package com.tmei;

/*

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I


 */

import java.util.Iterator;
import java.util.LinkedList;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows <= 1)
            return s;
        int[][] zz = new int[numRows][s.length()*2];
        for(int i=0; i<numRows; i++)
            for(int j=0; j<s.length(); j++)
                zz[i][j] = -1;

        int sIndex=0;
        int rowIndex = 0, colIndex=0;
        int rowIncr = 1, colIncr = 0;

        while(sIndex < s.length()){
            zz[rowIndex][colIndex] = sIndex;
            sIndex++;

            rowIndex += rowIncr;
            colIndex += colIncr;

            //set matrix indexes for next char position
            if(rowIndex >= numRows) {
                rowIncr = -1;
                rowIndex += (rowIncr-1);
                colIncr = 2;
                colIndex += colIncr;
            }else if(rowIndex < 0){
                colIndex -= colIncr;
                colIncr = 0;
                rowIncr = 1;
                rowIndex += rowIncr+1;
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i=0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                /*if (zz[i][j] >= 0)
                    System.out.print(s.charAt(zz[i][j]));
                else
                    System.out.print("*");
                */
                if (zz[i][j] >= 0)
                    sb.append(s.charAt(zz[i][j]));
            }
            //System.out.println();
        }
        return sb.toString();
    }


    public String convertSol2(String s, int numRows) {
        if(numRows <= 1)
            return s;

        LinkedList<Integer>[] zzSb = new LinkedList[numRows];

        for(int i=0; i < numRows; i++)
            zzSb[i] = new LinkedList<Integer>();

        int sIndex=0;
        int rowIndex = 0;
        int rowIncr = 1;

        while(sIndex < s.length()){
            zzSb[rowIndex].addLast(sIndex);
            sIndex++;
            rowIndex += rowIncr;

            //set matrix indexes for next char position
            if(rowIndex >= numRows) {
                rowIncr = -1;
                rowIndex += (rowIncr-1);
            }else if(rowIndex < 0){
                rowIncr = 1;
                rowIndex += rowIncr+1;
            }
        }

        StringBuffer result = new StringBuffer();
        char charArray[] = s.toCharArray();
        for(int i=0; i < numRows; i++) {
            Iterator<Integer> roller = zzSb[i].iterator();
            while (roller.hasNext())
                result.append(charArray[roller.next().intValue()]);
        }

        return result.toString();
    }
}

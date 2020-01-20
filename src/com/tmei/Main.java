package com.tmei;

public class Main {


    public double calculateMedian(int nums1[], int nums2[]){
        int medianIndex[] = calcMedianIndex(nums1.length, nums2.length);
        int valueInI;
        double median =0;

        //merge the arrays.
        int lastValueToCheckIndex;
        if(medianIndex.length == 1)
            lastValueToCheckIndex = medianIndex[0];
        else
            lastValueToCheckIndex = Math.max(medianIndex[0], medianIndex[1]);

        int n1Index=0, n2Index=0;
        for(int i=0; i<= lastValueToCheckIndex; i++){
            if(n1Index >= nums1.length){
                valueInI = nums2[n2Index];
                n2Index++;
            }
            else if (n2Index >= nums2.length){
                valueInI = nums1[n1Index];
                n1Index++;
            }
            else if(nums1[n1Index] <= nums2[n2Index]) {
                valueInI = nums1[n1Index];
                n1Index++;
            }else{
                valueInI = nums2[n2Index];
                n2Index++;
            }

            if(i == medianIndex[0])
                median = valueInI;
            else if(medianIndex.length == 2 && i == medianIndex[1]) {
                median = (median + valueInI) / 2;
            }

        }

        return median;
    }

    public int[] calcMedianIndex(int m, int n){
        int[] result;
        if((m+n) % 2 != 0){
            result = new int[1];
            result[0] = (m+n-1)/2;
        }else{
            result = new int[2];
            result[1] = (m+n)/2;
            result[0] = result[1] -1;
        }
        return result;

    }
}

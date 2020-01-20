package com.tmei;

public class SuperUglyNumber {
    //https://leetcode.com/problems/super-ugly-number/
    /*
    Write a program to find the nth super ugly number.

Super ugly numbers are positive numbers whose all prime factors are in the given prime list primes of size k.

Example:

Input: n = 12, primes = [2,7,13,19]
Output: 32
Explanation: [1,2,4,7,8,13,14,16,19,26,28,32] is the sequence of the first 12
             super ugly numbers given primes = [2,7,13,19] of size 4.

Note:

    1 is a super ugly number for any given primes.
    The given numbers in primes are in ascending order.
    0 < k ≤ 100, 0 < n ≤ 106, 0 < primes[i] < 1000.
    The nth super ugly number is guaranteed to fit in a 32-bit signed integer.

    * */

    public static void main(String[] arg){
        SuperUglyNumber s = new SuperUglyNumber();
        //int primes[] = {2,7,13,19};
        int primes[] = {7,19,29,37,41,47,53,59,61,79,83,89,101,103,109,127,131,137,139,157,167,179,181,199,211,229,233,239,241,251};

            int result = s.nthSuperUglyNumber(100000, primes);
            System.out.println(result);

    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n<= 0)
            return 0;

        if(n == 1)
            return 1;

        int number = primes[0];
        n = n-2;
        while(n > 0){
            number += 1;
            if(containsAllPrimteFactors(number, primes))
                n--;
        }

        return number;
    }

    public boolean containsAllPrimteFactors(int number, int[] primeFactors){

        for(int i=0; i < primeFactors.length && number > 1; i++) {
            while (number % primeFactors[i] == 0) {
                number = number / primeFactors[i];
            }
            if(number > 1 && primeFactors[i] > number)
                return false;
        }

        if(number > 1)
            return false;
        else
            return true;
    }
}

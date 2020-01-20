package com.tmei;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @org.junit.jupiter.api.Test

    @Test
    public void calcMedianIndexTestEvenNumsElements() {
        Main testClass = new Main();
        int result[];

        //array of 2 emelements in each
        result = testClass.calcMedianIndex(1, 1);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        //array of 2 emelements in each
        result = testClass.calcMedianIndex(2, 2);
        assertEquals(2, result.length);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);

        //array of 10, 4 elements
        result = testClass.calcMedianIndex(10, 4);
        assertEquals(2, result.length);
        assertEquals(6, result[0]);
        assertEquals(7, result[1]);

        //array of 10, 20 elements
        result = testClass.calcMedianIndex(10, 20);
        assertEquals(2, result.length);
        assertEquals(14, result[0]);
        assertEquals(15, result[1]);
    }

    @Test
    public void calcMerdianIndexesTestOddNumsElements(){
        Main testClass = new Main();
        int result[];

        result = testClass.calcMedianIndex(2, 1);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);

        result = testClass.calcMedianIndex(1, 2);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);

        result = testClass.calcMedianIndex(2, 3);
        assertEquals(1, result.length);
        assertEquals(2, result[0]);

        //array with 15, 10 elements
        result = testClass.calcMedianIndex(15, 10);
        assertEquals(1, result.length);
        assertEquals(12, result[0]);
    }


    @Test
    public void example1Test(){
        Main testClass = new Main();
        int[] numbs1 = {1, 3};
        int[] numbs2 = {2};
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(2, median);
    }

    @Test
    public void example2Test(){
        Main testClass = new Main();
        int[] numbs1 = {1, 2};
        int[] numbs2 = {3, 4};
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(2.5, median);
    }

    @Test
    public void example3Test(){
        Main testClass = new Main();
        int[] numbs1 = {1, 2, 5};
        int[] numbs2 = {1, 3, 4};
        //1, 1, 2, 3, 4. 5
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(2.5, median);
    }

    @Test
    public void example4Test(){
        Main testClass = new Main();
        int[] numbs1 = {1, 2, 5, 10};
        int[] numbs2 = {1, 1, 1, 12};
        //1, 1, 1, 1, 2, 5, 10, 12
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(1.5, median);
    }

    @Test
    public void example5Test(){
        Main testClass = new Main();
        int[] numbs1 = {1, 2, 5, 10};
        int[] numbs2 = {11, 15, 16, 20, 21};
        //1, 2, 5, 10, 11, 15, 16, 20, 21
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(11, median);
    }

    @Test
    public void example6Test(){
        Main testClass = new Main();
        int[] numbs1 = {10, 12, 15, 20};
        int[] numbs2 = {3, 5};
        //3, 5, 10, 12, 15, 20
        double median = testClass.calculateMedian(numbs1, numbs2);
        assertEquals(11, median);
    }
}

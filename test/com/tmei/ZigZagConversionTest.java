package com.tmei;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    @org.junit.jupiter.api.Test

    @Test
    public void testConversionExample(){
        ZigZagConversion z = new ZigZagConversion();
        assertEquals("PAHNAPLSIIGYIR", z.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", z.convert("PAYPALISHIRING", 4));
        assertEquals("PAYPALISHIRING", z.convert("PAYPALISHIRING", 1));

        assertEquals("PAHNAPLSIIGYIR", z.convertSol2("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", z.convertSol2("PAYPALISHIRING", 4));
        assertEquals("PAYPALISHIRING", z.convertSol2("PAYPALISHIRING", 1));
    }
}
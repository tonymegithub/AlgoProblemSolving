package com.tmei;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubPalindromeTest {
    @org.junit.jupiter.api.Test

    @Test
    public void longestPalindromeStringExample(){
        LongestSubPalindrome lsp = new LongestSubPalindrome();
        assertEquals("bab", lsp.longestPalindrome("babad"));
        assertEquals("bb", lsp.longestPalindrome("cbbd"));
        assertEquals("a", lsp.longestPalindrome("a"));
        assertEquals("a", lsp.longestPalindrome("ac"));
        assertEquals("bacab", lsp.longestPalindrome("abacab"));


    }

    @Test
    public void longestPalindromeStringTest() {
        LongestSubPalindrome lsp = new LongestSubPalindrome();
        assertEquals("aba", lsp.longestPalindrome("aba"));
        assertEquals("a", lsp.longestPalindrome("a"));
        assertEquals("aa", lsp.longestPalindrome("aa"));
        assertEquals("abba", lsp.longestPalindrome("abba"));
        assertEquals("abcba", lsp.longestPalindrome("abcba"));
        assertEquals("yyzzyy", lsp.longestPalindrome("fdsayyzzyyfdsafdsafdsa"));

    }

    @Test
    public void noPalidromeTest()
    {
        LongestSubPalindrome lsp = new LongestSubPalindrome();
        assertEquals("s", lsp.longestPalindrome("syz"));
        assertEquals("s", lsp.longestPalindrome("syzfdas"));
        assertEquals("h", lsp.longestPalindrome("helxo world xyz"));
        assertEquals("", lsp.longestPalindrome(""));
    }
}
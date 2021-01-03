package com.demo_project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class test {

    // Method to return the length and longest words in a sentence.
    public String stringTest(String sentence) {
        try {
            String[] words = sentence.split(" ");
            for (int j = 0; j < words.length; j++) {
                if (words[j].length() == words[j].length()) {
                    return "This sentence has more than one same length words";
                }
            }
            String maxWord = "";
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() >= maxWord.length()) {
                    maxWord = words[i];
                }
            }
            return maxWord.length() + " and " + maxWord;
        } catch (Exception e) {
            return "This is a null value";
        }
    }

    // Verify the method with a sentence
    @Test
    public void testWord() {
        String s1 = "I know java and selenium";
        System.out.println(stringTest(s1));
        Assert.assertEquals(stringTest(s1), "8 and selenium");
    }

    // Verify the method with null value
    @Test
    public void testNullValue() {
        String s2 = null;
        System.out.println(stringTest(s2));
        Assert.assertEquals(stringTest(s2), "This is a null value");
    }

    // Verify the method with empty value
    @Test
    public void testEmptyString() {
        String s3 = "";
        System.out.println(stringTest(s3));
        Assert.assertEquals(stringTest(s3), "0 and ");
    }

    // Verify the method with single word
    @Test
    public void testSingleWord() {
        String s4 = "Selenium";
        System.out.println(stringTest(s4));
        Assert.assertEquals(stringTest(s4), "8 and Selenium");
    }

    // Verify the method with more words
    @Test
    public void testMoreWords() {
        String s5 = "I like banana, almond, and orange";
        System.out.println(stringTest(s5));
        Assert.assertEquals(stringTest(s5), "This sentence has more than one same length words");
    }
}


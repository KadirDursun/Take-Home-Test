package com.demo_project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

public class test {

    public String stringTest (String sentence) {
        try {
            String[] word = sentence.split(" ");
            String maxlethWord = "";
            for (int i = 0; i < word.length; i++) {
                if (word[i].length() >= maxlethWord.length()) {
                    maxlethWord = word[i];
                }            }
            return maxlethWord.length() + " and " + maxlethWord;
        } catch (Exception e) {
            return "this is a null value";
        }
    }


    @Test
    public void testWord() {
       String s= "I know java and selenium";
       System.out.println(stringTest(s));
       Assert.assertEquals(stringTest(s),"8 and selenium");
    }

    @Test
    public void nullTest(){
        String ss=null;
        System.out.println(stringTest(ss));
        Assert.assertEquals(stringTest(ss),"this is a null value");
    }

    @Test
    public void emptyString(){
        String s3="";
        System.out.println(stringTest(s3));
    }

    @Test
    public void singleWord(){
        String s4="Selenium";
        System.out.println(stringTest(s4));
        Assert.assertEquals(stringTest(s4),"8 and Selenium");
    }

    @Test
    public void test(){

    }
}


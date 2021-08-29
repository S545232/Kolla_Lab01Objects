/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author S545232
 */
public class StringsAndNumbers {
    
    
    public static void main(String[] args) {
        
        //1
        System.out.println("******** String Class ********");

        //1.a
        String string1 = "  Welcome    ";
        String string2 = " to ";
        String string3 = "  the first    ";
        String string4 = "Lab Activity ";
        String string5 = " in the   ";
        String string6 = " OOP Course ";
        
        //1.b
        String resultString = string1.concat(string2).concat(string3).concat(string4).concat(string5).concat(string6);
        System.out.println(resultString);
        System.out.println("The length of the concatenated string is: " + resultString.length());
        
        //1.c
        resultString = resultString.replaceAll("\\s+", " ").trim()+"!";
        System.out.println(resultString);
        System.out.println("Length of the above string is: " + resultString.length());

        //1.d
        int labIndex = resultString.indexOf("L");
        int activityIndex = resultString.indexOf("y") + 1;
        String subStringLabActivity = resultString.substring(labIndex, activityIndex);
        System.out.println("Retrieved: " + subStringLabActivity);        
        
        //1.e
        subStringLabActivity = subStringLabActivity.toUpperCase();
        int iIndex = subStringLabActivity.indexOf("I");
        System.out.println("Index of first I in 'LAB ACTIVITY' is at: " + iIndex);
        
        
        //2.a
        String labInterestingString = "lab interesting activities are activities lab Interesting Lab Activities Are Interesting Lab activities Lab Interesting";
        int interestingIndex = labInterestingString.indexOf("Interesting");
        System.out.println("First occurrence of Interesting is at: " + interestingIndex);
        
        //2.b
        String oopString = "Object-Oriented-Programming 44542";
        System.out.println(oopString);
        oopString = oopString.replaceAll("-", "_");
        oopString = oopString.replaceAll("\\s+", "_");
        System.out.println(oopString);
        
        //2.c
        String computerString = "Computer";
        String scienceString = "Science";
        String computerSubString = computerString.substring(0, 4);
        String scienceSubString = scienceString.toUpperCase();
        scienceSubString = scienceSubString.substring(0, 3);
        System.out.println("The ID is: " + computerSubString + scienceSubString + computerString.length() + scienceString.length());
        
        //2.d
        System.out.println("I want to work in product based companies in mobile computing by using Data Structures and Machine Learning concepts, Northwest Missouri State University teaching both those subjects.");
        
        
                
        
        //3
        System.out.println("******** String Class ********");
        
        //3.a
        
    }
}

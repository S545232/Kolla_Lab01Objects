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
        resultString = resultString.replaceAll("\\s+", " ").trim() + "!";
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
        System.out.println("******** Math Class ********");

        //3.a.i
        int value1 = 9;
        int value2 = 13;
        System.out.println("sqrt (value12 +value22): " + Math.sqrt(Math.pow(value1, 2) + Math.pow(value2, 2)));

        //3.a.ii
        System.out.println("exp (9): " + Math.exp(value1));

        //3.a.iii
        System.out.println("sec (9): " + 1 / Math.cos(value1));

        //3.a.iv
        int myNumber = 27;
        System.out.println("Cube root of 27.00: " + Math.cbrt(myNumber));
        System.out.println("Logarithm value is: " + Math.log(myNumber));

        //3.a.v
        double var1 = 60;
        double var2 = 40;
        double tanResult = (Math.tan(60) - Math.tan(45)) / (1 + Math.tan(60) * Math.tan(45));
        System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) = " + tanResult);

        //3.a.vi
        System.out.println("Theoretical value of tan (90) is: " + Math.tan(90));
        System.out.println("Cubic root of modulus value of tan (90) is: " + Math.abs(Math.cbrt(Math.tan(90))));

        //3.a.vii
        double cos30 = 1 / Math.sin(30);
        System.out.println("Cosecant of 30 is: " + cos30);
        double sin30 = 1 / Math.cos(30);
        System.out.println("Secant of 30 is: " + sin30);
        System.out.println("Minimum value in Cosec (30) and Sec (30) is: " + Math.min(cos30, sin30));
        System.out.println("Maximum value in Cosec (30) and Sec (30) is: " + Math.max(cos30, sin30));

        //3.a.viii
        int myNumber1 = 45;
        int myNumber2 = 27;
        System.out.println("Rounded Value of cos 45: " + Math.round(Math.round(Math.cos(myNumber1))));
        System.out.println("Rounded Value of cos 27: " + Math.round(Math.round(Math.cos(myNumber2))));
        System.out.println("Rounded Value of tan 45: " + Math.round(Math.round(Math.tan(myNumber1))));
        System.out.println("Rounded Value of tan 45: " + Math.round(Math.round(Math.tan(myNumber2))));

        //3.b
        double result1 = Math.abs(8 * Math.cos(myNumber2));
        double result2 = Math.pow(Math.pow(7, 4) + (8 * 6 * 7 * 5), (double) 1 / 4);
        double result3 = Math.pow((Math.pow(5, 2) - Math.pow(3, 2)), (double) 1 / 8);
        double result = (result1 * result2) / result3;
        System.out.println("The value of given equation is: " + result);

        
        
        //4
        System.out.println("******** Random Class ********");
    }
}

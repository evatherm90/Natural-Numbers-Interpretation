/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.util.ArrayList;

/**
 * This class provides all the methods to disambiguate the number input
 *
 */
public class NumberDisambiguation {

    /**
     * The counter for the interpretations given in allPossiblePhoneNumbers
     * method
     */
    private int interpretation;

    /**
     * the calculateAllPossiblePhoneNumbers method calculates all possible
     * number combinations that can occur based on the user's input and the
     * given disambiguation rules
     *
     * @param input is user's input in a String array it is expected to consist
     * of positive integers that have maximum three digits
     * @return an arrayList with all possible phone numbers and the result of
     * number validation, ready to print in the form: "Interpretation 1:
     * 21693664	[phone number: INVALID]"
     */
    public ArrayList<String> calculateAllPossiblePhoneNumbers(String[] input) {
        int[] integerInput = parseInputToIntArray(input);
        this.interpretation = 0;
        ArrayList<String> results = new ArrayList<>();
        allPossiblePhoneNumbers(integerInput, 0, new ArrayList<>(), results);
        return results;
    }

    /**
     * The method disambiguateTwoDigitNumbers disambiguates a two digit positive
     * integer
     *
     * @param n1 is the number to be disambiguated
     * @param n2 is the number that follows after n1
     * @return an ArrayList with all the possible combinations given as integers
     */
    private ArrayList<String> disambiguateTwoDigitNumbers(int n1, int n2) {
        ArrayList<String> result = new ArrayList<>();
        if ((n1 % 10 == 0) && (n2 < 10) && (n2 != 0)) {
            int case1 = n1 / 10;
            int case2 = n1;
            String c1 = Integer.toString(case1);
            String c2 = Integer.toString(case2);
            result.add(c1);
            result.add(c2);
        } else if ((n1 % 10 != 0) && (n1 > 12)) {
            int case2 = (n1 - (n1 % 10)) * 10 + (n1 % 10);
            int case1 = n1;
            String c1 = Integer.toString(case1);
            String c2 = Integer.toString(case2);
            result.add(c1);
            result.add(c2);
        } else {
            int case1 = n1;
            String c1 = Integer.toString(case1);
            result.add(c1);
        }

        return result;
    }

    /**
     * The method disambiguateThreeDigitNumbers disambiguates a three digit
     * positive integer
     *
     * @param n1 is the number to be disambiguated
     * @param n2 is the number that follows after n1
     * @return an ArrayList with all the possible combinations given as integers
     *
     */
    private ArrayList<String> disambiguateThreeDigitNumbers(int n1, int n2) {
        ArrayList<String> result = new ArrayList<>();
        if (n1 % 100 != 0) {
            int case1 = n1 - (n1 % 100);
            int case2 = (n1 - (n1 % 100)) / 100;
            String c1 = Integer.toString(case1);
            String c2 = Integer.toString(case2);
            int mod = n1 % 100;
            ArrayList<String> twoLastDigits = disambiguateTwoDigitNumbers(mod, n2);
            for (int i = 0; i < twoLastDigits.size(); i++) {
                String d1 = c1 + twoLastDigits.get(i);
                String d2 = c2 + twoLastDigits.get(i);
                result.add(d1);
                result.add(d2);
            }
        } else {
            int case1 = n1;
            int case2 = n1 / 100;
            String c1 = Integer.toString(case1);
            String c2 = Integer.toString(case2);
            result.add(c1);
            result.add(c2);
        }

        return result;
    }

    /**
     * The method disambiguateTheNumbers disambiguates positive integers that
     * have maximum three digits and returns all possible combinations
     *
     * @param n1 is the positive integer that will be disambiguated
     * @param n2 is the number that follows after n1
     * @return ArrayList with all the possible combinations given as numeric
     * Strings
     */
    private ArrayList<String> disambiguateTheNumbers(int n1, int n2) {
        ArrayList<String> result = new ArrayList<>();
        if ((n1 >= 0) && (n1 < 10)) {
            String c = Integer.toString(n1);
            result.add(c);
        } else if ((n1 >= 10) && (n1 < 100)) {

            ArrayList<String> twoLastDigits = disambiguateTwoDigitNumbers(n1, n2);
            for (String digits : twoLastDigits) {
                result.add(digits);
            }
        } else if ((n1 >= 100) && (n1) < 1000) {
            ArrayList<String> threeLastDigits = disambiguateThreeDigitNumbers(n1, n2);
            for (String digits : threeLastDigits) {
                result.add(digits);
            }

        }
        return result;
    }

    /**
     * The method parseInputToIntArray parses a String Array to an int array.
     *
     * @param n is a String Array that consists of numeric strings
     * @return an int array
     */
    private int[] parseInputToIntArray(String[] n) {
        int[] phoneNumber = new int[n.length];
        try {
            for (int i = 0; i < n.length; i++) {
                phoneNumber[i] = Integer.parseInt(n[i]);
            }
        } catch (NumberFormatException ex) {
            System.out.println("THIS NOT A VALID INPUT");
        }
        return phoneNumber;
    }

    /**
     * The method allPossiblePhoneNumbers takes the given phone number in the
     * form of int array, disambiguates the numbers and then calculates all of
     * their possible combinations and validates them
     *
     * @param input is the given phone number
     * @param index is the index for the recursion
     * @param buffer temporary stores a tree branch that contains a possible
     * phone number
     * @param result this will hold the possible phone numbers
     * @return result is an ArrayList with all possible phone numbers and their
     * status as valid or invalid, given as string in the form of:
     * "Interpretation 1: 21693664	[phone number: INVALID]"
     */
    private ArrayList<String> allPossiblePhoneNumbers(int[] input, int index, ArrayList<String> buffer, ArrayList<String> result) {
        int next = 0;

        if (index < input.length) {
            if (index == input.length - 1) {
                next = 0;
            } else {
                next = input[index + 1];
            }
            ArrayList<String> dis = disambiguateTheNumbers(input[index], next);
            for (String s : dis) {
                buffer.add(s);
                allPossiblePhoneNumbers(input, index + 1, buffer, result);
                buffer.remove(buffer.size() - 1);
            }

        }
        if (index == input.length) {

            StringBuilder sb = new StringBuilder();
            for (String r : buffer) {

                sb.append(r);
            }

            NumberValidation nb = new NumberValidation();
            this.interpretation++;
            if (nb.validateStartOfDigits(sb.toString()) == true) {
                result.add("Interpretation " + this.interpretation + ": " + sb.toString() + "\t[phone number: VALID]");
            } else {
                result.add("Interpretation " + this.interpretation + ": " + sb.toString() + "\t[phone number: INVALID]");
            }

        }

        return result;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.util.Scanner;

/**
 * This is the class that manages the user's input
 *
 */
public class InputValidation {

    /**
     * The method gets the user's input
     *
     * @return the user's input in a String array
     */
    public String[] getInput() {
        System.out.println("GIVE ME A PHONE NUMBER");
        Scanner e = new Scanner(System.in);
        String number = e.nextLine();
        String[] n = number.split(" ");
        return n;
    }

    /**
     * The method isValid checks if the user's input consists of positive
     * integers that have maximum three digits
     *
     * @param n is the user's input in a String array
     * @return true if the input consists of positive integers that have maximum
     * three digits
     */
    public boolean isValid(String[] n) {
        if (isNumber(n) && (isMaximumThreeDigit(n))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The method isNumber checks if user's input is positive integer
     *
     * @param n is a String Array
     * @return true if n contains only numeric Strings
     */
    private boolean isNumber(String[] n) {
        for (String n1 : n) {
            if (!isNumeric(n1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * The method isNumeric checks if a String is numeric
     *
     * @param str is a String
     * @return true if str is numeric
     */
    private boolean isNumeric(final String str) {

        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    /**
     * The method is MaximumThreeDigit checks if a String Array that contains
     * numeric Strings has elements with maximum three digits
     *
     * @param phoneNumber is a String Array that contains numeric Strings
     * @return true if the array's elements have maximum three digits
     */
    private boolean isMaximumThreeDigit(String[] phoneNumber) {
        for (int i = 0; i < phoneNumber.length; i++) {
            if (phoneNumber[i].length() > 3) {

                return false;
            }
        }
        return true;
    }

}

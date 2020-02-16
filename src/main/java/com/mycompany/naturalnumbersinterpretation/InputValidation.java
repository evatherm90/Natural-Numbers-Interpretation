/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.util.Scanner;

/**
 *
 * @author antonis
 */
public class InputValidation {

    private boolean isNumeric(final String str) {

        if (str == null || str.length() == 0) {
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }

    private boolean isNumber(String[] n) {
        for (int i = 0; i < n.length; i++) {
            if (!isNumeric(n[i])) {
                return false;
            }
        }
        return true;
    }

    public String[] getInput() {
        System.out.println("GIVE ME A PHONE NUMBER");
        Scanner e = new Scanner(System.in);
        String number = e.nextLine();
        String[] n = number.split(" ");
        return n;
    }

    public boolean isValid(String[] n) {
        if (isNumber(n) && (isMaximumThreeDigit(n))) {// && (isOfAcceptableLength(n))
            return true;
        } else {
            return false;
        }
    }

    private boolean isMaximumThreeDigit(String[] phoneNumber) {
        for (int i = 0; i < phoneNumber.length; i++) {
            if (phoneNumber[i].length() > 3) {

                return false;
            }
        }
        return true;
    }

}

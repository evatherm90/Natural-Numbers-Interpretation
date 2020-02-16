/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

/**
 * this class provides the rules that make a phone number valid for a country
 *
 */
public class NumberValidation {

    /**
     * The method validateStartOfDigits checks if the given number is a valid
     * Greek phone number
     *
     * @param number is the phone number given as a numeric String
     * @return true if it is a valid phone number
     */
    public boolean validateStartOfDigits(String number) {
        if ((number.length() == 10) && (number.startsWith("2") || number.startsWith("69"))) {
            return true;
        } else if ((number.length() == 14) && (number.startsWith("00302") || number.startsWith("003069"))) {
            return true;
        } else {
            return false;
        }
    }

}

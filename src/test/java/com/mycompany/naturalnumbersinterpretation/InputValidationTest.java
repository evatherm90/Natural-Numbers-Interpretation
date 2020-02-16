/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static sun.awt.X11.XConstants.InputOutput;

/**
 *
 * 
 */
public class InputValidationTest {

    public InputValidationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValid() {

        String[] n = {"10", "6", "9", "30", "6", "6", "4"};
        InputValidation instance = new InputValidation();
        boolean expResult = true;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValidForEmptyInput() {

        String[] n = {""};
        InputValidation instance = new InputValidation();
        boolean expResult = false;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValidWithNoNumericCharacters() {

        String[] n = {"10", "l", "9", "30", "9", "6", "4"};
        InputValidation instance = new InputValidation();
        boolean expResult = false;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValidWithNegativeNumbers() {

        String[] n = {"10", "-3", "9", "30", "9", "6", "4"};
        InputValidation instance = new InputValidation();
        boolean expResult = false;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValidWithDoubleNumbers() {

        String[] n = {"10", "3.9", "9", "30", "9", "6", "4"};
        InputValidation instance = new InputValidation();
        boolean expResult = false;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValid method, of class InputValidation.
     */
    @Test
    public void testIsValidWithMoreThanThreeDigitsNumbers() {

        String[] n = {"10", "3284", "9", "10", "6", "9", "30", "6"};
        InputValidation instance = new InputValidation();
        boolean expResult = false;
        boolean result = instance.isValid(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getInput method, of class InputValidation.
     */
    @Test
    public void testGetInput() {

        InputValidation inputOutput = new InputValidation();
        String input = "fhwit 4hd9b saf#";
        String[] expResult = {"fhwit", "4hd9b", "saf#"};
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assert.assertArrayEquals(expResult, inputOutput.getInput());
    }
}

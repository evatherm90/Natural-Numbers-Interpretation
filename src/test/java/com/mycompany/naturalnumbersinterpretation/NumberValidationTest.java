/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antonis
 */
public class NumberValidationTest {

    public NumberValidationTest() {
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
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsStartingWith2() {       
        String number = "2106930664";
        NumberValidation instance = new NumberValidation();
        boolean expResult = true;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsStartingWith69() {       
        String number = "6972413502";
        NumberValidation instance = new NumberValidation();
        boolean expResult = true;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsStartingWith00302() {       
        String number = "00302106930664";
        NumberValidation instance = new NumberValidation();
        boolean expResult = true;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsStartingWith003069() {       
        String number = "00306972413502";
        NumberValidation instance = new NumberValidation();
        boolean expResult = true;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooLongStartingWith2() {       
        String number = "21069300664";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooLongStartingWith69() {       
        String number = "69724135029";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooLongStartingWith00302() {       
        String number = "003021069300664";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooLongStartingWith003069() {       
        String number = "00306969724135029";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooShortStartingWith2() {       
        String number = "210693006";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooShortStartingWith69() {       
        String number = "697241350";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooShortStartingWith00302() {       
        String number = "0030210693006";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
    
    /**
     * Test of validateStartOfDigits method, of class NumberValidation.
     */
    @Test
    public void testValidateStartOfDigitsTooShortStartingWith003069() {       
        String number = "003069697241350";
        NumberValidation instance = new NumberValidation();
        boolean expResult = false;
        boolean result = instance.validateStartOfDigits(number);
        assertEquals(expResult, result);
       
    }
}

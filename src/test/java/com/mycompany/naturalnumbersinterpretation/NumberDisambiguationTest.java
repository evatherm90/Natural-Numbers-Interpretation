/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.util.ArrayList;
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
public class NumberDisambiguationTest {

    public NumberDisambiguationTest() {
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
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersThreeDigitNumberThatIsDividedBy100() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"700", "53"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 70053	[phone number: INVALID]");
        expResult.add("Interpretation 2: 700503	[phone number: INVALID]");
        expResult.add("Interpretation 3: 753	[phone number: INVALID]");
        expResult.add("Interpretation 4: 7503	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
         ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersTwoDigitNumberThatIsDividedBy10() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"70", "5"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 75	[phone number: INVALID]");
        expResult.add("Interpretation 2: 705	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
         ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersThreeDigitNumberThatIsNotDividedBy100() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"715"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 70015	[phone number: INVALID]");
        expResult.add("Interpretation 2: 715	[phone number: INVALID]");
        expResult.add("Interpretation 3: 700105	[phone number: INVALID]");
        expResult.add("Interpretation 4: 7105	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
        ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersTwoDigitNumberThatIsNotDividedBy10() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"75"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 75	[phone number: INVALID]");
        expResult.add("Interpretation 2: 705	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
        ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersTwoDigitNumberThatIsNotAmbiguous() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"11"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 11	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
        ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbersOneDigitNumber() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"1"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 1	[phone number: INVALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
        ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
    
    /**
     * Test of calculateAllPossiblePhoneNumbers method, of class
     * NumberDisambiguation.
     */
    @Test
    public void testCalculateAllPossiblePhoneNumbers() {
        System.out.println("calculateAllPossiblePhoneNumbers");
        String[] input = {"2", "10", "6", "9", "30", "6", "6", "4"};
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Interpretation 1: 21693664	[phone number: INVALID]");
        expResult.add("Interpretation 2: 216930664	[phone number: INVALID]");
        expResult.add("Interpretation 3: 210693664	[phone number: INVALID]");
        expResult.add("Interpretation 4: 2106930664	[phone number: VALID]");
        NumberDisambiguation instance = new NumberDisambiguation();
        ArrayList<String> result = instance.calculateAllPossiblePhoneNumbers(input);
        assertEquals(expResult,result);
    }
}

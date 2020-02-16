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
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * 
 */
public class NumbersInterpretationTest {

    public NumbersInterpretationTest() {
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
     * Test of main method, of class NumbersInterpretation.
     */
    @Test
    public void testMain() {
        String[] args = null;
        final InputStream original = System.in;
        String input = "fhwit 4hd9b saf#";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        NumbersInterpretation.main(args);
        input = "2 45";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        NumbersInterpretation.main(args);
        System.setIn(original);

    }

}

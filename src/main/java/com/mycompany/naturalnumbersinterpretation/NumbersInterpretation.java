/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naturalnumbersinterpretation;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

/**
 *
 * @author antonis
 */
public class NumbersInterpretation {

    public static void main(String[] args) {
        NumberDisambiguation nd = new NumberDisambiguation();
        InputValidation iv = new InputValidation();

        String[] n = iv.getInput();

        if (iv.isValid(n)) {
            ArrayList<String> results=nd.calculateAllPossiblePhoneNumbers(n);
            for(String result:results){
                System.out.println(result);
            }
        } else {
            System.out.println("NOT A VALID NUMBER");
        }

    }

}

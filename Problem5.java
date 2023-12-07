/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problem5;

import java.util.*;

public class Problem5 {

 public static void main(String[] args) {
     // The string that will be reversed
        String str = ("When Chuck Norris falls in water, Chuck Norris doesn't get wet. Water gets Chuck Norris.");
       // Converts a string to an array of characters
        char[] c = str.toCharArray();
        // Puts the array into the method
        reverse(c);
        // Prints the original
        System.out.println("Normal: " + str);
        // Sets str to the newly reversed sentence
        str = new String(c);
        // Prints the reversed sentence
        System.out.println("Reverse: " + str);
    }
       // Creates a new stack, and pushes each letter that was converted from a string to an array onto the stack. It is then popped, and the order is reversed since its 1st in last out
    public static void reverse(char[] c){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            stack.push(c[i]);
        }
        int s = 0;
        while(!stack.empty()){
            c[s++]= stack.pop();
        }
       
    }
}

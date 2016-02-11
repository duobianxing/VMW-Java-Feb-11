/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author simon
 */
public class Hello {

    public static void showThis(String message, int count) {
        System.out.println("Hello " + message + " the count is " + count);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        System.out.println("Hello, world!");
        showThis(" Mrs. Jones ", 42);
        
        boolean isWarm = true;
        
        byte b = 42;
        short s = 3456;
        int i = 1234567;
        long l = 123456789012L;
        long l1;
        
//        l = l1 + 2;

        float f = 3.14159F;
        double d = 3.14159;
        
        i = (int)l;
        
        char c = '\ucafe';
        
        s = (short)(s + b);
        s += b;
        
        System.out.print("Enter text: ");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("You said: " + line);
    }

}

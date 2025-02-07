package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        System.out.println("JCompare is a text comparison tool made in Java");
        System.out.println("Input first text");
        String input1 = min.nextLine();
        System.out.println("Input the second text");
        String input2 = min.nextLine();
        if (input1.trim().equals(input2.trim())) {
            System.out.println("Text matches!");
        }
        else {
            System.out.println("text doesnt match!");
        }
    }
}
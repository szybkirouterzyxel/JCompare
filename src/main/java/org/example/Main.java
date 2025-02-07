package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner min = new Scanner(System.in);
        System.out.println("JCompare is a text comparison tool made in Java, it currently isnt case sensitive but soon will be");
        System.out.println("input the first text");

        String input1 = min.nextLine();

        System.out.println("input the second text");

        String input2 = min.nextLine();

        if (input1.equals(input2.trim())) {
            System.out.println("Text Matches!");

        } else {
            System.out.println("Text doesnt match!");
        }


    }
}
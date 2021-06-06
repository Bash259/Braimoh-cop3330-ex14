/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */



import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner UserInput = new Scanner(System.in);
        double OA = UserInput.nextDouble();
        String Lol = UserInput.nextLine();

        System.out.println("What is the state?");
        String state = UserInput.nextLine();

        if (state.equals("WI")){
            System.out.println("The subtotal is $"+OA);
            double tax = 0.055 * OA;
            System.out.println("The tax is $"+tax);
            double total = tax + OA;
            System.out.println("The total is $"+total);
            return;
        }
        System.out.println("The total is $"+OA);
    }
}

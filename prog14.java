/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Objects;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class prog14 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double tax = 0.55;

        Scanner a = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        double amount = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.print("What is the state? ");
        String state = b.nextLine();

        if (Objects.equals(state, "WI")) {
            amount += tax;
        }

        df.setRoundingMode(RoundingMode.UP);
        System.out.println("The total is $" + df.format(amount));
    }
}

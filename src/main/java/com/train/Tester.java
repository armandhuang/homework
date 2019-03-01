package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter number of tickets:");
            int totaltickets = scanner.nextInt();

            if (totaltickets > 0) {
                System.out.print("How many round-trip tickets:");
                int roundtrip = scanner.nextInt();
                if (roundtrip >= 0 && roundtrip <= totaltickets) {
                    Ticket ticket = new Ticket(totaltickets, roundtrip);
                    ticket.print();
                } else {
                    System.out.println("Input error.  Please check your number of  round-trip tickets.\n");
                }
            } else if (totaltickets == -1) {
                 System.out.println("Thank you.");
                 return;
            } else{
                 System.out.println("Input error.  Please check your number of tickets.\n");
            }
        }
    }
}

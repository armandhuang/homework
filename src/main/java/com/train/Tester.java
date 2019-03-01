package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int leave = -1;
        int totaltickets = 0;
        int roundtrip = 0;

        while (totaltickets != leave) {
            System.out.print("Please enter number of tickets:");
            totaltickets = scanner.nextInt();

            if (totaltickets > 0) {
                System.out.print("How many round-trip tickets:");
                roundtrip = scanner.nextInt();
                if (roundtrip >= 0 && roundtrip <= totaltickets) {
                    Ticket ticket = new Ticket(totaltickets, roundtrip);
                    ticket.print();
                } else {
                    System.out.println("Input error.  Please check your number of  round-trip tickets.\n");
                }
            } else if (totaltickets == leave) {
                 System.out.println("Thank you.");
                 break;
            } else{
                 System.out.println("Input error.  Please check your number of tickets.\n");
            }
        }
    }
}

package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int totaltickets = scanner.nextInt();
        if (totaltickets > 0){
            System.out.print("How many round-trip tickets:");
            int roundtrip = scanner.nextInt();
            if (roundtrip >= 0 && roundtrip <= totaltickets){
                Ticket ticket = new Ticket(totaltickets, roundtrip);
                ticket.print();
            }
            else{
                System.out.print("Input error.  Please check your number of  round-trip tickets.");
                return;
            }
        }
        else{
            System.out.print("Input error.  Please check your number of tickets.");
            return;
        }
    }
}

package com.train;

public class Ticket {
    int totaltickets;
    int roundtrip;
    float total;

    public Ticket(int totaltickets, int roundtrip) {
        this.totaltickets = totaltickets;
        this.roundtrip = roundtrip;
        total = ((totaltickets-roundtrip) * 1000) + (roundtrip * 2000 * 0.9f);
    }

    public void print(){
        System.out.println("Total tickets: " + totaltickets + "\n" +
                "Round-trip:" + roundtrip + "\n" +
                "Total:" + total);
    }
}

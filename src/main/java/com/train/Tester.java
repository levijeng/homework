package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        int oneWayticket = scanner.nextInt();
        System.out.println("Please enter number of round-trip tickets: ");
        int roundTripTicket = scanner.nextInt();
        Ticket ticket = new Ticket(oneWayticket, roundTripTicket);
        System.out.println("Total tickets:" + oneWayticket + "\t" +
                "Round-trip:" + roundTripTicket + "\t" +
                "Total:" + ticket.total());

    }


}

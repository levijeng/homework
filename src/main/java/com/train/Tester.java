package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(1000, 0.9f);
        System.out.println("Please enter number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        ticket.oneWayTicket = scanner.nextInt();
        System.out.println("Please enter number of round-trip tickets: ");
        ticket.roundTripTicket = scanner.nextInt();
        System.out.println("Total tickets:" + ticket.oneWayTicket + "\t" +
                "Round-trip:" + ticket.roundTripTicket + "\t" +
                "Total:" + ticket.total());

    }


}

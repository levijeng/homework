package com.train;

public class Ticket {
    int oneWayTicket;
    int roundTripTicket;
    int price;
    float roundTripDiscountRatio;

    public Ticket(int price, float roundTripDiscountRatio) {
        this.price = price;
        this.roundTripDiscountRatio = roundTripDiscountRatio;
    }

    public int total() {
        return (int)(oneWayTicket * price + roundTripTicket * price * 2 * roundTripDiscountRatio);
    }
}

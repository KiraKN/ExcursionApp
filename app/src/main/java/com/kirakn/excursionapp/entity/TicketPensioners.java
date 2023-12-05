package com.kirakn.excursionapp.entity;

public class TicketPensioners extends Ticket {

    private float ticketDiscount;

    public TicketPensioners() {
    }

    public TicketPensioners(int id, float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(id, ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(float ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)/100;
    }
}
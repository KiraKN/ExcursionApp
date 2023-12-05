package com.kirakn.excursionapp.entity;

public class Ticket {
    private int id;
    private float ticketPrice;
    private int numberOfTickets;

    public Ticket() {
    }

    public Ticket(int id, float ticketPrice, int numberOfTickets) {
        this.id = id;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void getNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float ticketPriceALL() {
        return ticketPrice * numberOfTickets;
    }

}

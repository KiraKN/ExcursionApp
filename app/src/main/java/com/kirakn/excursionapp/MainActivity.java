package com.kirakn.excursionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kirakn.excursionapp.entity.Ticket;
import com.kirakn.excursionapp.entity.TicketChild;
import com.kirakn.excursionapp.entity.TicketPensioners;

public class MainActivity extends AppCompatActivity {

    private Ticket ticket, ticketChild, ticketPensioners;

    private TextView infoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ticket = new Ticket(1, 35, 12);
        ticketChild = new TicketChild(2, 35, 14, 50f);
        ticketPensioners = new TicketPensioners(3, 35, 10, 45f);

        infoApp = findViewById(R.id.infoApp);

        float ticketPrice = ticket.ticketPriceAll();
        float ticketPriceChild = ticketChild.ticketPriceAll();
        float ticketPricePensioners = ticketPensioners.ticketPriceAll();
        float ticketPriceAll = ticketPrice + ticketPriceChild + ticketPricePensioners;

        infoApp.setText("Стоимость всех билетов " + ticketPriceAll + " монет\n"
        + "Из которых детские билеты стоят " + ticketPriceChild + " монет,"
        + "пенсионерские " + ticketPricePensioners + " монет,"
        + "а взрослые " + ticketPrice + " монет.");
    }
}
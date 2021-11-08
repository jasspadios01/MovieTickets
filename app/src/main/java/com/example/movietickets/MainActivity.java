package com.example.movietickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int costPerTicket = 250;
    int numberOfTickets;
    int totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText tickets = (EditText) findViewById(R.id.txtTickets);
        Spinner group = (Spinner) findViewById(R.id.spinner);
        TextView result = (TextView) findViewById(R.id.txtShowResult);

        Button cost = (Button) findViewById(R.id.txtResult);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    numberOfTickets = Integer.parseInt(tickets.getText().toString());
                    totalCost = costPerTicket * numberOfTickets;
                    groupChoice = group.getSelectedItem().toString();
                    result.setText("Cost for " + groupChoice + " is " + totalCost + " pesos.");

            }
        });



    }
}
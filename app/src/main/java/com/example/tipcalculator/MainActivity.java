package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText billAmount;
    TextView finalAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        billAmount = findViewById(R.id.billAmount);
        finalAmount = findViewById(R.id.finalAmount);
    }
    private void calculate(double tipPercent) {
        String textAmount = billAmount.getText().toString();
        if (textAmount.isEmpty()) textAmount = "0.00";
        Double amount = Double.parseDouble(textAmount);
        amount = amount * (1 + tipPercent);
        finalAmount.setText(String.format("%.2f", amount));
    }

    public void calculate8(View view) {
        calculate(0.08);
    }

    public void calculate12(View view) {
        calculate(0.12);
    }

    public void calculate15(View view) {
        calculate(0.15);
    }
}
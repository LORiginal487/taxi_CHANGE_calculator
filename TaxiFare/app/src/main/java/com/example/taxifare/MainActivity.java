package com.example.taxifare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inTaxiPrice, inSeats;
    TextView driverTotal;
    double num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inTaxiPrice = findViewById(R.id.intPrcF1);
        inSeats = findViewById(R.id.seatTa);
        driverTotal = findViewById(R.id.driverTotalOut);

        listeners();
    }
    public void listeners(){
            inTaxiPrice.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!inTaxiPrice.getText().toString().equals("") && !inSeats.getText().toString().equals("")) {
                        double num1 = Double.parseDouble(inTaxiPrice.getText().toString());
                        double num2 = Double.parseDouble(inSeats.getText().toString());
                        num = num1 * num2;
                        driverTotal.setText(String.valueOf(num));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            inSeats.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if(!inTaxiPrice.getText().toString().equals("") && !inSeats.getText().toString().equals("")) {
                        double num1 = Double.parseDouble(inTaxiPrice.getText().toString());
                        double num2 = Double.parseDouble(inSeats.getText().toString());
                        num = num1 * num2;
                        driverTotal.setText(String.valueOf(num));
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

    }


    public void calTop(String str2, String str){

        num = Double.parseDouble(str2) * Double.parseDouble(str);

    }
}
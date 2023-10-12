package com.example.taxifare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inTaxiPrice, inSeats;
    double amnt;
    EditText amntIn1, numberOfPpl1, changeOut1;
    EditText amntIn2, numberOfPpl2, changeOut2;
    EditText amntIn3, numberOfPpl3, changeOut3;
    EditText amntIn4, numberOfPpl4, changeOut4;
    EditText amntIn5, numberOfPpl5, changeOut5;
    EditText amntIn6, numberOfPpl6, changeOut6;
    TextView driverTotal;
    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6;

    double num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callViews();
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
                    if(inTaxiPrice.getText().toString().isEmpty()) {

                        Toast.makeText( amntIn1.getContext(), "Enter price for each person", Toast.LENGTH_SHORT).show();
                        Log.d("number 3", " work");
                    }
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

        amntIn1.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView1);
                Log.d("number 4", " work");
                if(!amntIn1.getText().toString().equals("") && !numberOfPpl1.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn1.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl1.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn1.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView1.setImageResource(R.drawable.red_cr);
                    }else{
                        imageView1.setImageResource(R.drawable.green_c);
                    }
                    changeOut1.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl1.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView1);
                Log.d("number 4", " work");
                if(!amntIn1.getText().toString().equals("") && !numberOfPpl1.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn1.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl1.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn1.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView1.setImageResource(R.drawable.red_cr);
                    }else{
                        imageView1.setImageResource(R.drawable.green_c);
                    }
                    changeOut1.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amntIn2.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView2);
                Log.d("number 4", " work");
                if(!amntIn2.getText().toString().equals("") && !numberOfPpl2.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn1.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl2.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn2.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView2.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView2.setImageResource(R.drawable.green_c);
                    }
                    changeOut2.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl2.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView2);
                Log.d("number 4", " work");
                if(!amntIn2.getText().toString().equals("") && !numberOfPpl2.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn2.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl2.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn2.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView2.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView2.setImageResource(R.drawable.green_c);
                    }
                    changeOut2.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amntIn3.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView3);
                Log.d("number 4", " work");
                if(!amntIn3.getText().toString().equals("") && !numberOfPpl3.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn3.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl3.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn3.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView3.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView3.setImageResource(R.drawable.green_c);
                    }
                    changeOut3.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl3.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView3);
                Log.d("number 4", " work");
                if(!amntIn3.getText().toString().equals("") && !numberOfPpl3.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn3.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl3.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn3.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView3.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView3.setImageResource(R.drawable.green_c);
                    }
                    changeOut3.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amntIn4.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView4);
                Log.d("number 4", " work");
                if(!amntIn4.getText().toString().equals("") && !numberOfPpl4.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn4.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl4.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn4.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView4.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView4.setImageResource(R.drawable.green_c);
                    }
                    changeOut4.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl4.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView4);
                Log.d("number 4", " work");
                if(!amntIn4.getText().toString().equals("") && !numberOfPpl4.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn4.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl4.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn4.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView4.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView4.setImageResource(R.drawable.green_c);
                    }
                    changeOut4.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amntIn5.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView5);
                Log.d("number 4", " work");
                if(!amntIn5.getText().toString().equals("") && !numberOfPpl5.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn5.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl5.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn5.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView5.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView5.setImageResource(R.drawable.green_c);
                    }
                    changeOut5.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl5.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView5);
                Log.d("number 4", " work");
                if(!amntIn5.getText().toString().equals("") && !numberOfPpl5.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn5.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl5.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn5.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView5.setImageResource(R.drawable.red_cr);
                    }
                    else{
                        imageView5.setImageResource(R.drawable.green_c);
                    }
                    changeOut5.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        amntIn6.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView6);
                Log.d("number 4", " work");
                if(!amntIn6.getText().toString().equals("") && !numberOfPpl6.getText().toString().equals("") && !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn6.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl6.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn6.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView6.setImageResource(R.drawable.red_cr);
                    }else{
                        imageView6.setImageResource(R.drawable.green_c);
                    }
                    changeOut6.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        numberOfPpl6.addTextChangedListener( new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                listeners2(imageView6);
                Log.d("number 4", " work");
                if(!amntIn6.getText().toString().equals("") && !numberOfPpl6.getText().toString().equals("")&& !inTaxiPrice.getText().toString().equals("")) {
                    amnt = (Double.parseDouble(amntIn6.getText().toString()) - Double.parseDouble(inTaxiPrice.getText().toString()) * Double.parseDouble(numberOfPpl6.getText().toString()));
                    Log.d("number 00001", " work");
                    if(amnt < 0 ){
                        Toast.makeText(amntIn6.getContext() , "Money is short with R"+(amnt*-1), Toast.LENGTH_SHORT).show();
                        Log.d("number 2", " work");
                        imageView6.setImageResource(R.drawable.red_cr);
                    }else{
                        imageView6.setImageResource(R.drawable.green_c);
                    }
                    changeOut6.setText(Double.toString(amnt));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
    public void callViews(){
        inTaxiPrice = findViewById(R.id.intPrcF1);
        inSeats = findViewById(R.id.seatTa);
        driverTotal = findViewById(R.id.driverTotalOut);

        amntIn1 = findViewById(R.id.editTextNumberDecimal14);
        numberOfPpl1 = findViewById(R.id.editTextNumberDecimal25);
        changeOut1 = findViewById(R.id.change1);

        amntIn2 = findViewById(R.id.editTextNumberDecimal24);
        numberOfPpl2 = findViewById(R.id.editTextNumberDecimal35);
        changeOut2 = findViewById(R.id.change2);

        amntIn3 = findViewById(R.id.editTextNumberDecimal74);
        numberOfPpl3 = findViewById(R.id.editTextNumberDecimal85);
        changeOut3 = findViewById(R.id.change3);

        amntIn4 = findViewById(R.id.editTextNumberDecimal04);
        numberOfPpl4 = findViewById(R.id.editTextNumberDecimal51);
        changeOut4 = findViewById(R.id.change4);

        amntIn5 = findViewById(R.id.editTextNumberDecimal42);
        numberOfPpl5 = findViewById(R.id.editTextNumberDecimal53);
        changeOut5 = findViewById(R.id.change5);

        amntIn6 = findViewById(R.id.editTextNumberDecimal4);
        numberOfPpl6 = findViewById(R.id.editTextNumberDecimal5);
        changeOut6 = findViewById(R.id.change6);

        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView);

    }
    public void listeners2(ImageView imgv){
        if(inTaxiPrice.getText().toString().isEmpty()) {
            imgv.setImageResource(R.drawable.red_cr);
            Toast.makeText( amntIn1.getContext(), "Enter price for each person", Toast.LENGTH_SHORT).show();
            Log.d("number 3", " work");
        }

    }
    public void restartApp(View view) {
        Intent intent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    public void openFollow(View view) {
        Intent intent = new Intent(MainActivity.this, FollowActivity.class);
        startActivity(intent);
    }
}
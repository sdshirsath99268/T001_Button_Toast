package com.example.t001_button_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Btn1 , Btn2 , Btn3 , Btn4 , Btn5 ;
    Button Btn6 , Btn7 , Btn8 , Btn9 , Btn10 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn1 = findViewById(R.id.btn1);
        Btn2 = findViewById(R.id.btn2);
        Btn3 = findViewById(R.id.btn3);
        Btn4 = findViewById(R.id.btn4);
        Btn5 = findViewById(R.id.btn5);
        Btn6 = findViewById(R.id.btn6);
        Btn7 = findViewById(R.id.btn7);
        Btn8 = findViewById(R.id.btn8);
        Btn9 = findViewById(R.id.btn9);
        Btn10 = findViewById(R.id.btn10);

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked Button 1 ", Toast.LENGTH_SHORT).show();
            }
        });

       Btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getApplicationContext(), "Clicked Button 2 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 3 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 4 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 5 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 6 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 7 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 8 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 9 ", Toast.LENGTH_SHORT).show();
           }
       });

       Btn10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Clicked Button 10 ", Toast.LENGTH_SHORT).show();
           }
       });
    }
}
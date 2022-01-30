package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);


        //change color of the text by clicking a button
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
        //change background of the text by clicking a button
        findViewById(R.id.changebackground).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
        });
        //change text by clicking a button
        findViewById(R.id.changetext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is awesome");
            }
        });
        // click the background to change app to its default setting
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text color to its original
                textView.setTextColor(getResources().getColor(R.color.black));
                // change background colour to its default
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.light_blue));
                // change text back to its original
                textView.setText("Hello from Uchechukwu");
            }
        });

        findViewById(R.id.changecustomtext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userenteredtext =((EditText) findViewById(R.id.editTextTextPersonName)).getText().toString();
                textView.setText(userenteredtext);



            }
        });
    }
}
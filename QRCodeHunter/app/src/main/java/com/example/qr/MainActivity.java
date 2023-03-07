package com.example.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button remove_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button signInButton = (Button) findViewById(R.id.sign_in_button);
        TextView registerButton = (TextView)findViewById(R.id.register_button);




        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_sign_in);
                Button cancel = (Button) findViewById(R.id.cancel_button);
                
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_sign_up);
                Button cancel = (Button) findViewById(R.id.cancel_button);


            }
        });









    }





}
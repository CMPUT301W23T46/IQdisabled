package com.example.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPref = getSharedPreferences("myPref", MODE_PRIVATE);
        boolean loggedIn = sharedPref.getBoolean("loggedIn", false);

        if (loggedIn) {
            // 如果已经登录，则启动HomeActivity
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }


        Button signInButton = (Button) findViewById(R.id.sign_in_button);
        TextView registerButton = (TextView)findViewById(R.id.register_button);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
//                Button cancel = (Button) findViewById(R.id.cancel_button);
                
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);

//                Button cancel = (Button) findViewById(R.id.cancel_button);


            }
        });
    }
}
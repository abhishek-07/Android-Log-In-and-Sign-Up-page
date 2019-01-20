package com.example.android.stayhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText urName, password;
Button clk, signup;
TextView txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        urName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        clk = (Button) findViewById(R.id.singingIn);
        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inn = new Intent(LoginActivity.this, signup.class);
                startActivity(inn);
            }
        });
        txt1 = (TextView) findViewById(R.id.text1);
        txt1.setText("Learn Code Online");
    }

    public void loginToMainActivity(View view)
    {
        String stName = urName.getText().toString();
        String stpasword = password.getText().toString();


        if (stName.equals("")|| stpasword.equals(""))
        {
            Toast.makeText(getBaseContext(), "Enter User name and Password", Toast.LENGTH_SHORT).show();
        }
        else{
            urName.setText("");
            password.setText("");
        }
    }


}

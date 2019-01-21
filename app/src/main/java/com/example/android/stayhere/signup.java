package com.example.android.stayhere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Button button = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.edt1);
        et2 = (EditText) findViewById(R.id.edt2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(signup.this, LoginActivity.class);
                if (et1.getText().toString().equals(et2.getText().toString())) {
                    startActivity(in);
                    Toast.makeText(signup.this,"SIGN UP SUCCESS",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(signup.this,"PASSWORDS DIDN'T MATCH",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

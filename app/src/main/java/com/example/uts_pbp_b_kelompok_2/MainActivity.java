package com.example.uts_pbp_b_kelompok_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnClear, btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username.getText().clear();
                password.getText().clear();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("190710356") && passwordKey.equals("win")){
                    Toast.makeText(getApplicationContext(), "Login Sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,DropdownActivity.class);
                    startActivity(intent);
                }else if (usernameKey.equals("") || passwordKey.equals("")){
                    Toast.makeText(getApplicationContext(), "Tolong Isi Username/Password yang Kosong",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Username/Password Salah",
                            Toast.LENGTH_SHORT).show();
                    username.getText().clear();
                    password.getText().clear();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
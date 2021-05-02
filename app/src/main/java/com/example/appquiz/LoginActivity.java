package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;

    private Button btnLogin;
    private Button btnSkip;
    private Button btnDaftar;

    private String strUsername;
    private String strPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        setData();
    }

    public void initView(){
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnSkip = findViewById(R.id.btnSkip);
        btnDaftar= findViewById(R.id.btnDaftar);
    }

    public void setData(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strUsername = etUsername.getText().toString();
                strPassword = etPassword.getText().toString();
                if(strUsername.equals("admin") &&  strPassword.equals("admin")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(),"Username atau Password Salah",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
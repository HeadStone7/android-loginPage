package com.example.loginpractice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class registerActivvity2 extends AppCompatActivity {
    
    public EditText email;
    public  EditText password;
    public  EditText comfirmP;
    public Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        username = findViewById(R.id.usernameID);
        Rpassword = findViewById(R.id.passwordID);
        login = findViewById(R.id.loginID);
        register =findViewById(R.id.registerID);
        
    }
}
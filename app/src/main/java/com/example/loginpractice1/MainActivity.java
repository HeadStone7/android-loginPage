package com.example.loginpractice1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button login;
    public Button register;
    public EditText username;
    public  EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlrpage);

        username = findViewById(R.id.usernameID);
        Rpassword = findViewById(R.id.passwordID);
        login = findViewById(R.id.loginID);
        register =findViewById(R.id.registerID);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr, psw;
                usr = username.getText().toString();
                psw = password.getText().toString();

                email = findViewById(R.id.EmailAddress);
                Rpassword = findViewById(R.id.password1);
                comfirmP = findViewById(R.id.comfirmpassword1);
                btnregister = findViewById(R.id.btnRegister);

                if(usr.equals("") || psw.equals("")){
                    Toast.makeText(MainActivity.this, "Please fill the form and try again", Toast.LENGTH_SHORT).show();

                } else{
                    if(usr.equals("abc") && psw.equals("abc")) {
                        Intent i = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(MainActivity.this, "Username or password incorrect", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, registerClass.class);
                startActivity(intent);
                if(email.equals("") || Rpassword.equals("") || comfirmP.equals("")){
                    Toast.makeText(MainActivity.this, "field empty, please fill and try again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
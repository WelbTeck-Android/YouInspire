package com.kwesiwelbred.youinspire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signInPage extends AppCompatActivity {
    EditText username, password;
    Button btnSignIn, btnSignUp, btn4GtnPassword, btnGoogle, btnFb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

        username = findViewById(R.id.UserNameEditText);
        password = findViewById(R.id.password_editText);

        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.sign_up);
        btn4GtnPassword = findViewById(R.id.btn_forgotPwd);
        btnGoogle = findViewById(R.id.btn_google);
        btnFb = findViewById(R.id.btn_facebook);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, passWrd;
                name = "Inspire";
                passWrd = "inspire123";

                username.getText();
                password.getText();

                if (!name.equals(username)&& !passWrd.equals(password)){
                    Toast.makeText(signInPage.this, "Sign in Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(signInPage.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(signInPage.this, "Sign Error", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

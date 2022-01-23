package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText email;
    private EditText password;
    private TextView forgot_password;
    private Button press;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            btn = findViewById(R.id.login);
            email = findViewById(R.id.email);
            password = findViewById(R.id.password);
            forgot_password=findViewById(R.id.forgot_password);
            press=findViewById(R.id.press);
            register=findViewById(R.id.register);
            btn.setOnClickListener(view -> {
                if(email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("admin")){
                    btn.setVisibility(view.GONE);
                    email.setVisibility(view.GONE);
                    password.setVisibility(view.GONE);
                    forgot_password.setVisibility(view.GONE);
                    press.setVisibility(view.GONE);
                    register.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались!", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }

            });
            email.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {}

                @Override
                public void afterTextChanged(Editable s) {
                    if(email.getText().toString().isEmpty()){
                        btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));



                    }else{
                        btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellow));

                    }
                }
            });
            password.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {}

                @Override
                public void afterTextChanged(Editable s) {
                    if(password.getText().toString().isEmpty()){
                        btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.gray));


                    }else{
                        btn.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellow));
                    }
                }
            });
        }

    }
}
package com.example.mvpproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    MainActivityContract.Presenter presenter;

    EditText username,password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenter(this);

        username = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email1 = username.getText().toString();
                String password1 = password.getText().toString();

                if (TextUtils.isEmpty(email1)||TextUtils.isEmpty(password1)){
                    onError("Field(s) Required");
                }else {
                    presenter.doLogin(email1,password1);
                }
            }
        });
    }

    @Override
    public void onSuccess(String message) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onError(String message) {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();

    }
}
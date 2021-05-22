package com.example.sem14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase db;
    private Button loginBtn;
    private EditText userInp;
    private boolean userEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance();
        loginBtn = findViewById(R.id.loginBtn);
        userInp = findViewById(R.id.userInp);

        loginBtn.setOnClickListener(
                (v) ->{
                    String user = userInp.getText().toString();
                    userEmpty = user.isEmpty();
                    if (userEmpty){
                        Toast.makeText(this, "Don't forget to write your username", Toast.LENGTH_SHORT).show();
                    }else{
                        //Si no ps cambia de pantalla
                        Intent i = new Intent(this, SecondActivity.class);
                        startActivity(i);
                    }
                }
        );
    }

    /*public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginBtn:

        }
    }*/
}
package com.example.sem14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginBtn:
                String username = UUID.randomUUID().toString();
                DatabaseReference reference = db.getReference().child("User").child("Username").child(username);
                User user = new User(
                        username,
                        userInp.getText().toString()
                );
                break;
        }
    }
}
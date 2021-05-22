package com.example.sem14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {

    private FirebaseDatabase db;
    private Button addBtn;
    private EditText remName, descInput;
    private ListView listRem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        db = FirebaseDatabase.getInstance();

        remName = findViewById(R.id.remName);
        descInput = findViewById(R.id.descInput);
        listRem = findViewById(R.id.listRem);
        addBtn = findViewById(R.id.addBtn);
    }
}
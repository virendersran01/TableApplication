package com.app.tableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText getNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getNum = findViewById(R.id.editTextNumber);
    }


    public void add(View view){
        if (getNum.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("num", getNum.getText().toString());
        intent.putExtra("task", "add");
        startActivity(intent);
    }

    public void sub(View view){
        if (getNum.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("num", getNum.getText().toString());
        intent.putExtra("task", "sub");
        startActivity(intent);
    }


    public void multi(View view){
        if (getNum.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("num", getNum.getText().toString());
        intent.putExtra("task", "multi");
        startActivity(intent);
    }


    public void div(View view){
        if (getNum.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Please enter number", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("num", getNum.getText().toString());
        intent.putExtra("task", "div");
        startActivity(intent);
    }

}
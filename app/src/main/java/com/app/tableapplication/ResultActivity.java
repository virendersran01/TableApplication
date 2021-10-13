package com.app.tableapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Get Intent
        String task = getIntent().getStringExtra("task");
        String num = getIntent().getStringExtra("num");

        // Convert String to Integer
        int number = Integer.parseInt(num);

        //Count up to 10
        int count = 10;

        //Output

        TextView result = findViewById(R.id.result);
        result.setText("Table "+num + "\n --------------------------");

        if (task.equals("add")){
            Toast.makeText(getApplicationContext(), "Addition Table", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= count ; i++) {
                int addition = number + i;
                result.append("\n" + num + " + " + i + " = "+addition);
            }
        }else if (task.equals("sub")){
            Toast.makeText(getApplicationContext(), "Subtraction Table", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= count ; i++) {
                int subtraction = number - i;
                result.append("\n" + num + " - " + i + " = "+subtraction);
            }

        }else if (task.equals("multi")){
            Toast.makeText(getApplicationContext(), "Multiplication Table", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= count ; i++) {
                int multiplication = number * i;
                result.append("\n" + num + " * " + i + " = "+multiplication);
            }
        }else {
            Toast.makeText(getApplicationContext(), "Division Table", Toast.LENGTH_SHORT).show();
            for (int i = 1; i <= count ; i++) {
                int division = number / i;
                result.append("\n" + num + " / " + i + " = "+division);
            }
        }

    }
}
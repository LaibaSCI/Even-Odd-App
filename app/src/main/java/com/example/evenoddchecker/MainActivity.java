package com.example.evenoddchecker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText numberInput = findViewById(R.id.numberInput);
        Button checkButton = findViewById(R.id.checkButton);
        TextView resultText = findViewById(R.id.resultText);

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = numberInput.getText().toString().trim();

                if (!input.isEmpty()) {
                    int num = Integer.parseInt(input);

                    if (num % 2 == 0) {
                        resultText.setText(num + " is even number");
                        resultText.setTextColor(Color.parseColor("#2E7D32")); // Dark Green
                    } else {
                        // Input number ke sath text show karna
                        resultText.setText(num + " is odd number");
                        resultText.setTextColor(Color.parseColor("#D32F2F")); // Dark Red
                    }
                } else {
                    resultText.setText("Please enter a number!");
                    resultText.setTextColor(Color.BLACK);
                }
            }
        });
    }
}
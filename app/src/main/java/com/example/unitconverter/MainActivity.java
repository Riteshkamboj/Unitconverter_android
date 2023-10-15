package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumberDecimal;
    TextView textView,textView2,textView3;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertToPound();
            }
        });
    }

    private void ConvertToPound() {
        String valueEntered = editTextNumberDecimal.getText().toString();
        double kilo = Double.parseDouble(valueEntered);
        double pounds = kilo*2.205;
        textView3.setText("Pounds: "+pounds);
    }
}
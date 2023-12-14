package com.example.calaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText value1, value2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value1 = findViewById(R.id.editTextNumber);
        value2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);

    }

    public void btn(View view) {
        double input1 = Double.parseDouble(value1.getText().toString());
        double input2 = Double.parseDouble(value2.getText().toString());
        int result1 = (int) input1 + (int) input2;
        result.setText("Addition is " + result1);
    }

    public void btn2(View view) {
        double input1 = Double.parseDouble(value1.getText().toString());
        double input2 = Double.parseDouble(value2.getText().toString());
        int result2 = (int) input1 - (int) input2;
        result.setText("Substartion is " + result2);
    }

    public void btn3(View view) {
        double input1 = Double.parseDouble(value1.getText().toString());
        double input2 = Double.parseDouble(value2.getText().toString());
        int result3 = (int) input1 * (int) input2;
        result.setText("Multiplication is " + result3);
    }

    public void btn4(View view) {
        double input1 = Double.parseDouble(value1.getText().toString());
        double input2 = Double.parseDouble(value2.getText().toString());
        double result4 = input1 / input2;
        String sum;
        if ((result4 == Math.floor(result4)) && !Double.isInfinite(result4)) {
            sum = String.valueOf((int) result4);
            result.setText("Divison is " + sum);
        } else {
            sum = String.format("%.667f", result4);
            result.setText("Divison is " + sum);
        }
    }
}
package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result_field;
    Double firstValue, twoValue, result;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_field = findViewById(R.id.result_field);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.seven:
                result_field.append("7");
                break;
            case R.id.eight:
                result_field.append("8");
                break;
            case R.id.nine:
                result_field.append("9");
                break;
            case R.id.six:
                result_field.append("6");
                break;
            case R.id.five:
                result_field.append("5");
                break;
            case R.id.four:
                result_field.append("4");
                break;
            case R.id.three:
                result_field.append("3");
                break;
            case R.id.two:
                result_field.append("2");
                break;
            case R.id.one:
                result_field.append("1");
                break;
            case R.id.zero:
                result_field.append("0");
                break;
        }
    }

    public void onOperationClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.clear:
                    result_field.setText("");
                    break;
                case R.id.plus:
                    operation = "+";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText("+");
                    break;
                case R.id.division:
                    operation = "/";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText("/");
                    break;
                case R.id.minus:
                    operation = "-";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText("-");
                    break;
                case R.id.dot:
                    operation = ".";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText( ".");
                    break;
                case R.id.multip:
                    operation = "*";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText("*");
                    break;
                case R.id.equal:
                    if (operation != null) {
                        String two = result_field.getText().toString()
                                .replace(firstValue + operation + " ", " ");
                        twoValue = Double.valueOf(two);
                        switch (operation) {
                            case "+":
                                plusOp();
                                break;
                            case "/":
                                divisionOp();
                                break;
                            case "-":
                                minus();
                                break;

                            case "*":
                                multiply();
                                break;
                        }

                    }
            }
        } catch (Exception e) {
        }
    }


    public void plusOp() {
        result = firstValue + twoValue;
        result_field.setText(firstValue + operation + twoValue+ "="+result);
    }


    public void divisionOp() {
        result = firstValue / twoValue;
        result_field.setText(firstValue + operation + twoValue +  "=" +result);
    }

    public void minus() {
        result = firstValue - twoValue;
        result_field.setText(firstValue + operation + twoValue +  "=" +result);
    }


        public void multiply() {
            result = firstValue * twoValue;
            result_field.setText(firstValue + operation + twoValue +  "=" +result);
        }

    }














package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result_field;
    Double firstValue,twoValue,result;
    String operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_field=findViewById(R.id.result_field);
    }

    public void onNumberClick (View view) {
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





        }}
        public void onOperationClick(View view){
        try {



            switch (view.getId()) {
                case R.id.clear:
                    result_field.setText("");
                    break;
                case R.id.plus:

                    operation = "+";
                        firstValue = Double.valueOf(result_field.getText().toString());
                        result_field.setText(firstValue + "+");
                        break;

                       case R.id.division:
//                            if(result_field== null){
//                                result_field.setText(" ");
//
//                            }else {
//                                result_field.setText("/");

                    operation = "/";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    result_field.setText(firstValue + "/");
                    break;


            case R.id.minus:
//                if(result_field ==null){
//                    result_field.setText(" ");
//                }else {
//                    result_field.setText("-");
//                }
                operation = "-";
                firstValue = Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValue + "-");
                break;

            case R.id.comma:
//                if (result_field==null){
//                    result_field.setText(" ");
//
//                }else {result_field.setText(",");}

                    result_field.setText(firstValue + ",");

                    operation = ",";
                    firstValue = Double.valueOf(result_field.getText().toString());
                    break;

            case R.id.multip:
//                if (result_field == null){
//                    result_field.setText(" ");
//                }else result_field.setText("*");

                operation = " *";
                firstValue = Double.valueOf(result_field.getText().toString());
                result_field.setText(firstValue + "*");
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
                        case ",":
                            comma();
                            break;
                        case "*":
                            multiply();
                            break;
                    }
                }
        }}catch (Exception e){}
    }


    public void plusOp() {
        result = firstValue + twoValue;
        result_field.setText(result.toString());
    }

    public void divisionOp() {
        result = firstValue/ twoValue;
        result_field.setText(result.toString());
    }
    public void minus(){
        result = firstValue/twoValue;
        result_field.setText(result.toString());
    }
    public void comma(){
        result = firstValue/twoValue;
        result_field.setText(result.toString());
    }
    public void multiply(){
        result = firstValue/twoValue;
        result_field.setText(result.toString());
    }

    }












package com.e.newcalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean addition = false , subtraction = false, multiplication = false, division = false;

    Float numOne,numTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button)findViewById(R.id.bn1);
        Button two = (Button)findViewById(R.id.bn2);
        Button three = (Button)findViewById(R.id.bn3);
        Button four = (Button)findViewById(R.id.bn4);
        Button five = (Button)findViewById(R.id.bn5);
        Button six = (Button)findViewById(R.id.bn6);
        Button seven = (Button)findViewById(R.id.bn7);
        Button eight = (Button)findViewById(R.id.bn8);
        Button nine = (Button)findViewById(R.id.bn9);
        Button zero = (Button)findViewById(R.id.bn0);
        Button add = (Button)findViewById(R.id.bnAdd);
        Button sub = (Button)findViewById(R.id.bnSub);
        Button mul = (Button)findViewById(R.id.bnMul);
        Button div = (Button)findViewById(R.id.bnDiv);
        Button equalTo = (Button)findViewById(R.id.bnEqualTo);
        Button decimal = (Button)findViewById(R.id.bnDec);
        Button clear = (Button)findViewById(R.id.clr);
        final TextView inputNum = (TextView)findViewById(R.id.testBoxOne);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNum.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    numOne = Float.parseFloat(inputNum.getText().toString());
                    addition = true;
                    inputNum.setText(null);
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNum.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    numOne = Float.parseFloat(inputNum.getText().toString());
                    subtraction = true;
                    inputNum.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNum.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    numOne = Float.parseFloat(inputNum.getText().toString());
                    multiplication = true;
                    inputNum.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNum.getText().toString() == "") {
                    Toast.makeText(getApplicationContext(), "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    numOne = Float.parseFloat(inputNum.getText().toString());
                    division = true;
                    inputNum.setText(null);
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(inputNum.getText().toString() + ".");
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNum.setText(null);
            }
        });

        equalTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputNum.getText().toString() == ""){
                    Toast.makeText(getApplicationContext(),"Please enter a number",Toast.LENGTH_SHORT).show();
                }
                else {
                    numTwo = Float.parseFloat(inputNum.getText().toString());

                    if (addition == true) {
                        inputNum.setText(numOne + numTwo + "");
                        addition = false;
                    } else if (subtraction == true) {
                        inputNum.setText(numOne - numTwo + "");
                        subtraction = false;
                    } else if (multiplication == true) {
                        inputNum.setText(numOne * numTwo + "");
                        multiplication = false;
                    } else if (division == true) {
                        inputNum.setText(numOne / numTwo + "");
                        division = false;
                    }
                }
            }
        });



    }
}

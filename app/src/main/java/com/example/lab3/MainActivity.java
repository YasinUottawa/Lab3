package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.EditText;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private enum Operator{none,add,minus,multiply,divide};
    private double data1=0, data2=0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }

    public void button2Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }

    public void button3Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }

    public void button4Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }

    public void button5Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }

    public void button6Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }

    public void button7Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }

    public void button8Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }

    public void button9Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }

    public void button0Click(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }

    public void buttonCClick(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText("");
    }
    public void button_dotClick(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

    public void button_plusClick(View view){
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void button_minusClick(View view){
        optr = Operator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void button_multiplicationClick(View view){
        optr = Operator.multiply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void button_divisionClick(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        optr = Operator.divide;
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void button_equalsClick(View view){
        if(optr!= Operator.none){
            EditText eText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if(optr==Operator.add){
                result = data1+data2;
            }
            else if(optr ==Operator.minus){
                result = data1-data2;
            }
            else if(optr ==Operator.multiply){
                result = data1*data2;
            }
            else if(optr ==Operator.divide){
                result = data1/data2;
            }
            optr=Operator.none;
            data1 = result;
            if((result-(int)result)!=0){
                eText.setText(String.valueOf(result));
            }
            else{
                eText.setText(String.valueOf((int)result));
            }
        }
    }




}

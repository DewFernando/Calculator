package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<txtValue1> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    double answer;

    public void addCount(View v){
        EditText txtValue1 = findViewById(R.id.txtValue1);
        String value1 = txtValue1.getText().toString();
        double v1 = Double.parseDouble(value1);

        EditText txtValue2 = findViewById(R.id.txtValue2);
        String value2 = txtValue2.getText().toString();
        double v2 = Double.parseDouble(value2);

        answer= v1+v2;
        TextView lblAnswerbox = findViewById(R.id.lblAnswerbox);
        lblAnswerbox.setText("" + answer);
    }

    public void subCount(View v) {
        EditText txtValue1 = findViewById(R.id.txtValue1);
        String value1 = txtValue1.getText().toString();
        double v1 = Double.parseDouble(value1);

        EditText txtValue2 = findViewById(R.id.txtValue2);
        String value2 = txtValue2.getText().toString();
        double v2 = Double.parseDouble(value2);

        answer = v1 - v2;
        TextView lblAnswerbox = findViewById(R.id.lblAnswerbox);
        lblAnswerbox.setText("" + answer);
    }

    public void mulCount(View v) {
        EditText txtValue1 = findViewById(R.id.txtValue1);
        String value1 = txtValue1.getText().toString();
        double v1 = Double.parseDouble(value1);

        EditText txtValue2 = findViewById(R.id.txtValue2);
        String value2 = txtValue2.getText().toString();
        double v2 = Double.parseDouble(value2);

        answer = v1 * v2;
        TextView lblAnswerbox = findViewById(R.id.lblAnswerbox);
        lblAnswerbox.setText("" + answer);
    }

    public void divCount(View v) {
        EditText txtValue1 = findViewById(R.id.txtValue1);
        String value1 = txtValue1.getText().toString();
        double v1 = Double.parseDouble(value1);

        EditText txtValue2 = findViewById(R.id.txtValue2);
        String value2 = txtValue2.getText().toString();
        double v2 = Double.parseDouble(value2);

        answer = v1 / v2;
        TextView lblAnswerbox = findViewById(R.id.lblAnswerbox);
        lblAnswerbox.setText("" + answer);
    }

    public void clearCount(View v) {

        TextView txtValue1 = findViewById(R.id.txtValue1);
        txtValue1.setText(" ");

        TextView txtValue2 = findViewById(R.id.txtValue2);
        txtValue2.setText(" ");

        answer =0;
        TextView lblAnswerbox = findViewById(R.id.lblAnswerbox);
        lblAnswerbox.setText(" ");
    }


}


package com.frankchoi.sumkata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        TextView num1Text = (TextView)findViewById(R.id.num1Text);
        TextView num2Text = (TextView)findViewById(R.id.num2Text);

        String resultSum = SumUtil.sum(num1Text.getText().toString(), num2Text.getText().toString());

        TextView resultText = (TextView)findViewById(R.id.resultText);
        resultText.setText(resultSum);
    }
}

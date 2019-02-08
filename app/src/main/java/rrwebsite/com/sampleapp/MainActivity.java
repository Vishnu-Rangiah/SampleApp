package rrwebsite.com.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button addNumBtn = (Button) findViewById(R.id.addNumBtn);
        addNumBtn.setOnClickListener(new View.OnClickListener() {
            @Override//creates on click event
            public void onClick(View view) {
                //code goes here
                EditText num1editText = (EditText) findViewById(R.id.num1editText);
                EditText num2editText = (EditText) findViewById(R.id.num2editText);
                TextView result = (TextView) findViewById(R.id.resultTextView);

                int num_1=Integer.parseInt(num1editText.getText().toString());
                int num_2=Integer.parseInt(num2editText.getText().toString());
                int resultNums = num_1 + num_2;
                result.setText(resultNums + "");
            }
        });



    }


}

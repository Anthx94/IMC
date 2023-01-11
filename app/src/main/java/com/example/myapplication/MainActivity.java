package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textViewid;
    TextView textid;
    EditText numbercmid;
    EditText numberkgid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // elements of GUI
        button = (Button) findViewById(R.id.button1);
        numbercmid=(EditText)findViewById(R.id.numbercm);
        numberkgid=(EditText)findViewById(R.id.numberkg);
        textViewid= (TextView) findViewById(R.id.textView);
        textid = (TextView) findViewById(R.id.textIMC);



        // click on the button
        // att, use automatic completion
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valCM = numbercmid.getText().toString();
                float intValCM = Integer.parseInt(valCM);

                String valKG = numberkgid.getText().toString();
                int intValKG = Integer.parseInt(valKG);

                float result = intValKG / (intValCM/100 * intValCM/100);
                textid.setText("Votre IMC est de :");
                textViewid.setText(String.valueOf(result));
            }
        });
    }
}
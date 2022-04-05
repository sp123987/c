package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText ed1 = (EditText) findViewById(R.id.ed1);
        EditText ed2 = (EditText) findViewById(R.id.ed2);

        TextView tview = findViewById(R.id.textView);

        int a;
        int b;
        int c;

        a = Integer.parseInt(ed1.getText().toString());
        b = Integer.parseInt(ed2.getText().toString());
        c = a+b;
        tview.setText(Integer.toString(c));
    }
}
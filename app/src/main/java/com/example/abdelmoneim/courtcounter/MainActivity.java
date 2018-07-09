package com.example.abdelmoneim.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      int a = 0;
      int b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonAdd3ofA = (Button) findViewById(R.id.buttonAdd3ofA);
        Button buttonAdd2ofA = (Button) findViewById(R.id.buttonAdd2ofA);
        Button buttonAdd1ofA = (Button) findViewById(R.id.buttonAdd1ofA);
        Button reset = (Button) findViewById(R.id.reset);
        buttonAdd3ofA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          a = a + 3;
          displyA(a);
            }
        });
        buttonAdd2ofA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 2;
               displyA(a);
            }
        });
        buttonAdd1ofA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = a + 1;
                displyA(a);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 0;
                b = 0;
                displyA(a);
                displyB(b);
            }
        });
    }
    public void onClike3B(View v){
        b = b + 3;
        displyB(b);
    }
    public void onClike2B(View v){
        b = b + 2;
        displyB(b);
    }
    public void onClike1B(View v){
        b = b + 1;
        displyB(b);
    }

    private void displyA(int number){
        TextView TextViewA = (TextView) findViewById(R.id.TeamA);
        TextViewA.setText(""+number);
    }
    private void displyB(int number){
        TextView TextViewB = (TextView) findViewById(R.id.TeamB);
        TextViewB.setText(""+number);
    }

}

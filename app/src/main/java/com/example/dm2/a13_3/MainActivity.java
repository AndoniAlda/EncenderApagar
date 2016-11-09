package com.example.dm2.a13_3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button btnEncencer;
    private Button btnApagar;
    private LinearLayout pdr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEncencer = (Button) findViewById(R.id.btnEncender);
        btnApagar = (Button) findViewById(R.id.btnApagar);
        pdr = (LinearLayout) findViewById(R.id.pdr);
        btnEncencer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                pdr.setBackgroundColor(Color.YELLOW);
            }
        });
        btnApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdr.setBackgroundColor(Color.GRAY);
            }
        });
    }
}

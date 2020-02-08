package com.example.changevalues;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int font=60;
int ch=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView t1=findViewById(R.id.textView1);

        Button b1=findViewById(R.id.btn1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setTextSize(font);
                font=font+10;
                if(font==100)
                {
                    font=60;
                }
            }
        });

        Button b2=findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ch==1)
                {
                    t1.setTextColor(Color.RED);
                    ch=2;
                }else
                if(ch==2)
                {
                    t1.setTextColor(Color.YELLOW);
                    ch=1;
                }
            }
        });
    }
}

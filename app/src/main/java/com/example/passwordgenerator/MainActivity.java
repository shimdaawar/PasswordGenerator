package com.example.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
           EditText num;
           TextView view;
           Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num=(EditText)findViewById(R.id.etnum);
        view=(TextView)findViewById(R.id.textView);
        click=(Button)findViewById(R.id.btnclick);
        click.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int len=Integer.parseInt(num.getText().toString());
                Random ra=new Random();
                String alpha="ABCDEFGHIJKLMNOPQRSTQVWXYZ";
                String numbers="1234567890";
                String symbols="@#$%^&*";
                String values=alpha+numbers+symbols;
                char[] c =new char[len];
                for(int x=0;x<len;x++)
                    c[x] = values.charAt(ra.nextInt(values.length()));
                String sc=new String(c);
                view.setText(sc);
            }
        });
    }
}
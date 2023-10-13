package com.example.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void check(View v){
        EditText value = findViewById(R.id.et);
        String seq = value.getText().toString();
        StringBuilder revTemp=new StringBuilder(seq);
        revTemp=revTemp.reverse();
        String rev= revTemp.toString();

        TextView ans=findViewById(R.id.tv1);
        if(rev.equals(seq)){
            ans.setText("Yes. It's a Palindrome.");
        }
        else{
            ans.setText("No!! It's not a Palindrome.");
        }
    }
}
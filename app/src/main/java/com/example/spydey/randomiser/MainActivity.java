package com.example.spydey.randomiser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    final int min = 1;
    final int max = 20;
    final int random = new Random().nextInt((max - min) + 1) + min;
    int count=0;
    public void randomChecker(View view)
    {
        EditText Text1=(EditText)findViewById(R.id.editText);
        String s = Text1.getText().toString();
        int x=Integer.parseInt(s);

        if(x>random)
        {
            count=count+1;
            Toast.makeText(this, "Search Lower"+" Attempt="+(count), Toast.LENGTH_SHORT).show();
        }
        else if(x<random)
        {
            count=count+1;
            Toast.makeText(this, "Search Higher"+"  Attempt="+count, Toast.LENGTH_SHORT).show();
        }
        else
            {
                count=count+1;
                Toast.makeText(this, "Congrats you got it!!"+" Attempt="+count, Toast.LENGTH_SHORT).show();
            }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

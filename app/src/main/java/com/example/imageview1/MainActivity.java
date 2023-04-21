package com.example.imageview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;
    int num =0;
    Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        iv= findViewById(R.id.imageView);
    }

    public void btn(View view) {
        num = rnd.nextInt(3)+1;
        switch (num){
            case 1:
                btn.setText("1");
                iv.setImageResource(R.drawable.rock);
                break;
            case 2:
                btn.setText("2");
                iv.setImageResource(R.drawable.paper);
                break;
            case 3:
                btn.setText("3");
                iv.setImageResource(R.drawable.scissors);
                break;

        }
    }
}
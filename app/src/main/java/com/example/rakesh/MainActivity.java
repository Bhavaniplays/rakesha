package com.example.rakesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        Intent intent= new Intent(this,MainActivity2.class);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    startActivity(intent);//my greatest tribute to greekfor greeks website


        }

    });
}
}

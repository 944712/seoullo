package com.example.user.seoulloapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enjoy= (Button)findViewById(R.id.enjoy); //서울로 즐기기
        Button guide= (Button)findViewById(R.id.guide); //서울로 이용안내


        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainGuide.class);
                startActivity(i);
            }
        });
        enjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EnjoyActivity.class);
                startActivity(i);
            }
        });
    }
}

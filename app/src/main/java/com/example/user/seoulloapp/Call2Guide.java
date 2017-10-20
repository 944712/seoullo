package com.example.user.seoulloapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//서울로 주요업무별 전화번호
public class Call2Guide extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_call2);

        Button call =(Button)findViewById(R.id.call1);

        //서울로 안내소
        ImageButton num1 = (ImageButton) findViewById(R.id.info);
        //서울로 가게
        ImageButton num2 = (ImageButton) findViewById(R.id.store);
        //서울로 여행자카페
        ImageButton num3 = (ImageButton) findViewById(R.id.tourist);
        //목련다방
        ImageButton num4 = (ImageButton) findViewById(R.id.magCafe);
        //수국식빵
        ImageButton num5 = (ImageButton) findViewById(R.id.bread);
        //장미빙수
        ImageButton num6 = (ImageButton) findViewById(R.id.roseIce);
        //7017 서울화반
        ImageButton num7 = (ImageButton) findViewById(R.id.flowerpot);
        //도토리풀빵
        ImageButton num8 = (ImageButton) findViewById(R.id.acorn);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inten = new Intent(Call2Guide.this, Call1Guide.class);
                startActivity(inten);
            }
        });
    }

    public void onClick(View view) {
        String tel = "tel:02-312-9575"; //서울로 안내소
        String tel2 = "tel:02-312-9836"; //서울로 가게
        String tel3 = "tel:02-312-8340"; //서울로 여행자카페
        String tel4 = "tel:02-312-5170"; //목련다방
        String tel5 = "tel:02-312-4714"; //수국식빵
        String tel6 = "tel:02-312-4971"; //장미빙수
        String tel7 = "tel:02-312-1697"; //7017 서울화반
        String tel8 = "tel:02-312-1892"; //도토리풀빵

        switch (view.getId()) {
            case R.id.info:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                break;
            case R.id.store:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel2)));
                break;
            case R.id.tourist:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel3)));
                break;
            case R.id.magCafe:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel4)));
                break;
            case R.id.bread:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel5)));
                break;
            case R.id.roseIce:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel6)));
                break;
            case R.id.flowerpot:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel7)));
                break;
            case R.id.acorn:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel8)));
                break;
        }
    }
}

package com.example.user.seoulloapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

//서울로 주요업무별 전화번호
public class Call1Guide extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_call);

        Button call = (Button) findViewById(R.id.call2);//관광 편의시설 전화번호 이동

        //서울로7017 총괄관리(안전, 관광편의)
        ImageButton num1 = (ImageButton) findViewById(R.id.total);
        //서울로7017 시설운영(행사, 프로그램)
        ImageButton num2 = (ImageButton) findViewById(R.id.event);
        //서울로7017 시설관리(시설, 식물관리)
        ImageButton num3 = (ImageButton) findViewById(R.id.plant);
        //서울로7017 공사
        ImageButton num4 = (ImageButton) findViewById(R.id.construction);
        //문화관광해설사와 함께하는 서울로 도보관광
        ImageButton num5 = (ImageButton) findViewById(R.id.walk);
        //서울역 일대 도시재생 활성화 계획
        ImageButton num6 = (ImageButton) findViewById(R.id.city);


        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Call1Guide.this, Call2Guide.class);
                startActivity(intent);
            }
        });
    }

    public void onClick(View view){
        String tel = "tel:02-2133-4479"; //서울로7017 총괄관리(안전, 관광편의)
        String tel2 = "tel:02-2133-4475"; //서울로7017 시설운영(행사, 프로그램)
        String tel3 = "tel:02-2133-4492"; //서울로7017 시설관리(시설, 식물관리)
        String tel4 = "tel:02-3708-2544"; //서울로7017 공사
        String tel5 = "tel:02-6925-0777"; //문화관광해설사와 함께하는 서울로 도보관광
        String tel6 = "tel:02-2133-8643"; //서울역 일대 도시재생 활성화 계획

                switch (view.getId()){
                    case R.id.total:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                        break;
                    case R.id.event:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel2)));
                        break;
                    case R.id.plant:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel3)));
                        break;
                    case R.id.construction:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel4)));
                        break;
                    case R.id.walk:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel5)));
                        break;
                    case R.id.city:
                        startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel6)));
                        break;

                }
    }



}


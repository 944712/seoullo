package com.example.user.seoulloapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

//서울로즐기기 지도
public class EnjoyActivity extends AppCompatActivity{
    Button yoonseul;
    Button plaza;
    ImageButton plant1,plant2,plant3;
    ImageButton theather,rose;
    Button gallery,rest;
    ImageButton bangbang;
    Button cafe;
    ImageButton coffee,magnolia;
    Button store,information;

    CustomDialog cd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enjoy);
        DisplayMetrics dm = getApplicationContext().getResources().getDisplayMetrics(); //디바이스 화면크기를 구하기위해
        int width = dm.widthPixels; //디바이스 화면 너비
        int height = dm.heightPixels; //디바이스 화면 높이

        yoonseul = (Button) findViewById(R.id.yoonseul);
        plaza = (Button) findViewById(R.id.plaza);
        plant1 = (ImageButton) findViewById(R.id.plant1);
        plant2 = (ImageButton) findViewById(R.id.plant2);
        plant3 = (ImageButton) findViewById(R.id.plant3);
        theather = (ImageButton) findViewById(R.id.theater);
        rose = (ImageButton) findViewById(R.id.rose);
        gallery = (Button) findViewById(R.id.gallery);
        rest = (Button) findViewById(R.id.rest);
        bangbang = (ImageButton) findViewById(R.id.bangbang);
        cafe = (Button)findViewById(R.id.cafe);
        coffee = (ImageButton) findViewById(R.id.coffee);
        magnolia = (ImageButton) findViewById(R.id.magnolia);
        store = (Button)findViewById(R.id.store);
        information = (Button)findViewById(R.id.information);


        cd = new CustomDialog(this);
        WindowManager.LayoutParams wm = cd.getWindow().getAttributes();  //다이얼로그의 높이 너비 설정하기위해
        wm.copyFrom(cd.getWindow().getAttributes());  //여기서 설정한값을 그대로 다이얼로그에 넣겠다는의미
        wm.width = width / 2;  //화면 너비의 절반
        wm.height = height / 2;  //화면 높이의 절반


        yoonseul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("윤슬");
                cd.img.setImageResource(R.drawable.yoonseul);
            }
        });
        plaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("만리동 광장");
                cd.img.setImageResource(R.drawable.plaza);
                cd.cont.setText("시민들의 쉼터 및 휴식공간");
            }
        });
        plant1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("호기심화분(들려요)");
                cd.img.setImageResource(R.drawable.plant);
                cd.cont.setText("서울의 대표적인 장소 18개소의 소리와 영상을 관망구를 통해 볼 수 있는 시설");
            }
        });
        plant2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("호기심화분(신비해요)");
                cd.img.setImageResource(R.drawable.plant);
                cd.cont.setText("숭례문을 배경으로 CG로 연출되는 AR기법을 통해 보여지는 실제공간을 새로운 공간으로 연출한 시설");
            }
        });
        plant3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("호기심화분(보여요)");
                cd.img.setImageResource(R.drawable.plant);
            }
        });
        theather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("담쟁이극장");
                cd.img.setImageResource(R.drawable.theater);
                cd.cont.setText("어린이 인형극 상설 공연장");
            }
        });
        rose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("장미무대");
                cd.img.setImageResource(R.drawable.rose);
                cd.cont.setText("공연 체험 프로그램 시설");
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("서울로 전시관");
                cd.img.setImageResource(R.drawable.gallery);
            }
        });
        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("공중자연쉼터");
                cd.img.setImageResource(R.drawable.rest);
                cd.cont.setText("시원하게 발을 담그고 경치를 즐길 수 있는 곳");
            }
        });
        bangbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("방방놀이터");
                cd.img.setImageResource(R.drawable.bang);
                cd.cont.setText("트램폴린");
            }
        });
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("서울로여행자카페");
                cd.img.setImageResource(R.drawable.cafe);
            }
        });
        coffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("목련다방");
                cd.img.setImageResource(R.drawable.coffee);
            }
        });
        magnolia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("목련무대");
                cd.img.setImageResource(R.drawable.magnolia);
                cd.cont.setText("인근 직장인과 지역주민을 위한 문화, 놀이프로그램으로 운영");
            }
        });
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("서울로가게");
                cd.img.setImageResource(R.drawable.store);
                cd.cont.setText("서울로 기념품 전시, 판매");
            }
        });
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cd.show();  //다이얼로그
                cd.title.setText("안내소");
                cd.img.setImageResource(R.drawable.information);
                cd.cont.setText("서울로 안내소");
            }
        });


    }
}

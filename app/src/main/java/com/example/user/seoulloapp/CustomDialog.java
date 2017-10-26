package com.example.user.seoulloapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 2017-10-26.
 */

public class CustomDialog extends Dialog {
    TextView title;
    TextView cont;
    ImageButton cancle;
    ImageView img;

    public CustomDialog(Context context){
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setContentView(R.layout.activity_dialog);

        title = (TextView)findViewById(R.id.dialog_title);
        cont = (TextView)findViewById(R.id.dialog_context);
        cancle = (ImageButton)findViewById(R.id.dialog_cancle);
        img = (ImageView)findViewById(R.id.dialog_img);

        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();   //다이얼로그를 닫는 메소드입니다.
            }
        });

    }
}

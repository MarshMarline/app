package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mTv5,mTv6,mTv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv5 = findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mTv5.getPaint().setAntiAlias(true);//去除锯齿

        mTv6 = findViewById(R.id.tv_6);
        mTv6.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mTv7 = findViewById(R.id.tv_7);
        mTv7.setText(Html.fromHtml("<u>天哥在奔跑</>"));
    }
}

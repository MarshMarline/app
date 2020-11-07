package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv4 = findViewById(R.id.iv_4);
        //需要在Manifest声明权限才能访问网络，如下
        //<uses-permission android:name="android.permission.INTERNET"/>
        Glide.with(this).load("https://www.tfswufe.edu.cn/static/img/publicIcon/logo.png").into(mIv4);
    }
}

package com.example.helloworld;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Manifest文件：非常重要，所有用到的activity都需要在Manifest里面声明注册，这样才能调用启动
 * build.gradle:可以设置版本号、版本名称
 */

public class MainActivity extends AppCompatActivity {

    //声明组件
    private Button mBtnTextView;//alt + 回车导包
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button getmBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
/*        mBtnTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //这里报错，需要实现接口？
                //跳转到了TextView演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnButton = findViewById(R.id.btn_button);
/*        mBtnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳转到了TextView演示界面
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnEditText = findViewById(R.id.btn_edittext);
/*        mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到了edit演示界面
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });*/
        getmBtnRadioButton = findViewById(R.id.btn_radiobutton);

        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageView = findViewById(R.id.btn_imageview);
        setListeners();
    }

    private void  setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        getmBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);

    }
    private class OnClick implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_edittext:
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButtonActivity演示界面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case  R.id.btn_checkbox:
                    //跳转到CheckBox演示界面
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case  R.id.btn_imageview:
                    //跳转到imageview演示界面
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
            }
            startActivity(intent);
        }
    }
}

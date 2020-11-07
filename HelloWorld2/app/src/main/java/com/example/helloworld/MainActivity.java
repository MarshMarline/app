package com.example.helloworld;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRadioButton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutdemo);
        EditText et = findViewById(R.id.name_1);
        RadioGroup rg1 = findViewById(R.id.radio_group);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
                RadioButton radioButton = group.findViewById(checkedId);
                Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox mCb1 = (CheckBox) findViewById(R.id.hobby_1);
        CheckBox mCb2 = (CheckBox) findViewById(R.id.hobby_2);

        mCb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"唱选中":"唱未选中",Toast.LENGTH_SHORT).show();
            }
        });

        mCb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this,isChecked?"跳选中":"跳未选中",Toast.LENGTH_SHORT).show();
            }
        });
        }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.layoutdemo);
        btnRadioButton1 = findViewById(R.id.visit_place_2);


    }
}

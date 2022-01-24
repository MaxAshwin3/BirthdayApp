package com.example.developerandroid1.Activity;


import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

import com.example.developerandroid1.Base.BaseActivity;
import com.example.developerandroid1.R;



public class BirthdayActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        initData();
        initUi();
    }

    @Override
    protected void initUi() {
        super.initUi();

        AppCompatTextView nameTextView = findViewById(R.id.nameView);

        Intent intent = getIntent();
        String str = intent.getStringExtra("MESSAGE");
        nameTextView.setText(str);
    }
}
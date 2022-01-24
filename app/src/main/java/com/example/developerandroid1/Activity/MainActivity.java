package com.example.developerandroid1.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.developerandroid1.Base.BaseActivity;
import com.example.developerandroid1.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
        initData();


    }

    @Override
    protected void initData() {
        super.initData();

    }

    @Override
    protected void initUi() {
        super.initUi();
        AppCompatEditText nameText = findViewById(R.id.editext);
        AppCompatButton sendButton = findViewById(R.id.button);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Text ;
                Text = nameText.getText().toString();

                Intent intent = new Intent(getApplicationContext(),BirthdayActivity.class);
                intent.putExtra("MESSAGE" , Text);
                startActivity(intent);
            }
        });
    }
}
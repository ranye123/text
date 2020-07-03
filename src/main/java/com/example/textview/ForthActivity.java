package com.example.textview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ForthActivity extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.none);
        textView = findViewById(R.id.ww2);
        imageView = findViewById(R.id.iv_1);
        Glide.with(this).load("https://www.soso.com/soso/images/logo_index_sosox2.png?v=2").into(imageView);
    }
}

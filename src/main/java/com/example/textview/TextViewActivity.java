package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.textview.Listview.GrideSecondActivity;
import com.example.textview.Listview.GrideViewDemoActivity;
import com.example.textview.Listview.ListViewActivity;
import com.example.textview.Listview.TabHostDemoActivity;
import com.example.textview.Listview.WebViewActivity;
import com.example.textview.recyclerview.RecyclerViewActivity;

public class TextViewActivity extends AppCompatActivity {
    //private TextView textview;
    private RadioButton radioButton;
    private RadioButton radioButton1;
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        //textview = findViewById(R.id.textview1);
        radioButton = findViewById(R.id.rbtn_1);
        radioButton1 = findViewById(R.id.rbtn_2);
        button1 = findViewById(R.id.bt1);
        button2 = findViewById(R.id.bt2);
        button3 = findViewById(R.id.bt3);
        button4 = findViewById(R.id.bt4);
        button5 = findViewById(R.id.bt5);
        button6 = findViewById(R.id.bt6);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        radioButton.setOnClickListener(onClick);
        radioButton1.setOnClickListener(onClick);
        button1.setOnClickListener(onClick);
        button2.setOnClickListener(onClick);
        button3.setOnClickListener(onClick);
        button4.setOnClickListener(onClick);
        button5.setOnClickListener(onClick);
        button6.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.rbtn_1:
                    Intent intent1 = new Intent(TextViewActivity.this,ThirdActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.rbtn_2:
                   Intent intent2 =  new Intent(TextViewActivity.this,ForthActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.bt1:
                    Intent intent3 = new Intent(TextViewActivity.this, ListViewActivity.class);
                    startActivity(intent3);
                    break;
                case R.id.bt2:
                    Intent intent4 = new Intent(TextViewActivity.this, GrideSecondActivity.class);
                    startActivity(intent4);
                    break;
                case R.id.bt3:
                    Intent intent5 = new Intent(TextViewActivity.this, GrideViewDemoActivity.class);
                    startActivity(intent5);
                    break;
                case R.id.bt4:
                    Intent intent6 = new Intent(TextViewActivity.this, TabHostDemoActivity.class);
                    startActivity(intent6);
                    break;
                case R.id.bt5:
                    Intent intent7 = new Intent(TextViewActivity.this, WebViewActivity.class);
                    startActivity(intent7);
                    break;
                case R.id.bt6:
                    Intent intent8 = new Intent(TextViewActivity.this, RecyclerViewActivity.class);
                    startActivity(intent8);
                    break;
            }
        }
    }
}

package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static com.example.textview.R.id.btn_textview;

public class MainActivity extends AppCompatActivity {

    private EditText et_1;
    private Button BtnTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnTextView = findViewById(btn_textview);
        et_1 = findViewById(R.id.et_1);
        BtnTextView.setOnClickListener(new mClick());
    }

        class mClick implements View.OnClickListener {
            public void onClick(View view) {
                String passwd;
                passwd = et_1.getText().toString();
                if (passwd.equals("LL0829")) {
                    Toast.makeText(MainActivity.this, "密码正确", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this, "密码错了，给你个提示，是LL0829", LENGTH_LONG).show();
            }
        }
    }
package com.example.quicklaunch;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("org.mentor.school.SOMTHING")) // check xem Main_Activity có gui tin hieu "org.mentor.school.SOMTHING" qua không?
        {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.mentor.school.SOMTHING"); // bien text se mang gia tri hello world ben Main_Activity
            tv.setText(text); // hien thi chuoi text ra

        }

    }
}

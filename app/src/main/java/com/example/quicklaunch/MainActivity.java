package com.example.quicklaunch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //----------------------------------------------------------------
        // Attempts to launch another activity within our own app
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class); // tao bien startIntent
                startIntent.putExtra("org.mentor.school.SOMTHING", "hello world");
                startActivity(startIntent); // thuc hien hanh dong starIntent
            }
        });
        //-----------------------------------------------------------------------
        // Attempts to launch another app outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String google = "http://www.google.com"; // tao bien google kieu string va gan link trang web
                Uri webaddress = Uri.parse(google); // tao bien webaddress kieu URI

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress); // tao 1 intent co ten la gotoGoogle  & View den webaddress
                if (gotoGoogle.resolveActivity(getPackageManager()) != null )
                {
                    startActivity(gotoGoogle); // thuc hien hanh dong gotoGoogle

                }


            }
        });

    }
}

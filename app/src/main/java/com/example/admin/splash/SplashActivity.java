package com.example.admin.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    finish();

                }
            }
        };
        thread.start();
    }
}
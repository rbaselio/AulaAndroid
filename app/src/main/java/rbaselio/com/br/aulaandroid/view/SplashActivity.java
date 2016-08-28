package rbaselio.com.br.aulaandroid.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rbaselio.com.br.aulaandroid.R;

public class SplashActivity extends AppCompatActivity {
    private final static int TIME_SPLASH = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashBoard = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(dashBoard);
                finish();

            }
        }, TIME_SPLASH);
    }
}

package rbaselio.com.br.aulaandroid.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rbaselio.com.br.aulaandroid.R;

public class SplashActivity extends AppCompatActivity {
    private final String TAG= "SPLASH";
    private final static int TIME_SPLASH = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate-------"+this.getClass().getSimpleName());
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent dashBoard = new Intent(SplashActivity.this, DashboardActivity.class);
                startActivity(dashBoard);
                finish();

            }
        }, TIME_SPLASH);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause-------"+this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop-------"+this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy----"+this.getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume-----"+this.getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart----"+this.getClass().getSimpleName());
    }
}

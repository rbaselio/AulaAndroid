package rbaselio.com.br.aulaandroid.view;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import rbaselio.com.br.aulaandroid.R;

public class DashboardActivity extends AppCompatActivity {
    private final String TAG= "DASHBOARD";
    RelativeLayout dashboard;
    private Button btnConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate-------"+this.getClass().getSimpleName());
        setContentView(R.layout.activity_dashboard);
        dashboard = (RelativeLayout) findViewById(R.id.activity_dashboard) ;

        btnConsultar = (Button) findViewById(R.id.btnConsultar);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consultarClientes = new Intent(DashboardActivity.this, ConsultarClienteActivity.class);
                startActivity(consultarClientes);
                finish();
            }
        });
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
        dashboard.setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart----"+this.getClass().getSimpleName());


    }
}

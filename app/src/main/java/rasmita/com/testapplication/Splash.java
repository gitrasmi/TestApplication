package rasmita.com.testapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rasmita.com.testapplication.Activity.Home;

public class Splash extends AppCompatActivity {
    public static  final int SPLASH_INTERVAL_TIME=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Home.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_INTERVAL_TIME);
    }
}

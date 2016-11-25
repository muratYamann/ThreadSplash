package com.yamankod.threadsplash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by murat on 25.11.2016.
 */
public class SplashThread extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.threadsplash);

        Thread thread = new Thread(){

            //thread başlatıldıgında yapılmak isteneni yap .
            public  void run(){

                try {
                    sleep(3000);
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
          }

        };
        thread.start();


    }
}

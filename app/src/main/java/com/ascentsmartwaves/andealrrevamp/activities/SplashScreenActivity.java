package com.ascentsmartwaves.andealrrevamp.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ascentsmartwaves.andealrrevamp.R;

public class SplashScreenActivity extends AppCompatActivity {
int height,width;
    ImageView logo;
    LinearLayout screen;
    Handler handler = new Handler();
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        findViews();
        setViews();
        new FetchData().execute();


    }
    public void findViews(){

       screen = (LinearLayout) findViewById(R.id.main);
        logo = (ImageView) findViewById(R.id.logo_splash_screen);
    }

    public void setViews(){



       logo.setImageResource(R.drawable.splashlogo);


    }



    private class FetchData extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... params) {
            try {
                logo.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale));

                (new Thread(){
                    @Override
                    public void run(){
                        for( i=0; i<230; i++){
                            handler.post(new Runnable(){
                                public void run(){
                                    screen.setBackgroundColor(Color.argb(255, i, i, i));
                                }
                            });
                            // next will pause the thread for some time
                            try{ sleep(10); }
                            catch(Exception e)
                            {

                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
                Thread.sleep(3000);
            }
            catch (Exception e ){

                //do nothingd
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid)
        {
            super.onPostExecute(aVoid);

            Display display = getWindowManager().getDefaultDisplay();
            width = Resources.getSystem().getDisplayMetrics().widthPixels;
            height = Resources.getSystem().getDisplayMetrics().heightPixels;
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(SplashScreenActivity.this);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("height", height);
            editor.putInt("width", width);
            editor.commit();
            Log.d("debug", "Screen inches : " + height+"\t"+width);//in pixels
            Intent i=new Intent(getApplicationContext(),LoginOrRegisterActivity.class);
           startActivity(i);
        }
    }
}

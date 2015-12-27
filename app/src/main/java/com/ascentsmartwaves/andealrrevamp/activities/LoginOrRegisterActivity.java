package com.ascentsmartwaves.andealrrevamp.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;


import android.widget.Button;


import com.ascentsmartwaves.andealrrevamp.R;

public class LoginOrRegisterActivity extends Activity {
Button twitter,facebook,google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
findViews();

    }
private void findViews()
{
   twitter=(Button)findViewById(R.id.btnTwitter);
    facebook=(Button)findViewById(R.id.btnFb);
  google=(Button)findViewById(R.id.btnGplus);
}
}

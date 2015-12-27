package com.ascentsmartwaves.andealrrevamp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.ascentsmartwaves.andealrrevamp.R;

public class HomeActivity extends AppCompatActivity {
Button newdeal,dealdetails,editprofile,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
findViews();
        setViews();
    }
private void findViews()
{
    newdeal=(Button)findViewById(R.id.newdeal_btn);
    dealdetails=(Button)findViewById(R.id.dealdetails_btn);
   editprofile=(Button)findViewById(R.id.editprofile_btn);
   logout=(Button)findViewById(R.id.logout_btn);

}

    private void setViews()
    {
    }
}

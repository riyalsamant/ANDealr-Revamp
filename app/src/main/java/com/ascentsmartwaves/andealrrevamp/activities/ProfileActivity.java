package com.ascentsmartwaves.andealrrevamp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.ascentsmartwaves.andealrrevamp.R;

public class ProfileActivity extends AppCompatActivity {
ImageView handle,picture;
    Button submit;
    EditText handler,company,mobile,locality,pincode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
findViews();
    }
private void findViews()
{
  picture=(ImageView)findViewById(R.id.picture);
    handle=(ImageView)findViewById(R.id.handlename);
    handler=(EditText)findViewById(R.id.company_handle_edittext_profile);
    handler=(EditText)findViewById(R.id.merchant_companyname_edittext_profile);
    handler=(EditText)findViewById(R.id.compny_mobile_edittext_profile);
    handler=(EditText)findViewById(R.id.company_locality_edittext_profile);
   submit=(Button)findViewById(R.id.merchant_confirm_password_company_profile);

}
}

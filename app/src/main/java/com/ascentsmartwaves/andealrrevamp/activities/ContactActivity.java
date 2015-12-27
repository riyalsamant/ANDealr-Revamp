package com.ascentsmartwaves.andealrrevamp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.ascentsmartwaves.andealrrevamp.R;

public class ContactActivity extends AppCompatActivity {
EditText name,email,feedback;
    Spinner feedbacktype;
    Button submit;
    CheckBox response;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        findViews();
    }



    private void findViews()
    {
    name=(EditText)findViewById(R.id.contact_name);
   email=(EditText)findViewById(R.id.contact_email);
        feedback=(EditText)findViewById(R.id.contact_feedback);
      submit=(Button)findViewById(R.id.contact_submit);
     response=(CheckBox)findViewById(R.id.contact_response);

    }
}

package com.ascentsmartwaves.andealrrevamp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.ascentsmartwaves.andealrrevamp.R;

public class AddDealActivity extends AppCompatActivity {
DatePicker start_date,end_date;
    TimePicker start_time,end_time;
    EditText name,description;
    Button addDeal;
    ImageButton cancelButton;
    ImageView uploadImage;
    RelativeLayout uploadOrCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_deal);

findViews();

    }

    private void findViews() {

        addDeal = (Button) findViewById(R.id.add_deal_add_dealBtn);
        name = (EditText) findViewById(R.id.deal_name_add_dealET);
        description = (EditText) findViewById(R.id.deal_description_add_dealET);
    start_date=(DatePicker)findViewById(R.id.datePicker);
      end_date=(DatePicker)findViewById(R.id.datePicker1);
        start_time=(TimePicker)findViewById(R.id.timePicker);
       end_time=(TimePicker)findViewById(R.id.timePicker1);
        uploadImage = (ImageView) findViewById(R.id.upload_image_add_deal_activity);
        uploadOrCancel = (RelativeLayout) findViewById(R.id.upload_or_cancel_included);
        cancelButton = (ImageButton) uploadOrCancel.findViewById(R.id.cancel_button_included);


    }

    private void setViews(){






    }

}

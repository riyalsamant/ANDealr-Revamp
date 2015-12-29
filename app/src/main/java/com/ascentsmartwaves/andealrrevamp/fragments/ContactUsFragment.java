package com.ascentsmartwaves.andealrrevamp.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.ascentsmartwaves.andealrrevamp.R;

public class ContactUsFragment extends Fragment {
    EditText name,email,feedback;
    Spinner feedbacktype;
    Button submit;
    CheckBox response;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_contact_us, container, false);

        name=(EditText)rootView.findViewById(R.id.contact_name);
        email=(EditText)rootView.findViewById(R.id.contact_email);
        feedback=(EditText)rootView.findViewById(R.id.contact_feedback);
        submit=(Button)rootView.findViewById(R.id.contact_submit);
        response=(CheckBox)rootView.findViewById(R.id.contact_response);
        submit.setOnClickListener(listener);

        return rootView;
    }


    private View.OnClickListener listener = new View.OnClickListener(){
        public void onClick(View v) {

        }
    };
}
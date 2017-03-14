package ics.infortainment_control;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Deanna on 3/9/2017.
 */

public class add_cable_box_fragment extends Fragment{

    Button power;
    Button yes;
    Button no;
    Spinner provider_input;
    String manufacturer;


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // tie display resources to java objects
        View v = inflater.inflate(R.layout.add_cable_box_layout,container,false);
        power = (Button) v.findViewById(R.id.power_btn);
        yes = (Button) v.findViewById(R.id.yes_btn);
        no = (Button) v.findViewById(R.id.no_btn);
        provider_input = (Spinner) v.findViewById(R.id.provider_input);


        // event listeners for power and source buttons
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manufacturer = provider_input.getSelectedItem().toString(); // manufacturer selected
                // now fire off IR power command using selected manufacturer's codes

            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // redirect user back to add_tv_fragment
                settings_fragment f = new settings_fragment();
                getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                // display a "Try again" text view

            }
        });

        return v;
    }
}



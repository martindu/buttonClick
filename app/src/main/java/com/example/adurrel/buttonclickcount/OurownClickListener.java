package com.example.adurrel.buttonclickcount;

import android.view.View.OnClickListener;
import android.view.View;
/**
 * Created by adurrel on 3/5/15.
 */
public class OurownClickListener implements OnClickListener{

    MainActivity caller;

    public OurownClickListener(MainActivity activity){
        this.caller = activity;

    }

    @Override
    public void onClick(View view){

        if(caller.theTextView.getText() == "The button was clicked!"){
            caller.theTextView.setText("Hello World");
        }
        else {
            caller.theTextView.setText("The button was clicked!");
        }
    }
}

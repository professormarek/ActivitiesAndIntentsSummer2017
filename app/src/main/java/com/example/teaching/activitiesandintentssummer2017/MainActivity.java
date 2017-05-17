package com.example.teaching.activitiesandintentssummer2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    this method will actually handle the actions that we need to take when the user clicks the button
     */
    private void handleClick(){
        //display a toast message
        Toast.makeText(this, "You clicked the button. Way to go! Enjoy the weather!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //leave the above method calls alone, they are needed by the framework!

        //in order to set behaviour for a button in our UI:
        //step 1: get a reference to the Button
        Button myButton = (Button) findViewById(R.id.button);
        //step 2: define a click handling method for the button
        /* note: we are using a java style here called anonymous temporary class*/
        myButton.setOnClickListener( /* instantiate an OnClickListener object inside the method call braces*/ new View.OnClickListener(){
            @Override
            public void onClick(View v) { /* override the onClick method in our new, anonymous OnClickListener object */
                //Marek's style for adding behaviour is to call a method defined in MainActivity to do the work (delegate the work)
                handleClick();
            }
        });
    }
}

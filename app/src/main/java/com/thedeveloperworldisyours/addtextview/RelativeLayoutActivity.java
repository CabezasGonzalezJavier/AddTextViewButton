package com.thedeveloperworldisyours.addtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);


        //add RelativeLayout
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_relative_layout);

        //add LayoutParams
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0, 80, 0, 0);  // left, top, right, bottom
        params.addRule(RelativeLayout.BELOW, 1);


        //add textView
        TextView textView = new TextView(this);
        textView.setText("The developer world is yours");
        textView.setId(1);


        // add Button
        Button button = new Button(this);
        button.setText("thedeveloperworldisyours");
        button.setLayoutParams(params);

        //add the textView and the Button to RelativeLayout
        relativeLayout.addView(textView);
        relativeLayout.addView(button);

    }
}

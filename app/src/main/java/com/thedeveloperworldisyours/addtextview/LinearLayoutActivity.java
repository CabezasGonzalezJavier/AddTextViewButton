package com.thedeveloperworldisyours.addtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        //added LInearLayout
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.activity_linear_layout);

        //added LayoutParams
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        //add textView
        TextView textView = new TextView(this);
        textView.setText("The developer world is yours");
        textView.setId(1);
        textView.setLayoutParams(params);

        // added Button
        Button button = new Button(this);
        button.setText("thedeveloperworldisyours");
        button.setId(2);

        //added the textView and the Button to LinearLayout
        linearLayout.addView(textView);
        linearLayout.addView(button);

    }
}

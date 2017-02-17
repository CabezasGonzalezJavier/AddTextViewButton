package com.thedeveloperworldisyours.addtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class CustomViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view);

        RelativeLayout mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_custom_view_relative_layout);

        //add LayoutParams
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        CustomView rectangle = new CustomView(this);
        rectangle.setLayoutParams(params);
        mRelativeLayout.addView(rectangle);

    }
}

package com.thedeveloperworldisyours.addtextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by javierg on 17/02/2017.
 */

public class CustomView extends View {

    private Rect mRectangle;
    private Paint mPaint;

    public CustomView(Context context) {
        super(context);
        int x = 50;
        int y = 50;
        int sideLength = 200;

        // create a rectangle that we'll draw later
        mRectangle = new Rect(x, y, sideLength, sideLength);

        // create the Paint and set its color
        mPaint = new Paint();
        mPaint.setColor(Color.GRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLUE);
        canvas.drawRect(mRectangle, mPaint);
    }

}

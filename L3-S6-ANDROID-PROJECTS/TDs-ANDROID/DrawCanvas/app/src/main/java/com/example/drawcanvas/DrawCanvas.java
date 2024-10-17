package com.example.drawcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class DrawCanvas extends View {

    private Paint paint = null;
    private Path path = null;
    
    public DrawCanvas(Context context) {
        super(context);
        reset();
        setOnTouchListener(new mTouch()); // la vue s'abonne au listener
    }

    protected void reset(){
        path = new Path();
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(6f);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }

    private class mTouch implements View.OnTouchListener{
        public boolean onTouch(View v, MotionEvent event) {
            float eventX = event.getX();
            float eventY = event.getY();
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    path.moveTo(eventX, eventY);
                    break;
                case MotionEvent.ACTION_MOVE:
                    path.lineTo(eventX, eventY);
                    break;
                case MotionEvent.ACTION_UP:
                     break;
                default :
                    return false;
            }
            invalidate();
            return true;
        }
    }
}
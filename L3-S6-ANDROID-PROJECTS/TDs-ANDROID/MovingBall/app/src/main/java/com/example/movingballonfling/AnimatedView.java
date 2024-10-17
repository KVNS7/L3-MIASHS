package com.example.movingballonfling;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AnimatedView extends View {
    private class mTouch implements GestureDetector.OnGestureListener {

        @Override
        public boolean onDown(@NonNull MotionEvent e) {
            return true;
        }

        @Override
        public void onShowPress(@NonNull MotionEvent e) {
        }

        @Override
        public boolean onSingleTapUp(@NonNull MotionEvent e) {
            return true;
        }

        @Override
        public boolean onScroll(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float distanceX, float distanceY) {
            return true;
        }

        @Override
        public void onLongPress(@NonNull MotionEvent e) {
        }

        @Override
        public boolean onFling(@Nullable MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {

            dx = (int) ((e2.getX() - e1.getX())/10);
            dy = (int) ((e2.getY() - e1.getY())/10);

            /*
            if(e2.getX() - e1.getX() > 0)dx = 5;
            else dx = -5;

            if(e2.getY() - e1.getY() > 0) dy = 5;
            else dy = -5;
            */
            return true;
        }
    }

    private final int timedelay = 20;
    private int dx, dy, x, y;
    private Handler h;
    private Runnable r;
    private GestureDetector mGestureDetector;
    BitmapDrawable ball;

    public AnimatedView(Context context) {
        super(context);
        h = new Handler();
        r = new Runnable() {
            @Override
            public void run() {
                invalidate();
            }
        };
        x = y = -1;
        dx = dy = 5;
        ball = (BitmapDrawable) this.getResources().getDrawable(R.drawable.dvd, null);

        mGestureDetector = new GestureDetector(context, new mTouch());
    }

    protected void onDraw(Canvas c) {
        if (x < 0 && y < 0) {
            x = this.getWidth() / 2;
            y = this.getHeight() / 2;
        }
        c.drawBitmap(ball.getBitmap(), x, y, null);
        h.postDelayed(r, timedelay);

        if (x > this.getWidth() - ball.getBitmap().getWidth() || x < 0) dx = -dx;
        if (y > this.getHeight() - ball.getBitmap().getWidth() || y < 0) dy = -dy;

        x += dx;
        y += dy;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);

        return true;
    }
}
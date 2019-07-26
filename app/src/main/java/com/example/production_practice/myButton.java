package com.example.production_practice;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;

public class myButton extends Button {
    static final int CLICK_FEEDBACK_DURATION = 350;
    static final int CLICK_FEEDBACK_INTERVAL = 10;
    int CLICK_FEEDBACK_COLOR;
    Paint mFeedbackPaint;
    long mAnimStart;
    float mTextX;
    float mTextY;
    public boolean mFlag=false;

    public myButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        Resources myResources = getResources();
        this.CLICK_FEEDBACK_COLOR = myResources.getColor(R.color.lightgray);
        this.mFeedbackPaint = new Paint();
        this.mFeedbackPaint.setStyle(Paint.Style.STROKE);
        this.mFeedbackPaint.setStrokeWidth(2);
        mAnimStart = -1;
    }
    //边框绘制
    private void drawMagicFlame(int duration, Canvas paramCanvas) {
        int alpha = 255 - duration * 255 / CLICK_FEEDBACK_DURATION;
        int color = CLICK_FEEDBACK_COLOR | (alpha << 24);
        this.mFeedbackPaint.setColor(color);
        paramCanvas.drawRect(1, 1, getWidth() - 1, getHeight() - 1,
                mFeedbackPaint);
    }
    public void changeColor()
    {
        mFlag = true;
    }
    // 回执自定义按钮
    protected void onDraw(Canvas canvas) {
        if (mAnimStart != -1) {
            int animDuration = (int) (System.currentTimeMillis() - mAnimStart);
            if (animDuration >= CLICK_FEEDBACK_DURATION) {
                mAnimStart = -1;
            } else {
                drawMagicFlame(animDuration, canvas);
                postInvalidateDelayed(CLICK_FEEDBACK_INTERVAL);
            }
        } else if (isPressed()) {
            drawMagicFlame(0, canvas);
        }

        CharSequence text = getText();

        if(mFlag == true){
            getPaint().setColor(Color.RED);
        }

        canvas.drawText(text, 0, text.length(), mTextX, mTextY,getPaint());
    }
    //字符坐标位置获取
    private void measureText() {
        String str = getText().toString();
        TextPaint mTextPaint = getPaint();
//        mTextPaint.setColor(R.color.crimson);
        mTextX = (getWidth() - mTextPaint.measureText(str)) / 2;
        mTextY = (getHeight() - mTextPaint.ascent() - mTextPaint.descent()) / 2;
    }

    public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3,
                              int paramInt4) {
        measureText();
    }

    protected void onTextChanged(CharSequence paramCharSequence, int paramInt1,
                                 int paramInt2, int paramInt3) {
        measureText();
    }

    public void animateClickFeedback() {
        this.mAnimStart = System.currentTimeMillis();
        invalidate();
    }
}

package com.bwie.xiaqin.xiaqin20180903.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by lenovo on 2018/9/3.
 */

//自定义View
public class MyTextView extends View {
    private Paint mPaint;

    public MyTextView(Context context) {
        super(context);

    }

    private void init(Context context) {
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setTextSize(18);
        //绘制标题
         mPaint.setTextSize(10);
        //绘制线
        //纵坐标
        canvas.drawLine(50,100,50,500,mPaint);
        //横坐标
        canvas.drawLine(50,500,400,500,mPaint);
        //纵坐标的值
        int[] array = {0,50,100,150,200,250,300,350};
        for (int i=0;i<array.length;i++){
            //绘制分割线
            canvas.drawLine(50,500-array[i],54,500-array[i],mPaint);
            //绘制值
            canvas.drawText(array[i]+"",20,500-array[i],mPaint);

        }
        //横坐标
        String[] array2 ={"管理成本","劳务成本","销售成本","资产盘亏"};
        for (int i = 0;i<array2.length;i++){
            canvas.drawText(array2[i]+"",array[i]+85,520,mPaint);
        }
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new Rect(90,500-56,110,500),mPaint);
        canvas.drawRect(new Rect(190,500-207,210,500),mPaint);
        canvas.drawRect(new Rect(140,500-98,160,500),mPaint);
        canvas.drawRect(new Rect(240,500-318,260,500),mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawText("56",88,500-58,mPaint);
        canvas.drawText("207",188,500-209,mPaint);
        canvas.drawText("90",138,500-100,mPaint);
        canvas.drawText("318",238,500-320,mPaint);
        mPaint.setColor(Color.RED);
        mPaint.setTextSize(16);
    }
}

package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        int[] ints = { 0,1,1,3,5,6,2};
        String[] strs = {"Froco","GB","ICS","JB","KitKal","L","M"};

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint2.setColor(Color.WHITE);
        paint2.setStrokeWidth(3);
        float[] lines = {110,80,110,520,110,520,1000,520};
        canvas.drawLines(lines,paint2);

        paint.setColor(Color.GREEN);
        paint2.setTextSize(30);
        for(int i = 0; i < ints.length; i++){
            int startX = 120 *( i+1);
            canvas.drawText(strs[i],startX + (7-strs[i].length())*15/2,550,paint2);
            canvas.drawRect(startX,520 - ints[i] * 50,startX + 105, 520, paint) ;

        }
        paint2.setTextSize(50);
        canvas.drawText("直方图",480,700,paint2);
    }
}

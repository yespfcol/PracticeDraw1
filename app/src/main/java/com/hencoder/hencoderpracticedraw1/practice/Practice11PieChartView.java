package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private  Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        paint.setColor(Color.RED);
        canvas.drawArc(200,100,750,650,-180,125,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(220,120,770,670,-55,40,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(220,120,770,670,-13,10,true,paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(220,120,770,670,-1,10,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(220,120,770,670,12,65,true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(220,120,770,670,80,98,true,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(160,125);
        path.rLineTo(150,0);
        path.rLineTo(10,20);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Lollipop",40,125,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(730,250);
        path.rLineTo(20,-20);
        path.rLineTo(90,0);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Marshmallow",845,230,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(765,325);
        path.rLineTo(75,0);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Froyo",845,325,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(765,355);
        path.rLineTo(25,0);
        path.rLineTo(25,15);
        path.rLineTo(25,0);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Gingerbread",845,375,paint);

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(765,410);
        path.rLineTo(25,0);
        path.rLineTo(25,15);
        path.rLineTo(25,0);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Ice Cream Sandwich",845,425,paint);


        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(720,550);
        path.rLineTo(20,20);
        path.rLineTo(95,0);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("Jelly Bean",845,570,paint);


        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        path.moveTo(180,645);
        path.rLineTo(150,0);
        path.rLineTo(20,-20);
        canvas.drawPath(path,paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(25);
        canvas.drawText("KitKat",80,645,paint);

        paint.setTextSize(45);
        canvas.drawText("饼图",400,760,paint);

    }
}

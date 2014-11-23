package cn.edu.gdmec.s07131020.demo_canvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View{

	public MyView(Context context) {
		super(context);
	
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		canvas.drawColor(Color.GRAY);
		
		Paint paint= new Paint();
		paint.setColor(Color.BLACK);
		
		canvas.drawCircle(100, 100, 50, paint);
		
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(10);
		canvas.drawRect(new RectF(200,200,300,300),paint);
		
		paint.setTextSize(40);
		paint.setColor(Color.BLUE);
		canvas.drawText("Hello World",300,300,paint);
	}

}

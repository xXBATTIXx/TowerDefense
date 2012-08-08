package de.TowerDefense;

<<<<<<< HEAD
<<<<<<< HEAD
import android.graphics.Canvas;

public class Spielfeld
{
	public Canvas canvas;
=======
=======
>>>>>>> origin/CherryCola
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Spielfeld extends View {
	
>>>>>>> origin/CherryCola
	private int x;
	private int y;
	
	
	
	 public Spielfeld(Context context) {
         super(context);
     }
 
     @Override
     protected void onDraw(Canvas c){
         super.onDraw(c);
         
         Paint paint = new Paint();
		 paint.setStyle(Paint.Style.FILL);
<<<<<<< HEAD
=======

		 // make the entire canvas white
		 paint.setColor(Color.WHITE);
		 c.drawPaint(paint);
		 
		 paint.setColor(Color.BLUE);
		 c.drawRect(50, 100, 200, 3, paint);
         
     }

	
>>>>>>> origin/CherryCola

		 // make the entire canvas white
		 paint.setColor(Color.WHITE);
		 c.drawPaint(paint);
		 
		 paint.setColor(Color.BLUE);
		 c.drawRect(50, 100, 200, 3, paint);
         
     }

	

	int a =5;
	
}

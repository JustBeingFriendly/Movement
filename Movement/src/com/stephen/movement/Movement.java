package com.stephen.movement;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;

public class Movement extends Activity {
	
	private AnimationView av;
	private Button rButton;
	private Button lButton;
	private Button cButton;
	int count = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_movement);
		
		av = (AnimationView) findViewById(R.id.animationView1);
		rButton = (Button) findViewById(R.id.rbutton);
		lButton = (Button) findViewById(R.id.lbutton);
		cButton = (Button) findViewById(R.id.cbutton);
		
		rButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				int e = event.getAction();
				count ++;
				return false;
			}
		});
	}
	
	public int getMovement(){
		
		
	}
	
	
	public void rightThruster(View view) {
		av.rightThruster();
	}
	
	public void leftThruster(View view) {
		av.leftThruster();
	}
	
	public void mainRocket(View view) {
		av.mainRocket();
	}



	
}

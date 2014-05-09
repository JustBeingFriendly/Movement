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

				if(event.getAction() != MotionEvent.ACTION_UP){
					av.rightThrusterFiring = true;
				}
				else
				{
					av.rightThrusterFiring = false;
				}
				return false;
			}
		});
		
		
		lButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() != MotionEvent.ACTION_UP){
					av.leftThrusterFiring = true;
				}
				else
				{
					av.leftThrusterFiring = false;
				}
				return false;
			}
		});
		
		cButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {

				if(event.getAction() != MotionEvent.ACTION_UP){
					av.mainRocketFiring = true;
				}
				else
				{
					av.mainRocketFiring = false;
				}
				return false;
			}
		});
		
	}





	
}

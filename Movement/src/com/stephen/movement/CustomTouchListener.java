package com.stephen.movement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class CustomTouchListener extends View implements OnTouchListener {

	AnimationView av;

	public CustomTouchListener(Context context) {
		super(context);
		this.setOnTouchListener(this);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onTouch(View v, MotionEvent event, String s, AnimationView aAv) {
		switch (s) {
			
		}
		
		
		return false;
	}
	
	
}

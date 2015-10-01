package com.helloandroid;

import com.helloandroid.lesson1.Lesson1Activity;
import com.helloandroid.lesson1.Lesson1aActivity;
import com.helloandroid.util.ActivityUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initializeViews();
	}
	
	private void initializeViews() {
		select1 = (Button) findViewById(R.id.select1);
		select2 = (Button) findViewById(R.id.select2);
		
		select1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ActivityUtil.startActivity(MainActivity.this, Lesson1Activity.class);
			}
		});
		
		select2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				ActivityUtil.startActivity(MainActivity.this, Lesson1aActivity.class);
			}
		});
	}
	
	
	private Button select1;
	private Button select2;
}

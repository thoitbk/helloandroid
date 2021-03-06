package com.helloandroid;

import com.helloandroid.lesson1.Lesson1Activity;
import com.helloandroid.lesson1.Lesson1aActivity;
import com.helloandroid.lesson2.Lesson2Activity;
import com.helloandroid.lesson3.Lesson3Activity;
import com.helloandroid.lesson4.Lesson4Activity;
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
		select3 = (Button) findViewById(R.id.select3);
		select4 = (Button) findViewById(R.id.select4);
		select5 = (Button) findViewById(R.id.select5);
		
		select1.setOnClickListener(onSelect1Click);
		select2.setOnClickListener(onSelect2Click);
		select3.setOnClickListener(onSelect3Click);
		select4.setOnClickListener(onSelect4Click);
		select5.setOnClickListener(onSelect5Click);
	}
	
	private OnClickListener onSelect1Click = new OnClickListener() {
		@Override
		public void onClick(View v) {
			ActivityUtil.startActivity(MainActivity.this, Lesson1Activity.class);
		}
	};
	
	private OnClickListener onSelect2Click = new OnClickListener() {
		@Override
		public void onClick(View v) {
			ActivityUtil.startActivity(MainActivity.this, Lesson1aActivity.class);
		}
	};
	
	private OnClickListener onSelect3Click = new OnClickListener() {
		@Override
		public void onClick(View v) {
			ActivityUtil.startActivity(MainActivity.this, Lesson2Activity.class);
		}
	};
	
	private OnClickListener onSelect4Click = new OnClickListener() {
		@Override
		public void onClick(View v) {
			ActivityUtil.startActivity(MainActivity.this, Lesson3Activity.class);
		}
	};
	
	private OnClickListener onSelect5Click = new OnClickListener() {
		@Override
		public void onClick(View v) {
			ActivityUtil.startActivity(MainActivity.this, Lesson4Activity.class);
		}
	};
	
	private Button select1;
	private Button select2;
	private Button select3;
	private Button select4;
	private Button select5;
}

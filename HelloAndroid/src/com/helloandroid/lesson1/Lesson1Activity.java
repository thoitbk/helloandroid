package com.helloandroid.lesson1;

import com.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lesson1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lession1);
		
		initializeViews();
	}
	
	private void initializeViews() {
		nameEditText = (EditText) findViewById(R.id.name_edittext);
		confirmButton = (Button) findViewById(R.id.confirm_button);
		helloTextView = (TextView) findViewById(R.id.hello_textview);
		
		confirmButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String name = nameEditText.getText().toString();
				helloTextView.setText("Hello " + name);
			}
		});
	}
	
	private EditText nameEditText;
	private Button confirmButton;
	private TextView helloTextView;
}

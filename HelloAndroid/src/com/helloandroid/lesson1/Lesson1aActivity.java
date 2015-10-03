package com.helloandroid.lesson1;

import com.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Lesson1aActivity extends Activity {
	
	private TextView enterNameTextView;
	private EditText nameEditText;
	private Button confirmButton;
	private TextView helloTextView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		
		int horizontalPadding = (int) getResources().getDimension(R.dimen.activity_horizontal_margin);
		int verticalPadding = (int) getResources().getDimension(R.dimen.activity_vertical_margin);
		layout.setPadding(horizontalPadding, verticalPadding, horizontalPadding, verticalPadding);
		
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		
		enterNameTextView = new TextView(this);
		enterNameTextView.setLayoutParams(layoutParams);
		enterNameTextView.setText(getResources().getString(R.string.enter_name));
		
		nameEditText = new EditText(this);
		nameEditText.setLayoutParams(layoutParams);
		
		confirmButton = new Button(this);
		confirmButton.setLayoutParams(layoutParams);
		confirmButton.setText(getResources().getString(R.string.confirm));
		
		helloTextView = new TextView(this);
		helloTextView.setLayoutParams(layoutParams);
		
		layout.addView(enterNameTextView);
		layout.addView(nameEditText);
		layout.addView(confirmButton);
		layout.addView(helloTextView);
		
		setContentView(layout);
		
		confirmButton.setOnClickListener(new OnConfirmButtonClick());
	}
	
	public class OnConfirmButtonClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			String name = nameEditText.getText().toString();
			helloTextView.setText("Hello " + name);
		}
	}
}

package com.helloandroid.lesson3;

import com.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class Lesson3Activity extends Activity {
	
	private SeekBar facebookSeekbar;
	private SeekBar twitterSeekbar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson3);
		
		facebookSeekbar = (SeekBar) findViewById(R.id.facebook_seekbar);
		twitterSeekbar = (SeekBar) findViewById(R.id.twitter_seekbar);
	}
	
	public void onFacebookClick(View view) {
		Toast.makeText(Lesson3Activity.this, "Facebook button clicked", Toast.LENGTH_SHORT).show();
	}
	
	public void onTwitterClick(View view) {
		Toast.makeText(Lesson3Activity.this, "Twitter button clicked", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.lesson3, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case R.id.full:
				facebookSeekbar.setProgress(1000);
				twitterSeekbar.setProgress(10);
				return true;
			case R.id.clear:
				facebookSeekbar.setProgress(0);
				twitterSeekbar.setProgress(0);
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}
}

package com.helloandroid.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.helloandroid.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Lesson4Activity extends Activity {
	
	private List<Contact> contacts = new ArrayList<Contact>(Arrays.
																asList(new Contact("1", "1", "1", false), 
																		new Contact("1", "1", "1", true), 
																		new Contact("1", "1", "1", false), 
																		new Contact("1", "1", "1", false), 
																		new Contact("1", "1", "1", false), 
																		new Contact("1", "1", "1", false)));
	
	private ListView contactList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (savedInstanceState != null) {
			boolean[] checkState = savedInstanceState.getBooleanArray("checkState");
			if (checkState != null) {
				for (int i = 0; i < checkState.length; i++) {
					contacts.get(i).setCheck(checkState[i]);
				}
			}
		}
		setContentView(R.layout.activity_lesson4);
		
		contactList = (ListView) findViewById(R.id.contactList);
		contactList.setAdapter(new ContactListAdapter(this, contacts));
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		boolean[] checkState = new boolean[contacts.size()];
		for (int i = 0; i < contacts.size(); i++) {
			checkState[i] = contacts.get(i).getCheck();
		}
		outState.putBooleanArray("checkState", checkState);
	}
}

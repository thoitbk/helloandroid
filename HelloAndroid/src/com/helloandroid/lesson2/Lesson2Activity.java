package com.helloandroid.lesson2;

import com.helloandroid.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Lesson2Activity extends ListActivity {
	
	private static String[] movies = {"The Bigbang theory", "The walking dead", "Saw", "Aircraft", 
			"The Bigbang theory", "The walking dead", "Saw", "Aircraft", 
			"The Bigbang theory", "The walking dead", "Saw", "Aircraft", 
			"The Bigbang theory", "The walking dead", "Saw", "Aircraft"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lesson2);
		
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, movies));
		getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		
		// Mang chua cac gia tri da duoc check
		SparseBooleanArray checked = l.getCheckedItemPositions();
		for (int i = 0; i < checked.size(); i++) {
			int key = checked.keyAt(i);
			boolean value = checked.get(key);
			if (value) {
				System.out.println(key);
			}
		}
	}
}

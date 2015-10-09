package com.helloandroid.lesson4;

import java.util.List;

import com.helloandroid.R;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactListAdapter extends ArrayAdapter<Contact> {
	
	private Activity context;
	private List<Contact> contacts;	
	
	public ContactListAdapter(Activity context, List<Contact> contacts) {
		super(context, R.layout.contact_row, contacts);
		this.context = context;
		this.contacts = contacts;
	}
	
	static class Holder {
		public ImageView contactImage;
		public TextView contactName;
		public TextView detail;
		public TextView time;
		public CheckBox selectContact;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		if (view == null) {
			view = context.getLayoutInflater().inflate(R.layout.contact_row, parent, false);
			final Holder holder = new Holder();
			holder.contactImage = (ImageView) view.findViewById(R.id.contact_image);
			holder.contactName = (TextView) view.findViewById(R.id.contact_name);
			holder.detail = (TextView) view.findViewById(R.id.contact_detail);
			holder.time = (TextView) view.findViewById(R.id.time);
			holder.selectContact = (CheckBox) view.findViewById(R.id.selectContact);
			
			holder.selectContact.setOnCheckedChangeListener(new OnCheckedChangeListener() {
				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					Contact contact = (Contact) holder.selectContact.getTag();
					contact.setCheck(isChecked);
				}
			});
			
			holder.selectContact.setTag(contacts.get(position));
			view.setTag(holder);
		} else {
			((Holder) view.getTag()).selectContact.setTag(contacts.get(position));
		}
		
		Holder holder = (Holder) view.getTag();
		
		holder.contactImage.setImageResource(R.drawable.facebook);
		
		Contact contact = contacts.get(position);
		
		holder.contactName.setText(contact.getName());
		holder.detail.setText(contact.getDetail());
		holder.time.setText(contact.getTime());
		holder.selectContact.setChecked(contact.getCheck());
		
		return view;
	}
}

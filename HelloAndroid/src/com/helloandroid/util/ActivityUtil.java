package com.helloandroid.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class ActivityUtil {
	
	public static void startActivity(Context context, Class<? extends Activity> target) {
		Intent intent = new Intent(context, target);
		context.startActivity(intent);
	}
}

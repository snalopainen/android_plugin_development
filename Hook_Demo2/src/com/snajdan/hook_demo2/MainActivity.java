package com.snajdan.hook_demo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.snajdan.hook_demo2.R;

public class MainActivity extends Activity {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(
				new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Utils.invokePluginActivity(MainActivity.this,
								PluginActivity.class);
					}
				});
	}
}

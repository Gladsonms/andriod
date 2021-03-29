package com.example.prg11;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	EditText editText;
	Button button; 
	TextView result; 
	int ans=0; 
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main);

	editText=(EditText)findViewById(R.id.editText1); 
	button=(Button)findViewById(R.id.button1); 
	result=(TextView)findViewById(R.id.textView1); 
	button.setOnClickListener(new OnClickListener() { 
		public void onClick(View arg0) {
	StringBuffer buffer = new StringBuffer(); 
	String fs=editText.getText().toString(); 
	int n = Integer.parseInt(fs);
	for (int i = 1; i <= 15; i++) { ans = (i * n);
	buffer.append(i + " X " + n + " = " + ans + "\n");
	result.setText(buffer);
	}
	}
	});

}}

package com.example.prg10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        final EditText et= (EditText) findViewById(R.id.editText1);
        final TextView tv=(TextView) findViewById(R.id.textView1);
        Button btn= (Button) findViewById(R.id.button1);
        
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String Value=et.getText().toString();
				tv.setText(Value);
				
			}
		});
        
    }
    
}


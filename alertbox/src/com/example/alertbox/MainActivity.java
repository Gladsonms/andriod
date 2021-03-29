package com.example.alertbox;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	    final Context context=this;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        Button btnClick= (Button) findViewById(R.id.button1);


	        btnClick.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View view) {
	                AlertDialog.Builder alertDialogBuilder= new AlertDialog.Builder(context);

	                alertDialogBuilder.setTitle("SHOW DIALOGUE");

	                alertDialogBuilder.setMessage("Click Ok to Exit").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialogInterface, int i) {
	                        Toast.makeText(getApplicationContext(),"You Clicked OK",Toast.LENGTH_SHORT).show();
	                        MainActivity.this.finish();
	                    }
	                });

	                alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialogInterface, int i) {
	                        Toast.makeText(getApplicationContext(),"You Clicked Cancel",Toast.LENGTH_SHORT).show();
	                        MainActivity.this.finish();
	                    }
	                });
	                AlertDialog alertDialog=alertDialogBuilder.create();
	                alertDialog.show();
	            }
	        });


	  }
	}

package com.example.prog12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textView = (TextView)findViewById(R.id.getIPAddress);
        getPublicIP();
    }
        private void getPublicIP()
        {
        	new Thread(new Runnable(){
        		ArrayList<String> urls=new ArrayList<String>();
        		public void run(){
        		try {
        		URL url = new URL("https://api.ipify.org/");
        		HttpURLConnection conn=(HttpURLConnection) url.openConnection();

        		conn.setConnectTimeout(60000);
        		BufferedReader in = new BufferedReader(new

        		InputStreamReader(conn.getInputStream()));

        		String str;
        		while ((str = in.readLine()) != null) {
        			urls.add(str);
        			}
        			in.close();
        			} catch (Exception e) {
        			Log.d("MyTag",e.toString());
        			}
        			MainActivity.this.runOnUiThread(new Runnable(){
        			public void run(){
        			try {
        			textView.setText("Your Device IP Address: " + urls.get(0));
        			}
        			catch (Exception e){
        			textView.setText("Please check Network Connectivity");
        			}
        			}
        			});

        			}
        			}).start();
        }
    
    

    
}

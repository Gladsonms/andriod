package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	String List[]={"Apple","oppo","Redmi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> os=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,List);
        lv.setAdapter(os);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick1(AdapterView<?> parent, View view, int position, long id) {
               String msg="You clicked position :"+position;
                Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
            }

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
			}
        });



    }
}

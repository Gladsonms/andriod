package com.example.twosum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creating object for button named click here
        Button Btn= (Button) findViewById(R.id.button1);

        //creating object for edit text
        final EditText etFirst= (EditText) findViewById(R.id.editText1);
        final EditText etSecond= (EditText) findViewById(R.id.editText2);

        //creating object for Textview which shows the result
        final TextView tvResult= (TextView) findViewById(R.id.textView1);


        //Set click event to toast Hello world
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //declared three variables for adding operation
                int result,First,Second;

                //Assigns the values to each integer from the edit texts
                First=Integer.parseInt(etFirst.getText().toString());
                Second=Integer.parseInt(etSecond.getText().toString());

                //Adding operation and store output to result variable
                result=First+Second;

                //result is assigning to a text view to show
                tvResult.setText(" "+result);

                //showing the toast Success
                Toast.makeText(getApplicationContext(),"Result is:"+result,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

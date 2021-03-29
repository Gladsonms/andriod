package com.example.radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {
	RadioButton male,female;
    String selectedSuperStar;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        male=(RadioButton)findViewById(R.id.radio0);
        female=(RadioButton)findViewById(R.id.radio1);
        submit=(Button)findViewById(R.id.button1);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(male.isChecked())
                {
                    selectedSuperStar=male.getText().toString();
                }
                else if(female.isChecked())
                {
                    selectedSuperStar=female.getText().toString();
                }

                Toast.makeText(getApplicationContext(),selectedSuperStar,Toast.LENGTH_LONG).show();
            }
        });

    }
}

package com.example.checkbox;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

	CheckBox pizza,kfc,burger;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        pizza=(CheckBox)findViewById(R.id.checkBox1);
        kfc=(CheckBox)findViewById(R.id.checkBox3);
        burger=(CheckBox)findViewById(R.id.checkBox2);
        buttonOrder=(Button)findViewById(R.id.button1);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("Selected Items:");

                if(pizza.isChecked()){
                    result.append("\npizza 100Rs");
                    totalamount+=100;
                }

                if(kfc.isChecked()){
                    result.append("\nKFC 150Rs");
                    totalamount+=150;
                }

                if(burger.isChecked()){
                    result.append("\nburger 120Rs");
                    totalamount+=120;
                }
                result.append("\nTotal: "+totalamount+"Rs");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


            }
        });
    }
}

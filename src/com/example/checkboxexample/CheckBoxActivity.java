package com.example.checkboxexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckBoxActivity extends Activity
{
	TextView textview;
	CheckBox checkbox;
	// comments
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        
        textview=(TextView)findViewById(R.id.textView1checkboxsample);
        
        checkbox=(CheckBox)findViewById(R.id.checkBox1checkboxsample);
        
        checkbox.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View arg0)
			{
				if(checkbox.isChecked()==true)
				{
					textview.setText("Now CheckBox is Checked");
				}
				else if(checkbox.isChecked()==false)
				{
					textview.setText("Now CheckBox is Unchecked");
				}
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.check_box, menu);
        return true;
    }
    
}

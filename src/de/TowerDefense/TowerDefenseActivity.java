package de.TowerDefense;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TowerDefenseActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	private Button button_start;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button_start = (Button) findViewById(R.id.button_start);
        button_start.setOnClickListener(this);
        
    }
    
    public void onClick(View v) {
    	
    	
    	
    }
}
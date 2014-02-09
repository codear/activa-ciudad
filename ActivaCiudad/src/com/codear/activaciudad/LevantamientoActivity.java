package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class LevantamientoActivity extends Activity {

	Typeface faceNormal; 
	TextView txtvPorProy, txtvLibre;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_levantamiento);
		
		faceNormal = Typeface.createFromAsset(getAssets(), "fonts/larkenormal.ttf");
		txtvPorProy = (TextView)findViewById(R.id.levantamientoUno);
		txtvLibre = (TextView) findViewById(R.id.levantamientoLibreTxt);
		
		txtvPorProy.setTypeface(faceNormal);
		txtvLibre.setTypeface(faceNormal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.levantamiento, menu);
		return true;
	}

}

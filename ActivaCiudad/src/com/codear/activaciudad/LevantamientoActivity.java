package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class LevantamientoActivity extends Activity {

	Typeface faceNormal; 
	TextView txtvPorProy, txtvLibre;
	Button btnLevantamiento, btnLevantamientoLibre;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_levantamiento);
		
		faceNormal = Typeface.createFromAsset(getAssets(), "fonts/larkenormal.ttf");
		txtvPorProy = (TextView)findViewById(R.id.levantamientoUno);
		txtvLibre = (TextView) findViewById(R.id.levantamientoLibreTxt);
		btnLevantamiento = (Button) findViewById(R.id.btnLevantamiento);
		btnLevantamientoLibre = (Button) findViewById(R.id.btnLevantamientoLibre);
		
		txtvPorProy.setTypeface(faceNormal);
		txtvLibre.setTypeface(faceNormal);
	}

}

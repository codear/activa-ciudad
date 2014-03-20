package com.codear.activaciudad;

import Singleton.LevantamientoSingleton;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;

public class FormularioPisoActivity extends Activity {
	
	boolean isDownPB=false;
	boolean isDownPU=true;
	boolean isDownPS=true;
	boolean isDownPT=true;
	boolean isDownPC=true;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario_piso);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formulario_piso, menu);
		return true;
	}

}

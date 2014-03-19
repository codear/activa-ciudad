package com.codear.activaciudad;

import Singleton.LevantamientoSingleton;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class FormularioPisoActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario_piso);
		//Log.e("asdfd", LevantamientoSingleton.getUso());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.formulario_piso, menu);
		return true;
	}

}

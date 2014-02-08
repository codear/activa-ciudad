package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TipoLevantamientoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_levantamiento);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tipo_levantamiento, menu);
		return true;
	}

}

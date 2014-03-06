package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class TipoLevantamientoActivity extends Activity {

	Spinner spinnerUso, spinnerGiro;
	Typeface faceNormal; 
	TextView txtUso, txtGiro;
	
	ArrayAdapter adapterUso, adapterHabitacion, adapterComercio,
			adapterEspVerd, adapterEspAbier, adapterOtro, adapterIndust,
			adapterServi, adapterEquipUno, adapterEquipDos, adapterIgleTemp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_levantamiento);
		
		faceNormal = Typeface.createFromAsset(getAssets(), "fonts/larkenormal.ttf");

		spinnerUso = (Spinner) findViewById(R.id.spinnerUso);
		spinnerGiro = (Spinner) findViewById(R.id.spinnerGiro);
		txtUso = (TextView) findViewById(R.id.txtUso);
		txtGiro = (TextView) findViewById(R.id.txtGiro);
		
		txtUso.setTypeface(faceNormal);
		txtGiro.setTypeface(faceNormal);

		adapterUso = ArrayAdapter.createFromResource(this,
				R.array.usoLevantamiendoArr,
				android.R.layout.simple_spinner_item);
		spinnerUso.setAdapter(adapterUso);

		adapterHabitacion = ArrayAdapter.createFromResource(this,
				R.array.habitacionalArr, android.R.layout.simple_spinner_item);
		adapterComercio = ArrayAdapter.createFromResource(this,
				R.array.comercioArr, android.R.layout.simple_spinner_item);
		adapterEspVerd = ArrayAdapter
				.createFromResource(this, R.array.espaciosverdesArr,
						android.R.layout.simple_spinner_item);
		adapterEspAbier = ArrayAdapter.createFromResource(this,
				R.array.espaciosabiertosArr,
				android.R.layout.simple_spinner_item);
		adapterOtro = ArrayAdapter.createFromResource(this, R.array.otrosArr,
				android.R.layout.simple_spinner_item);
		adapterIndust = ArrayAdapter.createFromResource(this,
				R.array.industriaArr, android.R.layout.simple_spinner_item);
		adapterServi = ArrayAdapter.createFromResource(this,
				R.array.serviciosArr, android.R.layout.simple_spinner_item);
		adapterEquipUno = ArrayAdapter.createFromResource(this,
				R.array.equipamientoUnoArr,
				android.R.layout.simple_spinner_item);
		adapterEquipDos = ArrayAdapter.createFromResource(this,
				R.array.equipamientoDosArr,
				android.R.layout.simple_spinner_item);
		adapterIgleTemp = ArrayAdapter.createFromResource(this,
				R.array.iglesiastemplosArr,
				android.R.layout.simple_spinner_item);

		spinnerUso.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parentView,
					View selectedItemView, int position, long id) {

				switch (position) {
				case 0:
					Log.e("spinner 0", "spinner 0");
					spinnerGiro.setAdapter(adapterHabitacion);
					break;
				case 1:
					Log.e("spinner 1", "spinner 1");
					spinnerGiro.setAdapter(adapterComercio);
					break;
				case 2:
					Log.e("spinner 2", "spinner 2");
					spinnerGiro.setAdapter(adapterEspVerd);
					break;
				case 3:
					Log.e("spinner 3", "spinner 3");
					spinnerGiro.setAdapter(adapterEspAbier);
					break;
				case 4:
					Log.e("spinner 4", "spinner 4");
					spinnerGiro.setAdapter(adapterOtro);
					break;
				case 5:
					Log.e("spinner 5", "spinner 5");
					spinnerGiro.setAdapter(adapterIndust);
					break;
				case 6:
					spinnerGiro.setAdapter(adapterServi);
					break;
				case 7:
					spinnerGiro.setAdapter(adapterEquipUno);
					break;
				case 8:
					spinnerGiro.setAdapter(adapterEquipDos);
					break;
				case 9:
					spinnerGiro.setAdapter(adapterIgleTemp);
					break;

				default:
					break;
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parentView) {
				// TODO Auto-generated method stub

			}
		});
	}

}

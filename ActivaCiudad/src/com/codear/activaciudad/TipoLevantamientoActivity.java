package com.codear.activaciudad;

import Controllers.*;
import Singleton.LevantamientoSingleton;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TipoLevantamientoActivity extends Activity {

	Spinner spinnerUso, spinnerGiro;
	Typeface faceNormal;
	TextView txtUso, txtGiro, txtResponsable, txtZona, txtManzana, txtNoCedula,
			txtFecha;
	EditText edResponsable, edZona, edManzana, edCedula;
	DatePicker picker;
	Button btnSig;

	ArrayAdapter adapterUso, adapterHabitacion, adapterComercio,
			adapterEspVerd, adapterEspAbier, adapterOtro, adapterIndust,
			adapterServi, adapterEquipUno, adapterEquipDos, adapterIgleTemp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipo_levantamiento);

		faceNormal = Typeface.createFromAsset(getAssets(),
				"fonts/larkenormal.ttf");

		spinnerUso = (Spinner) findViewById(R.id.spinnerUso);
		spinnerGiro = (Spinner) findViewById(R.id.spinnerGiro);

		edResponsable = (EditText) findViewById(R.id.responsableEdtxt);
		edZona = (EditText) findViewById(R.id.zonaEdtxt);
		edManzana = (EditText) findViewById(R.id.manzanaEdtxt);
		edCedula = (EditText) findViewById(R.id.numCedulaEdtxt);

		picker = (DatePicker) findViewById(R.id.datePicker);

		btnSig = (Button) findViewById(R.id.btnSigTipoLeva);

		txtUso = (TextView) findViewById(R.id.txtUso);
		txtGiro = (TextView) findViewById(R.id.txtGiro);
		txtResponsable = (TextView) findViewById(R.id.txtResponsable);
		txtZona = (TextView) findViewById(R.id.txtZona);
		txtManzana = (TextView) findViewById(R.id.txtManzana);
		txtNoCedula = (TextView) findViewById(R.id.txtNoCedula);
		txtFecha = (TextView) findViewById(R.id.txtFecha);

		txtUso.setTypeface(faceNormal);
		txtGiro.setTypeface(faceNormal);
		txtResponsable.setTypeface(faceNormal);
		txtZona.setTypeface(faceNormal);
		txtManzana.setTypeface(faceNormal);
		txtNoCedula.setTypeface(faceNormal);
		txtFecha.setTypeface(faceNormal);

		adapterUso = ArrayAdapter.createFromResource(this,
				R.array.usoLevantamiendoArr,
				android.R.layout.simple_spinner_dropdown_item);
		spinnerUso.setAdapter(adapterUso);

		adapterHabitacion = ArrayAdapter.createFromResource(this,
				R.array.habitacionalArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterComercio = ArrayAdapter.createFromResource(this,
				R.array.comercioArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterEspVerd = ArrayAdapter.createFromResource(this,
				R.array.espaciosverdesArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterEspAbier = ArrayAdapter.createFromResource(this,
				R.array.espaciosabiertosArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterOtro = ArrayAdapter.createFromResource(this, R.array.otrosArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterIndust = ArrayAdapter.createFromResource(this,
				R.array.industriaArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterServi = ArrayAdapter.createFromResource(this,
				R.array.serviciosArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterEquipUno = ArrayAdapter.createFromResource(this,
				R.array.equipamientoUnoArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterEquipDos = ArrayAdapter.createFromResource(this,
				R.array.equipamientoDosArr,
				android.R.layout.simple_spinner_dropdown_item);
		adapterIgleTemp = ArrayAdapter.createFromResource(this,
				R.array.iglesiastemplosArr,
				android.R.layout.simple_spinner_dropdown_item);

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

		btnSig.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				if (!validarDatos()) {
					llenarSingleton();
					Intent intent = new Intent(TipoLevantamientoActivity.this,
							FormularioPisoActivity.class);
					startActivity(intent);
				}
			}
		});

	}

	protected boolean validarDatos() {
		boolean cancelar = false;
		View focusView;
		edResponsable.setError(null);
		edZona.setError(null);
		edManzana.setError(null);
		edCedula.setError(null);
		// validando responsable
		if (Validaciones.errorEditCero(TipoLevantamientoActivity.this,
				edResponsable, R.string.errEdtxZero)) {
			focusView = edResponsable;
			cancelar = true;
		}
		// validando zona
		if (Validaciones.errorEditCero(TipoLevantamientoActivity.this, edZona,
				R.string.errEdtxZero)) {
			focusView = edZona;
			cancelar = true;
		}
		// validando manzana
		if (Validaciones.errorEditCero(TipoLevantamientoActivity.this,
				edManzana, R.string.errEdtxZero)) {
			focusView = edManzana;
			cancelar = true;
		}
		// validando cedula
		if (Validaciones.errorEditCero(TipoLevantamientoActivity.this,
				edCedula, R.string.errEdtxZero)) {
			focusView = edCedula;
			cancelar = true;
		}

		return cancelar;
	}

	public void llenarSingleton() {

		LevantamientoSingleton.setUso(spinnerGiro.getSelectedItem().toString());
		LevantamientoSingleton
				.setGiro(spinnerGiro.getSelectedItem().toString());
		LevantamientoSingleton.setResponsable(edResponsable.getText()
				.toString());
		LevantamientoSingleton.setZona(edZona.getText().toString());
		LevantamientoSingleton.setManzana(edManzana.getText().toString());
		LevantamientoSingleton.setCedula(edCedula.getText().toString());
		LevantamientoSingleton.setFecha(picker.getDayOfMonth() + "/"
				+ picker.getMonth() + "/" + picker.getYear());

	}

}

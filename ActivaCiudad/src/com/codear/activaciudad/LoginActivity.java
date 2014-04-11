package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {
	
	TextView txtIngresa, txtMail, txtPass, txtUserNew;
	Button btnComenzar, btnRegistrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		txtIngresa = (TextView) findViewById(R.id.Ingresa);
		txtMail = (TextView) findViewById(R.id.Mail);
		txtPass = (TextView) findViewById(R.id.pass);
		txtUserNew = (TextView) findViewById(R.id.usuarioNuevo);
		
		btnComenzar = (Button) findViewById(R.id.btnEntrar);
		btnRegistrar = (Button) findViewById(R.id.btnRegistrarse);
		
		Typeface faceNormal = Typeface.createFromAsset(getAssets(), "fonts/larkenormal.ttf");
		Typeface faceBold = Typeface.createFromAsset(getAssets(), "fonts/larkebold.ttf");		
		txtIngresa.setTypeface(faceBold);
		txtMail.setTypeface(faceNormal);
		txtPass.setTypeface(faceNormal);
		txtUserNew.setTypeface(faceNormal);
		
		btnComenzar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.w("LoginActivity", "boton comenzar");
				login();
			}
		});
		
		btnRegistrar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.w("LoginActivity", "boton registrar");
				registrar();
			}
		});
		
	}

	protected void login() {
		Log.w("LoginActivity", "Login");
		if (validacion()) {
			Log.w("Validacion", "validacion "+validacion());
		}
		Intent intent = new Intent(getApplicationContext(), LevantamientoActivity.class);
		startActivity(intent);
	}
	

	protected void registrar() {
		// TODO Auto-generated method stub
		
	}

	private boolean validacion() {
		// TODO Auto-generated method stub
		return false;
	}

}

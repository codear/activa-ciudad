package com.codear.activaciudad;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class LoginActivity extends Activity {
	
	TextView txtIngresa, txtMail, txtPass, txtUserNew;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		txtIngresa = (TextView) findViewById(R.id.Ingresa);
		txtMail = (TextView) findViewById(R.id.Mail);
		txtPass = (TextView) findViewById(R.id.pass);
		txtUserNew = (TextView) findViewById(R.id.usuarioNuevo);
		
		Typeface faceNormal = Typeface.createFromAsset(getAssets(), "fonts/larkenormal.ttf");
		Typeface faceBold = Typeface.createFromAsset(getAssets(), "fonts/larkebold.ttf");		
		txtIngresa.setTypeface(faceBold);
		txtMail.setTypeface(faceNormal);
		txtPass.setTypeface(faceNormal);
		txtUserNew.setTypeface(faceNormal);
		
	}

}

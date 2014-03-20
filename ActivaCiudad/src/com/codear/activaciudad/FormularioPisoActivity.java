package com.codear.activaciudad;

import Controllers.ControllSQL;
import Singleton.LevantamientoSingleton;
import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class FormularioPisoActivity extends Activity {

	boolean isDownPB = false;
	boolean isDownPU = true;
	boolean isDownPS = true;
	boolean isDownPT = true;
	boolean isDownPC = true;

	RelativeLayout dropPB, dropPU, dropPS, dropPT, dropPC;
	LinearLayout layoutPB, layoutPU, layoutPS, layoutPT, layoutPC;

	ImageView imgPB, imgPU, imgPS, imgPT, imgPC;

	Button btnLote, btnEnviar;

	EditText edUsoPB, edGiroPB, edEdoPB, edUsoPU, edGiroPU, edEdoPU, edUsoPS,
			edGiroPS, edEdoPS, edUsoPT, edGiroPT, edEdoPT, edUsoPC, edGiroPC,
			edEdoPC;
	SQLiteDatabase db;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_formulario_piso);
		
		//ControllSQL loteDBH = new ControllSQL(this, "LevantamientoDB", null, 1);
		
		//db = loteDBH.getWritableDatabase();

		dropPB = (RelativeLayout) findViewById(R.id.DropPB);
		dropPU = (RelativeLayout) findViewById(R.id.DropPU);
		dropPS = (RelativeLayout) findViewById(R.id.DropPS);
		dropPT = (RelativeLayout) findViewById(R.id.DropPT);
		dropPC = (RelativeLayout) findViewById(R.id.DropPC);

		layoutPB = (LinearLayout) findViewById(R.id.layoutPB);
		layoutPU = (LinearLayout) findViewById(R.id.layoutPU);
		layoutPS = (LinearLayout) findViewById(R.id.layoutPS);
		layoutPT = (LinearLayout) findViewById(R.id.layoutPT);
		layoutPC = (LinearLayout) findViewById(R.id.layoutPC);

		imgPB = (ImageView) findViewById(R.id.ImgPB);
		imgPU = (ImageView) findViewById(R.id.ImgPU);
		imgPS = (ImageView) findViewById(R.id.ImgPS);
		imgPT = (ImageView) findViewById(R.id.ImgPT);
		imgPC = (ImageView) findViewById(R.id.ImgPC);

		btnLote = (Button) findViewById(R.id.btnSigLote);
		btnEnviar = (Button) findViewById(R.id.btnFinalizar);

		edUsoPB = (EditText) findViewById(R.id.edtxUsoPB);
		edGiroPB = (EditText) findViewById(R.id.edtxGiroPB);
		edEdoPB = (EditText) findViewById(R.id.edtxEdoPB);
		
		edUsoPU = (EditText) findViewById(R.id.edtxUsoPU);
		edGiroPU = (EditText) findViewById(R.id.edtxGiroPU);
		edEdoPU = (EditText) findViewById(R.id.edtxEdoPU);
		
		edUsoPS = (EditText) findViewById(R.id.edtxUsoPS);
		edGiroPS = (EditText) findViewById(R.id.edtxGiroPS);
		edEdoPS = (EditText) findViewById(R.id.edtxEdoPS);
		
		edUsoPT = (EditText) findViewById(R.id.edtxUsoPT);
		edGiroPT = (EditText) findViewById(R.id.edtxGiroPT);
		edEdoPT = (EditText) findViewById(R.id.edtxEdoPT);
		
		edUsoPC = (EditText) findViewById(R.id.edtxUsoPC);
		edGiroPC = (EditText) findViewById(R.id.edtxGiroPC);
		edEdoPC = (EditText) findViewById(R.id.edtxEdoPC);

		btnLote.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				nuevoLote();
			}
		});

		btnEnviar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

			}
		});
		
		dropPB.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dropPlantaBaja();
			}
		});

		dropPU.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dropPlantaUno();
			}
		});

		dropPS.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dropPlantaDos();
			}
		});

		dropPT.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dropPlantaTres();
			}
		});

		dropPC.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				dropPlantaCuatro();
			}
		});

	}
	
	protected void nuevoLote() {

		isDownPB = false;
		isDownPU = true;
		isDownPS = true;
		isDownPT = true;
		isDownPC = true;
		
		limpiarCampos();
		
		layoutPB.setVisibility(View.VISIBLE);
		imgPB.setRotation(0f);
		
		layoutPU.setVisibility(View.GONE);
		imgPU.setRotation(90f);
		
		layoutPS.setVisibility(View.GONE);
		imgPS.setRotation(90f);
		
		layoutPT.setVisibility(View.GONE);
		imgPT.setRotation(90f);
		
		layoutPC.setVisibility(View.GONE);
		imgPC.setRotation(90f);
	}

	public void guardarCampos() {
		
		if (db != null) {
			ContentValues valores = new ContentValues();
			
			valores.put("PBuso", edUsoPB.getText().toString());
			valores.put("PBgiro", edGiroPB.getText().toString());
			valores.put("PBedo", edEdoPB.getText().toString());
			
			valores.put("PUuso", edUsoPU.getText().toString());
			valores.put("PUgiro", edGiroPU.getText().toString());
			valores.put("PUedo", edEdoPU.getText().toString());
			
			valores.put("PDuso", edUsoPS.getText().toString());
			valores.put("PDgiro", edGiroPS.getText().toString());
			valores.put("PDedo", edEdoPS.getText().toString());
			
			valores.put("PTuso", edUsoPT.getText().toString());
			valores.put("PTgiro", edGiroPT.getText().toString());
			valores.put("PTedo", edEdoPT.getText().toString());
			
			valores.put("PCuso", edUsoPC.getText().toString());
			valores.put("PCgiro", edGiroPC.getText().toString());
			valores.put("PCedo", edEdoPC.getText().toString());
			
			db.insert("Lote", null, valores);
			
		}
		
		Cursor c = db.rawQuery("SELECT * FROM Lote", null);
		//String tabla = "";
		
		if (c.moveToFirst()) {
			do {
				String usopb = c.getString(1);
				Log.e("tabla", usopb);
			} while (c.moveToNext());
		}
		
	}
	
	public void limpiarCampos(){
		edUsoPB.setText("");
		edGiroPB.setText("");
		edEdoPB.setText("");
		
		edUsoPU.setText("");
		edGiroPU.setText("");
		edEdoPU.setText("");
		
		edUsoPS.setText("");
		edGiroPS.setText("");
		edEdoPS.setText("");
		
		edUsoPT.setText("");
		edGiroPT.setText("");
		edEdoPT.setText("");
		
		edUsoPC.setText("");
		edGiroPC.setText("");
		edEdoPC.setText("");
	}
	
	public void dropPlantaBaja() {
		if (isDownPB == true) {
			layoutPB.setVisibility(View.VISIBLE);
			imgPB.setRotation(0f);
			isDownPB = false;
		} else {
			layoutPB.setVisibility(View.GONE);
			imgPB.setRotation(90f);
			isDownPB = true;
		}
	}

	public void dropPlantaUno() {
		if (isDownPU == true) {
			layoutPU.setVisibility(View.VISIBLE);
			imgPU.setRotation(0f);
			isDownPU = false;
		} else {
			layoutPU.setVisibility(View.GONE);
			imgPU.setRotation(90f);
			isDownPU = true;
		}
	}

	public void dropPlantaDos() {
		if (isDownPS == true) {
			layoutPS.setVisibility(View.VISIBLE);
			imgPS.setRotation(0f);
			isDownPS = false;
		} else {
			layoutPS.setVisibility(View.GONE);
			imgPS.setRotation(90f);
			isDownPS = true;
		}
	}

	public void dropPlantaTres() {
		if (isDownPT == true) {
			layoutPT.setVisibility(View.VISIBLE);
			imgPT.setRotation(0f);
			isDownPT = false;
		} else {
			layoutPT.setVisibility(View.GONE);
			imgPT.setRotation(90f);
			isDownPT = true;
		}
	}

	public void dropPlantaCuatro() {
		if (isDownPC == true) {
			layoutPC.setVisibility(View.VISIBLE);
			imgPC.setRotation(0f);
			isDownPC = false;
		} else {
			layoutPC.setVisibility(View.GONE);
			imgPC.setRotation(90f);
			isDownPC = true;
		}
	}

}

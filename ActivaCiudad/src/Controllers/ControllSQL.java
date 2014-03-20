package Controllers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ControllSQL extends SQLiteOpenHelper {
	
	String sqlCreate = "CREATE TABLE Lote (id_lote INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
			"PBuso TEXT, PBgiro TEXT,PBedo TEXT," +
			"PUuso TEXT, PUgiro TEXT,PUedo TEXT," +
			"PDuso TEXT, PDgiro TEXT,PDedo TEXT," +
			"PTuso TEXT, PTgiro TEXT,PTedo TEXT)," +
			"PCuso TEXT, PCgiro TEXT,PCedo TEXT";
	
	String sqlDrop = "DROP TABLE IF EXISTS Lote";
	String sqlTruncate = "TRUNCATE TABLE Lote";

	public ControllSQL(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(sqlCreate);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL(sqlDrop);
		db.execSQL(sqlCreate);
	}

}

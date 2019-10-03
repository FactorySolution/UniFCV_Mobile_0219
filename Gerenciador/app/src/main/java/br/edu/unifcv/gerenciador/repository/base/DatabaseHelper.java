package br.edu.unifcv.gerenciador.repository.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String DB_NAME = "Gerenciador.db";

    private static final String TABLE_TESTE =
            "CREATE TABLE TESTE (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME VARCHAR(100));";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_TESTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

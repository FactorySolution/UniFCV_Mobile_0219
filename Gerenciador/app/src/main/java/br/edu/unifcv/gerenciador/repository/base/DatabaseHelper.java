package br.edu.unifcv.gerenciador.repository.base;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.edu.unifcv.gerenciador.constants.DataBaseConstants;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int VERSAO = 1;
    private static final String DB_NAME = "Gerenciador.db";

    private static final String CREATE_CONVIDADO = "Create Table " +
            DataBaseConstants.CONVIDADO.TABLE_NAME +
            " ( " + DataBaseConstants.CONVIDADO.COLUMNS.ID +
            " integer primary key autoincrement, " +
            DataBaseConstants.CONVIDADO.COLUMNS.NAME +
            " varchar(200) not null, " +
            DataBaseConstants.CONVIDADO.COLUMNS.PRESENCE +
            " integer not null" +
            " );";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONVIDADO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

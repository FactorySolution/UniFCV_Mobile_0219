package br.edu.unifcv.gerenciador.repository;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import br.edu.unifcv.gerenciador.repository.base.DatabaseHelper;

public class Teste {

    private static Teste INSTANCE;
    private DatabaseHelper databaseHelper;

    private Teste(Context context) {
        this.databaseHelper = new DatabaseHelper(context);
    }

    public static Teste getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new Teste(context);
        }
        return INSTANCE;
    }

    public void testar() {
        SQLiteDatabase database = databaseHelper.getReadableDatabase();
        database.execSQL("select * from teste");
    }
}

package br.edu.unifcv.gerenciador.repository;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import br.edu.unifcv.gerenciador.constants.DataBaseConstants;
import br.edu.unifcv.gerenciador.repository.base.DatabaseHelper;

import static android.support.constraint.Constraints.TAG;

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
        try {
            SQLiteDatabase database = databaseHelper.getReadableDatabase();
            database.execSQL("select * from " + DataBaseConstants.CONVIDADO.TABLE_NAME);
        } catch (Exception e) {
            Log.d(TAG, e.getMessage());

        }
    }
}

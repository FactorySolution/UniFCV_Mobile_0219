package br.edu.unifcv.gerenciador.repository;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

import br.edu.unifcv.gerenciador.constants.DataBaseConstants;
import br.edu.unifcv.gerenciador.model.Convidado;
import br.edu.unifcv.gerenciador.repository.base.DatabaseHelper;

public class ConvidadoRepositoryImpl implements CRUDRepository<Convidado> {


    private static ConvidadoRepositoryImpl INSTANCE;
    private Context context;
    private DatabaseHelper databaseHelper;

    private ConvidadoRepositoryImpl(Context context) {
        this.context = context;
        this.databaseHelper = new DatabaseHelper(context);
    }

    public static ConvidadoRepositoryImpl getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new ConvidadoRepositoryImpl(context);
        }
        return INSTANCE;
    }

    @Override
    public List<Convidado> getAll() {
        return null;
    }

    @Override
    public Convidado getByID(int ID) {
        // select * from convidado where ID = ID;
        try {
            SQLiteDatabase database = this.databaseHelper.getReadableDatabase();
            Cursor cursor = database.rawQuery("Select * from "
                    + DataBaseConstants.CONVIDADO.TABLE_NAME +
                    " where " + DataBaseConstants.CONVIDADO.COLUMNS.ID + " = " + String.valueOf(ID), null, null);
            if (cursor != null && cursor.getCount() > 0) {

            }
        } finally {

        }


        return null;
    }
}

package br.edu.unifcv.gerenciador.repository;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

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
        Convidado convidado = new Convidado();
        try {
            SQLiteDatabase database = this.databaseHelper.getReadableDatabase();

            // select * from convidado where id =  + id;
            // Campos do Select
            String[] projection = {
                    DataBaseConstants.CONVIDADO.COLUMNS.ID,
                    DataBaseConstants.CONVIDADO.COLUMNS.NAME,
                    DataBaseConstants.CONVIDADO.COLUMNS.PRESENCE
            };

            String where = DataBaseConstants.CONVIDADO.COLUMNS.ID  + " = ?";

            String args[] = {String.valueOf(ID)};

            Cursor cursor =
                    database.query(
                            DataBaseConstants.CONVIDADO.TABLE_NAME,
                            projection,
                            where,
                            args,
                            null,
                            null,
                            null);
            //Cursor cursor = database.rawQuery("Select * from "
            //        + DataBaseConstants.CONVIDADO.TABLE_NAME +
            //        " where " + DataBaseConstants.CONVIDADO.COLUMNS.ID + " = " + String.valueOf(ID), null, null);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                convidado.setID(
                        cursor.getInt(
                                cursor.getColumnIndex(DataBaseConstants.CONVIDADO.COLUMNS.ID)));
                convidado.setNome(
                        cursor.getString(
                                cursor.getColumnIndex(DataBaseConstants.CONVIDADO.COLUMNS.NAME)));
                convidado.setPresenca(
                        cursor.getInt(
                                cursor.getColumnIndex(DataBaseConstants.CONVIDADO.COLUMNS.PRESENCE)));
                cursor.close();
            }
        } catch (Exception e) {
            return convidado;
        }
        return convidado;
    }

    @Override
    public void save(Convidado convidado) {
       // insert into convidado (nome, presenca)
        // values (convidado.getNome, convidado.getPresenca)
        try {
            SQLiteDatabase database = this.databaseHelper.getWritableDatabase();
            ContentValues values = new ContentValues();

            values.put(
                    DataBaseConstants.CONVIDADO.COLUMNS.NAME, convidado.getNome());
            values.put(
                    DataBaseConstants.CONVIDADO.COLUMNS.PRESENCE, convidado.getPresenca());
            long a = database.insert(
                       DataBaseConstants.CONVIDADO.TABLE_NAME, null, values );
        } catch (Exception e) {

        }
    }

}

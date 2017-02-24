package br.com.reinosoft.agendacadastro.dominio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;

public class RepositorioContato {

    private SQLiteDatabase conn;

    public RepositorioContato(SQLiteDatabase conn) {
        this.conn = conn;
    }

    public void testInserirContatos() {
        for (int c = 0; c < 10; c++) {
            ContentValues values = new ContentValues();
            values.put("telefone", "8488-4690");
            conn.insertOrThrow("contato", null, values);
        }
    }

    //Método responsável pela consulta dos contatos
    public ArrayAdapter<String> buscaContatos(Context context) {
        ArrayAdapter<String> adpContatos = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1);

        Cursor cursor = conn.query("contato", null, null, null, null, null, null);

        if(cursor.getCount() > 0) {
            cursor.moveToFirst();
            do {
                String telefone = cursor.getString(1);
                adpContatos.add(telefone);
            } while(cursor.moveToNext());
        }

        return adpContatos;
    }

}

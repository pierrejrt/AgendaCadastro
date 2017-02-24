package br.com.reinosoft.agendacadastro.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    public DataBase(Context context) {
        super(context, "AGENDA", null, 1);
    }

    //Método Responsável pela criação das Tabelas
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptSQL.getCreateContato()); //Executa o Script de criação da tabela contato.

    }
    //Método responsável pelas atualiszações das tabelas
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

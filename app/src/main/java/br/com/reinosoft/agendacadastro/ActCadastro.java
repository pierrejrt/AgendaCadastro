package br.com.reinosoft.agendacadastro;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import br.com.reinosoft.agendacadastro.database.DataBase;
import br.com.reinosoft.agendacadastro.dominio.RepositorioContato;

public class ActCadastro extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnAdicionar;
    private EditText edtPesquisa;
    private ListView lstContatos;
    private ArrayAdapter<String> adpContatos;
    private RepositorioContato repositorioContato;

    private DataBase dataBase;
    private SQLiteDatabase conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cadastro);

        //Faz a implementação dos componentes do layout act_cadastro.xml
        btnAdicionar = (ImageButton) findViewById(R.id.btnAdicionar);
        edtPesquisa = (EditText) findViewById(R.id.edtPesquisa);
        lstContatos = (ListView) findViewById(R.id.lstContatos);

        btnAdicionar.setOnClickListener(this);

        try {
            dataBase = new DataBase(this);
            conn = dataBase.getWritableDatabase();

            repositorioContato = new RepositorioContato(conn);
            //repositorioContato.testInserirContatos();
            adpContatos = repositorioContato.buscaContatos(this);

            lstContatos.setAdapter(adpContatos);

        } catch (SQLException ex) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro de Conexão. " + ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

    @Override
    public void onClick(View v) {
        //Intent faz a chamada do layout act_cad_contatos.xml
        Intent it = new Intent(this, ActCadContatos.class);
        startActivity(it);
    }
}

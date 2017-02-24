package br.com.reinosoft.agendacadastro;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ActCadContatos extends AppCompatActivity {

    private EditText edtNome;
    private EditText edtTelefone;
    private Spinner spnTipoTelefone;
    private EditText edtEmail;
    private Spinner spnTipoEmail;
    private EditText edtEndereco;
    private Spinner spnTipoEndereco;
    private EditText edtDatasEspeciasi;
    private Spinner spnDatasEspeciais;
    private EditText edtGrupos;

    private ArrayAdapter<String> adpTipoTelefone;
    private ArrayAdapter<String> adpTipoEmail;
    private ArrayAdapter<String> adpTipoEndereco;
    private ArrayAdapter<String> adpDatasEspeciais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_contatos);

        edtNome = (EditText) findViewById(R.id.edtNome);

        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        spnTipoTelefone = (Spinner) findViewById(R.id.spnTipoTelefone);

        edtEmail = (EditText) findViewById(R.id.edtEmail);
        spnTipoEmail = (Spinner) findViewById(R.id.spnTipoEmail);

        edtEndereco = (EditText) findViewById(R.id.edtEndereco);
        spnTipoEndereco = (Spinner) findViewById(R.id.spnTipoEndereco);

        edtDatasEspeciasi = (EditText) findViewById(R.id.edtDatasEspeciais);
        spnDatasEspeciais = (Spinner) findViewById(R.id.spnDatasEspeciais);

        edtGrupos = (EditText) findViewById(R.id.edtGrupos);

        adpTipoTelefone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoTelefone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoEmail = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoEmail.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpTipoEndereco = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpTipoEndereco.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        adpDatasEspeciais = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adpDatasEspeciais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spnTipoTelefone.setAdapter(adpTipoTelefone);
        spnTipoEmail.setAdapter(adpTipoEmail);
        spnTipoEndereco.setAdapter(adpTipoEndereco);
        spnDatasEspeciais.setAdapter(adpDatasEspeciais);

        adpTipoEmail.addAll("Casa", "Trabalho", "Outros");
        adpTipoTelefone.addAll("Celular", "Trabalho", "Casa", "Principal", "Fax Trabalho", "Fax Casa", "Pager", "Outros");
        adpTipoEndereco.addAll("Casa", "Trabalho", "Outros");
        adpDatasEspeciais.addAll("Aniversário", "Data Comemorativa", "Outros");
    }

    //Método responsável para associar o menu_act_cad_contatos.xml com a interface act_cad_contatos.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_contatos, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //Método responsável pela seleção dos itens de menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mni_acao1:

                break;
            case R.id.mni_acao2:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

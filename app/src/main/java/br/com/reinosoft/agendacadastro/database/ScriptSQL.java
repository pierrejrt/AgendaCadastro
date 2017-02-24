package br.com.reinosoft.agendacadastro.database;

public class ScriptSQL {

    public static String getCreateContato() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS contato ( ");
        sqlBuilder.append("_id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append("telefone VARCHAR(14), ");
        sqlBuilder.append("tipo_telefone VARCHAR(1), ");
        sqlBuilder.append("email VARCHAR(255), ");
        sqlBuilder.append("tipo_email VARCHAR(1), ");
        sqlBuilder.append("endereco VARCHAR(255), ");
        sqlBuilder.append("tipo_endereco VARCHAR(1), ");
        sqlBuilder.append("datas_especiais DATE, ");
        sqlBuilder.append("tipo_datas_especiais VARCHAR(1), ");
        sqlBuilder.append("grupos VARCHAR(255) ");
        sqlBuilder.append(");");
        return sqlBuilder.toString();
    }

}

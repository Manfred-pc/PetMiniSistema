package com.example.provaestudar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHELPER extends SQLiteOpenHelper {


    public static final String DB_Nome = "GestaoPet";
    public static final int VERSAO = 1;
    public static final String TABELA_PET = "Pet";
    public static final String COLUNA_ID_PET = "_id";
    public static final String COLUNA_NOME_PET = "nome";
    public static final String COLUNA_IDADE_PET = "idade";
    public static final String COLUNA_SEXO_PET = "sexo";
    public static final String COLUNA_RACA_PET = "raca";
    public static final String COLUNA_ESPECIE_PET = "especie";
    public static final String COLUNA_DONO_PET = "dono";

    public DBHELPER (Context context){
        super (context,DB_Nome,null,VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE "+ TABELA_PET+ "(" +
                COLUNA_ID_PET + "INTEGER PRIMARY KEY AUTOINCREMENT,"+
                COLUNA_NOME_PET + "TEXT NOT NULL, "+
                COLUNA_IDADE_PET + "INTEGER NOT NULL, "+
                COLUNA_SEXO_PET + "TEXT NOT NULL, "+
                COLUNA_RACA_PET + "TEXT NOT NULL, "+
                COLUNA_ESPECIE_PET + "TEXT NOT NULL, "+
                COLUNA_DONO_PET + "TEXT NOT NULL, ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

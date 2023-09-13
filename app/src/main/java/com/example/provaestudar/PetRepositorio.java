package com.example.provaestudar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public class PetRepositorio {

    private DBHELPER dbhelper;
     public  PetRepositorio(Context context){
         dbhelper= new DBHELPER(context);

     }
     public long inserir (Pet pet) {
         SQLiteDatabase db = dbhelper.getWritableDatabase();
         ContentValues valores = new ContentValues();
         valores.put(DBHELPER.COLUNA_ID_PET, pet.getId());
         valores.put(DBHELPER.COLUNA_NOME_PET, pet.getNome());
         valores.put(DBHELPER.COLUNA_IDADE_PET, pet.getIdade());
         valores.put(DBHELPER.COLUNA_SEXO_PET, pet.getSexo());
         valores.put(DBHELPER.COLUNA_RACA_PET, pet.getRaca());
         valores.put(DBHELPER.COLUNA_ESPECIE_PET, pet.getEspecie());
         valores.put(DBHELPER.COLUNA_DONO_PET, pet.getDono());
         long id = db.insert (DBHELPER.TABELA_PET,null,valores);
         dbhelper.close();
         return id;
     }
     public List<Pet> buscarTodosPet(){
         SQLiteDatabase db = dbhelper.getReadableDatabase();
         String sql = "SELECT * FROM "+ DBHELPER.TABELA_PET+"ORDER BY"
                 +DBHELPER.COLUNA_NOME_PET;
         Cursor cursor = db.rawQuery(sql,null);
         
     }



}

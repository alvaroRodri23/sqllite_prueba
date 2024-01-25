/*package com.example.sqllite_prueba

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context,DATABASE,null,DATABASE_VERSION){
    companion object{
        private const val DATABASE_VERSION=1
        private const val DATABASE="Aritulos.db"
        private const val TABLA_ARTICULOS= "Articulos"
        private const val KEY_ID= "_id"
        private const val COLUMN_TIPOARTICULO="TipoArticulo"
        private const val COLUMN_NOMBRE="nombre"
        private const val COLUMN_PESO="peso"
        private const val COLUMN_PRECIO="precio"
        private const val COLUMN_ATAQUE="ataque"
        private const val COLUMN_DEFENSA="defensa"
        private const val COLUMN_VIDA="vida"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable ="CREATE TABLE $TABLA_ARTICULOS($KEY_ID INTEGER PRIMARY KEY,"+
                "$COLUMN_TIPOARTICULO TEXT, $COLUMN_NOMBRE TEXT, $COLUMN_PESO INTEGER, $COLUMN_PRECIO INTEGER,$COLUMN_ATAQUE ICOLUMN_$COLUMN_DEFENSA,ICOLUMN_$COLUMN_VIDA INTEGER)"
        db?.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLA_ARTICULOS")
        onCreate(db)
    }

    fun insertarArticulo(articulo: Articulo){
        val db= this.writableDatabase
        val values= ContentValues().apply {
            put(COLUMN_NOMBRE, Articulo.TipoArticulo.ARMA.name)
            put(COLUMN_PESO, articulo.getPeso())
            put(COLUMN_PRECIO,articulo.getPrecio())
            put(COLUMN_TIPOARTICULO, Articulo.Nombre.ESPADA.name)
            put(COLUMN_ATAQUE,articulo.getAumentoAtaque())
            put(COLUMN_DEFENSA,articulo.getAumentoDefensa())
            put(COLUMN_VIDA,articulo.getAumentoVida())
        }
        db.insert(TABLA_ARTICULOS,null,values)
        db.close()
    }

    @SuppressLint("Range")
    fun getArticulos():ArrayList<Articulo>{

        val articulos= ArrayList<Articulo>()
        val selectQuery ="SELECT * FROM $TABLA_ARTICULOS"
        val db = this.readableDatabase
        val cursor =db.rawQuery(selectQuery,null)
        if(cursor.moveToFirst()){

            do{
                val id= cursor.getInt(cursor.getColumnIndex(KEY_ID))
                val nombre= cursor.getString(cursor.getColumnIndex(COLUMN_NOMBRE))
                val tipo= cursor.getString(cursor.getColumnIndex(COLUMN_TIPOARTICULO))
                val peso= cursor.getInt(cursor.getColumnIndex(COLUMN_PESO))
                val precio= cursor.getString(cursor.getColumnIndex(COLUMN_PRECIO))
                val ataque = cursor.getInt(cursor.getColumnIndex(COLUMN_ATAQUE))
                val defensa = cursor.getInt(cursor.getColumnIndex(COLUMN_DEFENSA))
                val vida = cursor.getInt(cursor.getColumnIndex(COLUMN_VIDA))
            }while(cursor.moveToNext())
        }
        cursor.close()
        db.close()
        return articulos
    }



}
*/
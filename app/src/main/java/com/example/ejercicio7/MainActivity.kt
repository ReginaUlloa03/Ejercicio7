package com.example.ejercicio7

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun accion1(v: View){ //Intención explicita
        Log.w("Intenciones APP", "Se ppreionó el botón 1")
        val intencion1 = Intent(this, Tecladito:: class.java) //(contexto, clase mandar llamar)
        startActivity(intencion1) //para mandar llamar, star se lleva intencion1

    }
    fun accion2(v:View){ //Intencion implicita
        Log.w("Intenciones APP", "Se presionó el botón 2")
        val Pagina = Intent(android.content.Intent.ACTION_VIEW) //Intencion requiere dato
        Pagina.data = Uri.parse("https://google.com.mx") //para que abra pagina web
        startActivity(Pagina)

    }
}
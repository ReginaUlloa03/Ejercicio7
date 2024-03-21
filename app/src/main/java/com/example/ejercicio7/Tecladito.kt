package com.example.ejercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    lateinit var txtMostrar: TextView
    var inputText: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)
        txtMostrar = findViewById(R.id.txtMostrar)
        val btn1: Button = findViewById(R.id.btn1)
        val btn2: Button = findViewById(R.id.btn2)
        val btn3: Button = findViewById(R.id.btn3)
        val btn4: Button = findViewById(R.id.btn4)
        val btnB: Button = findViewById(R.id.btnB)
        val btnC: Button = findViewById(R.id.btnC)


        // Configuración del listener de clic para btn1
        btn1.setOnClickListener {
            // Cuando se hace clic en btn1, se agrega su texto al TextView txtMostrar
            agregarDigito(btn1.text.toString())
        }


        // Configuración del listener de clic para btn2
        btn2.setOnClickListener {
            // Cuando se hace clic en btn2, se agrega su texto al TextView txtMostrar
            agregarDigito(btn2.text.toString())
        }
        btn3.setOnClickListener {
            agregarDigito(btn3.text.toString())
        }
        btn4.setOnClickListener {
            agregarDigito(btn4.text.toString())
        }
        btnB.setOnClickListener {
            borrarUltimoDigito()
        }
        // Configuración del listener de clic para btnC (Limpiar todo)
        btnC.setOnClickListener {
            limpiarTodo()
        }
    }
private fun agregarDigito(digito: String) {
    inputText += digito
    actualizarTexto()
}
private fun borrarUltimoDigito() {
    if (inputText.isNotEmpty()) {
        inputText = inputText.substring(0, inputText.length - 1)
        actualizarTexto()
    }
}
    private fun limpiarTodo() {
        inputText = ""
        actualizarTexto()
    }
private fun actualizarTexto() {
    txtMostrar.text = inputText
}
}
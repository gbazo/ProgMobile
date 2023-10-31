package com.example.aula01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vinculando os elementos
        val editTextName: EditText = findViewById(R.id.editTextName)
        val buttonSubmit: Button = findViewById(R.id.buttonSubmit)
        val textViewResult: TextView = findViewById(R.id.textViewResult)

        // Definindo a ação de clique do botão
        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            textViewResult.text = "Olá, $name!"
        }
    }
}

package com.example.loginchallengeort

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var signInTextView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickListener()
    }
    private fun setClickListener() {
        signInTextView = findViewById<TextView>(R.id.registerTextId)
        signInTextView.setOnClickListener {
            // Cuando se hace clic en registerTextId, crea un Intent para iniciar SignInForm
            val intent = Intent(this, SignInForm::class.java)
            startActivity(intent)
        }
        initializeComponents();
    }

    private fun initializeComponents() {
        val loginButton = findViewById<Button>(R.id.loginButtonId)
        val passwordInputEditText = findViewById<EditText>(R.id.passwordInputId)
        val userInputEditText = findViewById<EditText>(R.id.userInputId)
        loginButton.setOnClickListener {
            // Obtiene el texto de los EditText
            val username = userInputEditText.text.toString()
            val password = passwordInputEditText.text.toString()

            // Imprime los datos del usuario en la consola
            Log.d("Login", "Nuevo inicio de sesión: ");
            Log.d("Login", "Usuario: $username, Contraseña: $password")
        }
    }
}
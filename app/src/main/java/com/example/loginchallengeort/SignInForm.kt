package com.example.loginchallengeort

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInForm : AppCompatActivity() {
    lateinit var goBackTextView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_form)

        setClickListener()
    }

    private fun setClickListener() {
        goBackTextView = findViewById<TextView>(R.id.goBackTextId)

        goBackTextView.setOnClickListener {
            // Cuando se hace clic en registerTextId, crea un Intent para iniciar SignInForm
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        initializeComponents();
    }

    private fun initializeComponents() {
        val signInButton = findViewById<Button>(R.id.signInButtonId)
        val emailInputEditText = findViewById<EditText>(R.id.emailInputId)
        val passwordInputEditText = findViewById<EditText>(R.id.passwordInputId)
        val userInputEditText = findViewById<EditText>(R.id.userInputId)
        signInButton.setOnClickListener {
            // Obtiene el texto de los EditText
            val email = emailInputEditText.text.toString();
            val username = userInputEditText.text.toString();
            val password = passwordInputEditText.text.toString();

            // Imprime los datos del usuario en la consola
            Log.d("SignIn", "Nuevo registro: ");
            Log.d("SignIn", "Email: $email, Usuario: $username, Contraseña: $password");
        }
    }
}
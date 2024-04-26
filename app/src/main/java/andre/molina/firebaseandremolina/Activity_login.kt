package andre.molina.firebaseandremolina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Llamar a los elementos

        val txtCorreoL = findViewById<EditText>(R.id.txtCorreoL)
        val txtContraseñaL = findViewById<EditText>(R.id.txtContraseñaL)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnIraSignUp = findViewById<Button>(R.id.btnIraSignUp)


            btnIraSignUp.setOnClickListener{
                val pantallaRegistro = Intent(this, MainActivity::class.java)
                startActivity(pantallaRegistro)
            }
    }
}
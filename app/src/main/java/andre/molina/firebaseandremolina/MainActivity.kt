package andre.molina.firebaseandremolina

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Mandar a llamar todos los elementos

        val txtCorreo = findViewById<EditText>(R.id.txtCorreo)
        val txtContraseña = findViewById<EditText>(R.id.txtContraseña)
        val btnRegistrarse = findViewById<Button>(R.id.btnRegistrarse)
        val btnIraLogin = findViewById<Button>(R.id.btnIraLogin)

        //Programar el botòn

        btnRegistrarse.setOnClickListener {
            //Creamos un usuario con el correo y contraseña
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(txtCorreo.text.toString(), txtContraseña.text.toString())
            //Imprimir
            println("¡El usuario ha sido regitsrado con éxito!")
        }

        btnIraLogin.setOnClickListener {
            val pantallalogin = Intent(this, Activity_login::class.java)
            startActivity(pantallalogin)
        }


    }
}
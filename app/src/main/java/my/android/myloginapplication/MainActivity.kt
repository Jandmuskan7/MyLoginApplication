package my.android.myloginapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import my.android.myloginapplication.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    companion object{
        lateinit var auth: FirebaseAuth
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
   val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty())
            {
                MainActivity.auth.signInWithEmailAndPassword(email,password).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this, "Login Successfull",
                            Toast.LENGTH_LONG).show()
//intent to home activity
                        startActivity(
                            Intent(this, LoginActivity ::
                        class.java)
                        )
                        finish()
                    }
                }.addOnFailureListener {
                    Toast.makeText(this, it.localizedMessage,
                        Toast.LENGTH_LONG).show()
                }
            }
        }
        binding.btnSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity ::
            class.java))
            finish()
        }
    }
}

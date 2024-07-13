package my.android.myloginapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import my.android.myloginapplication.databinding.ActivityLoginBinding
import my.android.myloginapplication.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Log In"
        binding.btnLogin.setOnClickListener {
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty()) {
                MainActivity.auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(
                            this, "Login Successfull",
                            Toast.LENGTH_LONG
                        ).show()
//intent to home activity
                    }
                }.addOnFailureListener {
                    Toast.makeText(
                        this, it.localizedMessage,
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    }
}
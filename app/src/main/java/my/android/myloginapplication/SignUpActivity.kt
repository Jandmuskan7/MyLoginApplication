package my.android.myloginapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import my.android.myloginapplication.databinding.ActivityMainBinding
import my.android.myloginapplication.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    companion object{
        lateinit var auth: FirebaseAuth
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = FirebaseAuth.getInstance()
val binding =ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title= "Sign Up"

        binding.btnRegister.setOnClickListener{
            val email = binding.editTextTextEmailAddress.text.toString()
            val password = binding.editTextTextPassword.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty()){
                MainActivity.auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show()
//intent to home activity
                    }
                }.addOnFailureListener {
                    Toast.makeText(this, it.localizedMessage,
                        Toast.LENGTH_LONG).show()
                }
            }
        }
        binding.btnLogin.setOnClickListener {
          val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
package my.android.myloginapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class Bottom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom)

        var NavController = findNavController(R.id.fragmentContainerView)

        // Initialize BottomNavigationView
        val bottomnav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set up BottomNavigationView with NavController
        bottomnav.setupWithNavController(NavController)
        
    }
}

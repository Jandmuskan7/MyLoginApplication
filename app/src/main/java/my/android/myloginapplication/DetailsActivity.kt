package my.android.myloginapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import my.android.myloginapplication.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Optionally, you can set the content dynamically if needed
        binding.foodNameTextView.text = buildString {
            append("Food Name")
        }
        binding.shortDescriptionTextView.text = buildString {
            append("Short description\nLorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad")
        }
        binding.ingredientsTextView.text = buildString {
            append("• Strawberry\n• Cream\n• Wheat")
        }
        binding.addToCartButton.text = buildString {
            append("Add To Cart")
        }
    }
}
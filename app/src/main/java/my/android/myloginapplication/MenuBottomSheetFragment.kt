package my.android.myloginapplication

import MenuAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import my.android.myloginapplication.databinding.FragmentMenuBottomSheetBinding
import java.util.ArrayList
import androidx.recyclerview.widget.LinearLayoutManager


class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener{
            dismiss()
        }
            val menuFoodName = listOf("Burger",
                "sandwich",
                "momo",
                "item",
                "sandwich",
                "momo",
                "Burger",
                "sandwich",
                "momo",
                "item",
                "sandwich",
                "momo")
        val menuItemPtice = listOf("$5", "$6", "$8", "$9", "$10", "$10","$5", "$6", "$8", "$9", "$10", "$10")
        val menuImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6,
        )
        val adapter = MenuAdapter(
            ArrayList(menuFoodName),
            ArrayList(menuItemPtice),
            ArrayList(menuImage)
        )

        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }


    companion object {

    }
}

package my.android.myloginapplication.Fragement

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.android.myloginapplication.CongratsBottomSheet
import my.android.myloginapplication.PayOutActivity
import my.android.myloginapplication.R
import my.android.myloginapplication.adapter.CartAdapter
import my.android.myloginapplication.databinding.FragmentCartBinding

class CartFragment : Fragment() {

private lateinit var binding:FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater,container,false)

        val cartFoodName = listOf("Burger","Sandwich","Momo","Item","Sandwich","Momo")
        val cartItemPrice = listOf("$5","$10","$20","13","25","10")
        val cartImage = listOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu5,
            R.drawable.menu6
        )
        val adapter = CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        binding.proceedButton.setOnClickListener{
            val intent = Intent(requireContext(),PayOutActivity::class.java)
            startActivity(intent)
        }
        binding.proceedButton.setOnClickListener{
        val bottomSheetDialog = CongratsBottomSheet()
        bottomSheetDialog.show(parentFragmentManager, "Test")
        }
        return  binding.root
    }

    companion object {


    }
}
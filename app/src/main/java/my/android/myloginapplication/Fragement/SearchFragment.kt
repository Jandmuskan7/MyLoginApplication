package my.android.myloginapplication.Fragement

import MenuAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.android.myloginapplication.R
import my.android.myloginapplication.databinding.FragmentHomeBinding
import my.android.myloginapplication.databinding.FragmentSearchBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
   private lateinit var adapter : MenuAdapter
    private val originalMenuFoodName =  listOf(
        "Burger",
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
        "momo"
    )
    private val originalMenuItemPrice = listOf("$5", "$6", "$8", "$9", "$10", "$10","$5", "$6", "$8", "$9", "$10", "$10")
    private val originalMenuImage = listOf(
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater,container,false)

        return binding.root
    }

    companion object {


    }
}
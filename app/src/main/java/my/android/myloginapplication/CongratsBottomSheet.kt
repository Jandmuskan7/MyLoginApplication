package my.android.myloginapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import my.android.myloginapplication.databinding.FragmentCongratsBottomSheetBinding

class CongratsBottomSheet : BottomSheetDialogFragment() {
private lateinit var binding: FragmentCongratsBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCongratsBottomSheetBinding.inflate(layoutInflater, container, false)
        binding.goHome.setOnClickListener{
            val intent = Intent(requireContext(), Bottom ::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    companion object {

    }
}
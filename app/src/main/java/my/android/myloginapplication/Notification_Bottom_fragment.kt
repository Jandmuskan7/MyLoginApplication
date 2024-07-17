package my.android.myloginapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import my.android.myloginapplication.adapter.NotificationAdaptor
import my.android.myloginapplication.databinding.FragmentNotificationBottomFragmentBinding


class Notification_Bottom_fragment :BottomSheetDialogFragment() {
    private lateinit var binding: FragmentNotificationBottomFragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =
            FragmentNotificationBottomFragmentBinding.inflate(layoutInflater, container, false)
        val notifications = listOf("Your order has been Canceled Successfully","Order has been taken by the driver","Congrats Your order has been placed")


        val adapter = NotificationAdaptor(
            ArrayList(notifications),
            ArrayList()
        )

        return binding.root
    }

    companion object {

    }
}
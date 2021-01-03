package com.khoirulfajri.modul6navigasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {

    lateinit var nav: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        btnSubmit.setOnClickListener {
            // exitAnim = waktu pindah ke fragment tujuan
            // enterAnim = waktu sampai di fragment tujuan
            // popupExitAnim = waktu back dari fragment
            // popupEnterAnim = waktu sampai di fragment sebelumnya

            //pengecekan dari input user
            if (edInput.text.toString().isNotEmpty()) {

                //kalau ngk kosong
                val input = edInput.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)

                nav.navigate(R.id.action_secondFragment_to_resultFragment,bundle)
            }
        }
    }
}
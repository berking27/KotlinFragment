package com.example.kotlinfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.kotlinfragment.databinding.FragmentHomePageBinding
import com.google.android.material.snackbar.Snackbar

class HomePageFragment : Fragment() {
    private lateinit var design: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val design = FragmentHomePageBinding.inflate(inflater, container, false)

        design.homeBtn.setOnClickListener {
            val user1 = Users(27,"Berkin Koca")
            val dataPass = HomePageFragmentDirections.toGamePage(user1, "Berkin",22)


            Navigation.findNavController(it).navigate(dataPass)
        }


        return design.root
    }

}
package com.example.kotlinfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.kotlinfragment.databinding.FragmentGamePageBinding

class GamePageFragment : Fragment() {

    private  lateinit var design: FragmentGamePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val design = FragmentGamePageBinding.inflate(inflater, container, false)
        val bundle: GamePageFragmentArgs by navArgs()

        val name = bundle.name
        val age = bundle.age
        val userObject = bundle.userObject

        Log.e("Name", name)
        Log.e("Age", age.toString())
        Log.e("User No", userObject.id.toString())
        Log.e("User Name", userObject.name)

        design.gameBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toResultPage)
        }

        return design.root
    }

}
package com.example.agecalculation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.agecalculation.databinding.FragmentAppBinding


class AppFragment : Fragment() {

    private lateinit var binding: FragmentAppBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentAppBinding.inflate(inflater,container,false)
        binding.days.setOnClickListener {
            val navDayCalc =AppFragmentDirections.actionAppFragment2ToDateFragment()
            view?.let { it1 -> Navigation.findNavController(it1).navigate(navDayCalc) }
        }
        binding.dayBirth.setOnClickListener {
            val navBirth = AppFragmentDirections.actionAppFragment2ToBirthFragment()
            val navController = view?.findNavController()
            navController?.navigate(navBirth)
        }
        return binding.root
    }
}
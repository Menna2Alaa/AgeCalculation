package com.example.agecalculation

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.agecalculation.databinding.FragmentBirthBinding
import java.time.LocalDate
import java.time.Period

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class BirthFragment : Fragment() {

    private lateinit var binding: FragmentBirthBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentBirthBinding.inflate(inflater,container,false)
        return binding.root
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.datePicker.setOnDateChangedListener { _, year, month, day ->
            val birthDate = LocalDate.of(year, month + 1, day)
            calculateAge(birthDate)
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun calculateAge(birthDate: LocalDate) {
        val currentDate = LocalDate.now()
        val age: Period = Period.between(birthDate, currentDate)
        val years = age.years
        val months = age.months
        val days = age.days

        val ageString = "Age: $years years, $months months, $days days"
        binding.resText.text=ageString
    }

}

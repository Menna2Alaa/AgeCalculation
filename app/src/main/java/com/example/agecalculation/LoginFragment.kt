package com.example.agecalculation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.agecalculation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private lateinit var loginButton: Button

    /**
     *  onCreate is called before onCreateView
     *  so you need to init the binding in the onCreateView
     */

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
       /* binding.login.text.toString()
        val email = binding.userEt.text.toString()
        val password = binding.passWordEt.text.toString()
        loginButton.setOnClickListener {
            if (email.isNotEmpty() && password.isNotEmpty()) {
                val navDirection = LoginFragmentDirections.actionLoginFragment2ToAppFragment2()
                val navController = view?.findNavController()
                navController?.navigate(navDirection)
            }
        }*/
        return binding.root
    }


}
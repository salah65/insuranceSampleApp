package com.example.sampleinsuranceapp.app.features.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.sampleinsuranceapp.R
import com.example.sampleinsuranceapp.app.core.hideLoadingDialog
import com.example.sampleinsuranceapp.app.core.showLoadingDialog
import com.example.sampleinsuranceapp.data.retrofit.Status
import com.example.sampleinsuranceapp.databinding.FragmentSigninBinding
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentSigninBinding
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSigninBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loginBtn.setOnClickListener {
            val email = binding.emailInput.text.toString()
            val password = binding.passwordInput.text.toString()
// check if input not valid request from viewModel login else show snackBar with MSG
            if (email.isNotEmpty() && password.isNotEmpty())
                viewModel.loginWithEmailAndPassword(
                    binding.emailInput.text.toString(),
                    binding.passwordInput.text.toString()
                )
            else
                Snackbar.make(requireView(), "Enter Email valid And Password", Snackbar.LENGTH_SHORT)
                    .show()
        }
        viewModel.loginLiveData.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> showLoadingDialog()
                Status.SUCCESS -> {
                    hideLoadingDialog()
                    findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                }
                else -> {
                    hideLoadingDialog()
                    Toast.makeText(requireContext(), it.message, Toast.LENGTH_LONG).show()
                }

            }
        }

    }
}
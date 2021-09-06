package com.example.sampleinsuranceapp.app.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sampleinsuranceapp.databinding.FragmentHomeBinding
import com.example.sampleinsuranceapp.databinding.FragmentMedicalNetworkBinding

class MedicalNetworkFragment:Fragment() {
    private lateinit var binding:FragmentMedicalNetworkBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMedicalNetworkBinding.inflate(layoutInflater)
        return binding.root
    }
}
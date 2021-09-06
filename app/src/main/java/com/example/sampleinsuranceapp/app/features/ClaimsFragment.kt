package com.example.sampleinsuranceapp.app.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sampleinsuranceapp.databinding.FragmentClaimsBinding
import com.example.sampleinsuranceapp.databinding.FragmentHomeBinding

class ClaimsFragment:Fragment() {
    private lateinit var binding:FragmentClaimsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentClaimsBinding.inflate(layoutInflater)
        return binding.root
    }
}
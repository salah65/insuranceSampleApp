package com.example.sampleinsuranceapp.app.features

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sampleinsuranceapp.R
import com.example.sampleinsuranceapp.databinding.FragmentSplashBinding

class splashFragment : Fragment() {
    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.videoView.setVideoPath("android.resource://${activity?.packageName}/${R.raw.intro2}")
        binding.videoView.start()
        binding.videoView.setOnCompletionListener {
            findNavController().navigate(
                R.id
                    .action_splashFragment_to_loginFragment
            )
        }
    }
}
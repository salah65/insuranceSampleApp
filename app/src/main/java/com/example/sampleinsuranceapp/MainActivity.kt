package com.example.sampleinsuranceapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sampleinsuranceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavBar.setupWithNavController(navController)
        binding.bottomNavBar.background = null
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment, R.id.loginFragment -> {
                    hideToolbar()
                    hideBottomNav()
                }
                else -> {
                    showToolbar()
                    showBottomNav()
                }
            }
        }
        binding.servicesFab.setOnClickListener {
            navController.navigate(R.id.action_global_servicesFragment)
        }
    }

    private fun hideBottomNav() {
        binding.bottomNav.visibility = View.GONE
    }

    private fun showBottomNav() {
        binding.bottomNav.visibility = View.VISIBLE
    }

    private fun hideToolbar() {
        binding.appBarLayout.visibility = View.GONE
    }

    private fun showToolbar() {
        binding.appBarLayout.visibility = View.VISIBLE
    }
}
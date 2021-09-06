package com.example.sampleinsuranceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.sampleinsuranceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navController= findNavController(R.id.nav_host_fragment)
        binding.bottomNavBar.setupWithNavController(navController)
        binding.bottomNavBar.background=null
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.splashFragment,R.id.loginFragment -> hideBottomNav()
                else -> showBottomNav()
            }
        }
    }
    private fun hideBottomNav(){
        binding.bottomNav.visibility=View.GONE
    }
    private fun showBottomNav(){
        binding.bottomNav.visibility=View.VISIBLE
    }
}
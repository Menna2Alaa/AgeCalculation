package com.example.agecalculation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.agecalculation.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var toolbar: Toolbar
    private lateinit var slider: NavigationView
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var graph: NavGraph


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.Nav_Host) as NavHostFragment
        val inflater = navHostFragment.navController.navInflater
        graph = inflater.inflate(R.navigation.nav_graph)

//        navController = navHostFragment.navController
        toolbar = binding.toolbar
        val fragments: MutableSet<Int> = HashSet()
        fragments.add(R.id.loginFragment2)
        fragments.add(R.id.appFragment2)
        fragments.add(R.id.birthFragment)
        fragments.add(R.id.dateFragment)

        drawerLayout = binding.drawerLayout
        appBarConfiguration = AppBarConfiguration.Builder(fragments).setOpenableLayout(drawerLayout).build()
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(toolbar, navController, appBarConfiguration)

        slider = binding.slider
        NavigationUI.setupWithNavController(slider, navController)


    }
}


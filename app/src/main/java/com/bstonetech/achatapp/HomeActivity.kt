package com.bstonetech.achatapp


import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationView
import android.annotation.SuppressLint
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.core.view.GravityCompat
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.appcompat.app.AppCompatDelegate
import android.os.Build
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

@Suppress("DEPRECATION")
class HomeActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    @SuppressLint("NonConstantResourceId")
    private val mOnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener label@{ item: MenuItem ->
            var fragment: Fragment
            when (item.itemId) {
                R.id.navigationMyProfile->{
                    Toast.makeText(this, "Ma profile", Toast.LENGTH_SHORT).show()
                }
                R.id.navigationMyCourses->{
                    Toast.makeText(this, "Mes course", Toast.LENGTH_SHORT).show()
                }
                R.id.navigationHome->{
                    Toast.makeText(this, "Acceuille", Toast.LENGTH_SHORT).show()
                }
                R.id.navigationSearch->{
                    Toast.makeText(this, "Recherche", Toast.LENGTH_SHORT).show()
                }
                R.id.navigationMenu -> {
                    val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
                    drawer.openDrawer(GravityCompat.START)
                    return@label true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setDarkMode(window)
        setContentView(R.layout.activity_home)

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        //
        val layoutParams = bottomNavigationView.layoutParams as CoordinatorLayout.LayoutParams
        layoutParams.behavior = BottomNavigationBehavior()
        bottomNavigationView.selectedItemId = R.id.navigationHome

        //handling floating action menu
        findViewById<View>(R.id.floatingActionButton).setOnClickListener {
            val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
            drawer.openDrawer(GravityCompat.START)
        }
    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId
        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
        } else if (id == R.id.nav_slideshow) {
        } else if (id == R.id.nav_manage) {
        } else if (id == R.id.nav_share) {
        } else if (id == R.id.nav_dark_mode) {
            //code for setting dark mode
            //true for dark mode, false for day mode, currently toggling on each click
            val darkModePrefManager = DarkModePref(this)
            darkModePrefManager.setDarkMode(!darkModePrefManager.isNightMode)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            recreate()
        }
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    //create a seperate class file, if required in multiple activities
    fun setDarkMode(window: Window) {
        if (DarkModePref(this).isNightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            changeStatusBar(MODE_DARK, window)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            changeStatusBar(MODE_LIGHT, window)
        }
    }

    fun changeStatusBar(mode: Int, window: Window) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = this.resources.getColor(R.color.contentStatusBar)
            //Light mode
            if (mode == MODE_LIGHT) {
                window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
        }
    }

    companion object {
        private const val MODE_DARK = 0
        private const val MODE_LIGHT = 1
    }
}
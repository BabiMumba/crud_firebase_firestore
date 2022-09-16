package com.bstonetech.achatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bstonetech.achatapp.DarkModePrefManager
import androidx.appcompat.app.AppCompatDelegate
import com.bstonetech.achatapp.R
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (DarkModePrefManager(this).isNightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        setContentView(R.layout.activity_settings)
        //function for enabling dark mode
        setDarkModeSwitch()
        var prof = findViewById<TextView>(R.id.prodile)
        prof.setOnClickListener {
            Intent(this,AchatActivity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun setDarkModeSwitch() {
        @SuppressLint("UseSwitchCompatOrMaterialCode") val darkModeSwitch =
            findViewById<Switch>(R.id.darkModeSwitch)
        darkModeSwitch.isChecked = DarkModePrefManager(this).isNightMode
        darkModeSwitch.setOnCheckedChangeListener { buttonView: CompoundButton?, isChecked: Boolean ->
            val darkModePrefManager = DarkModePrefManager(this@SettingsActivity)
            darkModePrefManager.setDarkMode(!darkModePrefManager.isNightMode)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            recreate()
        }
    }
}
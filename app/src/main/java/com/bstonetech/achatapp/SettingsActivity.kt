package com.bstonetech.achatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import android.annotation.SuppressLint
import android.content.Intent
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (DarkModePref(this).isNightMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
        setContentView(R.layout.activity_settings)
        //function for enabling dark mode
        setDarkModeSwitch()
        var prof = findViewById<TextView>(R.id.prodile)
        val home = findViewById<TextView>(R.id.passe)
        val home_card = findViewById<TextView>(R.id.home_card)
        home.setOnClickListener {
            Intent(this,HomeActivity::class.java).also {
                startActivity(it)
            }
        }
        prof.setOnClickListener {
            Intent(this,AchatActivity::class.java).also {
                startActivity(it)
            }
        }
        home_card.setOnClickListener {
            Intent(this,MainActivity::class.java).also {
                startActivity(it)
            }
        }


    }

    private fun setDarkModeSwitch() {
        @SuppressLint("UseSwitchCompatOrMaterialCode") val darkModeSwitch =
            findViewById<Switch>(R.id.darkModeSwitch)
        darkModeSwitch.isChecked = DarkModePref(this).isNightMode
        darkModeSwitch.setOnCheckedChangeListener { buttonView: CompoundButton?, isChecked: Boolean ->
            val darkModePrefManager = DarkModePref(this@SettingsActivity)
            darkModePrefManager.setDarkMode(!darkModePrefManager.isNightMode)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            recreate()
        }
    }
}
package com.bstonetech.achatapp.internet


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bstonetech.achatapp.R
import android.widget.Toast

class InternetDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet_dialog)

        // CALL getInternetStatus() function to check for internet and display error dialog
        if (InternetDialog(this).internetStatus) {
            Toast.makeText(this, "INTERNET VALIDATION PASSED", Toast.LENGTH_SHORT).show()
        }
    }
}
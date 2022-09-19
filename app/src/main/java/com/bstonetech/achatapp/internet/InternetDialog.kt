package com.bstonetech.achatapp.internet

import android.app.Dialog
import android.content.Context
import com.bstonetech.achatapp.R
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.view.View

/**
 * Created by kapil on 03/11/18.
 */
class InternetDialog {
    private var context: Context? = null

    constructor() {}
    constructor(context: Context?) {
        this.context = context
    }

    fun showNoInternetDialog() {
        val dialog1 = Dialog(context!!, R.style.df_dialog)
        dialog1.setContentView(R.layout.dialog_no_internet)
        dialog1.setCancelable(true)
        dialog1.setCanceledOnTouchOutside(true)
        dialog1.findViewById<View>(R.id.btnSpinAndWinRedeem)
            .setOnClickListener { dialog1.dismiss() }
        dialog1.show()
    }

    //show no internet dialog
    val internetStatus: Boolean
        get() {
            val cm = context!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val activeNetwork = cm.activeNetworkInfo
            val isConnected = activeNetwork != null &&
                    activeNetwork.isConnectedOrConnecting
            if (!isConnected) {
                //show no internet dialog
                showNoInternetDialog()
            }
            return isConnected
        }
}
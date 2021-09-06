package com.example.sampleinsuranceapp.app.core

import android.app.AlertDialog
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import com.example.sampleinsuranceapp.R

lateinit var loading: AlertDialog
lateinit var error: AlertDialog
lateinit var logout: AlertDialog
lateinit var fawry: AlertDialog

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
fun Fragment.showLoadingDialog(
) {
    loading = AlertDialog.Builder(this.requireContext())
        .setView(R.layout.loading_dialog)
        .setCancelable(false)
        .show()

}

fun hideLoadingDialog() {
    loading.let { loading.dismiss() }
}





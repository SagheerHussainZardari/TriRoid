package com.sagheer.triroid

import android.app.AlertDialog
import android.content.Context

fun Context.showAlertDialog(message: String, title: String) {

    var alertDialog = AlertDialog.Builder(this)
    alertDialog.setTitle(title)
    alertDialog.setMessage(message)
    alertDialog.show()

}
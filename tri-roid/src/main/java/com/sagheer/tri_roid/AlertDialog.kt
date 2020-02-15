package com.sagheer.tri_roid

import android.app.AlertDialog
import android.content.Context

fun Context.showAlertDialog(title: String, message: String) {

    var alertDialog = AlertDialog.Builder(this)
    alertDialog.setTitle(title)
    alertDialog.setMessage(message)
    alertDialog.show()

}
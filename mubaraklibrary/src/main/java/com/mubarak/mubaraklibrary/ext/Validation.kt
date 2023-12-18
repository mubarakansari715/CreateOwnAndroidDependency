package com.mubarak.mubaraklibrary.ext

import android.content.Context
import android.text.TextUtils
import android.util.Patterns


/**
 * Created by :: Mubarak Ansari
 * method is used for checking valid email id format.
 *
 * @param email email address as String
 * @return boolean true for valid false for invalid
 * Example : mubarakansari@gmail.com
 */
fun Context.isEmailValid(email: String): Boolean {
    return !TextUtils.isEmpty(email.trim()) && Patterns.EMAIL_ADDRESS.matcher(email.trim())
        .matches()
}
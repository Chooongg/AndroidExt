package com.chooongg.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

class BasicActivity : AppCompatActivity() {

    inline val context: Context get() = this
}
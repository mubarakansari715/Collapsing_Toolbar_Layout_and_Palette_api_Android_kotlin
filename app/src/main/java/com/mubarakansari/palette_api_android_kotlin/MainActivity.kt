package com.mubarakansari.palette_api_android_kotlin

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set appbar Name
        setSupportActionBar(toolbarLayout)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //set palette api
        val bitmap = BitmapFactory.decodeResource(this.resources, R.drawable.w1)
        Palette.from(bitmap).generate {
            if (it != null){
                collapsingtoolbar.setContentScrimColor(it.getMutedColor(R.attr.colorPrimary))
            }
        }
    }
}
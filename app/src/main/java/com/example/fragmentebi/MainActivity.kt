package com.example.fragmentebi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var gadasvla:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gadasvla=findViewById(R.id.gadasvla)
        gadasvla.setOnClickListener {
            fragmentisshecvla(dasamatebeli_fragmenti())
        }

    }

    private fun fragmentisshecvla(dasamatebeliFragmenti: dasamatebeli_fragmenti) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.charcho,dasamatebeliFragmenti)
        fragmentTransaction.commit()


    }
}
package com.example.myapplicationwqasd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ShopActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var returnButton : Button
    lateinit var clicklevel_upgrade : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //used to return to main menu
        returnButton = findViewById(R.id.returnButton)
        returnButton.setOnClickListener(this)

        //click level upgrade
        clicklevel_upgrade = findViewById(R.id.clicklevel_upgrade)
        clicklevel_upgrade.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.returnButton -> {
                val ToMainMenuIntent = Intent(this, MainActivity::class.java)
                startActivity(ToMainMenuIntent)
            }
            R.id.clicklevel_upgrade -> {
                var price = clicklevel_upgrade.text.toString().toDoubleOrNull() ?: 0.0
                var newPrice = 2.5 * price
                clicklevel_upgrade.text = "$newPrice"
            }
        }

    }
}

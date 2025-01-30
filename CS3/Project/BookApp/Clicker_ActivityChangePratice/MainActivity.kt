package com.example.myapplicationwqasd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var ButtonTap : Button
    lateinit var shopButton : Button
    lateinit var money_Box : TextView

    //variables for upgrades & attributes
    var clicklevel = 1;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //finds the id of the elements
        ButtonTap = findViewById(R.id.ButtonTap)
        shopButton = findViewById(R.id.shopButton)
        money_Box = findViewById(R.id.money_Box)


        //adds onclicklistener, calls method OnClock when ran
        ButtonTap.setOnClickListener(this)
        shopButton.setOnClickListener(this)

        //switchings between activities (shop)
        val ToShopIntent = Intent(this, ShopActivity::class.java)

    }
    //Click Listener,runs when button is clicked
    override fun onClick(v: View?) {

        when(v?.id) {
            R.id.ButtonTap -> {
                val money = money_Box.text.toString().toDoubleOrNull() ?: 0.0 //money, get from text box
                var result =money

                result += clicklevel
                money_Box.text = "$result"
            }
            R.id.shopButton -> {
                val ToShopIntent = Intent(this, ShopActivity::class.java)
                startActivity(ToShopIntent)
            }
        }


    }


}

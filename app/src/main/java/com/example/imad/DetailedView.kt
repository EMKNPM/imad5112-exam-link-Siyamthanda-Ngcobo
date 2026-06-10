package com.example.imad

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

annotation class builderGearList(val value: Any)

class DetailedView : AppCompatActivity() {

    private lateinit var btnBack : Button
    private lateinit var btnList : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnList = findViewById(R.id.btnList)
        btnBack = findViewById(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()

            builderGearList(listContainer)

        }

        private fun buildGearList(container: LinearLayout) {
            container.removeAllViews()

            if (AddGear.GearData.entryCount() = 0 ){
                val empty = TextView(this).apply {
                    text = "No gear packed yet "

                }
                container.addView(empty)
                return

            }
            for( i in 0 until AddGear.GearData.entryCount()){
                val cardView = layoutInflater.inflate(R.layout.item_gear_card,container,false)
                cardView.name.text = AddGear.GearData.categories
                cardView.
            }
        }

        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
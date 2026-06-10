package com.example.imad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddGear : AppCompatActivity() {

    //Declaration

    private lateinit var btnAddGear : Button
    private lateinit var tvTitle : TextView
    private lateinit var tvTotalItemsPacked : TextView
    private lateinit var edtComments : EditText
    private lateinit var edtQuantity : EditText
    private lateinit var edtCategory : EditText
    private lateinit var edtItem: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_gear)

        //Typecasting

        btnAddGear = findViewById(R.id.btnAddGear)
        tvTitle = findViewById(R.id.tvTitle)
        tvTotalItemsPacked = findViewById(R.id.tvTotalItemsPacked)
        edtCategory = findViewById(R.id.edtCategory)
        edtComments = findViewById(R.id.edtComments)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtItem = findViewById(R.id.edtItem)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
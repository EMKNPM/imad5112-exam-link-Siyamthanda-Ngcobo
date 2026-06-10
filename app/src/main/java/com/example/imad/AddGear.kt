package com.example.imad

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat




private fun totalItems() {
    TODO("Not yet implemented")
}




class AddGear : AppCompatActivity() {

    //Declaration

    private lateinit var btnAddGear: Button
    private lateinit var btnViewGear: Button
    private lateinit var tvTitle: TextView
    private lateinit var edtComments: EditText
    private lateinit var edtQuantity: EditText
    private lateinit var edtCategory: EditText
    private lateinit var edtItem: EditText
    private lateinit var tvTotalItemsPacked: TextView
    private lateinit var spinnerItem: Spinner



   // Previously, we could have created the array like this:
   // private val weatherArray = arrayOf(...)
    //However, that would make the array belong only to this HomeActivity object.
    //The DetailedScreenActivity would not be able to access it directly.

    //A companion object allows the array to belong to the HomeActivity class itself.
   // This means another activity can access it using:

    //HomeActivity.Array

   // We use this because the user enters the ITEM data on the Home screen,
    //but the Detailed screen also needs to read and display that same data.

  //  In short:
   // - Normal private array: only HomeActivity can use it.
   // - Companion object array: HomeActivity and DetailedScreenActivity can use it.

  //  This is useful here because we are not using a database yet.
  // The companion object keeps the data available while the app is runnin

    //parallel arrays
    object GearData {
        val categories = mutableListOf("Shelter","Food","Safety")
        val categoryOptions = arrayOf("Shelter","Food","Cooking","First Aid ","Safety","Other")

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_gear)

        val intent = Intent(this, DetailedView::class.java)
        startActivity(intent)

        tvTotalItemsPacked.text.toString()

        //Typecasting

        btnAddGear = findViewById(R.id.btnAddGear)
        btnViewGear = findViewById(R.id.btnViewGear)
        tvTitle = findViewById(R.id.tvTitle)
        edtCategory = findViewById(R.id.edtCategory)
        edtComments = findViewById(R.id.edtComments)
        edtQuantity = findViewById(R.id.edtQuantity)
        edtItem = findViewById(R.id.edtItem)
        tvTotalItemsPacked = findViewById(R.id.tvTotalItemsPacked)


        btnAddGear.setOnClickListener { showAddGearDialog() }

        btnViewGear.setOnClickListener {

            startActivity(Intent(this, DetailedView::class.java))
        }
        refreshTotal()
    }
    //Refresh totals every time the user returns from Detailed View

    //Use a loop in the GearInformation.tOtal items packed
    @SuppressLint("SetTextI18n")
    private fun refreshTotal() {


        val total = totalItems()
        val entries = tvTotalItemsPacked.everyCount
        tvTotalItemsPacked.text = "Total items packed: $total\n($entries gear entries)"
    }

    //Use an array
    private fun showAddGearDialog() {

        val dialogView = layoutInflater.inflate (R.layout.dialong_add_gear_null)

        //Array
        val adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, GearData.categoryOptions
        ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        spinnerItem.adapter = adapter

        AlertDialog.Builder(this, R.layout.style.DialogTheme)
            .setTitle("Add Gear")
            .setView(dialogView)
            .setPostiveButton("Pack it!") { _, _ ->

                edtItem.text.toString().trim()
                spinnerItem.selectedItem.toString()
                edtQuantity.text.toString().trim()
                edtComments.text.toString().trim()
            }


        //IF statements
        if (Item.isEmpty()) {
            Toast.makeText(this, "Please make sure all Item name is not empty.", Toast.LENGTH_SHORT)
                .show()
            return
        }
        val quantity = quantityStr.toIntOrNull() ?: 1

        GearData.addItem(name, cat, quantity, comment)
        refreshTotal()
        Toast.makeText(this, "\"$name\" added to the pack!", Toast.LENGTH_SHORT).show()

    }
    .setNegativeButton("Cancel",null)
    .show()









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

}
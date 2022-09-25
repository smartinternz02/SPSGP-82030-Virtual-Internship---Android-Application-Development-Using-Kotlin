package com.example.groceryapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocerry_items")

data class GroceryItems (

    @ColumnInfo(name = "itemName")
    var itemname: String,

    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: Int,

    @ColumnInfo(name = "itemPrice")
    var itemprice: Int,

    ){

        @PrimaryKey(autoGenerate = true)
        var id: Int?= null
}
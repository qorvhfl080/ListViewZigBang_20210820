package com.neppplus.listviewzigbang_20210820.data

import java.io.Serializable
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

class Room(val price: Int, val address: String, val floor: Int, val description: String) : Serializable {

    fun measurePrice(roomPrice: Int): String {

        if (roomPrice >= 10000) {
            val uk = roomPrice / 10000
            val rest = roomPrice % 10000
            val dec = DecimalFormat("#,###")

//            val result = "${uk}${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"
            return "${uk}억 ${dec.format(rest)}"

        } else {
            val result = NumberFormat.getNumberInstance(Locale.KOREA).format(roomPrice)

            return result
//            val dec = DecimalFormat("#,###")
//
//            return dec.format(roomPrice)
        }

    }

    fun measureFloor(): String {

        if (this.floor == 0) {
            return "반지하"
        } else if (this.floor < 0) {
            return "지하${-this.floor}층"
        } else {
            return "${this.floor}층"
        }

    }

}
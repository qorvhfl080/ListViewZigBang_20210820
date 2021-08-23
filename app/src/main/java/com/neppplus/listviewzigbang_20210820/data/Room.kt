package com.neppplus.listviewzigbang_20210820.data

import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

class Room(val price: Int, val address: String, val floor: Int, val description: String) {

    fun measurePrice(roomPrice: Int): String {



        // 01234 length=5
        // 28500 -> 2억8,500
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

    fun measureFloor(roomFloor: Int): String {

        if (roomFloor == 0) {
            return "반지하"
        } else if (roomFloor < 0) {
            return "지하${roomFloor * (-1)}층"
        } else {
            return "${roomFloor}층"
        }

    }

}
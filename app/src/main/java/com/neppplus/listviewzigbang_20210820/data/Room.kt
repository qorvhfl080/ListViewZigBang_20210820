package com.neppplus.listviewzigbang_20210820.data

class Room(val price: Int, val address: String, val floor: Int, val description: String) {

    fun measurePrice(roomPrice: Int): String {

//        if (roomPrice >= 10000) {
//            return "${roomPrice.}"
//        }

        return ""
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
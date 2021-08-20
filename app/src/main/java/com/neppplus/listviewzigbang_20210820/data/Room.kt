package com.neppplus.listviewzigbang_20210820.data

class Room(val price: Int, val address: String, val floor: Int, val description: String) {

    fun measurePrice(roomPrice: Int): String {

        // 01234 length=5
        // 28500 -> 2억8,500
        if (roomPrice >= 10000) {
            var resultString: String = roomPrice.toString()
            //resultString = resultString.slice() + "억" + resultString.slice(resultString.length.toInt() - 3, resultString.length)

            return resultString
        } else {

            return ""
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
package com.neppplus.listviewzigbang_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewzigbang_20210820.data.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("room") as Room

        priceTxt.text = "${room.measurePrice(room.price)}"
        descriptionTxt.text = room.description
        addressTxt.text = room.address
        floorTxt.text = room.measureFloor()

    }


}
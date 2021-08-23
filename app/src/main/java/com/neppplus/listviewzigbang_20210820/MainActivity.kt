package com.neppplus.listviewzigbang_20210820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewzigbang_20210820.adapter.RoomAdapter
import com.neppplus.listviewzigbang_20210820.data.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<Room>()

    lateinit var roomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Room(8000, "마포구 서교동", 1, "망원/홍대역 풀옵션"))
        roomList.add(Room(28500, "마포구 서교동", -3, "신혼부부의 보금자리"))
        roomList.add(Room(13000, "마포구 서교동", 5, "홍대입구역 인근 원룸"))
        roomList.add(Room(12000, "마포구 성산동", 0, "강추"))
        roomList.add(Room(11000, "마포구 망원1동", 3, "풀옵션 원룸"))
        roomList.add(Room(15000, "마포구 망원동", -2, "초역세권"))
        roomList.add(Room(16000, "동대문구 제기동", -1, "제기동역 근처"))
        roomList.add(Room(17500, "동대문구 제기동", 0, "제기동역 근처"))
        roomList.add(Room(21000, "동대문구 제기동", 10, "제기동역 근처"))
        roomList.add(Room(19000, "동대문구 신설동", 2, "역근처"))
        roomList.add(Room(9000, "동대문구 신설동", -1, "역세권"))
        roomList.add(Room(7500, "동대문구 신설동", 0, "풀옵션 반지하"))

        roomAdapter = RoomAdapter(this, R.layout.room_list_item, roomList)

        roomListView.adapter = roomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = roomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)

            myIntent.putExtra("room", clickedRoom)

            startActivity(myIntent)

        }

    }
}
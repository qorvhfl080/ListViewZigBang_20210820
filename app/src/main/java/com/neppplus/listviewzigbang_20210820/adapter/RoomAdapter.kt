package com.neppplus.listviewzigbang_20210820.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.neppplus.listviewzigbang_20210820.R
import com.neppplus.listviewzigbang_20210820.data.Room

class RoomAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        priceTxt.text = "${data.measurePrice(data.price)}"
        addressTxt.text = "${data.address}, ${data.measureFloor(data.floor)}"
        descriptionTxt.text = data.description

        return row
    }

}
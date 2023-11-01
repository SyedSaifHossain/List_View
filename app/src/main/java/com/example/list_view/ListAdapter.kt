package com.example.list_view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView


class ListAdapter(context: Context, arrayList: ArrayList<ListModel>): ArrayAdapter<ListModel>(context,0,arrayList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var list = convertView

        if(list == null){
            list = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        var listItem : ListModel? = getItem(position)
        var title = list!!.findViewById<TextView>(R.id.title)
        var desTitle = list!!.findViewById<TextView>(R.id.desTitle)
        var des = list!!.findViewById<TextView>(R.id.des)
        title.setText(listItem!!.title)
        desTitle.setText(listItem!!.desTitle)
        des.setText(listItem!!.des)
        return list
    }
}
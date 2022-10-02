package com.tech4dev.myfriendslist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tech4dev.myfriendslist.R
import com.tech4dev.myfriendslist.SampleFriendsList


class FriendsAdapter(var context: Context) : RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder>() {

    var sampleFriends = SampleFriendsList()
     var listOfFriends  = sampleFriends.LIST_OF_FRIENDS
//     var listOfFriends  = listOf("hi","emilly","joan","vivian")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsViewHolder {
        val itemView: View = LayoutInflater.from(context).inflate(R.layout.list_friend_item, parent, false)

        return FriendsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FriendsViewHolder, position: Int) {

        holder.name.text = listOfFriends[position].name
    }

    override fun getItemCount(): Int {
        return listOfFriends.size
    }
    class FriendsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.name)

    }
}
package com.tech4dev.myfriendslist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tech4dev.myfriendslist.adapter.FriendsAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var friendsRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        friendsRv = findViewById(R.id.rvFriends)
        friendsRv.hasFixedSize()
        friendsRv.layoutManager = LinearLayoutManager(this)
        friendsRv.adapter = FriendsAdapter(this)


    }
}
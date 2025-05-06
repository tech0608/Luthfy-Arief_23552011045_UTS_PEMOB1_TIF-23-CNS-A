package com.example.uts_pemob_1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class ListChatActivity : AppCompatActivity() {
    private lateinit var lvChat: ListView
    private val messages = listOf(
        "Halo komunitas otomotif!",
        "Kapan kita kopdar?",
        "Saya baru upgrade knalpot motor saya!",
        "Event drag race minggu depan lho!"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_chat)

        lvChat = findViewById(R.id.lvChat)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, messages)
        lvChat.adapter = adapter
    }
}

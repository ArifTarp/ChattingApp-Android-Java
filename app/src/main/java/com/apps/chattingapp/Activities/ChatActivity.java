package com.apps.chattingapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.apps.chattingapp.Adapters.MessagesAdapter;
import com.apps.chattingapp.Models.Message;
import com.apps.chattingapp.databinding.ActivityChatBinding;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    ActivityChatBinding binding;
    MessagesAdapter adapter;
    ArrayList<Message> messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        messages = new ArrayList<>();
        adapter = new MessagesAdapter(this,messages);

        String name = getIntent().getStringExtra("name");
        String uid = getIntent().getStringExtra("uid");

        getSupportActionBar().setTitle(name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
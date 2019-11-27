package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);


        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Fire", "98764313244", R.drawable.fire));
        contactsList.add(new Contacts("water", "98764313244", R.drawable.water));
        contactsList.add(new Contacts("flower", "98764313244", R.drawable.flower));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this,contactsList);

        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
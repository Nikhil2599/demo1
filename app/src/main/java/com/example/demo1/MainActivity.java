package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<User> UserList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        setUserinfo();
        setAdapter();
    }

    private void setAdapter() {
        RecyclerAdapter adapter=new RecyclerAdapter((UserList));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setUserinfo() {
        UserList.add(new User("john"));
        UserList.add(new User("jowded"));
        UserList.add(new User("jddfff"));
        UserList.add(new User("johrrtqrgn"));
        UserList.add(new User("nuikkhsgdn"));
        UserList.add(new User("jdhdfdhuohn"));
    }

}
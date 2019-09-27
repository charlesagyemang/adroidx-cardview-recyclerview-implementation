package com.android.cardviewlearn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.android.cardviewlearn.adapters.UserAdapter;
import com.android.cardviewlearn.models.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;
    private UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user =  new User (
                "Available Beds",
                "1000",
                getResources().getDrawable(R.drawable.pat),
                getResources().getDrawable(R.drawable.bg3)
        );

        User user2 =  new User (
                "Koobi Adorable",
                "77",
                getResources().getDrawable(R.drawable.cloud),
                getResources().getDrawable(R.drawable.bg2)
        );

        userList.add(user2);
        userList.add(user);
        userList.add(user2);
        userList.add(user);



        recyclerView = findViewById(R.id.recView);

        mAdapter =  new UserAdapter(userList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager (getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        mAdapter.notifyDataSetChanged();



    }
}

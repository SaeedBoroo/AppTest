package com.example.saeed.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.saeed.apptest.Adapter.MyRecyclearAdapter;
import com.example.saeed.apptest.fakdeGenerator.ProductFakeGenrator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        MyRecyclearAdapter adapter=new MyRecyclearAdapter(getApplicationContext(), ProductFakeGenrator.getList());

        recyclerView.setAdapter(adapter);
           recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));



    }


}

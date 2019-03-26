package com.example.hp.stayby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    ListAdapter adapter ;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.viewme);


       addit();


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ListAdapter(arrayList, MainActivity.this);
        recyclerView.setAdapter(adapter);


    }

    public void addit (){
        Model m1 = new Model("Adi Vansh Roy Hostel","Kaka Deo, Kanpur", 4000, 1, R.drawable.h1) ;
        Model m2 = new Model("Balaji Girls Hostel","Tulsi Nagar,Kanpur", 4500, 1, R.drawable.h2) ;
        Model m3 = new Model("Panday Hostel","Kaka Deo, Kanpur", 6000,1, R.drawable.h3) ;

        Model m4 = new Model("RS Building","Pandu Nagar, Kanpur", 4000, 2, R.drawable.f1) ;
        Model m5 = new Model("Sai Girls Building ","Kaka Deo, Kanpur", 5500, 2, R.drawable.f2) ;
        Model m6 = new Model("Shashank Flats","Pandu Nagar, Kanpur", 6000,2, R.drawable.f3) ;


        Model m7 = new Model("Shree Krishna pg","Kaka Deo, Kanpur", 3500, 3, R.drawable.p1) ;
        Model m8 = new Model("Shyam Girls pg"," Pandu Nagar, Kanpur", 4000, 3, R.drawable.p2) ;
        Model m9 = new Model("RAJ Property","Kaka Deo, Kanpur", 3500,3, R.drawable.p3) ;


        arrayList.add(m1);
        arrayList.add(m4);
        arrayList.add(m7);
        arrayList.add(m5);
        arrayList.add(m2);
        arrayList.add(m3);
        arrayList.add(m8);
        arrayList.add(m6);
        arrayList.add(m9);



    }

}

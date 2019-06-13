package com.fulgence.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;

public class ListActivity extends AppCompatActivity {
ArrayList<String> students;
ArrayAdapter adapter;
ListView listView;
Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.lv);
        realm = Realm.getDefaultInstance();
        RealmHelper helper = new RealmHelper(realm);
        students = helper.retrieve();
        adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,students);
        listView.setAdapter(adapter);
    }
}

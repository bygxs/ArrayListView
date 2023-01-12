package com.biniyam.arraylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Persons> personsArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setTitle(" my simple ArrayListView");
        listView = (ListView) findViewById(R.id.listView);


        personsArrayList.add(new Persons("Ab",32,"ab st."));
        personsArrayList.add(new Persons("Bc",21,"bb st."));
        personsArrayList.add(new Persons("Cc",45,"cc st."));
        personsArrayList.add(new Persons("Dk",85,"dk st."));

        ArrayAdapter<Persons> arrayAdapter =
                new ArrayAdapter<> //Persons?
                        (this, android.R.layout.simple_list_item_1,personsArrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "you touched..."+
                                personsArrayList.get(position),Toast.LENGTH_SHORT).show();

            }
        });



    }
}
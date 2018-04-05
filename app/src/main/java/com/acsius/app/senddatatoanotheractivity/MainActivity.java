package com.acsius.app.senddatatoanotheractivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String data[]= new String[]{"Lucky Roy","Hemant Kummar","Sohan Kumar","Vikash Panday","Golu Kumar","Shahrukh Khan","Amit Roy","Sunny Deol"};
        ListView listView = (ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,android.R.id.text1,data);
 listView.setAdapter(adapter);
 listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
         String textdata =data[position].toString();
         Intent intent =new Intent(MainActivity.this,Second.class);
         intent.putExtra("Senddata",textdata);
         startActivity(intent);
     }
 });
    }
}

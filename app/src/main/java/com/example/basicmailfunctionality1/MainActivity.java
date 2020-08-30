package com.example.basicmailfunctionality1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ArrayAdapter arrayAdapter;
    ArrayList<String> mails;
    ListView mailsListView;
    float x,y,diffx,diffy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mails = new ArrayList<>();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,mails);
        mailsListView = (ListView) findViewById(R.id.mailsListView);

        mails.add("Hello");
        mails.add("Thank You");
        mails.add("Welcome");
        mails.add("Good Bye");

        mailsListView.setAdapter(arrayAdapter);

        mailsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ((TextView) view).getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        mailsListView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                x = event.getX();
                y = event.getY();
                diffx = x - event.getHistoricalX(1);
                diffy = y - event.getHistoricalY(1);
                return false;
            }
        });
    }
}

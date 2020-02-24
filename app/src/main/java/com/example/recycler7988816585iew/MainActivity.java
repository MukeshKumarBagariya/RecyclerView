package com.example.recycler7988816585iew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private EditText add,remove;
    private Button addB,removeB;
    private ArrayList<Items> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.insertElement);
        addB = findViewById(R.id.insertButton);
        remove = findViewById(R.id.removeElement);
        removeB = findViewById(R.id.removeButton);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        items = new ArrayList<>();
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));
        items.add(new Items(R.drawable.android,"Android","version:9.0.1"));
        items.add(new Items(R.drawable.music,"Eminem","Still don't give a fuck"));
        items.add(new Items(R.drawable.wifi,"Bangon","You don't get one"));

        adapter = new RecyclerAdapter(items,this);
        recyclerView.setAdapter(adapter);


        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ad = Integer.parseInt(add.getText().toString());
                if (ad <= items.size() && ad > 0) {
                    addItems(ad);
                } else {
                    Toast.makeText(MainActivity.this,"Please enter a valid position",Toast.LENGTH_LONG).show();
                }
            }
        });

        removeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rm = Integer.parseInt(remove.getText().toString());
                if (rm <= items.size() && rm > 0) {
                    removeItem(rm);
                } else {
                    Toast.makeText(MainActivity.this,"Please enter a valid position",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void addItems(int position){
        items.add(position, new Items(R.drawable.android, "Android At Position " + position, "Same as Fuck"));
        adapter.notifyItemInserted(position);
    }
    public void removeItem(int position) {
        items.remove(position);
        adapter.notifyItemRemoved(position);
    }
}

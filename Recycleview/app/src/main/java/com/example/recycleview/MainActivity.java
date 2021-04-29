package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

import android.os.Bundle;

import com.example.recycleview.Mahasiswa;
import com.example.recycleview.MahasiwaAdapter;
import com.example.recycleview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView viewRec;
    private MahasiwaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        viewRec = (RecyclerView) findViewById(R.id.recycle_view);
        adapter = new MahasiwaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        viewRec.setLayoutManager(layoutManager);
        viewRec.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Kim Namjoon","12091994","085231481241"));
        mahasiswaArrayList.add(new Mahasiswa("Kim Seok Jin","04121992","08289745121"));
        mahasiswaArrayList.add(new Mahasiswa("Min Yoongi","09031993","08123457121"));
        mahasiswaArrayList.add(new Mahasiswa("Jung Hoseok","18021994","085232281241"));
        mahasiswaArrayList.add(new Mahasiswa("Park Jimin","13101995","085331484241"));
        mahasiswaArrayList.add(new Mahasiswa("Kim Taehyung","30121995","085331001241"));
        mahasiswaArrayList.add(new Mahasiswa("Jeon Jungkook","01091997","082911984811"));
    }
}
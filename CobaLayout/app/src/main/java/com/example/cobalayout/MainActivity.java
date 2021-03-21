package com.example.cobalayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Pada, Subject, Pesan;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.relative_layout);
        //setContentView(R.layout.constraint_layout);
        //setContentView(R.layout.frame_layout);
        //setContentView(R.layout.tabel_layout);
        //setContentView(R.layout.material_design);
        //setContentView(R.layout.scroll_view);
       //setContentView(R.layout.scroll_view_2);

        Pada = findViewById(R.id.pada);
        Subject = findViewById(R.id.subject);
        Pesan = findViewById(R.id.pesan);
        Submit = findViewById(R.id.submit);


    }
}
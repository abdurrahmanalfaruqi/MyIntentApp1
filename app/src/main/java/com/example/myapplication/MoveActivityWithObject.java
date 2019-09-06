package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithObject extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_object);
        textView = findViewById(R.id.textView);

        Mybiodata mybiodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya" + mybiodata.getName() + "Umur saya"+mybiodata.getUmur());

    }
}

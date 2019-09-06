package com.example.myapplication;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener( this);


        Button btnMoveWithDataAvtivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataAvtivity.setOnClickListener(this);


        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnMoveActivityWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataAvtivity.setOnClickListener(this);

        Button btnMoveActivityWithObject =findViewById(R.id.btn_move_activity_objek);
        btnMoveActivityWithObject.setOnClickListener(this);









    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent (MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;

            case  R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this,MoveWithDataActivity.class) ;
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"DicodingAcedemy Boy") ;
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,5) ;
                startActivity(moveWithDataIntent);
                break;

            case  R.id.btn_dial_number:
                String phoneNumber = "081210841382";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);

                break;

            case R.id.btn_move_activity_objek:
                Intent keMoveActivityWithObject = new Intent(MainActivity.this,MoveActivityWithObject.class);
                Mybiodata biodataFaruq =new Mybiodata("Faruq",15);
                keMoveActivityWithObject.putExtra("biodata",biodataFaruq);
                startActivity(keMoveActivityWithObject);

                break;












        }


    }
}

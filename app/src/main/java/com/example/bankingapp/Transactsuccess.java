package com.example.bankingapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Transactsuccess extends AppCompatActivity {
     Button btn;
     database db=new database(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transactsuccess);
        btn=(Button)findViewById(R.id.btntransact);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Transactsuccess.this,listhistory.class);
                startActivity(intent);
            }
        });


    }


}




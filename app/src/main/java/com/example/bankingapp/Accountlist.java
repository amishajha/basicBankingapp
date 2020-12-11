package com.example.bankingapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Accountlist extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Recyclerviewholder recyclerviewholder;
    private ArrayList<Accounts> accountsArrayList;
    private ArrayAdapter<String> arrayAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

      database db=new database(Accountlist.this);

        //Recyclerview initialization
        recyclerView=findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        accountsArrayList=new ArrayList<>();


        //Get all accounts
        List<Accounts> accountsList=db.getAllAccounts();
        for(Accounts account:accountsList)
        {
            Log.d("sid","Account: "+account.getId1()+"\n"+
                    "Name: "+account.getName() +"\n"+
                    "Email: "+account.getEmail()+"\n"+
                    "PhoneNO: "+account.getPhone()+"\n"+
                    "Balance: "+account.getBalance());

            accountsArrayList.add(account);
        }

        //Use Recyclerview
        Recyclerviewholder recyclerview = new Recyclerviewholder(Accountlist.this,accountsArrayList);
        recyclerView.setAdapter(recyclerview);

    }
}

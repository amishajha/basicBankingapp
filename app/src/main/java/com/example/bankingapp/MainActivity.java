package com.example.bankingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnpay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpay=(Button)findViewById(R.id.buttonpay);
        database db =new database(MainActivity.this);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(!prefs.getBoolean("firstTime", false)) {
            //Adding accounts
            Accounts Amisha = new Accounts();
            Amisha.setName("Amisha jha");
            Amisha.setEmail("Amisha.jha@gmail.com");
            Amisha.setPhone("9026365638");
            Amisha.setBalance(10000);
            db.addAccount(Amisha);


            Accounts kalyani = new Accounts();
            kalyani.setName("kalyani muske");
            kalyani.setEmail("kalyanimuske@gmail.com");
            kalyani.setPhone("9900227744");
            kalyani.setBalance(3400);
            db.addAccount(kalyani);

            Accounts kirti = new Accounts();
            kirti.setName("kirti vatsa");
            kirti.setEmail("kirtivatsa@gmail.com");
            kirti.setPhone("7839374674");
            kirti.setBalance(340000);
            db.addAccount(kirti);

            Accounts shefali = new Accounts();
            shefali.setName("shefali Singh");
            shefali.setEmail("shefalisingh@gmail.com");
            shefali.setPhone("8983746473");
            shefali.setBalance(33030);
            db.addAccount(shefali);

            Accounts Rahul = new Accounts();
            Rahul.setName("Rahul kumar");
            Rahul.setEmail("Rahulkumar@gmail.com");
            Rahul.setPhone("6473839364");
            Rahul.setBalance(100000);
            db.addAccount(Rahul);

            Accounts Bharvi = new Accounts();
            Bharvi.setName("Bharvi chavda");
            Bharvi.setEmail("Bharvichavda@gmail.com");
            Bharvi.setPhone("7899328566");
            Bharvi.setBalance(3000);
            db.addAccount(Bharvi);

            Accounts Kiran = new Accounts();
            Kiran.setName("Kiran kumar");
            Kiran.setEmail("kirankumar@gmail.com");
            Kiran.setPhone("8899994566");
            Kiran.setBalance(190000);
            db.addAccount(Kiran);

            Accounts Shruti = new Accounts();
            Shruti.setName("Shruti tiwari");
            Shruti.setEmail("Shrutitiwari@gmail.com");
            Shruti.setPhone("78899922566");
            Shruti.setBalance(120000);
            db.addAccount(Shruti);


            Accounts harsh = new Accounts();
            harsh.setName("harsh kumar");
            harsh.setEmail("harshkumar@gmail.com");
            harsh.setPhone("7878956622");
            harsh.setBalance(88000);
            db.addAccount(harsh);

            Accounts mihir = new Accounts();
            mihir.setName("Mihir deshmukh");
            mihir.setEmail("mihirdeshmukh@gmail.com");
            mihir.setPhone("999999566");
            mihir.setBalance(160000);
            db.addAccount(mihir);



            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime", true);
            editor.commit();



        }
        btnpay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Accountlist.class);
                startActivity(intent);
            }
        });






    }
}
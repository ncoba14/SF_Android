package com.example.admin.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class iniActivity extends AppCompatActivity {

    EditText nama,pass;
    Button masuk,coba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ini);


        nama = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        masuk = (Button) findViewById(R.id.button);
        coba = (Button) findViewById(R.id.button4);



        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //EditText editText1 = EditText.getText().toString();
               if(nama.getText().toString().equals("")){

                   Toast.makeText(iniActivity.this, "namamu siapa?", Toast.LENGTH_LONG).show();

               } else if(pass.getText().toString().equals("")) {

                   Toast.makeText(iniActivity.this, "paswordnya apa?", Toast.LENGTH_LONG).show();

               }else{

                   Intent intent = new Intent(getApplicationContext(), satuActivity.class);
                   startActivity(intent);

               }
            }
        });

        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

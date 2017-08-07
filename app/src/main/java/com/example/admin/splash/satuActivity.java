package com.example.admin.splash;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class satuActivity extends AppCompatActivity {
    Button keluar,kabur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satu);



        kabur     = (Button)findViewById(R.id.button3);
        keluar  = (Button)findViewById(R.id.button2);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(satuActivity.this);
                //pesan keluar
                builder.setMessage("Keluar dari Aplikasi ?")
                        .setCancelable(false)
                        //Button Keluar
                        .setPositiveButton("Keluar", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                moveTaskToBack(true);
                                System.exit(0);
                            }
                        })
                        //Button Batal
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();

            }
        });

        kabur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              alertDialog("satu");
            }
        });


    }

    public void alertDialog(String ttl)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(satuActivity.this).create();
        alertDialog.setTitle(ttl);
        alertDialog.setMessage("oke");
        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }


}

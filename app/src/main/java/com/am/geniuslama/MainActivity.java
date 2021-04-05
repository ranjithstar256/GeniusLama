package com.am.geniuslama;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;  // Declaration above oncreate
    EditText e;
    String s;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=findViewById(R.id.button6);  // intialisation inside oncreate

        e=findViewById(R.id.editTextTextPersonName4);  // intialisation inside oncreate
        t=findViewById(R.id.textView6);  // intialisation inside oncreate

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s= e.getText().toString();
                Toast.makeText(MainActivity.this,
                        "Great learning on Great Day "
                                +s
                        , Toast.LENGTH_LONG).show();
                t.setText(s);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.xyz,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void abt(MenuItem item) {

        Intent obj = new Intent(MainActivity.this,
                MainActivity2.class);
        startActivity(obj);

    }

    public void showart(MenuItem item) {// context ==> current class name .this
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Notice!").setMessage("Please cast your votes!!").setIcon(android.R.drawable.star_big_on)
                .setPositiveButton("dhriti", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "dh", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNeutralButton("cancell",null)
                .show();
    }

    public void cusdia(MenuItem item) {
        Dialog dialog = new Dialog(MainActivity.this);

        dialog.setContentView(R.layout.customdia);

        dialog.show();
    }
}
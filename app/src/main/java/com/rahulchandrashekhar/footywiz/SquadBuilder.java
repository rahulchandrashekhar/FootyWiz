package com.rahulchandrashekhar.footywiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SquadBuilder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad_builder);

        Button player_1 = (Button)findViewById(R.id.player_1);

        player_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_2 = (Button)findViewById(R.id.player_2);

        player_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_3 = (Button)findViewById(R.id.player_3);

        player_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_4 = (Button)findViewById(R.id.player_4);

        player_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_5 = (Button)findViewById(R.id.player_5);

        player_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_6 = (Button)findViewById(R.id.player_6);

        player_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_7 = (Button)findViewById(R.id.player_7);

        player_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_8 = (Button)findViewById(R.id.player_8);

        player_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_9 = (Button)findViewById(R.id.player_9);

        player_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_10 = (Button)findViewById(R.id.player_10);

        player_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button player_11 = (Button)findViewById(R.id.player_11);

        player_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Database to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });

        Button saveButton = (Button)findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Functionality to be added", Toast.LENGTH_LONG)
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_squad_builder, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

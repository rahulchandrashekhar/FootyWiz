package com.rahulchandrashekhar.footywiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        setupButtons();
    }

    private void setupButtons(){
        Button viewSquads = (Button)findViewById(R.id.view_teams_button);
        viewSquads.setOnClickListener(new View.OnClickListener(){

                                         @Override
                                     public void onClick(View v){
                                             Intent myIntent = new Intent(WelcomeScreen.this, ViewSquadsActivity.class);
                                             myIntent.putExtra("buildOrView","view");
                                             WelcomeScreen.this.startActivity(myIntent);
                                         }
                                      }
        );

        Button buildSquad = (Button)findViewById(R.id.build_squad_button);

        buildSquad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(WelcomeScreen.this, ViewSquadsActivity.class);
                myIntent.putExtra("buildOrView", "build");
                WelcomeScreen.this.startActivity(myIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome_screen, menu);
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

package com.rahulchandrashekhar.footywiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ViewSquadsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_squads);
        setupButtons();
    }

    private void setupButtons(){

        Button englandView = (Button)findViewById(R.id.england_view);

        englandView.setOnClickListener(new View.OnClickListener(){

                                          @Override
                                          public void onClick(View v){
                                              Intent intent = getIntent();
                                              String value = intent.getStringExtra("buildOrView");
                                              Intent myIntent = new Intent(ViewSquadsActivity.this, SquadListView.class);
                                              myIntent.putExtra("league","england");
                                              myIntent.putExtra("buildOrView", value);
                                              ViewSquadsActivity.this.startActivity(myIntent);
                                          }
                                      }
        );

        Button germanyView = (Button)findViewById(R.id.germany_view);

        germanyView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = getIntent();
                String value = intent.getStringExtra("buildOrView");
                Intent myIntent = new Intent(ViewSquadsActivity.this, SquadListView.class);
                myIntent.putExtra("league","germany");
                myIntent.putExtra("buildOrView", value);
                ViewSquadsActivity.this.startActivity(myIntent);
            }
        });

        Button franceView = (Button)findViewById(R.id.france_view);

        franceView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = getIntent();
                String value = intent.getStringExtra("buildOrView");
                Intent myIntent = new Intent(ViewSquadsActivity.this, SquadListView.class);
                myIntent.putExtra("league","france");
                myIntent.putExtra("buildOrView", value);
                ViewSquadsActivity.this.startActivity(myIntent);
            }
        });

        Button portugalView = (Button)findViewById(R.id.portugal_view);

        portugalView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = getIntent();
                String value = intent.getStringExtra("buildOrView");
                Intent myIntent = new Intent(ViewSquadsActivity.this, SquadListView.class);
                myIntent.putExtra("league","portugal");
                myIntent.putExtra("buildOrView", value);
                ViewSquadsActivity.this.startActivity(myIntent);
            }
        });

        Button spainView = (Button)findViewById(R.id.spain_view);

        spainView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = getIntent();
                String value = intent.getStringExtra("buildOrView");
                Intent myIntent = new Intent(ViewSquadsActivity.this, SquadListView.class);
                myIntent.putExtra("league","spain");
                myIntent.putExtra("buildOrView", value);
                ViewSquadsActivity.this.startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_squads, menu);
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

package com.rahulchandrashekhar.footywiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SquadBuilder extends AppCompatActivity {

    Button updateButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_squad_builder);

        Intent myIntent = getIntent();
        final String naam = myIntent.getStringExtra("buildName");
        String formation = myIntent.getStringExtra("formationName");
        if(formation.equals("4-4-2"))
        {
            setContentView(R.layout.formation_442);
        }
        else if(formation.equals("4-3-3"))
        {
            setContentView(R.layout.formation_4331);
        }
        else if(formation.equals("4-1-2-1-2"))
        {
            setContentView(R.layout.formation_41212);
        }
        else
        {
            setContentView(R.layout.formation_532);
        }

        setTitle(naam);


        final Button player_1 = (Button)findViewById(R.id.player_1);

        player_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_1;
                SquadBuilder.this.startActivityForResult(mIntent, 1);

            }
        });


        final Button player_2 = (Button)findViewById(R.id.player_2);

        player_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_2;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_3 = (Button)findViewById(R.id.player_3);

        player_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_3;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_4 = (Button)findViewById(R.id.player_4);

        player_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_4;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_5 = (Button)findViewById(R.id.player_5);

        player_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_5;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_6 = (Button)findViewById(R.id.player_6);

        player_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_6;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_7 = (Button)findViewById(R.id.player_7);

        player_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_7;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_8 = (Button)findViewById(R.id.player_8);

        player_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_8;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_9 = (Button)findViewById(R.id.player_9);

        player_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_9;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_10 = (Button)findViewById(R.id.player_10);

        player_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                updateButton = player_10;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        final Button player_11 = (Button)findViewById(R.id.player_11);

        player_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent mIntent = new Intent(SquadBuilder.this, SelectedSquadList.class);
                mIntent.putExtra("toBuild", "true");
                mIntent.putExtra("teamName", naam);
                mIntent.putExtra("forResult", "true");
                updateButton = player_11;
                SquadBuilder.this.startActivityForResult(mIntent, 1);
            }
        });

        Button saveButton = (Button)findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "Saving file...", Toast.LENGTH_LONG)
                        .show();

                //View rootView = getWindow().getDecorView().findViewById(android.R.id.content);
                //store(getScreenShot(rootView),"myteam");
                Button button = (Button)v;
                button.setVisibility(View.INVISIBLE);
                Bitmap bitmap = takeScreenshot();
                saveBitmap(bitmap);
                button.setVisibility(View.VISIBLE);



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

    @Override
    public void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                Toast.makeText(getApplicationContext(), result , Toast.LENGTH_LONG)
                        .show();
                String[] mTemp = result.split(" ");

                updateButton.setText(mTemp[mTemp.length-1]);

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }

    public static Bitmap getScreenShot(View view) {
        View screenView = view.getRootView();
        screenView.setDrawingCacheEnabled(true);
        Bitmap bitmap = Bitmap.createBitmap(screenView.getDrawingCache());
        screenView.setDrawingCacheEnabled(false);
        return bitmap;
    }

    public static void store(Bitmap bm, String fileName){
        String dir1 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Screenshots";
        File dir = new File(dir1);
        if(!dir.exists())
            dir.mkdirs();
        File file = new File(dir, fileName);
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            bm.compress(Bitmap.CompressFormat.PNG, 85, fOut);
            fOut.flush();
            fOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Bitmap takeScreenshot() {
        View rootView = findViewById(android.R.id.content).getRootView();
        rootView.setDrawingCacheEnabled(true);
        return rootView.getDrawingCache();
    }

    public void saveBitmap(Bitmap bitmap) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

// Get the date today using Calendar object.
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);
        Log.i("appDate",reportDate);
        File imagePath = new File(Environment.getExternalStorageDirectory() + "/screenshot.png");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(imagePath);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
            fos.flush();
            fos.close();
        } catch (Exception e) {
            Log.e("GREC", e.getMessage(), e);
        }
    }

}

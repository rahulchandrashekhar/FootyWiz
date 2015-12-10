package com.rahulchandrashekhar.footywiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class SelectedSquadList extends AppCompatActivity {

    ListView listView;
    String league=null;
    String forResult=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_squad_list);

        listView = (ListView) findViewById(R.id.selected_list);


        /*
        String[] values = new String[]{
                "Player 1",
                "Player 2",
                "Player 3",
                "Player 4",
                "Player 5",
                "Player 6",
                "Player 7",
                "Player 8",
                "Player 9",
                "Player 10",
                "Player 11"
        };
        */

        Intent myIntent = getIntent();
        league = myIntent.getStringExtra("leagueName");
        //String value = myIntent.getStringExtra("teamName");
        forResult = myIntent.getStringExtra("forResult");
        String value = myIntent.getStringExtra("teamName");
        InputStream inputStream = getInputStream(value);
        CSVFile csvFile = new CSVFile(inputStream);
        ArrayList<String[]> scoreList = csvFile.read();
        String[] values = new String[scoreList.size()];
        boolean flag = false;
        for(int i = 0;i<scoreList.size();i++)
        {
            String[] temp = scoreList.get(i);
            //Log.i("playerNumber","the length is "+temp[0]);
            int tempLength = temp.length;
            flag = false;
            /*
            for(int j = 0;j<tempLength;j++)
            {

                if(flag)
                {
                    break;
                }
                if(temp[j].length()>1)
                {
                    if(temp[j].charAt(1)=='.')
                    {
                        Log.i("playerNaam",temp[j]);
                        values[i-1] = temp[j+1].substring(1,temp[j+1].length()-1);
                        flag = true;
                    }
                }
                Log.i("playerNaam",temp[j]);
            }*/
            values[i] = temp[0];
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView.getItemAtPosition(position);

                Intent myIntent = getIntent();
                //String temp = myIntent.getStringExtra("teamNaam");
                String buildT = myIntent.getStringExtra("toBuild");
                if(buildT!=null && buildT.equals("true"))
                {
                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("result",itemValue);
                    setResult(Activity.RESULT_OK, returnIntent);
                    finish();
                }

                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();


            }

        });
    }

    public InputStream getInputStream(String clubName)
    {
        if(clubName.equals("Manchester United"))
        {
            return getResources().openRawResource(R.raw.manchesterunitednew);
        }
        else if(clubName.equals("Arsenal"))
        {
            return getResources().openRawResource(R.raw.arsenalnew);
        }
        else if(clubName.equals("Chelsea"))
        {
            return getResources().openRawResource(R.raw.chelseanew);
        }
        else if(clubName.equals("Atletico Madrid"))
        {
            return getResources().openRawResource(R.raw.atleticomadrid);
        }
        else if(clubName.equals("Manchester City"))
        {
            return getResources().openRawResource(R.raw.manchestercity);
        }
        else if(clubName.equals("Tottenham"))
        {
            return getResources().openRawResource(R.raw.tottenham);
        }
        else if(clubName.equals("Bayern Munich"))
        {
            return getResources().openRawResource(R.raw.bayernmunich);
        }
        else if(clubName.equals("Augsburg"))
        {
            return getResources().openRawResource(R.raw.augsburg);
        }
        else if(clubName.equals("Bayer Leverkusen"))
        {
            return getResources().openRawResource(R.raw.bayerleverkusen);
        }
        else if(clubName.equals("Borussia Monchengladbach"))
        {
            return getResources().openRawResource(R.raw.borussiamonchengladbach);
        }
        else if(clubName.equals("Wolfsburg"))
        {
            return getResources().openRawResource(R.raw.wolfsburg);
        }
        else if(clubName.equals("Real Madrid"))
        {
            return getResources().openRawResource(R.raw.realmadrid);
        }
        else if(clubName.equals("Barcelona"))
        {
            return getResources().openRawResource(R.raw.barcelona);
        }
        else if(clubName.equals("Sevilla"))
        {
            return getResources().openRawResource(R.raw.sevilla);
        }
        else if(clubName.equals("Valencia"))
        {
            return getResources().openRawResource(R.raw.valencia);
        }
        else if(clubName.equals("Paris Saint Germain"))
        {
            return getResources().openRawResource(R.raw.parissaintgermain);
        }
        else if(clubName.equals("Olympique Marseille"))
        {
            return getResources().openRawResource(R.raw.olympiquemarseille);
        }
        else if(clubName.equals("Olympique Lyon"))
        {
            return getResources().openRawResource(R.raw.olympiquelyon);
        }
        else if(clubName.equals("Saint Etienne"))
        {
            return getResources().openRawResource(R.raw.saintetienne);
        }
        else if(clubName.equals("Monaco"))
        {
            return getResources().openRawResource(R.raw.monaco);
        }
        else if(clubName.equals("Benfica"))
        {
            return getResources().openRawResource(R.raw.benfica);
        }
        else if(clubName.equals("Porto"))
        {
            return getResources().openRawResource(R.raw.fcporto);
        }
        else if(clubName.equals("Braga"))
        {
            return getResources().openRawResource(R.raw.braga);
        }
        else if(clubName.equals("Sporting"))
        {
            return getResources().openRawResource(R.raw.sportingcp);
        }
        else
        {
            return getResources().openRawResource(R.raw.vitoriaguimaraes);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_selected_squad_list, menu);
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
    public void onNewIntent (Intent intent) {
        setIntent(intent);
    }

    @Override
    public void onBackPressed() {
        if(forResult!=null && forResult.equals("true"))
        {
            Intent returnIntent = new Intent();
            returnIntent.putExtra("result",league);
            setResult(Activity.RESULT_OK,returnIntent);
            finish();
        }
        else
        {
            finish();
        }

    }
}

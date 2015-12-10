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

public class SquadListView extends AppCompatActivity {

    ListView listView;
    String league=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad_list_view);

        Intent intent = getIntent();
        Log.i("gotIntent","got the intent");
        final String value;
        value = intent.getStringExtra("league");
        //if(value==null)
        //{
        //    value = savedInstanceState.getString("leagueNameValue");
        //}
        final String buildOrView = intent.getStringExtra("buildOrView");
        //Log.i("buildOrV",buildOrView);

        listView = (ListView) findViewById(R.id.list);

        String[] values = getTeamList(value);

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

                if(buildOrView.equals("view")){
                    Intent myIntent = new Intent(SquadListView.this, SelectedSquadList.class);
                    myIntent.putExtra("teamName", itemValue);
                    myIntent.putExtra("leagueName", value);
                    SquadListView.this.startActivityForResult(myIntent,1);
                }
                else{
                    Intent myIntent = new Intent(SquadListView.this, SelectFormation.class);
                    myIntent.putExtra("teamName", itemValue);
                    myIntent.putExtra("leagueName", value);
                    SquadListView.this.startActivityForResult(myIntent,1);
                }


                // Show Alert
                /*Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();*/



            }

        });
    }

    private String[] getTeamList(String key){
        String ret[];

        if(key.equals("england")){
            ret = new String[]{
                    "Arsenal",
                    "Manchester United",
                    "Chelsea",
                    "Manchester City",
                    "Tottenham"
            };
        }

        else if (key.equals("germany")){
            ret = new String[]{
                    "Bayern Munich",
                    "Borussia Dortmund",
                    "Bayer Leverkusen",
                    "Borussia Monchengladbach",
                    "Augsburg"
            };
        }
        else if (key.equals("france")){
            ret = new String[]{
                    "Monaco",
                    "Paris Saint Germain",
                    "Saint Etienne",
                    "Olympique Lyon",
                    "Olympique Marseille"
            };
        }
        else if (key.equals("spain")){
            ret = new String[]{
                    "Barcelona",
                    "Real Madrid",
                    "Valencia",
                    "Atletico Madrid",
                    "Sevilla"
            };
        }
        else{
            ret = new String[]{
                    "Benfica",
                    "Porto",
                    "Braga",
                    "Sporting CP",
                    "Vitoria Guimaraes"
            };
        }

        return ret;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_squad_list_view, menu);
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
        finish();
    }

    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                String result=data.getStringExtra("result");
                //Toast.makeText(getApplicationContext(), result , Toast.LENGTH_LONG)
                        //.show();

                league = result;

                updateUI();

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Write your code if there's no result
            }
        }
    }

    public void updateUI()
    {
        listView = (ListView) findViewById(R.id.list);

        String[] values = getTeamList(league);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);
    }


}

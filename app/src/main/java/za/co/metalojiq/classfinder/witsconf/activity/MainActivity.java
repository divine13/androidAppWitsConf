package za.co.metalojiq.classfinder.witsconf.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import za.co.metalojiq.classfinder.witsconf.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      this is saying where the layout of the file is , layout is what the user sees on their screens yoh
//      and its located at res/layout/content_main; put your mouse on content_main and then press ctrl-b then it
//      will take you to the view file where you can edit the how you want your application to look
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu); //this just makes sure that the menu is shown when u click on the 3 dots
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //* not boiler plate code
        switch (id) {
            case R.id.action_settings:
                return true;
            case R.id.action_love:
                //press ctrl-p to see the parameters
                Intent intent = new Intent(this, ListActivity.class);
                startActivity(intent); // to start another activity you need an intent
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}

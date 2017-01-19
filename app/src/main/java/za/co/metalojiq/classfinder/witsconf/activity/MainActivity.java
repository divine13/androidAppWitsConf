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
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import za.co.metalojiq.classfinder.witsconf.R;
import za.co.metalojiq.classfinder.witsconf.model.PowerTools;


//TODO: reformat file to make it look nice.
public class MainActivity extends AppCompatActivity {

    //intent Identifier-> because the extras that i send to the other activity will be serialised and then marked with an ID
    public static final String LANGUAGE = "programmingLanguage";
    //constants are in caps in Java separated with under score not camelcase
    public static final String NAME = "programmerName";
    //this variable has global scope in this class becuase we need to acces it in the findPowerTool(View view) onBtn click function
    String selectedItem = "";
    //change all references
    EditText name;
    Intent intent; //used to send data to the list activity which will know what to do with the data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      this is saying where the layout of the file is , layout is what the user sees on their screens yoh
//      and its located at res/layout/content_main; put your mouse on content_main and then press ctrl-b then it
//      will take you to the view file where you can edit the how you want your application to look
        setContentView(R.layout.activity_main);
 Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        name = (EditText) findViewById(R.id.name); //need better naming
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, PowerTools.getLangAsArray()));

        //spinner.getSelectedItem() return an object so we need to cast into a String class that is what the (String) is for
        selectedItem = (String) spinner.getSelectedItem();

   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(intent);
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

    //this finction will be called when the user presses
    public void findPowerTool(View view) {
        if (name.getText().toString().trim().equals("")) {
            name.setError("this is required, we need your name... for the some calculations...");
            return; //this is so that we dont executed the code below and it does not start the other activity; I could have done it with else block but
            //this it to also show different return statements and their effects and saves me from writing more code ;)
        }

        intent = new Intent(this, ListActivity.class);
        intent.putExtra(LANGUAGE, selectedItem);
        //in java Hello and hello are different-> its case sensitive
        //ctrl-q to know what the method getText() does
        intent.putExtra(NAME, name.getText());
        startActivity(intent);
    }
}

package za.co.metalojiq.classfinder.witsconf.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import za.co.metalojiq.classfinder.witsconf.R;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] names = {"ME", "YOU", "WITS", "JETBRAINS", "LOVE", "PRODUCTIVITY", "TOOLS", "THE BEST"};
        ListView listView = (ListView) findViewById(R.id.todo_list);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);
    }

}

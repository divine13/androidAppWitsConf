package za.co.metalojiq.classfinder.witsconf.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import za.co.metalojiq.classfinder.witsconf.R;
import za.co.metalojiq.classfinder.witsconf.adapter.ListAdapter;
import za.co.metalojiq.classfinder.witsconf.model.PowerTools;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //simple Lists
//        String[] names = {"ME", "YOU", "WITS", "JETBRAINS", "LOVE", "PRODUCTIVITY", "TOOLS", "THE BEST"};
//        ListView listView = (ListView) findViewById(R.id.todo_list);
//
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
//        listView.setAdapter(adapter);


        //these are like templates in c++ but but they are called generics
        ArrayList<PowerTools> tools = new ArrayList<PowerTools>();

        // can be turned to a for each loop
        for(int i = 0; i < PowerTools.names.length; i++) {
            PowerTools.LANGUAGE[] languages =  PowerTools.getLanguage(PowerTools.names[i]);
            tools.add(new PowerTools(PowerTools.names[i],PowerTools.desc[i],languages));
        }

        ListView listView = (ListView) findViewById(R.id.todo_list);
        ListAdapter adapter = new ListAdapter(this, tools);
        listView.setAdapter(adapter);


    }

}

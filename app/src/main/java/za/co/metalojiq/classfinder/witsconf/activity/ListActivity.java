package za.co.metalojiq.classfinder.witsconf.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import za.co.metalojiq.classfinder.witsconf.R;
import za.co.metalojiq.classfinder.witsconf.adapter.ListAdapter;
import za.co.metalojiq.classfinder.witsconf.model.PowerTools;

public class ListActivity extends AppCompatActivity {

    private static final String TAG = "ListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        Intent intent = getIntent();
        String lang = intent.getStringExtra(MainActivity.LANGUAGE);
        String name = intent.getStringExtra(MainActivity.NAME);
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

        //if lang is null then it was not from the find power tool button
        if (lang != null) {
            //TAG variable is really helpful like u can just copy and past this in the main acitvity
            Log.d(TAG, "language that was selected" + lang);

            //if you dont do new Arr.... you will get a nullPointer exception!!!!
            ArrayList<PowerTools> powerTools = new ArrayList<PowerTools>();
            Toast.makeText(this, "hello " +  name + " from http://jetbrains/student", Toast.LENGTH_LONG).show();
            for (int i = 0; i < tools.size() ; i++) {
                //for each loop
                for (PowerTools.LANGUAGE l : tools.get(i).getLang()) {
                    if (TextUtils.equals(l.name(), lang)) {
                        //should extract this to a valriable because we doing the same job twice
                        powerTools.add(tools.get(i));
                    }
                }
            }

            if (powerTools.size() == 0) {
                Toast.makeText(this,   name + " SQL is not added yet check out DATAGRIP at http://jetbrains/student", Toast.LENGTH_LONG).show();
                return;
            }

            ListView listView = (ListView) findViewById(R.id.todo_list);
            ListAdapter adapter = new ListAdapter(this, powerTools);
            listView.setAdapter(adapter);
            Toast.makeText(this,   "As always" +  name + "JetBrains has your back, you can download all of the tools here for FREE at http://jetbrains/student", Toast.LENGTH_LONG).show();

        } else {
            ListView listView = (ListView) findViewById(R.id.todo_list);
            ListAdapter adapter = new ListAdapter(this, tools);
            listView.setAdapter(adapter);
        }





    }
}

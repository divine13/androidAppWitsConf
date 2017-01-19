package za.co.metalojiq.classfinder.witsconf.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import za.co.metalojiq.classfinder.witsconf.R;
import za.co.metalojiq.classfinder.witsconf.model.Person;

/**
 * Created by divine on 1/19/17.
 */


// @link ListActivity shows a simple list but what if we want custimise how the list looks
public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<Person> persons;

    public ListAdapter(Context context,  ArrayList<Person> persons) {
        this.context = context;
        this.persons = persons;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return persons.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    //This is where we customise our list view
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = LayoutInflater.from(context).inflate(R.layout.list_person, parent, false);

        return rowView;
    }
}

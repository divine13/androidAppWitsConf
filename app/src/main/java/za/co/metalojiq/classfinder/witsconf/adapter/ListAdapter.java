package za.co.metalojiq.classfinder.witsconf.adapter;


import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import za.co.metalojiq.classfinder.witsconf.R;
import za.co.metalojiq.classfinder.witsconf.model.PowerTools;

/**
 * Created by divine on 1/19/17.
 */


// @link ListActivity shows a simple list but what if we want custimise how the list looks
public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<PowerTools> persons;

    public ListAdapter(Context context,  ArrayList<PowerTools> persons) {
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
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView textViewDescription = (TextView) rowView.findViewById(R.id.secondLine);
        TextView textViewName = (TextView) rowView.findViewById(R.id.firstLine);
        TextView textViewLanguages = (TextView) rowView.findViewById(R.id.languages);

        imageView.setImageResource(persons.get(position).getImageResource());
        textViewDescription.setText(persons.get(position).getDescription());
        textViewName.setText(persons.get(position).getName());
        //variables in a function aka Method in Java
        String lang = persons.get(position).getStringLang();
        if(TextUtils.isEmpty(lang)) {
            textViewLanguages.setText("All");
        } else {
            textViewLanguages.setText(lang);
        }
            return rowView;
    }
}
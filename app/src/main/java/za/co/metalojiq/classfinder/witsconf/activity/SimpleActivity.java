package za.co.metalojiq.classfinder.witsconf.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.metalojiq.classfinder.witsconf.R;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //when you get a red colored hover ontop and then click on it then on the bulb
        setContentView(R.layout.activity_simple_activities);
    }
}

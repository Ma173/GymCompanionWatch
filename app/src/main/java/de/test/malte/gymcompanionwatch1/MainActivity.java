package de.test.malte.gymcompanionwatch1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.wear.widget.drawer.WearableActionDrawerView;
import android.support.wear.widget.drawer.WearableDrawerLayout;
import android.support.wear.widget.drawer.WearableNavigationDrawerView;
import android.support.wearable.activity.WearableActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.wear.widget.*;
import android.support.wearable.view.*;

public class MainActivity extends WearableActivity implements MenuItem.OnMenuItemClickListener {

    private TextView mTextView;
    private WearableDrawerLayout mWearableDrawerLayout;
    private WearableNavigationDrawerView mWearableNavigationDrawer;
    private WearableActionDrawerView mWearableActionDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();

        // Top navigation drawer
        mWearableNavigationDrawer = (WearableNavigationDrawerView) findViewById(R.id.top_drawer);
        mWearableNavigationDrawer.setAdapter(new YourImplementationNavigationAdapter(this) {
            @Override
            public CharSequence getItemText(int i) {
                return null;
            }

            @Override
            public Drawable getItemDrawable(int i) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        });
        // Peeks navigation drawer on the top.
        //mWearableNavigationDrawer.getController().peekDrawer();
        // Bottom action drawer
        mWearableActionDrawer = (WearableActionDrawerView) findViewById(R.id.bottom_action_drawer);
        // Peeks action drawer on the bottom.
        mWearableActionDrawer.getController().peekDrawer();
        mWearableActionDrawer.setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return false;}
}



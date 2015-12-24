package com.amoz.omnimessenger.ui.list;

import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.amoz.omnimessenger.R;
import com.amoz.omnimessenger.ui.common.BaseActivity;
import com.amoz.omnimessenger.util.Log;

public class ListActivity extends BaseActivity {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ListActivity created");
        setContentView(R.layout.list_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "TODO: New message", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        startListFragment();
    }

    /**
     * Create and start list fragment.
     */
    private void startListFragment() {
        final FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, new ListFragment(),
                ListFragment.class.getName());
        fragmentTransaction.commit();
    }
}

package com.amoz.omnimessenger.ui.common;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.amoz.omnimessenger.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BaseFragment extends Fragment {

    /**
     * Reference to {@link BaseActivity}.
     */
    protected BaseActivity mActivity;

    /**
     * {@inheritDoc}
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mActivity = (BaseActivity) getActivity();
        return inflater.inflate(R.layout.list_fragment, container, false);
    }
}

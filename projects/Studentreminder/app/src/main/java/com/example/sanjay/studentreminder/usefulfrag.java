package com.example.sanjay.studentreminder;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sanjay on 16-03-2017.
 */

public class usefulfrag extends Fragment {
    View myview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myview= inflater.inflate(R.layout.useful_links,container,false);

        return myview;
    }
}

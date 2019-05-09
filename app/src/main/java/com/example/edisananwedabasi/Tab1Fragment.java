package com.example.edisananwedabasi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";



    public Tab1Fragment(){

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);
        ListView listView = view.findViewById(R.id.old_testament_list);
        ListView listView2 = view.findViewById(R.id.new_testament_list);
        return view;
    }

}

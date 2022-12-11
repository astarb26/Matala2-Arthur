package com.example.matala2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragmentTwo extends Fragment {
    private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter addapter;
    public BlankFragmentTwo() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_two, container, false);
        TextView textView = view.findViewById(R.id.textView3);
        TextView textView2 = view.findViewById(R.id.textView4);
        ImageView imageview = view.findViewById(R.id.image);
        textView.setText(getArguments().getString("title"));
        textView2.setText(getArguments().getString("description2"));
        imageview.setImageResource((getArguments().getInt("image")));

        return view;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }
}
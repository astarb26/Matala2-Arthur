package com.example.matala2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragmentOne extends Fragment {

    private ArrayList<DataModel> dataSet;

    private RecyclerView recycleView;
    private LinearLayoutManager layoutManager;
    private CustomAdapter addapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank_one, container, false);
        recycleView = view.findViewById(R.id.my_recycler_view);
        layoutManager = new LinearLayoutManager(getActivity()); // new GridLayoutManager
        recycleView.setLayoutManager(layoutManager);

        recycleView.setItemAnimator(new DefaultItemAnimator());

        dataSet = new ArrayList<DataModel>();

        for(int i=0 ; i<MyData.nameArray.length ; i++)
        {
            dataSet.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.description[i],
                    MyData.description2[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]


            ));
        }
        CustomAdapter adapter = new CustomAdapter(dataSet,this);
        recycleView.setAdapter(adapter);

        return view;
    }


     public void onCreate(@Nullable Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

     }


}
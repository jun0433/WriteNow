package com.example.writenow.Write;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.writenow.R;


public class ResultFragment extends Fragment {

    View view;
    String ans1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_result, container, false);

        if (getArguments() != null){
            ans1 = getArguments().getString("ans");
        }

        return view;

    }
}
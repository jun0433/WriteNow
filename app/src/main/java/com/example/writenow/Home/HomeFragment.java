package com.example.writenow.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.writenow.R;

import java.util.Calendar;

public class HomeFragment extends Fragment {

    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment




        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void getDT() {
        Calendar cal = Calendar.getInstance();
        int y = 0, m = 0, d = 0, h = 0, mi = 0, s = 0;

        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH) + 1;

        textView.setText(y + "." + m);
    }

}
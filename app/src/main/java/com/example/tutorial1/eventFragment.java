package com.example.tutorial1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class eventFragment extends Fragment {
    Button button;


    public eventFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        button = view.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new homeFragment();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container,fragment).commit();

            }
        });

        return view;
    }
}
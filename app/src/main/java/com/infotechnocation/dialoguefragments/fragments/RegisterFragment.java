package com.infotechnocation.dialoguefragments.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.infotechnocation.dialoguefragments.R;

/**
 * Created by Prajin Bajracharya on 11/29/2016.
 */

public class RegisterFragment extends Fragment {

    EditText etname;
    EditText etpass;
    EditText etadd;
    Button btnreg;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.frag_register,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etname=(EditText)view.findViewById(R.id.etname1);
        etpass=(EditText)view.findViewById(R.id.etpass1);
        etadd=(EditText)view.findViewById(R.id.etadd1);
        btnreg=(Button)view.findViewById(R.id.btnreg1);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

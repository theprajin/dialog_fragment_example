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

public class LoginFragment extends Fragment {
    EditText etname;
    EditText etpass;
    Button btnlogin;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_login,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etname = (EditText)view.findViewById(R.id.etname);
        etpass = (EditText)view.findViewById(R.id.etpass);
        btnlogin = (Button) view.findViewById(R.id.btnlogin);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

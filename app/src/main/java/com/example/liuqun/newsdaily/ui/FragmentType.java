package com.example.liuqun.newsdaily.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.liuqun.newsdaily.R;
import com.github.ikidou.fragmentBackHandler.FragmentBackHandler;

public class FragmentType extends Fragment implements FragmentBackHandler {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_type, container, false);
    }

    @Override
    public boolean onBackPressed() {
        Intent intent =new Intent(getActivity(),MainActivity.class);
        startActivity(intent);
        return false;
    }
}

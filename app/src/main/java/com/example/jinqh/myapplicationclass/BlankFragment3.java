package com.example.jinqh.myapplicationclass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 第三个页面 作息表
 *
 * @author qingyin
 *
 */
public class BlankFragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false);

    }
    @Override
    public void onStart() {

        super.onStart();
    }
}

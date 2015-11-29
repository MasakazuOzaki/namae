package com.example.masakazuozaki.namae;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MasakazuOzaki on 2015/11/01.
 */
public class HomeFragment extends Fragment {
    int position;

    public static HomeFragment newInstance(int position){
        HomeFragment f = new HomeFragment();
        Bundle b = new Bundle();
        b.putInt("position",position);
        f.setArguments(b);

        return f;
    }


    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        position = getArguments().getInt("position");



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.homefragment, container, false);

        return view;
    }
}

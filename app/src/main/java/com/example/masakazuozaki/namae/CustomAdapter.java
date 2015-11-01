package com.example.masakazuozaki.namae;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by MasakazuOzaki on 2015/11/01.
 */
public class CustomAdapter extends ArrayAdapter {

    List<Word>mWords;
    private LayoutInflater layoutInflater;


    public CustomAdapter(Context context,int textViewResourceId, List<Word> objects){
        super(context, textViewResourceId, objects);

        mWords = objects;
        layoutInflater = (layoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {
        return mWords.size();
    }

    @Override
     public Object getItem(int position){
        return mWords.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
       Word item = (Word)getItem(position);

        if


        return convertView;
    }
}

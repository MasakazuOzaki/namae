package com.example.masakazuozaki.namae;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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

        if(null ==convertView){
            convertView = layoutInflater.inflate(R.layout.rowdata, null);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.text);
        textView.setText(item.spell);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(20.0f);

        return convertView;
    }
}

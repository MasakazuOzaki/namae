package com.example.masakazuozaki.namae;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MasakazuOzaki on 2015/11/01.
 */
public class TestFragment extends Fragment{

    int position;

    ListView listView;
    String text;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    List<String> objects;
    ArrayAdapter<String>  mAdapter;
    View button;


    public static TestFragment newInstance(int position){
        TestFragment f = new TestFragment();
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
        View view = inflater.inflate(R.layout.fragment, container, false);

        listView = (ListView)view.findViewById(R.id.listView);

        pref = getActivity().getSharedPreferences("てすと", Context.MODE_PRIVATE);
        text = pref.getString("Google","error");
        objects  = new ArrayList<>();
        text = pref.getString("Google", "error");

        for (int count = 0; count < 200; count++) {
            objects.add(text);
        }

        mAdapter = new ArrayAdapter<String>(getActivity(), R.layout.rowdata, objects);


        listView.setAdapter(mAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //tapされたとき
                Toast.makeText(getActivity(), "Toast example", Toast.LENGTH_SHORT).show();


            }
        });


        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                text = pref.getString("Google", "error");

                objects.clear();

                for (int count = 0; count < 200; count++) {
                    objects.add(text);
                }
                Log.e("Tag","1");
                mAdapter.notifyDataSetChanged();

            }

        });





        return view;
    }
}

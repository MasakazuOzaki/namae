package com.example.masakazuozaki.namae;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
    CustomAdapter mAdapter;


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
        List<Word> objects = new ArrayList<Word>();

        for (int count = 0; count < 200; count++){
            objects.add(new Word("てすと"));
        }
        mAdapter = new CustomAdapter(getActivity(),0, objects);
        listView =(ListView)view.findViewById(R.id.listView);
        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                       public void onItemClick(AdapterView<?> parent, View view,
                                                               int position, long id){
                                            //tapされたとき
                                               Toast.makeText(getActivity(), "Toast example", Toast.LENGTH_SHORT).show();
                                            }
        });
        return view;
    }
}

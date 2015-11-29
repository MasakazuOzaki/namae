package com.example.masakazuozaki.namae;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by MasakazuOzaki on 2015/11/01.
 */
public class RenrakuFragment extends Fragment {
    int position;
    EditText editText;
    TextView textView;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    String text;
    View button;



    public static RenrakuFragment newInstance(int position){
        RenrakuFragment f = new RenrakuFragment();
        Bundle b = new Bundle();
        b.putInt("position", position);
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
        View view = inflater.inflate(R.layout.renrakufragment, container, false);
        button = view.findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                pref = getActivity().getSharedPreferences("てすと", Context.MODE_PRIVATE);
                editor = pref.edit();

                EditText editText = (EditText) getActivity().findViewById(R.id.editText);
                editText.selectAll();
                text = editText.getText().toString();
                editor.putString("Google", text);
                editor.commit();
                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
            }

        });



        return view;
    }





}

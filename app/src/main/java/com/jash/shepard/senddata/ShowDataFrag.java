package com.jash.shepard.senddata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowDataFrag extends Fragment {
    private TextView showData;

    public ShowDataFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show_data, container, false);
        showData = view.findViewById(R.id.showData);
        Bundle bundle = getArguments();
        Person person = (Person) bundle.getSerializable("person");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("نام :" + "\t" + person.getfName() +"\n");
        stringBuilder.append("نام خانوادگی :" + "\t" + person.getlName()+"\n");
        stringBuilder.append("سن :" + "\t" + person.getAge()+"\n");
        stringBuilder.append("جنسیت :" + "\t" + person.getSex()+"\n");
        showData.setText(stringBuilder);
        return view;
    }
}

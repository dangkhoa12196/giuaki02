package com.example.dangkhoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import java.lang.reflect.Array;

public class FragmentList extends Fragment {
    ArrayAdapter adt;
    String[] StudentName={"Khoa","Nghia","Vinh"};
    SendName sendName;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        sendName=(SendName) getActivity();
        View v=inflater.inflate(R.layout.fragment_list,container,false);
        ListView lv=v.findViewById(R.id.lvFList);
        adt=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,StudentName);
        lv.setAdapter(adt);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                sendName.sendname(Array.get(StudentName,position).toString());
            }
        });
        return  v;
    }
}

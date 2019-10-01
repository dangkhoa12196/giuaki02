package com.example.dangkhoa;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentName extends Fragment {
    TextView tvFName;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState){
        View v=inflater.inflate(R.layout.fragment_name,container,false);
        tvFName=v.findViewById(R.id.tvFName);
        return v;
    }
}

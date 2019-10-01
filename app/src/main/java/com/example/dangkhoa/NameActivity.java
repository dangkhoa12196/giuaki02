package com.example.dangkhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class NameActivity extends AppCompatActivity {
    FragmentName fragmentName;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        Intent intent=getIntent();

        fragmentName = (FragmentName) getFragmentManager().findFragmentById(R.id.frgName);
        fragmentName.tvFName.setText(intent.getStringExtra("name"));
    }
}

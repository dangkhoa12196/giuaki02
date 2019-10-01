package com.example.dangkhoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements SendName{

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void sendname(String name){
        Configuration configuration=getResources().getConfiguration();
        if(Configuration.ORIENTATION_LANDSCAPE == configuration.orientation)
        {
            FragmentName fragmentName=(FragmentName) getFragmentManager().findFragmentById(R.id.fragment2);
            fragmentName.tvFName.setText(name);
        }
        else
        {
            Intent intent=new Intent(MainActivity.this,NameActivity.class);
            intent.putExtra("name",name);
            startActivity(intent);

        }
    }
}

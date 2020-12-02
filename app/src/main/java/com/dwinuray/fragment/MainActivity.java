package com.dwinuray.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentA fragmentA = new FragmentA();
        Fragment fragment = fm.findFragmentByTag(FragmentA.class.getSimpleName());

        if ( ! (fragment instanceof FragmentA) ) {

            fm.beginTransaction()
                    .add(R.id.main_container, fragmentA, FragmentA.class.getSimpleName())
                    .commit();
        }


    }
}

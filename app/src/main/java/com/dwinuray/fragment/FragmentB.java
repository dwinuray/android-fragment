package com.dwinuray.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentB extends Fragment {

    Button btnMove;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnMove = view.findViewById(R.id.btnMoveFB);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentC fragmentC = new FragmentC();
                Bundle bundle = new Bundle();
                FragmentManager fm = getFragmentManager();

                if ( fm != null ) {

                    // data :: metode bundle
                    bundle.putString(fragmentC.TITLE, "Ini adalah judul");
                    fragmentC.setArguments( bundle );

                    // data :: setter getter
                    fragmentC.setDescription("Ini yo deskripsi cak");

                    fm.beginTransaction().replace(R.id.main_container, fragmentC, FragmentC.class.getSimpleName())
                            .addToBackStack(null).commit();
                }
            }
        });
    }
}

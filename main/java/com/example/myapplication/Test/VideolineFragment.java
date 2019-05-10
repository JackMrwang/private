package com.example.myapplication.Test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.Thirtyquestion.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideolineFragment extends Fragment {
   private ImageView imageView1;
   private ImageView imageView2;

    public VideolineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_videoline, container, false);
        // Inflate the layout for this fragment
        imageView1=view.findViewById(R.id.videoimage1);
        imageView2=view.findViewById(R.id.videoimage2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getContext(), MainActivity.class);
                startActivity(intent1);
            }
        });
        return view;
    }

}

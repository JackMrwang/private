package com.example.myapplication.Test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.Thirtytwiquestion.Main4Activity;


/**
 * A simple {@link Fragment} subclass.
 */
public class PicturelineFragment extends Fragment {
     private ImageView imageView1;
     private ImageView imageView2;

    public PicturelineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_pictureline, container, false);
        // Inflate the layout for this fragment
        imageView1=view.findViewById(R.id.pictureimage1);
        imageView2=view.findViewById(R.id.pictureimage2);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), Main4Activity.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), Main4Activity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}

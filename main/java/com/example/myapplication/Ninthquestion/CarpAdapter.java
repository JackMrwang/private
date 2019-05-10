package com.example.myapplication.Ninthquestion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class CarpAdapter  extends ArrayAdapter<Carp> {
    private int resourceId;
    public CarpAdapter(@NonNull Context context, int resource, @NonNull List<Carp> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate
                    (resourceId,parent,false);//加载子布局
        }
        final Carp carp=getItem(position);
        TextView textView=convertView.findViewById(R.id.car_id);
        ImageView imageView=convertView.findViewById(R.id.car_img);
        TextView  textView1=convertView.findViewById(R.id.car_num);
        TextView  textView2=convertView.findViewById(R.id.car_name);
        TextView  textView3=convertView.findViewById(R.id.car_price);
        Button button=convertView.findViewById(R.id.button);


        textView.setText(carp.getId()+"");
        imageView.setImageResource(carp.getImage());
        textView1.setText(carp.getNum());
        textView2.setText(carp.getName());
        textView3.setText(carp.getPrice()+"");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarpAdapter.this.notifyDataSetChanged();
                new ShowDialog().showPopup(CarpAdapter.this.getContext(),v,carp,CarpAdapter.this);
            }
        });
        return convertView;
    }


}

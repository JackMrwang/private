package com.example.myapplication.Ninthquestion;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class CarpAdapter  extends ArrayAdapter<Carp> {

    private int resourceId;
    private List<CheckBox> checkBoxes;
    private List<Carp> carpList;
    public CarpAdapter(@NonNull Context context, int resource, @NonNull List<Carp> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
        checkBoxes=new ArrayList<>();
        this.carpList = objects;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView!=null){
            return convertView;
        }
        convertView = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);//加载子布局
        final Carp carp=getItem(position);
        TextView textView=convertView.findViewById(R.id.car_id);
        ImageView imageView=convertView.findViewById(R.id.car_img);
        TextView  textView1=convertView.findViewById(R.id.car_num);
        TextView  textView2=convertView.findViewById(R.id.car_name);
        TextView  textView3=convertView.findViewById(R.id.car_price);
        final CheckBox checkBox=convertView.findViewById(R.id.checkBox);
        checkBoxes.add(position,checkBox);
        Button button=convertView.findViewById(R.id.button);

        textView.setText(carp.getId()+"");
        imageView.setImageResource(carp.getImage());
        textView1.setText(carp.getNum());
        textView2.setText(carp.getName());
        textView3.setText(carp.getPrice()+"");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                List<Integer> integers = new ArrayList<>();
                for (int i = 0; i < checkBoxes.size(); i++) {
                    if (checkBoxes.get(i).isChecked()){
                        integers.add(i);
                    }
                }
                Log.d("suoyin", "onClick: "+integers);
                /***
                 * for
                 * if dianjia
                 * getItem()
                 *  add
                 */

                new ShowDialog().showPopup(CarpAdapter.this.getContext(),v,integers,carpList,CarpAdapter.this);
            }
        });
        return convertView;
    }


}

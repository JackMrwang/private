package com.example.myapplication.Ninthquestion;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class ShowDialog  {
    public void showPopup(final Context context, View view, List<Integer> integers,List<Carp> carps, final CarpAdapter carpAdapter){
        final Dialog dialog = new Dialog(context);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(R.layout.layout_topup);
        TextView carNumber = dialog.findViewById(R.id.car_number1);
        final EditText editText = dialog.findViewById(R.id.car_money);
        Button buttonOK = dialog.findViewById(R.id.car_ok);
        Button buttonCancel = dialog.findViewById(R.id.car_cancel);
        StringBuilder capcap= new StringBuilder();
        for (int i:integers){
            capcap.append(carps.get(i).getNum());
        }
        carNumber.setText(""+capcap.toString());
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int m;
//                try {
//                    m = Integer.parseInt(editText.getText().toString());
//                } catch (NumberFormatException e) {
//                    m = 0;
//                }
//                if (m == 0) {
//                    dialog.dismiss();
//                } else {
//                    carp.setPrice(carp.getPrice() + m);
//                    carpAdapter.notifyDataSetChanged();
//                    dialog.dismiss();
//                }
            }
        });
        dialog.show();

    }
}

package com.example.myapplication.Ninthquestion;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class ShowDialog  {
    public void showPopup(final Context context, View view, final Carp carp, final CarpAdapter carpAdapter){
        final Dialog dialog = new Dialog(context);
        //popupWindow.setOutsideTouchable(true);
        dialog.setCanceledOnTouchOutside(false);//外部触摸
        dialog.setContentView(R.layout.layout_topup);
        TextView carNumber = dialog.findViewById(R.id.car_number1);
        TextView carNumber1= dialog.findViewById(R.id.car_number2);
        final EditText editText = dialog.findViewById(R.id.car_money);
        Button buttonOK = dialog.findViewById(R.id.car_ok);
        Button buttonCancel = dialog.findViewById(R.id.car_cancel);
        carNumber.setText(carp.getNum());
        carNumber1.setText(carp.getNum());
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int m;
                try {
                    m = Integer.parseInt(editText.getText().toString());
                } catch (NumberFormatException e) {
                    m = 0;
                }
                if (m == 0) {
                    dialog.dismiss();
                } else {
                    carp.setPrice(carp.getPrice() + m);
                    carpAdapter.notifyDataSetChanged();
                    dialog.dismiss();
                }
            }
        });
        dialog.show();

    }
}

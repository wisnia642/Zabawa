package com.example.michal.zabawa;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_Adapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] pi;
    private final String[] pi2;
    private final String[] pi3;
    private final String[] pi4;
    private final Integer[] pi5;
    public custom_Adapter(Activity context,
                         String[] pizza,String[] pizza2,String[] pizza3,String[] pizza4, Integer[] pizza5) {
        super(context, R.layout.custom_spinner, pizza);
        this.context = context;
        this.pi = pizza;
        this.pi2 = pizza2;
        this.pi3 = pizza3;
        this.pi4 = pizza4;
        this.pi5 = pizza5;


    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_spinner, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.text1);
        TextView txtTitle1 = (TextView) rowView.findViewById(R.id.text2);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.text3);
        TextView txtTitle3 = (TextView) rowView.findViewById(R.id.text4);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.image);

        txtTitle.setText(pi[position]);
        txtTitle1.setText(pi2[position]);
        txtTitle2.setText(pi3[position]);
        txtTitle3.setText(pi4[position]);
        imageView.setImageResource(pi5[position]);
        return rowView;


    }
}

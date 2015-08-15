package com.example.michal.zabawa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;


public class MainActivity extends ActionBarActivity {

    int userSelectedIndex;
    String[] pi=null;
    String[] pi2 =null;
    String[] pi3 =null;
    String[] pi4 =null;
    Integer[] pi5=null;
    String[] spinnerSubs  = { "Euro", "Brytyjski Funt", "Szwajcarski Funt","Dolar Amerykański", "Polski Złoty"};
    String[] spinnerValues = { "EUR", "GBP", "CHF", "USD", "PLN" };
    String[] spinnerSubs1 = new String[6];
    String[] spinnerSubs2 = { "1 EUR = 1.31", "1 GBP = 0.71", "1 CHF = 1.02", "1 USD = 1.07", "1 PLN = 4.00" };
    Double[] spinnerSubs3 = new Double[6];
    Integer total_images[] = { R.drawable.euro, R.drawable.funt, R.drawable.szwajcaria, R.drawable.ameryka, R.drawable.polska};
    EditText edit;
    Double wynik;
    custom_Adapter adapter;
    ListView mylistView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner_show);
        Button powrot = (Button) findViewById(R.id.button2);
        final Button oblicz = (Button) findViewById(R.id.button3);
        edit = (EditText) findViewById(R.id.editText);
        mySpinner.setAdapter(new MyAdapter(this, R.layout.custom_row, spinnerValues));

            pi=spinnerValues;
            pi2=spinnerSubs;
            pi3=spinnerSubs1;
            pi4=spinnerSubs2;
            pi5=total_images;
           //oblicz.setEnabled(false);


             adapter = new custom_Adapter(this, pi, pi2, pi3,pi4, pi5);
             mylistView = (ListView) findViewById(R.id.listView);
            mylistView.setAdapter(adapter);

        powrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, poczatek.class);
                startActivity(i);
            }
        });

        oblicz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userSelectedIndex == 0) {
                    try {
                        wynik = Double.parseDouble(edit.getText().toString());
                        spinnerSubs3[0] = wynik;
                        spinnerSubs1[0] = String.valueOf(spinnerSubs3[0]);
                        spinnerSubs3[1] = wynik * 0.7188;
                        spinnerSubs3[1] = Math.round(spinnerSubs3[1] * 100.0) / 100.0;
                        spinnerSubs1[1] = String.valueOf(spinnerSubs3[1]);
                        spinnerSubs3[2] = wynik * 1.0259;
                        spinnerSubs3[2] = Math.round(spinnerSubs3[2] * 100.0) / 100.0;
                        spinnerSubs1[2] = String.valueOf(spinnerSubs3[2]);
                        spinnerSubs3[3] = wynik * 1.0778;
                        spinnerSubs3[3] = Math.round(spinnerSubs3[3] * 100.0) / 100.0;
                        spinnerSubs1[3] = String.valueOf(spinnerSubs3[3]);
                        spinnerSubs3[4] = wynik * 4.0015;
                        spinnerSubs3[4] = Math.round(spinnerSubs3[4] * 100.0) / 100.0;
                        spinnerSubs1[4] = String.valueOf(spinnerSubs3[4]);
                        mylistView.setAdapter(adapter);
                    } catch (Exception e) {
                    }
                }
                if (userSelectedIndex == 1) {
                    try {
                        wynik = Double.parseDouble(edit.getText().toString());
                        spinnerSubs3[0] = wynik * 1.39;
                        spinnerSubs3[0] = Math.round(spinnerSubs3[0] * 100.0) / 100.0;
                        spinnerSubs1[0] = String.valueOf(spinnerSubs3[0]);
                        spinnerSubs3[1] = wynik;
                        spinnerSubs1[1] = String.valueOf(spinnerSubs3[1]);
                        spinnerSubs3[2] = wynik * 1.42;
                        spinnerSubs3[2] = Math.round(spinnerSubs3[2] * 100.0) / 100.0;
                        spinnerSubs1[2] = String.valueOf(spinnerSubs3[2]);
                        spinnerSubs3[3] = wynik * 1.49;
                        spinnerSubs3[3] = Math.round(spinnerSubs3[3] * 100.0) / 100.0;
                        spinnerSubs1[3] = String.valueOf(spinnerSubs3[3]);
                        spinnerSubs3[4] = wynik * 5.56;
                        spinnerSubs3[4] = Math.round(spinnerSubs3[4] * 100.0) / 100.0;
                        spinnerSubs1[4] = String.valueOf(spinnerSubs3[4]);
                        mylistView.setAdapter(adapter);

                    } catch (Exception e) {
                    }
                }
                if (userSelectedIndex == 2) {
                    try {
                        wynik = Double.parseDouble(edit.getText().toString());
                        spinnerSubs3[0] = wynik * 0.97;
                        spinnerSubs3[0] = Math.round(spinnerSubs3[0] * 100.0) / 100.0;
                        spinnerSubs1[0] = String.valueOf(spinnerSubs3[0]);
                        spinnerSubs3[1] = wynik * 0.70;
                        spinnerSubs3[1] = Math.round(spinnerSubs3[1] * 100.0) / 100.0;
                        spinnerSubs1[1] = String.valueOf(spinnerSubs3[1]);
                        spinnerSubs3[2] = wynik;
                        spinnerSubs1[2] = String.valueOf(spinnerSubs3[2]);
                        spinnerSubs3[3] = wynik * 1.05;
                        spinnerSubs3[3] = Math.round(spinnerSubs3[3] * 100.0) / 100.0;
                        spinnerSubs1[3] = String.valueOf(spinnerSubs3[3]);
                        spinnerSubs3[4] = wynik * 3.90;
                        spinnerSubs3[4] = Math.round(spinnerSubs3[4] * 100.0) / 100.0;
                        spinnerSubs1[4] = String.valueOf(spinnerSubs3[4]);
                        mylistView.setAdapter(adapter);

                    } catch (Exception e) {
                    }
                }
                if (userSelectedIndex == 3) {
                    try {
                        wynik = Double.parseDouble(edit.getText().toString());
                        spinnerSubs3[0] = wynik * 0.92;
                        spinnerSubs3[0] = Math.round(spinnerSubs3[0] * 100.0) / 100.0;
                        spinnerSubs1[0] = String.valueOf(spinnerSubs3[0]);
                        spinnerSubs3[1] = wynik * 0.66;
                        spinnerSubs3[1] = Math.round(spinnerSubs3[1] * 100.0) / 100.0;
                        spinnerSubs1[1] = String.valueOf(spinnerSubs3[1]);
                        spinnerSubs3[2] = wynik * 0.95;
                        spinnerSubs3[2] = Math.round(spinnerSubs3[2] * 100.0) / 100.0;
                        spinnerSubs1[2] = String.valueOf(spinnerSubs3[2]);
                        spinnerSubs3[3] = wynik;
                        spinnerSubs1[3] = String.valueOf(spinnerSubs3[3]);
                        spinnerSubs3[4] = wynik * 3.71;
                        spinnerSubs3[4] = Math.round(spinnerSubs3[4] * 100.0) / 100.0;
                        spinnerSubs1[4] = String.valueOf(spinnerSubs3[4]);
                        mylistView.setAdapter(adapter);

                    } catch (Exception e) {
                    }
                }
                if (userSelectedIndex == 4) {
                    try {
                        wynik = Double.parseDouble(edit.getText().toString());
                        spinnerSubs3[0] = wynik * 0.24;
                        spinnerSubs3[0] = Math.round(spinnerSubs3[0] * 100.0) / 100.0;
                        spinnerSubs1[0] = String.valueOf(spinnerSubs3[0]);
                        spinnerSubs3[1] = wynik * 0.17;
                        spinnerSubs3[1] = Math.round(spinnerSubs3[1] * 100.0) / 100.0;
                        spinnerSubs1[1] = String.valueOf(spinnerSubs3[1]);
                        spinnerSubs3[2] = wynik * 0.25;
                        spinnerSubs3[2] = Math.round(spinnerSubs3[2] * 100.0) / 100.0;
                        spinnerSubs1[2] = String.valueOf(spinnerSubs3[2]);
                        spinnerSubs3[3] = wynik * 0.26;
                        spinnerSubs3[3] = Math.round(spinnerSubs3[3] * 100.0) / 100.0;
                        spinnerSubs1[3] = String.valueOf(spinnerSubs3[3]);
                        spinnerSubs3[4] = wynik;
                        spinnerSubs1[4] = String.valueOf(spinnerSubs3[4]);
                        mylistView.setAdapter(adapter);

                    } catch (Exception e) {
                    }}

            }
        });



            mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    userSelectedIndex = position;



                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }

    public class MyAdapter extends ArrayAdapter<String>
    {
        public MyAdapter(Context ctx, int txtViewResourceId, String[] objects)
        {
            super(ctx, txtViewResourceId, objects);
        }

        @Override
    public View getDropDownView(int position, View cnvtView, ViewGroup prnt)
    {
        return getCustomView(position, cnvtView, prnt);
    }
    @Override
    public View getView(int pos, View cnvtView, ViewGroup prnt)
    {
        return getCustomView(pos, cnvtView, prnt);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = getLayoutInflater();
        View mySpinner = inflater.inflate(R.layout.custom_row, parent, false);
        TextView main_text = (TextView) mySpinner .findViewById(R.id.text1);
        main_text.setText(spinnerValues[position]);
        ImageView left_icon = (ImageView) mySpinner .findViewById(R.id.image);
        left_icon.setImageResource(total_images[position]);
        return mySpinner;
    }
}}


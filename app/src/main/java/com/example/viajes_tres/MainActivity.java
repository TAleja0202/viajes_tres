package com.example.viajes_tres;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RadioButton jrbcartagena,jrbsantamarta,jrbsanandres;
    TextView   jtvciudad,jtvautomovil,jtvtotal ;
    Button jbttotal;
    CheckBox jcbautomovil;           ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        jrbcartagena = findViewById(R.id.rbcartagena);
        jrbsantamarta = findViewById(R.id.rbsantamarta);
        jrbsanandres = findViewById(R.id.rbsanandres);
        jtvciudad = findViewById(R.id.tvciudad);
        jtvautomovil = findViewById(R.id.tvautomovil);
        jtvtotal = findViewById(R.id.tvtotal);
        jbttotal = findViewById(R.id.bttotal);
        jcbautomovil = findViewById(R.id.cbautomovil);



    }

    public void hallar_total(View View){

       double ciudad,automovil,total;
        if(jrbcartagena.isChecked()){
            jtvciudad.setText("80000");
        }
            else
                if(jrbsantamarta.isChecked()){
                    jtvciudad.setText("90000");

                }
                   else{
                        jtvciudad.setText("100000");
                }
                   if(jcbautomovil.isChecked()){
                       jtvautomovil.setText("500000");

                     }
                    else{

                       jtvautomovil.setText("0");}

                        ciudad = Double.parseDouble(jtvciudad.getText().toString());
                        automovil = Double.parseDouble(jtvautomovil.getText().toString());
                        total = ciudad + automovil;
                        jtvtotal.setText(String.valueOf(total));

                }

          }

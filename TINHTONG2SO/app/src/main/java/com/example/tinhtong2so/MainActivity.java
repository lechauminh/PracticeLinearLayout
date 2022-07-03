package com.example.tinhtong2so;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtSo1;
TextView txtSo2;
Button btnTinh;
TextView txtKetqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSo1 =(TextView) findViewById(R.id.textViewSo1);
        txtSo2=(TextView) findViewById(R.id.textViewSo2);
        btnTinh=(Button) findViewById(R.id.btnTong);
        txtKetqua=(TextView) findViewById(R.id.textViewKetquaTong);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = txtSo1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);
                String chuoi2 = txtSo2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);
                int tong = so1+so2;
                txtKetqua.setText(String.valueOf(tong));
            }
        });
    }
}
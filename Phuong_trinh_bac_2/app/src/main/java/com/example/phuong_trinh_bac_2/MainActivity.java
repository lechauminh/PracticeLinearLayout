package com.example.phuong_trinh_bac_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtHesoA;
    EditText txtHesoB;
    EditText txtHesoC;
    TextView txtNghiemX1;
    TextView txtNghiemX2;
    Button btnKetQuaTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tham chiếu với Id
        txtHesoA=(EditText) findViewById(R.id.eTxtHeSoA);
        txtHesoB=(EditText) findViewById(R.id.eTxtHeSoB);
        txtHesoC=(EditText) findViewById(R.id.eTxtHeSoC);
        txtNghiemX1=(TextView) findViewById(R.id.eTxtNghiemX1);
        txtNghiemX2=(TextView) findViewById(R.id.eTxtNghiemX2);
        btnKetQuaTinh=(Button) findViewById(R.id.btnTinhNghiem);
        // Tạo sự kiện xử lý kết quả
        btnKetQuaTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ép sang kiểu chuỗi
                String chuoiSoA = txtHesoA.getText().toString();
                String chuoiSoB = txtHesoB.getText().toString();
                String chuoiSoC = txtHesoC.getText().toString();
                //Ép sang kiểu số
                int soA = Integer.parseInt(chuoiSoA);
                int soB = Integer.parseInt(chuoiSoB);
                int soC = Integer.parseInt(chuoiSoC);

                double delta = soB^2 - 4*soA*soC;
                double x1 = (- soB + Math.sqrt(delta))/2*soA;
                double x2 = (- soB - Math.sqrt(delta))/2*soA;
                double x0 = - soC/soB;
                double x12 = - soB/2*soA;
                txtNghiemX1.setText(String.valueOf(x1));
                txtNghiemX2.setText(String.valueOf(x2));

                if (soA == 0)
                {
                    System.out.println("Phương trình vô nghiệm");
                    txtNghiemX1.setText(String.valueOf(x0));
                }
                else if(delta<0)
                {
                    System.out.println("Phương trình vô nghiệm");
                }
                else if (delta==0)
                {
                    System.out.println("Phương trình có nghiệm kép");
                    txtNghiemX1.setText(String.valueOf(x12));
                    txtNghiemX2.setText(String.valueOf(x12));
                }
                else
                {
                    System.out.println("Phương trình có 2 nghiệm phân biệt");
                    txtNghiemX1.setText(String.valueOf(x1));
                    txtNghiemX2.setText(String.valueOf(x2));
                }
            }
        });

    }
}
package com.example.cristian.mytoolbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class Traductor extends AppCompatActivity implements View.OnClickListener {

    TextView nt1, nt2, nt3, nt4, nt5, nt6, nt7, nt8, nt9, nt10, nt11, nt12, nt13, nt14, nt15, nt16, nt17, nt18, nt19, nt20;
    TextView Resulttrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);

        Resulttrans = (TextView)findViewById(R.id.Resulttrans);

        nt1=(TextView)findViewById(R.id.nota1);
        nt1.setOnClickListener(this);
        nt2=(TextView)findViewById(R.id.nota2);
        nt2.setOnClickListener(this);
        nt3=(TextView)findViewById(R.id.nota3);
        nt3.setOnClickListener(this);
        nt4=(TextView)findViewById(R.id.nota4);
        nt4.setOnClickListener(this);
        nt5=(TextView)findViewById(R.id.nota5);
        nt5.setOnClickListener(this);
        nt6=(TextView)findViewById(R.id.nota6);
        nt6.setOnClickListener(this);
        nt7=(TextView)findViewById(R.id.nota7);
        nt7.setOnClickListener(this);
        nt8=(TextView)findViewById(R.id.nota8);
        nt8.setOnClickListener(this);
        nt9=(TextView)findViewById(R.id.nota8);
        nt9.setOnClickListener(this);
        nt10=(TextView)findViewById(R.id.nota10);
        nt10.setOnClickListener(this);
        nt11=(TextView)findViewById(R.id.nota11);
        nt11.setOnClickListener(this);
        nt12=(TextView)findViewById(R.id.nota12);
        nt12.setOnClickListener(this);
        nt13=(TextView)findViewById(R.id.nota13);
        nt13.setOnClickListener(this);
        nt14=(TextView)findViewById(R.id.nota14);
        nt14.setOnClickListener(this);
        nt15=(TextView)findViewById(R.id.nota15);
        nt15.setOnClickListener(this);
        nt16=(TextView)findViewById(R.id.nota16);
        nt16.setOnClickListener(this);
        nt17=(TextView)findViewById(R.id.nota17);
        nt17.setOnClickListener(this);
        nt18=(TextView)findViewById(R.id.nota18);
        nt18.setOnClickListener(this);
        nt19=(TextView)findViewById(R.id.nota19);
        nt19.setOnClickListener(this);
        nt20=(TextView)findViewById(R.id.nota20);
        nt20.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {


        int select = view.getId();
        try {
            switch (select) {

                case R.id.nota1:
                    Resulttrans.setText("Car");
                    break;
                case R.id.nota2:
                    Resulttrans.setText("Computer");
                    break;
                case R.id.nota3:
                    Resulttrans.setText("Table");
                    break;
                case R.id.nota4:
                    Resulttrans.setText("Cellphone");
                    break;
                case R.id.nota5:
                    Resulttrans.setText("Clock");
                    break;
                case R.id.nota6:
                    Resulttrans.setText("Food");
                    break;
                case R.id.nota7:
                    Resulttrans.setText("Water");
                    break;
                case R.id.nota8:
                    Resulttrans.setText("Dog");
                    break;
                case R.id.nota9:
                    Resulttrans.setText("Cat");
                    break;
                case R.id.nota10:
                    Resulttrans.setText("Motorbike");
                    break;
                case R.id.nota11:
                    Resulttrans.setText("Gato");
                    break;
                case R.id.nota12:
                    Resulttrans.setText("Mesa");
                    break;
                case R.id.nota13:
                    Resulttrans.setText("Motocicleta");
                    break;
                case R.id.nota14:
                    Resulttrans.setText("Agua");
                    break;
                case R.id.nota15:
                    Resulttrans.setText("Carro");
                    break;
                case R.id.nota16:
                    Resulttrans.setText("Perro");
                    break;
                case R.id.nota17:
                    Resulttrans.setText("Reloj");
                    break;
                case R.id.nota18:
                    Resulttrans.setText("Comida");
                    break;
                case R.id.nota19:
                    Resulttrans.setText("Computador");
                    break;
                case R.id.nota20:
                    Resulttrans.setText("Celular");
                    break;

            }
        } catch (Exception e) {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}


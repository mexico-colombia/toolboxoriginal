package com.example.cristian.mytoolbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    Double[] number = new Double[20];
    Double resultado;
    boolean potencia = false;
    boolean raiz = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        //Numeros
        Button n0 = (Button)findViewById(R.id.Boton_0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.Boton_1);
        n1.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.Boton_2);
        n2.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.Boton_3);
        n3.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.Boton_4);
        n4.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.Boton_5);
        n5.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.Boton_6);
        n6.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.Boton_7);
        n7.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.Boton_8);
        n8.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.Boton_9);
        n9.setOnClickListener(this);

        //Operaciones
        Button punto = (Button)findViewById(R.id.Boton_punto);
        punto.setOnClickListener(this);
        Button suma = (Button)findViewById(R.id.Boton_Suma);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.Boton_Resta);
        resta.setOnClickListener(this);
        Button multiplicacion = (Button)findViewById(R.id.Boton_Multiplicacion);
        multiplicacion.setOnClickListener(this);
        Button division = (Button)findViewById(R.id.Boton_Division);
        division.setOnClickListener(this);
        Button potencia = (Button)findViewById(R.id.Boton_Potencia);
        potencia.setOnClickListener(this);
        Button raiz = (Button)findViewById(R.id.Boton_Raiz);
        raiz.setOnClickListener(this);

        //Graficas
        Button parabola = (Button)findViewById(R.id.Boton_Parabola);
        parabola.setOnClickListener(this);
        Button recta = (Button)findViewById(R.id.Boton_Recta);
        recta.setOnClickListener(this);

        //Procesos
        Button resultado = (Button)findViewById(R.id.Boton_Resultado);
        resultado.setOnClickListener(this);
        Button ben = (Button)findViewById(R.id.Boton_Eliminar_Numero);
        ben.setOnClickListener(this);
        Button bet = (Button)findViewById(R.id.Boton_Eliminar_Todo);
        bet.setOnClickListener(this);


    }

    @Override
    public void onClick(View view){
        TextView screen = (TextView)findViewById(R.id.textview);
        int select = view.getId();
        String SaveNum = screen.getText().toString();

        try {
            switch (select) {

                case R.id.Boton_0:
                    screen.setText(SaveNum + "0");
                    break;
                case R.id.Boton_1:
                    screen.setText(SaveNum + "1");
                    break;
                case R.id.Boton_2:
                    screen.setText(SaveNum + "2");
                    break;
                case R.id.Boton_3:
                    screen.setText(SaveNum + "3");
                    break;
                case R.id.Boton_4:
                    screen.setText(SaveNum + "4");
                    break;
                case R.id.Boton_5:
                    screen.setText(SaveNum + "5");
                    break;
                case R.id.Boton_6:
                    screen.setText(SaveNum + "6");
                    break;
                case R.id.Boton_7:
                    screen.setText(SaveNum + "7");
                    break;
                case R.id.Boton_8:
                    screen.setText(SaveNum + "8");
                    break;
                case R.id.Boton_9:
                    screen.setText(SaveNum + "9");
                    break;
                case R.id.Boton_punto:
                    if (!decimal) {
                        screen.setText(SaveNum + ".");
                        decimal = true;
                    } else {
                        return;
                    }

                    break;

                case R.id.Boton_Suma:
                    suma = true;
                    number[0] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.Boton_Resta:
                    resta = true;
                    number[0] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.Boton_Multiplicacion:
                    multiplicacion = true;
                    number[0] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.Boton_Division:
                    division = true;
                    number[0] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.Boton_Potencia:
                    potencia = true;
                    number[0] = Double.parseDouble(SaveNum);
                    number[1] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    resultado = Math.pow(number[0],number[1]);
                    screen.setText(String.valueOf(resultado));
                    decimal = false;
                    break;
                case R.id.Boton_Raiz:
                    number[0] = Double.parseDouble(SaveNum);
                    screen.setText("");
                    resultado = Math.sqrt(number[0]);
                    decimal = false;
                    break;



                case R.id.Boton_Resultado:
                    number[1] = Double.parseDouble(SaveNum);
                    if (suma) {
                        resultado = number[0] + number[1];
                        screen.setText(String.valueOf(resultado));
                    }
                    else if (resta){
                        resultado = number[0] - number[1];
                        screen.setText(String.valueOf(resultado));
                    }
                    else if (multiplicacion){
                        resultado = number[0] * number[1];
                        screen.setText(String.valueOf(resultado));
                    }
                    else if (division){
                        resultado = number[0] / number[1];
                        screen.setText(String.valueOf(resultado));
                    }
                    else if (potencia){
                        screen.setText(String.valueOf(resultado));
                    }
                    else if (raiz){
                        resultado = number[0] / number[1];
                        screen.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    break;

                case R.id.Boton_Eliminar_Numero:
                    screen.setText(SaveNum);
                    break;
                case R.id.Boton_Eliminar_Todo:
                    screen.setText("");
                    decimal = false;
                    break;
                case R.id.Boton_Parabola:
                    Intent v2 = new Intent(this,Parabola.class);
                    startActivity(v2);
                    break;
                case R.id.Boton_Recta:
                    Intent v3 = new Intent(this,Recta.class);
                    startActivity(v3);
                    break;

            }

        } catch  (Exception e) {
            screen.setText("Error");}
    }
}

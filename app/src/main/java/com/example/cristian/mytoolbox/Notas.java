package com.example.cristian.mytoolbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Notas extends AppCompatActivity implements View.OnClickListener {

    TextView nt1, nt2, nt3, nt4, nt5, nt6, nt7, nt8;
    EditText ct1, ct2, ct3, ct4, ct5, ct6, ct7, ct8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        nt1=(TextView)findViewById(R.id.nota1);
        ct1=(EditText)findViewById(R.id.Edit1);
        nt1.setOnClickListener(this);
        ct1.setEnabled(false);

        nt2=(TextView)findViewById(R.id.nota2);
        ct2=(EditText)findViewById(R.id.Edit2);
        nt2.setOnClickListener(this);
        ct2.setEnabled(false);

        nt3=(TextView)findViewById(R.id.nota3);
        ct3=(EditText)findViewById(R.id.Edit3);
        nt3.setOnClickListener(this);
        ct3.setEnabled(false);

        nt4=(TextView)findViewById(R.id.nota4);
        ct4=(EditText)findViewById(R.id.Edit4);
        nt4.setOnClickListener(this);
        ct4.setEnabled(false);


        nt5=(TextView)findViewById(R.id.nota5);
        ct5=(EditText)findViewById(R.id.Edit5);
        nt5.setOnClickListener(this);
        ct5.setEnabled(false);


        nt6=(TextView)findViewById(R.id.nota6);
        ct6=(EditText)findViewById(R.id.Edit6);
        nt6.setOnClickListener(this);
        ct6.setEnabled(false);


        nt7=(TextView)findViewById(R.id.nota7);
        ct7=(EditText)findViewById(R.id.Edit7);
        nt7.setOnClickListener(this);
        ct7.setEnabled(false);


        nt8=(TextView)findViewById(R.id.nota8);
        ct8=(EditText)findViewById(R.id.Edit8);
        nt8.setOnClickListener(this);
        ct8.setEnabled(false);

    }

    @Override
    public void onClick(View view) {

        Intent v2 = new Intent(this,Nota.class);

        int select = view.getId();
        try {
            switch (select) {

                case R.id.nota1:
                    startActivity(v2);
                    break;

                case R.id.Edit1:
                    startActivity(v2);
                    break;

                case R.id.nota2:
                    startActivity(v2);
                    break;

                case R.id.Edit2:
                    startActivity(v2);
                    break;

                case R.id.nota3:
                    startActivity(v2);
                    break;

                case R.id.Edit3:
                    startActivity(v2);
                    break;

                case R.id.nota4:
                    startActivity(v2);
                    break;

                case R.id.Edit4:
                    startActivity(v2);
                    break;

                case R.id.nota5:
                    startActivity(v2);
                    break;

                case R.id.Edit5:
                    startActivity(v2);
                    break;

                case R.id.nota6:
                    startActivity(v2);
                    break;

                case R.id.Edit6:
                    startActivity(v2);
                    break;

                case R.id.nota7:
                    startActivity(v2);
                    break;

                case R.id.Edit7:
                    startActivity(v2);
                    break;

                case R.id.nota8:
                    startActivity(v2);
                    break;

                case R.id.Edit8:
                    startActivity(v2);
                    break;

            }

        } catch  (Exception e) {
            Toast.makeText(getApplicationContext(),"Ha ocurrido un error",Toast.LENGTH_SHORT).show();}
    }
}

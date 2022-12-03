package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        resultado=findViewById(R.id.resultado);
    }
    public void suma(View view){
        int n1 = Integer.valueOf(num1.getText().toString());
        int n2 = Integer.valueOf(num2.getText().toString());

        int res=n1+n2;
        resultado.setText(""+res);

    }
    public void resta(View view){
        int n1 = Integer.valueOf(num1.getText().toString());
        int n2 = Integer.valueOf(num2.getText().toString());

        int res=n1-n2;
        resultado.setText(""+res);

    }
    public void division(View view){
        int n1 = Integer.valueOf(num1.getText().toString());
        int n2 = Integer.valueOf(num2.getText().toString());

        int res=n1/n2;
        resultado.setText(""+res);

    }
    public void multiplica(View view){
        int n1 = Integer.valueOf(num1.getText().toString());
        int n2 = Integer.valueOf(num2.getText().toString());

        int res=n1*n2;
        resultado.setText(""+res);

    }
    public void limpiar(View view) {
        num1.setText("");
        num2.setText("");
        resultado.setText("");
    }
}
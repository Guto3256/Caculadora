package com.example.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView texto;
    private Double resultado = 0.00;
    private String textoantigo;
    private String textonovo;
    private Double novoresultado;
    private String op = "";
    private String ultimoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = (TextView) findViewById(R.id.lblResultado);
    }

    public void resultado(Double resultado, String op){
        if(texto.getText() == ""){
        }else{
            novoresultado = Double.parseDouble(texto.getText().toString());
            if(op == "+"){
                resultado = resultado + novoresultado;
            }
            if(op == "-"){
                resultado = resultado - novoresultado;
            }
            if(op == "*"){
                resultado = resultado * novoresultado;
            }
            if(op == "/"){
                resultado = resultado / novoresultado;
            }
            texto.setText(resultado.toString());
            resultado = 0.00;
            System.out.println(resultado);
        }
    }

    public void clicouBtn(String num){
        if(ultimoBtn == "+" || ultimoBtn == "*" || ultimoBtn == "-" || ultimoBtn == "/"){
            texto.setText("");
        }
        textoantigo = texto.getText().toString();
        textonovo = textoantigo+num;
        texto.setText(textonovo);
        ultimoBtn = num;
    }


    public void onClickBtn(View v){
        int id = v.getId();

        switch (id){
            case R.id.button0:
                clicouBtn("0");
            break;

            case R.id.button1:
                clicouBtn("1");
            break;

            case R.id.button2:
                clicouBtn("2");
            break;

            case R.id.button3:
                clicouBtn("3");
            break;

            case R.id.button4:
                clicouBtn("4");
            break;

            case R.id.button5:
                clicouBtn("5");
            break;

            case R.id.button6:
                clicouBtn("6");
            break;

            case R.id.button7:
                clicouBtn("7");
            break;

            case R.id.button8:
                clicouBtn("8");
            break;

            case R.id.button9:
                clicouBtn("9");
            break;

            case R.id.buttonSoma:
                if(op != "" && op != "entrar"){
                    this.resultado(resultado, op);
                }
                if(texto.getText() == ""){
                }else {
                    novoresultado = Double.parseDouble(texto.getText().toString());
                    resultado = resultado + novoresultado;
                    texto.setText("");
                    System.out.println(resultado);
                    op = "+";
                    ultimoBtn = op;
                    if(resultado != 0.00){
                        texto.setText(resultado.toString());
                    }
                }
            break;

            case R.id.buttonSubtracao:
                if(op != "" && op != "entrar"){
                    this.resultado(resultado, op);
                }
                if(texto.getText() == ""){
                }else{
                    novoresultado = Double.parseDouble(texto.getText().toString());
                    resultado = novoresultado - resultado;
                    texto.setText("");
                    System.out.println(resultado);
                    op = "-";
                    ultimoBtn = op;
                    if(resultado != 0.00){
                        texto.setText(resultado.toString());
                    }
                }
            break;

            case R.id.buttonVezes:
                if(op != "" && op != "entrar"){
                    this.resultado(resultado, op);
                }
                if(texto.getText() == ""){
                }else{
                    resultado = Double.parseDouble(texto.getText().toString());
                    texto.setText("");
                    System.out.println(resultado);
                    op = "*";
                    ultimoBtn = op;
                    if(resultado != 0.00){
                        texto.setText(resultado.toString());
                    }
                }
            break;

            case R.id.buttonDividir:
                if(op != "" && op != "entrar"){
                    this.resultado(resultado, op);
                }
                if(texto.getText() == ""){
                }else{
                    resultado = Double.parseDouble(texto.getText().toString());
                    texto.setText("");
                    System.out.println(resultado);
                    op = "/";
                    ultimoBtn = op;
                    if(resultado != 0.00){
                        texto.setText(resultado.toString());
                    }
                }
            break;

            case R.id.buttonLimpar:
                texto.setText("");
                resultado = 0.00;
                ultimoBtn = "";
                op = "";
                System.out.println(resultado);
            break;

            case R.id.buttonEntrar:
                this.resultado(resultado, op);
                ultimoBtn = "entrar";
                op = "entrar";
            break;
        }
    }
}

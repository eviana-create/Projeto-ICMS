package com.empresalogistica.icms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdittextEstado;
    private EditText mEdittextValor;
    private TextView mTextViewPorcentagem;
    private TextView mTextViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdittextEstado = findViewById(R.id.EditTextEstado);
        mEdittextValor = findViewById(R.id.EditTextValor);
        mTextViewPorcentagem = findViewById(R.id.textViewPorcentagem);
        mTextViewTotal = findViewById(R.id.textViewTotal);
    }

        public void calcular(View view){
            String estado = mEdittextEstado.getText().toString();

            String valorString = mEdittextValor.getText().toString();
            float valor = Float.parseFloat(valorString);

            float porcentagem = 0;
            switch (estado) {
                case "RO":
                    porcentagem = 17.5f;
                 break;
                case "SP":
                    porcentagem = 18;
                 break;
        }
            float total = valor + (valor * porcentagem/100);

            mTextViewPorcentagem.setText(String.valueOf(porcentagem) + "%");
            mTextViewTotal.setText(String.format("R$ % 2f", total));
        }

}
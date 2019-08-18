package br.edu.unifcv.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalcular;
    private EditText edtValor;

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        edtValor = findViewById(R.id.edtValor);

        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCalcular:
                double valor = Double.valueOf(edtValor.getText().toString());
                double total = valor * 2.00;
                txtResultado.setText(String.valueOf(total));
                break;
        }
    }
}

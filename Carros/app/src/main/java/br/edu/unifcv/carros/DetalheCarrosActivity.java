package br.edu.unifcv.carros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetalheCarrosActivity extends AppCompatActivity {

    private CarroModel mCarro;
    private ImageView imgCarro;
    private TextView textModelo;
    private TextView textFabricante;
    private TextView textPotencia;
    private TextView textPreco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_carros);

        this.imgCarro = this.findViewById(R.id.img_detalhe_carro);
        this.textModelo = this.findViewById(R.id.text_detalhe_modelo);
        this.textFabricante = this.findViewById(R.id.text_detalhe_fabricante);
        this.textPotencia = this.findViewById(R.id.text_detalhe_potencia);
        this.textPreco = this.findViewById(R.id.text_detalhe_preco);


        Bundle bundle = getIntent().getExtras();

        CarroMock carroMock = new CarroMock(this);

        if (bundle != null) {
            this.mCarro = carroMock.getCarro(bundle.getInt(CarroConstants.CARRO_ID));
        }

        if (this.mCarro != null) {
            this.imgCarro.setImageDrawable(this.mCarro.getImagem());
            this.textModelo.setText(this.mCarro.getModelo());
            this.textFabricante.setText(this.mCarro.getFabricante());
            this.textPotencia.setText(String.valueOf(this.mCarro.getPotencia()));
            this.textPreco.setText("R$ " + String.valueOf(this.mCarro.getPreco()));
        }
    }
}

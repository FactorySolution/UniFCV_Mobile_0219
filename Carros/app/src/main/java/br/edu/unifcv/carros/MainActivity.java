package br.edu.unifcv.carros;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lista;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);

        CarroMock mock = new CarroMock(this);

        List<CarroModel> mCarros = mock.getCarrosList();

        this.mContext = this;

        onClickViewListener onClickViewListener = new onClickViewListener() {
            @Override
            public void click(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarroConstants.CARRO_ID, id);
                Intent i = new Intent(mContext, DetalheCarrosActivity.class);
                i.putExtras(bundle);
                startActivity(i);

            }
        };

        CarroAdapter carroAdapter = new CarroAdapter(mCarros, onClickViewListener);
        lista.setAdapter(carroAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        lista.setLayoutManager(linearLayoutManager);

    }
}

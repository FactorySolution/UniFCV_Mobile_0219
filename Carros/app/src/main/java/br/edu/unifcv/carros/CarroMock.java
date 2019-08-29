package br.edu.unifcv.carros;

import java.util.ArrayList;
import java.util.List;

public class CarroMock {

    private List<CarroModel> mCarros;

    public CarroMock() {
        mCarros = new ArrayList<>();

        for (int i = 0; i < 99; i++) {
            mCarros.add(new CarroModel(i + 1, String.valueOf(i)));
        }
    }

    public List<CarroModel> getCarrosList() {
        return this.mCarros;
    }

    public CarroModel getCarro(int index) {
        return mCarros.get(index);


    }
}

package br.edu.unifcv.carros;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class CarroMock {

    private List<CarroModel> mMockList;

    public CarroMock(Activity activity) {
        mMockList = new ArrayList<>();
        int id = 0;
        CarroModel audiR8 = new CarroModel(id, "Audi R8", "Audi", 610, Double.valueOf(1165338.00), ContextCompat.getDrawable(activity, R.drawable.audir8));
        mMockList.add(audiR8);
        CarroModel bugattiChiron = new CarroModel(++id, "Bugatti Chiron", "Bugatti", 1520, Double.valueOf(1000000.00), ContextCompat.getDrawable(activity, R.drawable.bugattichiron));
        mMockList.add(bugattiChiron);
        CarroModel civicTypeR = new CarroModel(++id, "Civic Type R", "Honda", 310, Double.valueOf(136000.00), ContextCompat.getDrawable(activity, R.drawable.civictyper));
        mMockList.add(civicTypeR);
        CarroModel corolla = new CarroModel(++id, "Corolla", "Toyota", 144, Double.valueOf(101000.00), ContextCompat.getDrawable(activity, R.drawable.corolla));
        mMockList.add(corolla);
        CarroModel ferrari458Italia = new CarroModel(++id, "Ferrari 458 Itália", "Ferrari", 670, Double.valueOf(1500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrari458));
        mMockList.add(ferrari458Italia);
        CarroModel ferrariF60America = new CarroModel(++id, "Ferrari F60 América", "Ferrari", 700, Double.valueOf(2500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrarif60america));
        mMockList.add(ferrariF60America);
        CarroModel jaguarFTypeCoupe = new CarroModel(++id, "Jaguar F-Type Coupe", "Jaguar", 340, Double.valueOf(500000.00), ContextCompat.getDrawable(activity, R.drawable.jaguarftype));
        mMockList.add(jaguarFTypeCoupe);
        CarroModel jeepRenegade = new CarroModel(++id, "Jeep Renegade", "Jeep", 139, Double.valueOf(79000.00), ContextCompat.getDrawable(activity, R.drawable.jeeprenegade));
        mMockList.add(jeepRenegade);
        CarroModel lamborghiniAventador = new CarroModel(++id, "Lamborghini Aventador", "Lamborghini", 700, Double.valueOf(2800000.00), ContextCompat.getDrawable(activity, R.drawable.lamborghiniaventador));
        mMockList.add(lamborghiniAventador);
        CarroModel mcLarenMP412C = new CarroModel(++id, "McLaren MP4-12C", "McLaren", 625, Double.valueOf(2200000.00), ContextCompat.getDrawable(activity, R.drawable.mclarenmp412c));
        mMockList.add(mcLarenMP412C);
        CarroModel mustang = new CarroModel(++id, "Mustang", "Ford", 533, Double.valueOf(270000.00), ContextCompat.getDrawable(activity, R.drawable.mustang));
        mMockList.add(mustang);
        CarroModel porsche911 = new CarroModel(++id, "Porsche 911", "Porsche", 435, Double.valueOf(509000.00), ContextCompat.getDrawable(activity, R.drawable.porsche911));
        mMockList.add(porsche911);
        CarroModel rangeRoverEvoque = new CarroModel(++id, "Range Rover Evoque", "Range Rover", 285, Double.valueOf(224000.00), ContextCompat.getDrawable(activity, R.drawable.rangerover));
        mMockList.add(rangeRoverEvoque);
        CarroModel vanquish = new CarroModel(++id, "Vanquish", "Aston Martin", 573, Double.valueOf(1850000.00), ContextCompat.getDrawable(activity, R.drawable.vanquish));
        mMockList.add(vanquish);


    }

    public List<CarroModel> getCarrosList() {
        return this.mMockList;
    }

    public CarroModel getCarro(int index) {
        return mMockList.get(index);


    }
}

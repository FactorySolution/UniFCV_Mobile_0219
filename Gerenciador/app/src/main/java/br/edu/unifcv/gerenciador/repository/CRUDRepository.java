package br.edu.unifcv.gerenciador.repository;

import java.util.List;

public interface CRUDRepository<T> {

    List<T> getAll();

    T getByID(int ID);

    void save(T object);


}

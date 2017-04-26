package com.rr.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {

    T getById(int id);

    T add(T domain);

    void update(T domain);

    void delete(int id);

    List<T> getAll();

}
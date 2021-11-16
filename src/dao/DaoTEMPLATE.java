/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author scdel
 * @param <T>
 */
public interface DaoTEMPLATE<T> {
    void insertInto(T t);
    T findById(int id);
    List<T> findAll();
    boolean delete(int id);
    
}

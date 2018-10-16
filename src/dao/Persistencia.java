/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author linux
 */
public interface Persistencia<T> {
    
    public int insert(T obj);
    public boolean update(T obj);
    public boolean delete(T obj);
    public List<T> select();
    public T findByCodigo(int codigo);
    
}

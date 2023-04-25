/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.awt.List;


/**
 *
 * @author u71661414176
 */
public abstract class DAO_Abstract {
    public abstract void insert(Object object);
    public abstract void update();
    public abstract void delete();
    public abstract Object list(int id);
    public abstract List listaAll();
    
}

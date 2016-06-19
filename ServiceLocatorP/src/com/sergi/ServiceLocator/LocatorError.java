/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

/**
 *
 * @author Sergi Cervera
 */
public class LocatorError extends Exception{

    public LocatorError(ClassCastException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    LocatorError(String msg) {
        super(msg);
    }
    
}

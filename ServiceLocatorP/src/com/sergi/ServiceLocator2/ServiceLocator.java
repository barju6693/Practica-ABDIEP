/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

/**
 *
 * @author F1_1_
 */
public class ServiceLocator implements IServiceLocator{

    @Override
    public <T> void setService(Class<T> klass, Factory<T> factory) throws LocatorError {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> void setConstant(Class<T> klass, T value) throws LocatorError {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T> T getObject(Class<T> klass) throws LocatorError {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
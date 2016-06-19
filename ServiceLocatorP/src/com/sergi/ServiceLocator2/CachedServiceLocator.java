/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

import java.util.HashMap;

/**
 *
 * @author F1_1_
 */
public class CachedServiceLocator<T> implements ServiceLocator{

    HashMap<Class, Object> map = new HashMap<Class, Object>();
    
    @Override
    public <T> void setService(Class<T> klass, Factory<T> factory) throws LocatorError {
        if(map.containsKey(klass)) throw new LocatorError("Exist");
        else map.put(klass, factory);
    }

    @Override
    public <T> void setConstant(Class<T> klass, T value) throws LocatorError {
        if(map.containsKey(klass)) throw new LocatorError("Exist");
        else map.put(klass, value);
    }

    @Override
    public <T> T getObject(Class<T> klass) throws LocatorError {
        if(map.containsKey(klass)){
            return (T) map.get(klass);
        }
        else{
            throw new LocatorError("Not found");
        }
    }
    
}

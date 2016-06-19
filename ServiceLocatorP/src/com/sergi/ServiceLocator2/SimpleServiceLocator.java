/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

import java.util.HashMap;

/**
 *
 * @author Sergi Cervera
 */
public class SimpleServiceLocator<T> implements ServiceLocator{

    static HashMap<Class, Object> map = new HashMap<Class, Object>();
    static HashMap<Class, Factory> mapF = new HashMap<Class, Factory>();
    
    @Override
    public <T> void setService(Class<T> klass, Factory<T> factory) throws LocatorError {
        if(mapF.containsKey(klass)) throw new LocatorError("Exist");
        else mapF.put(klass, factory);
    }

    @Override
    public <T> void setConstant(Class<T> klass, T value) throws LocatorError {
        if(map.containsKey(klass)) throw new LocatorError("Exist");
        else map.put(klass, value);
    }

    @Override
    public <T> T getObject(Class<T> klass) throws LocatorError {
        if (mapF.containsKey(klass)) {
            //Factory f = mapF.get(name);
            
            switch (klass) {
                case "A":
                    return new FactoryA1();
                case "B":
                    return new FactoryB1();
                case "C":
                    return new FactoryC1();
                case "D":
                    return new FactoryD1();
            }
        }
        else if (map.containsKey(klass)){
            return map.get(klass);
        }
        else{
            throw new LocatorError("Not found");
        }
        return null;
    }
    }
    
}

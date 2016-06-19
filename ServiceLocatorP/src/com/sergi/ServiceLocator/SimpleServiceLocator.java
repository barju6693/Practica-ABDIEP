/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import java.util.HashMap;

/**
 *
 * @author Sergi Cervera
 */
public class SimpleServiceLocator implements ServiceLocator{
    Object name = new String();
    Object value;
    static HashMap<String, Object> map = new HashMap<String, Object>();
    static HashMap<String, Factory> mapF = new HashMap<String, Factory>();

    @Override
    public void setService(String name, Factory factory) {
        this.name = name;
        this.value = factory;

        mapF.put(name, factory);
    }

    @Override
    public void setConstant(String name, Object value) {
        this.name = name;
        this.value = value;

        map.put(name, value);
    }

    @Override
    public Object getObject(String name) throws LocatorError {
        if (mapF.containsKey(name)) {
            //Factory f = mapF.get(name);
            switch (name) {
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
        return map.get(name);
    }
}

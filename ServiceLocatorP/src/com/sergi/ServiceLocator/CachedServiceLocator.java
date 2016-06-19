/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import static com.sergi.ServiceLocator.SimpleServiceLocator.map;
import java.util.HashMap;

/**
 *
 * @author Sergi Cervera
 */
public class CachedServiceLocator implements ServiceLocator{
    Object name = new String();
    Object value;
    static HashMap<String, Object> map = new HashMap<String, Object>();

    @Override
    public void setService(String name, Factory factory) throws LocatorError {
        if(map.containsKey(name)) throw new LocatorError("Exist");
        else map.put(name, factory);
    }

    @Override
    public void setConstant(String name, Object value) throws LocatorError {
        if(map.containsKey(name)) throw new LocatorError("Exist");
        else map.put(name, value);
    }

    @Override
    public Object getObject(String name) throws LocatorError {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            throw new LocatorError("Not found");
        }
    }
}

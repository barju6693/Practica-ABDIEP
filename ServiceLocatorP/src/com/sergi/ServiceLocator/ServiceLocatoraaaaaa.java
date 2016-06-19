/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Sergi Cervera
 */
public class ServiceLocatoraaaaaa implements ServiceLocator{
    Object name = new String();
    Object value;
    static HashMap<String, Object> map = new HashMap<String, Object>();

    @Override
    public void setService(String name, Factory factory) {
        this.name = name;
        this.value = factory;

        map.put(name, factory);
    }

    @Override
    public void setConstant(String name, Object value) {
        this.name = name;
        this.value = value;

        map.put(name, value);
    }

    @Override
    public Object getObject(String name) throws LocatorError {
        if (map.containsKey(name)) {
            return map.get(name);
        } else {
            throw new LocatorError("msg");
        }
    }
}

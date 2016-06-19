/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

import servicelocatorp.*;

/**
 *
 * @author F1_1_
 */
public class FactoryD1<T> implements Factory<InterfaceD>{

    @Override
    public InterfaceD create(ServiceLocator sl) throws LocatorError {
        int i = (int) sl.getObject("i");
        sl.setConstant(klass, i);
        return new ImplementationD1(i);
    }
    
}

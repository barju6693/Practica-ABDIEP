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
public class FactoryB1<T> implements Factory<InterfaceB>{
    @Override
    public InterfaceB create (ServiceLocator sl) throws LocatorError{
        InterfaceD d = sl.getObject(InterfaceD.class);
        return new ImplementationB1(d);
    }
}

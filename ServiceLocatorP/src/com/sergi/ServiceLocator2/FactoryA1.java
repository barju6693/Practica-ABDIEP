/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

import servicelocatorp.*;

/**
 *
 * @author Sergi Cervera
 */
public class FactoryA1<T> implements Factory<InterfaceA>{
    public InterfaceA create(ServiceLocator sl) throws LocatorError {
        InterfaceB b = sl.getObject(InterfaceB.class);
        InterfaceC c = sl.getObject(InterfaceC.class);
        return new ImplementationA1(b, c);
    }
}

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
public class FactoryC1 implements Factory<InterfaceC>{
    @Override
    public InterfaceC create (ServiceLocator sl) throws LocatorError{
        String c
        
        //InterfaceD d = sl.getObject(InterfaceD.class);
        return new ImplementationB1(d);
    }
}

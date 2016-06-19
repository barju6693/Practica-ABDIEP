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
public class FactoryC1<T> implements Factory<InterfaceC>{
    @Override
    public InterfaceC create (ServiceLocator sl) throws LocatorError{
        String c = (String) sl.getObject(String.class);
        return new ImplementationC1(c);
    }
}

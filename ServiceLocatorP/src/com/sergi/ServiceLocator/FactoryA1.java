/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import com.sergi.ServiceLocator.Factory;
import com.sergi.ServiceLocator.LocatorError;
import com.sergi.ServiceLocator.ServiceLocatoraaaaaa;
import servicelocatorp.*;

/**
 *
 * @author Sergi Cervera
 */
public class FactoryA1 implements Factory {

    @Override
    public InterfaceA create(ServiceLocator sl) throws LocatorError {
        try {
            InterfaceB b = (InterfaceB) sl.getObject("B");
            InterfaceC c = (InterfaceC) sl.getObject("C");
            sl.setService("A", this);
            return new ImplementationA1(b, c);
        } catch (ClassCastException ex) {
            throw new LocatorError(ex);
        }
    }
}

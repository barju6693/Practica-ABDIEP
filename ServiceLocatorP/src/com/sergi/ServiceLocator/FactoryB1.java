/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import com.sergi.ServiceLocator.Factory;
import com.sergi.ServiceLocator.LocatorError;
import com.sergi.ServiceLocator.ServiceLocator;
import servicelocatorp.*;

/**
 *
 * @author Sergi Cervera
 */
public class FactoryB1 implements Factory {

    @Override
    public InterfaceB create(ServiceLocator sl) throws LocatorError {
        try {
            InterfaceD d = (InterfaceD) sl.getObject("D");
            sl.setService("B", this);
            return new ImplementationB1(d);
        } catch (ClassCastException ex) {
            throw new LocatorError(ex);
        }
    }
}

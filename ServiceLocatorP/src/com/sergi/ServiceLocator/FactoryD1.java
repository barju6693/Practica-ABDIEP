/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import com.sergi.ServiceLocator.Factory;
import com.sergi.ServiceLocator.LocatorError;
import servicelocatorp.*;

/**
 *
 * @author Sergi Cervera
 */
public class FactoryD1 implements Factory {

    @Override
    public InterfaceD create(ServiceLocator sl) throws LocatorError {
        try {
            int d = (int)sl.getObject("D");
            return new ImplementationD1(d);
        } catch (ClassCastException ex) {
            throw new LocatorError(ex);
        }
    }
}

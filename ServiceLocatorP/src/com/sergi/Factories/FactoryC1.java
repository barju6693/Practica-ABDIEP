/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.Factories;

import com.sergi.ServiceLocator.Factory;
import com.sergi.ServiceLocator.LocatorError;
import com.sergi.ServiceLocator.ServiceLocator;
import servicelocatorp.*;

/**
 *
 * @author Sergi Cervera
 */
public class FactoryC1 implements Factory {

    @Override
    public InterfaceC create(ServiceLocator sl) throws LocatorError {
        try {
            //InterfaceC c = (InterfaceC) sl.getObject("C"); //CREC QUE NO ESTA BÉ; JA QUE AQUEST ES L'ULTIM NIVELL, NO DEPEN D'ALTRES INTERFICIES
            sl.setService("C", this);
            sl.setConstant("Hola", this);
            return new ImplementationC1(new String("HOLA"));
        } catch (ClassCastException ex) {
            throw new LocatorError(ex);
        }
    }
}

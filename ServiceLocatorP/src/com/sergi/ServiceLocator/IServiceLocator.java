/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

/**
 *
 * @author Sergi Cervera
 */
public interface IServiceLocator {
    void setService(String	name,	Factory	factory) throws	LocatorError;
	void setConstant(String	name,	Object	value) throws LocatorError;	
	Object getObject(String	name) throws LocatorError;
}

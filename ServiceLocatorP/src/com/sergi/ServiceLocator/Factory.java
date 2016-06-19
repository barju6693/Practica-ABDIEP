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
public interface Factory {
    Object create(ServiceLocator sl) throws LocatorError;
}

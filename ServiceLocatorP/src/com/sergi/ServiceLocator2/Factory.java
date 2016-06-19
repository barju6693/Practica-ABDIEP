/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

/**
 *
 * @author Sergi Cervera
 */
public interface Factory<T> {
    T create(ServiceLocator sl) throws LocatorError;
}

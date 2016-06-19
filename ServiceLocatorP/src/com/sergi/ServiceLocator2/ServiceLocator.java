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
public interface ServiceLocator {
    <T> void setService(Class<T> klass, Factory<T> factory) throws LocatorError;
    <T> void setConstant(Class<T> klass, T value) throws LocatorError;
    <T> T getObject(Class<T> klass)throws LocatorError;
}

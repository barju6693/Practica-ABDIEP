/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author F1_1_
 */
public class SimpleServiceLocatorTest {
    
    public SimpleServiceLocatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetService() throws Exception {
        System.out.println("setService");
        String name = "";
        Factory factory = null;
        SimpleServiceLocator instance = new SimpleServiceLocator();
        instance.setService(name, factory);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetConstant() throws Exception {
        System.out.println("setConstant");
        String name = "";
        Object value = null;
        SimpleServiceLocator instance = new SimpleServiceLocator();
        instance.setConstant(name, value);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        String name = "";
        SimpleServiceLocator instance = new SimpleServiceLocator();
        Object expResult = null;
        Object result = instance.getObject(name);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

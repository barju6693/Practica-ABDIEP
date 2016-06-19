/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sergi.ServiceLocator2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergi Cervera
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
        SimpleServiceLocator instance = new SimpleServiceLocator();
        instance.setService(null);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetConstant() throws Exception {
        System.out.println("setConstant");
        SimpleServiceLocator instance = new SimpleServiceLocator();
        instance.setConstant(null);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        SimpleServiceLocator instance = new SimpleServiceLocator();
        Object expResult = null;
        Object result = instance.getObject(null);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

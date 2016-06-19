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
 * @author F1_1_
 */
public class CachedServiceLocatorTest {
    
    public CachedServiceLocatorTest() {
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
        CachedServiceLocator instance = new CachedServiceLocator();
        instance.setService(null);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetConstant() throws Exception {
        System.out.println("setConstant");
        CachedServiceLocator instance = new CachedServiceLocator();
        instance.setConstant(null);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        CachedServiceLocator instance = new CachedServiceLocator();
        Object expResult = null;
        Object result = instance.getObject(null);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}

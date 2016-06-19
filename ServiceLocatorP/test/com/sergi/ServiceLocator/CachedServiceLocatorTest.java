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
import servicelocatorp.*;

/**
 *
 * @author F1_1_
 */
public class CachedServiceLocatorTest {
    
    ServiceLocator sl = new CachedServiceLocator();
    
    public CachedServiceLocatorTest() { 
    }
    
    @Before
    public void setUp() {
        try{
            sl.setService("B",new FactoryB1());
            sl.setService("C",new FactoryC1());
            sl.setService("D",new FactoryD1());
            sl.setConstant("i", 10);
            sl.setConstant("S","string");
        }catch(Exception e){
            fail("Exception in setUp!");
        }
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSetServiceConstant() throws Exception {
        System.out.println("setServiceConstant");
        assertTrue(sl.getObject("D") instanceof ImplementationD1);
    }
    
    @Test
    public void testSetServiceFactory() throws Exception{
        System.out.println("setServiceFactory");
        Factory B1 = new FactoryB1();
        sl.setService("Hello", B1);
        assertNotEquals(sl.getObject("Hello"),B1);     
    }

    @Test
    public void testSetConstant() throws Exception {
        System.out.println("setConstant");
        String name = "V";
        Object value = "valor";
        sl.setConstant(name, value);
        assertEquals(value, sl.getObject("V"));
    }

    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        String name = "i";
        Object expResult = 10;
        Object result = sl.getObject(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetObjectI() throws Exception{
        System.out.println("getObjectI");
        String name = "i";
        Object result = sl.getObject(name);
        assertTrue(result instanceof Integer);
        
    }
}

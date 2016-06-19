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
 * @author Sergi Cervera
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
            sl.setConstant("int", 66);
            sl.setConstant("str","string");
        }catch(Exception e){
            fail("Exception in setUp!");
        }
    }
    
    @After
    public void tearDown() {
    }
    
        @Test
    public void testServiceInstance() throws Exception{
        System.out.println("serviceInstance");
        assertTrue(sl.getObject("B") instanceof ImplementationB1);
    }
    
    @Test
    public void testSetConstantString() throws Exception {
        System.out.println("setConstantString");
        String name = "str2";
        Object value = "string2";
        sl.setConstant(name, value);
        assertEquals(value, sl.getObject("str2"));
    }
    
    @Test
    public void testSetServiceFactory() throws Exception{
        System.out.println("setServiceFactory");
        Factory B1 = new FactoryB1();
        sl.setService("Hello", B1);
        assertNotEquals(sl.getObject("Hello"),B1);     
    }

    

    @Test
    public void testGetObject() throws Exception {
        System.out.println("getObject");
        String name = "i";
        Object comp = 66;
        Object value = sl.getObject(name);
        assertEquals(comp, value);
    }
    
    @Test
    public void testGetObjectInstance() throws Exception{
        System.out.println("getObjectInstance");
        String name = "int";
        Object result = sl.getObject(name);
        assertTrue(result instanceof Integer);
        
    }
}

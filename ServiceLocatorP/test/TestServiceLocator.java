
import com.sergi.ServiceLocator.CachedServiceLocator;
import com.sergi.ServiceLocator.Factory;
import com.sergi.ServiceLocator.FactoryC1;
import com.sergi.ServiceLocator.LocatorError;
import com.sergi.ServiceLocator.ServiceLocator;
import com.sergi.ServiceLocator.SimpleServiceLocator;
import org.junit.Test;
import servicelocatorp.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_1_
 */
public class TestServiceLocator {
    
    @Test
    public void createA(){
        
    }
    
    @Test
    public void createB(){
        
    }
    
    @Test (expected = LocatorError.class)
    public void createC(){
        ServiceLocator sl = new CachedServiceLocator();
        sl.setConstant("C", "hola");
        Factory c = new FactoryC1();
        c.create(sl);
    }
    
    @Test (expected = LocatorError.class)
    public void createD(){
        InterfaceD d = new ImplementationD1(3);
        ServiceLocator sl = new SimpleServiceLocator();
        sl.setConstant("D", d);
    }
}

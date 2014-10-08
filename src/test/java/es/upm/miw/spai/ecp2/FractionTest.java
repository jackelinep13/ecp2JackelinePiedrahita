package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.ecp2.Fraction;

public class FractionTest {
 private Fraction pt, pt2; 
  
  
    @Before 
    public void before() { 
        pt = new Fraction(5, 2); 
        pt2 = new Fraction(5, 1); 
    }


    @Test 
    public void testNumeradorInt() { 
        assertEquals(5, pt.getNumerator()); 
    }

    @Test 
    public void testDenominadorInt() { 
        assertEquals(2, pt.getDenominator()); 
    }

 
    @Test 
    public void testDecimal() { 
        assertEquals(2.5, pt.decimal(), 10e-5); 
    } 
    
    @Test 
    public void testIsMenor() { 
        assertEquals(true, pt.isMenor(pt2)); 
    } 
    
    @Test 
    public void testIsPropia() { 
        pt = new Fraction(2, 3);
    	pt2 = new Fraction(4,3);
        assertEquals(true, pt.isPropia());
        assertEquals(false, pt2.isPropia());
    } 
    
    

    
  
}

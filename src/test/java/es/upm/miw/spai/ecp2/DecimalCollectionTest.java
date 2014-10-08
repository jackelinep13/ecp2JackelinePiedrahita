package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

	private DecimalCollection dc;

    @Before
    public void before() {
        dc = new DecimalCollection();
        dc.add(2.5);
    	dc.add(3.5);
    	dc.add(2.6);
    }

    @Test
    public void testAdd() {
    	assertEquals(3, dc.size());
    }
    
    @Test
    public void testSum() {
    	assertEquals(8.6, dc.sum(), 0);
    }
    
    @Test
    public void tesHigher() {
    	assertEquals(3.5, dc.higher(), 0);
    }
    
    @Test
    public void tesMultiplicarCollection() {
    	assertEquals(22.75, dc.multiplicarCollection(), 0);
    }
	
	
    
}

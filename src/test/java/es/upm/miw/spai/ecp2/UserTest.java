
package es.upm.miw.spai.ecp2;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
public class UserTest {
 private User pt; 
  
 @Before
    public void before() {
        pt = new User(2, "Ana", "Morales");
    }
  
 @Test
    public void testUser() {
        assertEquals(2, pt.getNumber());
        assertEquals("Ana", pt.getName());
        assertEquals("Morales", pt.getFamilyName());
    }
 @Test
    public void testNumber() {
        assertEquals(2, pt.getNumber());
    }
 
 @Test
 public void testFullName() {
     assertEquals("Ana Morales",pt.fullName());
 }
 
 @Test
    public void testName() {
        assertEquals("Ana", pt.getName());
    }
 
 @Test
    public void testFamilyName() {
  assertEquals("Morales", pt.getFamilyName());
    }
 
 @Test
    public void testInitials() {
  assertEquals("A.", pt.initials());
    }
  
}
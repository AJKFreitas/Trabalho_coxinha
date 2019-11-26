package test;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 *
 * @author mviniciusmarques
 */
public class AssertTrueTest {
  
  @Test
  public void testAssertTrue() {
    assertTrue("O parâmetro deve ser true", true);  
  }  

    private void assertTrue(String o_parâmetro_deve_ser_true, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

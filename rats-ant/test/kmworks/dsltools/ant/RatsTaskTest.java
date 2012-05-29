package kmworks.dsltools.ant;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author cpl
 */
public class RatsTaskTest {
  
  public RatsTaskTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  /*
   * Generate parser for EBNF.rats with same parameters as given in the kmworks-dsltools build file
   */
  @Test
  public void testExecute() {
    RatsTask rats = new RatsTask();
    rats.setFile(new File("P:\\KMW_RATSLAB\\svn\\product\\kmworks-dsltools\\src\\kmworks\\dsltools\\ebnf\\EBNF.rats"));
    rats.setRoot(new File("P:\\KMW_RATSLAB\\svn\\product\\kmworks-dsltools\\src\\kmworks\\dsltools"));
    rats.setOptions("verbose");
    rats.execute();
  }
}

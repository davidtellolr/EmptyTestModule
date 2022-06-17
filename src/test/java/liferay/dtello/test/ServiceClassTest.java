package liferay.dtello.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceClassTest {

	   @Before
	   public void setUp() {
	   }
	   @Test
	   public void testToStringKo() {
	      String fullName = this.toString();

	      Assert.assertEquals("Keyser Söze", fullName);
	   }

	   @Test
	   public void testToStringOk() {
	      String fullName = this.toString();

	      Assert.assertEquals(fullName, fullName);
	   }

	}
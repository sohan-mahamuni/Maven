package com.myproject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void testlogin() {
		App myapp = new App();
		Assert.assertEquals(0,myapp.user_Login("Sohan", "sohan174"));
	}
	
	  @Test
	  public void testlogin1() {
		  App myapp = new App();
		  Assert.assertEquals(0,myapp.user_Login("Sohan", "sohan174"));
		  
	  }
}

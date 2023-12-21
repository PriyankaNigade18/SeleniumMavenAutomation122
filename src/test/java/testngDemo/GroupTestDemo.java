package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTestDemo
{
  @Test(priority=1,groups ="SmokeTest")
  public void verifyUrl() 
  {
	  System.out.println("Url Test:This is smoke test case");
  }
  
  
  @Test(priority=2,groups ="SmokeTest")
  public void verifylink() 
  {
	  System.out.println("Link Test: This is smoke test case");
  }
  
  @Test(priority=3,groups ="FunctionalTest")
  public void verifyLogin() 
  {
	  System.out.println("LoginTest: This is Functional test case");
  }
  
  @Test(priority=4,groups ="FunctionalTest")
  public void verifyTitle() 
  {
	  System.out.println("TitleTest: This is Functional test case");
  }
  
  @Test(priority=5,groups ="FunctionalTest")
  public void verifyLogout() 
  {
	  System.out.println("Logout Test: This is Functional test case");
  }
  
}

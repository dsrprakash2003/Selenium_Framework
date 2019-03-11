package com.training.sanity.tests;

import org.testng.annotations.Test;

public class OrderSequenceTest {
	
  @Test(dependsOnMethods="register")
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void register() {
	  System.out.println("register");
  }
  @Test
  public void home() {
	  System.out.println("home");
	  
	  
  }
  @Test(dependsOnMethods="home")
  public void begin() {
	  System.out.println("begin");
}
}
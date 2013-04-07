package com.tw;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;


@Test
public class ParallelTest {

	@Test(invocationCount = 10)
  	public void parallelTest1() throws InterruptedException{
		Thread.sleep(300);
		assertTrue(true);    
  	}

  	@Test(invocationCount = 6)
  	public void parallelTest2() throws InterruptedException{
		Thread.sleep(200);
		assertTrue(true);    
  	}

  	@Test(invocationCount = 5)
  	public void parallelTest3() throws InterruptedException{
		Thread.sleep(200);
		assertTrue(true);    
  	}

  	@Test(invocationCount = 4)
  	public void parallelTest4() throws InterruptedException{
		Thread.sleep(300);
		assertTrue(true);    
  	}
}
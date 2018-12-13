package com.zcz.maven;

import junit.framework.Assert;
import org.junit.Test;
import com.zcz.maven.HelloMaven;

public class HelloTest {
	
	@Test
	public void testHello() {
		HelloMaven he=new HelloMaven();
		String name=he.Hello("Daniel");
		
		Assert.assertEquals("Daniel", name);
	}
}

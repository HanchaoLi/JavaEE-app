package xdclass.springboot.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;
import net.xdclass.demo.XdclassApplication;

@RunWith(SpringRunner.class) // use SpringJUnit4ClassRunner under layer
@SpringBootTest(classes = {XdclassApplication.class}) // start whole project
public class SpringBootTestDemo {

	@Test
	public void testOne() {
		System.out.println("hello");
		TestCase.assertEquals(1, 1);
	}
	
	@Before
	public void testBefore() {
		System.out.println("before");
	}
	
	@After
	public void testAfter() {
		System.out.println("After");
	}
}

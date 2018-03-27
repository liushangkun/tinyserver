package tinyserver;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import tinyserver.mapper.MyMapper;

/**
 * @author lsk
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ApplicationConfig.class)
public class MyTests {
	
	@Autowired
	private MyMapper myMapper;
	
	@Test
	public void testEnv() {
		Assert.assertNotNull(myMapper);
	}

}

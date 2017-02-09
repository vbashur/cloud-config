package com.vbashur.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Lab3ServerApplication.class)
@SpringBootApplication(scanBasePackages = "com.vbashur.cloud")
public class Lab3ServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}

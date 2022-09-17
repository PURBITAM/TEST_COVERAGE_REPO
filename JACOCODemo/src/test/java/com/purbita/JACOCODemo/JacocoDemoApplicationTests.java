package com.purbita.JACOCODemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JacocoDemoApplicationTests {

	JacocoDemoApplication jacocoDemoApplication = new JacocoDemoApplication();
	
	@Test
	void startTest() {
		assertEquals("start", jacocoDemoApplication.start());
	}

}

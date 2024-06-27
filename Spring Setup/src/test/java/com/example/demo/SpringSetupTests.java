package com.example.demo;//import package from the project itself
import org.junit.jupiter.api.Test;//This is needed for the JVM to understand we will be testing
// Tells the JVM that well will be specifically testing a spring app
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest//tells the JVM the following code will be tested within the next class
class SpringSetupTests {

	@Test//code block that will be tested
	void contextLoads() {
	}

}

//This organizes the classes into namespaces.
package com.example.demo;
//libraries for the spring framework to function properly
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //tells the JVM to point to the spring application
@RestController //used to create restfull web services

public class SpringSetup {

public static void main(String[] args) {//main program
	//tells the JVM to run the spring application in the main program
		SpringApplication.run(SpringSetup.class, args);
	}
	@GetMapping("/Welcome") //annotation for mapping HTTP GET requests on certain handler methods
	//request param is used to directly access and extract individual request parameters.
	//One does not need to handle a whole request body

	// the code below takes the String "hello" then, combines that with the "name" of the user from the website
	public String Hello(@RequestParam(value = "name", defaultValue = "name") String name){
	return String.format("Welcome %s!", name + "!");
			}
}

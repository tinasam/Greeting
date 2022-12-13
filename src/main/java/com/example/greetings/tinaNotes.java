package com.example.greetings;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


// what we need to run the application


// how do we add endpoints
  // what kind of endpoints can we add?

// NOTE:
	// a SQL dependency has been added to the application to connect to a db.... in the future
	// currently we do NOT have a database, nor want to connect to one
	// we need to add a temporary annotation to ignore the dependency



//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@RestController
//public class tinaNotes {
////		private ArrayList<String> greetings = new ArrayList<>();
//	private ArrayList<com.example.greeting.model.Greeting> greetings = new ArrayList<>();
//
//	public static void main(String[] args) {
//		SpringApplication.run(tinaNotes.class, args);
//	}

	// to create an endpooint we need
	  // an annotation to detail
	     // the location of the endpoint and,
		// the associated HTTP method
		// a method that runs when the endpoint is "hit"
			// when a requests is made to that endpoint


	// extra to the controller
//	@GetMapping("/welcome")
//	public String sayHi() {
//		return "Welcome to Springboot!";
//	}

	// path variables and request parameters
	  // Why is this needed?
	  // Pass info on GET requests, from the client (REACT) to the server (Spring Boot)

	// CHALLENGE: add two more endpoints
		// one for getting a greeting by ID
//	@GetMapping("/greeting/{id}")
//	public String getGreetingById(@PathVariable String id) {
//		return "this is a greeting by ID: " + id;
//	}


//GET ROUTE
//	@GetMapping("/greeting/{user}/{date}")
//	public String getGreetingById(@PathVariable String user date) {
//		return "this is a greeting by ID: " + user/date;
//	}
		// one for saying "Hello" back to someone
//	@GetMapping("/Hello")
//	public String sayHello() {
//		return "Hello My Friend!";
//	}


//		// looks for a query sign, an ?, and reads from after that
//	@GetMapping("/greeting")
//	public String getCustomGreeting(@RequestParam String name) {
//		return "Hello " + name;
//	}

	// on the browser - to see results type http://localhost:8080/greeting?name=Fred

// INDEX ROUTE (get all)
//	@GetMapping("/listGreeting")
//	public String getListGreeting() {
//		ArrayList<String>ArrGreeting = new ArrayList<>(List.of("Hello","GoodMorning", "How are you"));
//		return "Welcome My Friend! " +ArrGreeting;
//	}
	// should use this to see greeting - http://localhost:8080/greeting?greeting=Hello

	// CHALLENGE
//	@GetMapping("random")
//	public String getRandomGreeting() {
//		//example
//		// could be shortened
//		Random random = new Random();
//		String randomGreeting = greetings.get(r.nextInt(greetings.size()));
//		return randomGreeting;
//	}

//
//@PutMapping("/greetings/{id}")
//	public String updateGreeting(@PathVariable int id, @RequestBody String newGreeting) {
//		String greeting = greetings.get(id);
//		change the greeting with the new information
	// set the greeting back into the list
//		greetings.set(id, newGreeting);
//		return newGreeting;
//		}


//@DeleteMapping("/greetings/{id}")
//	public String deleteGreeting(@PathVariable String id) {
//		greetings.remove(id);
//		return "Greeting with id: " +id + " deleted.";
//	}

//}



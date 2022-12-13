package com.example.greetings;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.time.LocalDateTime;


@SpringBootApplication
//@RestController()
public class GreetingApplication {
//    private ArrayList<Greeting> greetings = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(GreetingApplication.class, args);
    }

    // extra to the controller
//    @GetMapping("/welcome")
//    public String sayHi() {
//        return "Welcome to the server side!!";
//    }

    // GET route
//	@GetMapping("/greetings/{id}")
//	public String getGreetingById(@PathVariable int id) {
//	  return greetings.get(id);
//	}

    // INDEX route (GET ALL)
//	@GetMapping("/greetings")
//	public List<String> getGreetings() {
//		return greetings;
//	}

    // CREATE route
//    @PostMapping("/greetings")
//    public String createGreeting(@RequestBody Greeting greeting) {

        // set the greetings id based on the greetings list
//        greeting.setId(greetings.size() +1);
//
//        // set the created by
//        greeting.setCreatedBy("Tina");
//
//        // set the created at timestamp
//        greeting.setDateCreated(new Timestamp(System.currentTimeMillis()));
//
//        greetings.add(greeting);
//        return greeting + " added";
//    }

    // CHALLENGE (extra to the controller)
//	@GetMapping("/random")
//	public String getRandomGreeting() {
//		// example
//		// could be shortened
//		Random r = new Random();
//		String randomGreeting = greetings.get(r.nextInt(greetings.size()));
//
//		return randomGreeting;
//	}

    // UPDATE route
//	@PutMapping("/greetings/{id}")
//	public String updateGreeting(@PathVariable int id, @RequestBody String newGreeting) {
//		// change the greeting with the new info
//		// set the greeting back into the list
//		greetings.set(id, newGreeting);
//		return newGreeting;
//	}

    // DELETE route
//	@DeleteMapping("/greetings/{id}")
//	public String deleteGreeting(@PathVariable int id) {
//		greetings.remove(greetings.get(id));
//		return "Greeting with id: " + id + " deleted.";
//	}

}

package com.example.greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.example.greetings.model.Greeting;

import static java.lang.Integer.parseInt;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GreetingController {

    private ArrayList<Greeting> greetings = new ArrayList<>();

   // dependency injection
      // avoids the need to make a new instance
    @Autowired
    GreetingRepository repository;

    @GetMapping("/greeting/{id}")
    public ResponseEntity<Optional<Greeting>> getGreetingById(@PathVariable String id) {
//        return greetings.stream()
//                .filter(greeting -> greeting.getId() == parseInt(id))
//                .findFirst()
//                .orElse(null);

        //ResponseEntity
          // configure the entire response using this
             // .status() configure the status code we receive
        return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
    }

    //This goes back to the database to retrieve all the greetings
    @GetMapping("/greetings")
    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    @GetMapping("/random")
    public ResponseEntity<Greeting> getRandomGreeting() {

        List<Greeting> allGreetings = repository.findAll();
        // refactor to get random greeting from database, not greetings array
            // .count to find the number of entries in the repository
//        int index = 1 + r.nextInt((int) (repository.count()));
        Random r = new Random();
//        return repository.findById(index);
            // .findAll (already written above) - gets all the existing greetings
        Greeting randomGreeting = allGreetings.get(r.nextInt(allGreetings.size()));
        return  ResponseEntity.status(HttpStatus.OK).body(randomGreeting);
    }

    @PostMapping("/greetings")
    public ResponseEntity<String> createGreeting(@RequestBody Greeting greeting) {
        // set the greetings id based on the greetings list
        // set the created by
        // greeting.setId(greetings.size() + 1);
       // greeting.setCreatedBy("Ollie");
        //greeting.setDateCreated(new Timestamp(System.currentTimeMillis()));
        repository.save(greeting);
        return ResponseEntity.status(HttpStatus.CREATED).body("Greeting added: " + greeting.getGreeting());
    }

    // UPDATE route
    @PutMapping("/greetings/{id}")
    public String updateFullGreeting(@PathVariable int id, @RequestBody com.example.greetings.model.Greeting newGreeting){
        com.example.greetings.model.Greeting updatedGreeting = greetings.get(id);
        updatedGreeting.setGreeting(newGreeting.getGreeting());
        updatedGreeting.setCreatedBy(newGreeting.getCreatedBy());
        updatedGreeting.setOriginCountry(newGreeting.getGreeting());
        return "Greeting with id: " + id + "changed to" + newGreeting;
    }

    // DELETE route
    @DeleteMapping("/greetings/{id}")
    public String deleteGreeting(@PathVariable int id) {
        repository.deleteById(Integer.toString(id));
//        return "Greeting with id: " + id + " deleted.";
        repository.delete(repository.findById(id));

        return "Greeting with id: " + id + " deleted";
    }

}

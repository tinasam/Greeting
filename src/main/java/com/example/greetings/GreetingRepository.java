package com.example.greetings;

import com.example.greetings.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


        //Repository - add database layer
//           |
//      CRUDRepository - CREATE READ UPDATE DELETE
//          |
//      JpaRepository - Java Persistance API
// We have access to all the CRUD operations inherited from CRUD Repository


// interaction from the database happens from here
@Repository
public interface GreetingRepository extends JpaRepository<Greeting, String> {
// we have access to build in methods like save() for POST, findAll for GET
    // We can also write our own custom methods (later)
      //Jpa will parse the names of these custom methods to look for "find" "by"
    Greeting findByid(int id);
        // find - look for something
        // By - the condition of what is being searched or looke for
        // id - the variable

}

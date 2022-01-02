package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Actor;

@RestController
public class ProducerController {

	@GetMapping("/wel")
	public ResponseEntity<?> welcome() {
		System.out.println("I am inside the welcome method");
		return new ResponseEntity<String>("welcome chandu", HttpStatus.CREATED);
	}

	@GetMapping("/hello")
	public ResponseEntity<?> hello() {
		System.out.println("I am inside the hello()");
		return new ResponseEntity<String>("hello chandu", HttpStatus.CREATED);
	}

	@GetMapping("/hai")
	public ResponseEntity<?> hai() {
		System.out.println("I am inside the hai()");
		return new ResponseEntity<String>("hi chandu", HttpStatus.CREATED);
	}

	@GetMapping("/dwm/{name}/{id}")
	public ResponseEntity<String> displaywithMsg(@PathVariable("name") String name, @PathVariable("id") Integer id) {
		System.out.println("I am in the displaywithmsh()>>avilable in producer class");
		return new ResponseEntity<String>("i am using 2 params", HttpStatus.CREATED);
	}

	@PostMapping("/save")
	public ResponseEntity<?> saveData(@RequestBody Actor actor) {
		return new ResponseEntity<String>(actor.toString(), HttpStatus.CREATED);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Actor> searchActor(@PathVariable("id") Integer id) {
		System.out.println("I am inside the 	@GetMapping(\"/find/{id}\")   of---->  searchActor()");
		return new ResponseEntity<Actor>(new Actor(121, "chandu velagapudi", 25, "Good"), HttpStatus.CREATED);

	}

	@GetMapping("/findall")
	public ResponseEntity<List<Actor>> searchallActors() {
		System.out.println("I am inside the 	@GetMapping(\"/find/{id}\")   of---->  searchallActors()");
		  ArrayList<Actor> arrayList = new ArrayList<>();
		  arrayList.add(new Actor(121, "chandu", 22, "Hero"));
		  arrayList.add(new Actor(122, "siva", 33, "Villan"));
		  arrayList.add(new Actor(123, "ramcharan", 34, "Comedian"));
		  arrayList.add(new Actor(124, "ntr", 39, "S-a"));
		  arrayList.add(new Actor(125, "balaya", 60, "Hero"));
		  arrayList.add(new Actor(126, "srikanth", 18, "Heroin"));
		  arrayList.add(new Actor(127, "naveen",48, "Hero"));
		return new ResponseEntity<List<Actor>>(arrayList,HttpStatus.OK);
	}
	
}

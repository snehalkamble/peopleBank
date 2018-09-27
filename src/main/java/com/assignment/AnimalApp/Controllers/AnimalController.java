package com.assignment.AnimalApp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.AnimalApp.Helper.AnimalHelper;

@RestController
public class AnimalController {

	@Autowired
	AnimalHelper animalHelper;
	
	@RequestMapping(
	value="/animal",
	method=RequestMethod.GET)
	public ResponseEntity<?> getAnimal(@RequestParam(value="type", required=true) String type) {
		try {
			return new ResponseEntity<List<String>>(animalHelper.getAnimalBehavior(type), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Animal not found", HttpStatus.NOT_FOUND);
		}
	}
}

package com.javaTraining.firstApplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaTraining.firstApplication.Service.ReelsService;
import com.javaTraining.firstApplication.models.Reels;

@RestController
@RequestMapping("/reels")  //localhost:8080/reels
public class ReelsController {

	@Autowired
	ReelsService reelsService;

	@GetMapping()
	public List<Reels> getAllReels() {
		return reelsService.getReels();
	}
	
	@GetMapping("/{id}")
	public Reels getSingleReel(@PathVariable int id) {
		return reelsService.getReel(id);	
	}
	
	@GetMapping("/create")
	public String createReelsDummy() {
		return "Dude i'm coming from the Get Method Reels Created Successfully";
	}
	
	@PostMapping("/create")
	public String createReels() {
		return reelsService.createReels();
	}
	
	@PatchMapping("/edit")
	public String editReels() {
		return "Reels Edited Successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteReels() {
		return "Reels Deleted Successfully";
	}
	
}

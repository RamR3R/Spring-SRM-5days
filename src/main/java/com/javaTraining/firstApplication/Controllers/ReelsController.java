package com.javaTraining.firstApplication.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaTraining.firstApplication.DTO.ReelsPatchDTO;
import com.javaTraining.firstApplication.Service.ReelsService;
import com.javaTraining.firstApplication.models.Reels;

@RestController
@RequestMapping("/reels")  //localhost:8080/reels
public class ReelsController {

	@Autowired
	ReelsService reelsService;

	@GetMapping("/get")
	public List<Reels> getAllReels() {
		return reelsService.getAllReels();
	}
	
	@GetMapping("/get/{id}")
	public Reels getSingleReel(@PathVariable int id) {
		return reelsService.getOneReel(id);	
	}
	
	@PostMapping("/create")
	public Reels createReels(@RequestBody Reels x) {
		return reelsService.createReel(x);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteReels(@PathVariable int id) {
		return reelsService.deleteReels(id);
	}
	
	@PatchMapping("/edit/{xyz}")
	public Reels editReels(@PathVariable int xyz ,@RequestBody ReelsPatchDTO ram) {
		return reelsService.updateReel(xyz, ram);
	}
	
	@DeleteMapping("/delete")
	public String deleteReels() {
		return "Reels Deleted Successfully";
	}
	
}

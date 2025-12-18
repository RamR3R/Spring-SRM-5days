package com.javaTraining.firstApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTraining.firstApplication.Repositories.ReelsRepository;
import com.javaTraining.firstApplication.models.Reels;

@Service
public class ReelsService {
	
	@Autowired
	ReelsRepository repo;
	
	public List<Reels> getReels()
	{
		return repo.findAll();
	}
	
	public Reels getReel(int id)
	{
		return repo.getById(id);
	}
	
	public String createReels()
	{
		Reels newReels = new Reels(1,"Ram is Coding" , 10);
		repo.save(newReels);
		return "Reels created";
	}
	
}

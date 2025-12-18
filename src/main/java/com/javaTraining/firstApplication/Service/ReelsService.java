package com.javaTraining.firstApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTraining.firstApplication.Repositories.ReelsRepository;
import com.javaTraining.firstApplication.models.Reels;

@Service
public class ReelsService {
	
	@Autowired
	ReelsRepository x;
	
	public List<Reels> getAllReels(){
		return x.findAll();
	}
	
	public Reels getOneReel(int id) {
		return x.getById(id);
	}
	
	public Reels createReel(Reels reelFromReq) {
		return x.save(reelFromReq);
	}
	
	public String deleteReels(int id) {
		x.deleteById(id);
		return "Reels Deleted Successfully";
	}
	
}

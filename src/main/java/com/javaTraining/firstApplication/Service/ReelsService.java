package com.javaTraining.firstApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaTraining.firstApplication.DTO.ReelsPatchDTO;
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
	
	public Reels updateReel(int id , ReelsPatchDTO newData)
	{
		Reels obj = x.getById(id);
		
		if(newData.getId() != null)
			obj.setId(newData.getId());
		
		if(newData.getLikes() != null)
			obj.setLikes(newData.getLikes());
		
		if(newData.getReelsData() != null)
			obj.setReelsData(newData.getReelsData());
		
		return x.save(obj);
	}
	
	public String deleteReels(int id) {
		x.deleteById(id);
		return "Reels Deleted Successfully";
	}
	
}

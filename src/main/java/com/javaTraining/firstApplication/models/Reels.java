package com.javaTraining.firstApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reelsDa")
public class Reels {
	
	@Id
	private int id; 
	private String reelsData;
	private int likes;
	
	public Reels() {}
	
	public Reels(int id , String reelsData , int likes)
	{
		this.id = id;
		this.reelsData = reelsData;
		this.likes = likes;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReelsData() {
		return reelsData;
	}
	public void setReelsData(String reelsData) {
		this.reelsData = reelsData;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
	
	
	
}

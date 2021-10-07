package com.xowrkz.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xowrkz.practice.entity.Technology;
import com.xowrkz.practice.repository.TechnologyRepository;

@Service
public class TechnologyService {

	@Autowired
	private TechnologyRepository technologyRepository;

	public List<Technology> getAllTechnology() {
		List<Technology> technologies = new ArrayList<>();
		technologyRepository.findAll().forEach(technologies::add);
		return technologies;
	}
	
	public Technology getTechnology(int id) {	
		return technologyRepository.findById(id).get();
	}
	
	public void addTechnology(Technology technology)
	{
		technologyRepository.save(technology);
	}
	
	public void updateTechnology(Technology technology,int id) {
		technologyRepository.save(technology);
	}
	
	public void deleteTechnology(int id) {
		technologyRepository.deleteById(id);
	}
}

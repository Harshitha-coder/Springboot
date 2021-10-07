package com.xowrkz.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xowrkz.practice.entity.Technology;
import com.xowrkz.practice.service.TechnologyService;

@RestController
public class TechnologyController {

	@Autowired
	private TechnologyService technologyService;

	@RequestMapping("/technologies")
	public List<Technology> getAllTechnology() {
		return technologyService.getAllTechnology();
	}

	@RequestMapping("/technologies/{id}")
	public Technology getTechnology(@PathVariable int id) {
		return technologyService.getTechnology(id);
	}

	@RequestMapping(value = "/technologies", method = RequestMethod.POST)
	public void addTechnology(@RequestBody Technology technology) {
		technologyService.addTechnology(technology);
	}

	@RequestMapping(value = "/technologies/{id}", method = RequestMethod.PUT)
	public void updateTechnology(Technology technology,@PathVariable int id) {
		technologyService.updateTechnology(technology, id);
	}

	@RequestMapping(value = "/technologies/{id}", method = RequestMethod.DELETE)
	public void deleteTechnology(@PathVariable int id) {
		technologyService.deleteTechnology(id);
	}
}

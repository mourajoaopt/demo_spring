package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.MasterRepository;
import com.example.demo.model.Master;

@RestController
@RequestMapping("/Master")
public class ControllerMaster {

	@Autowired
	private MasterRepository masterRepository;

	@GetMapping
	public List<Master> Listar() {

		System.out.println("adiciona lista Master Repository" +masterRepository.count());

		return masterRepository.findAll();


	}
	@PostMapping
	public Master addicionar (@RequestBody Master master) {


		return masterRepository.save(master);


	}	



}

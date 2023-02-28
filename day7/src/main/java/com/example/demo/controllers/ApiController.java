package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepo;

@RestController
@RequestMapping("/car")
public class ApiController 
{
	@Autowired
	CarRepo repository;
	
	@PostMapping("")
	public boolean add(@RequestBody Car car)
	{
		repository.save(car);
		return true;
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> getCarByOwners(@PathVariable int owners)
	{
		return repository.findCarByOwners(owners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getCarByAddress(@PathVariable String address)
	{
		return repository.findCarByAddress(address);
	}
	
	@GetMapping("/carName/{carName}")
	public List<Car> getCarByCarName(@PathVariable String carName)
	{
		return repository.findCarByCarName(carName);
	}
	
	@GetMapping("/owners/{owners}/carType/{carType}")
	public List<Car> getCarByOwnersAndCarType(@PathVariable int owners,@PathVariable String carType)
	{
		return repository.findCarByOwnersAndCarType(owners, carType);
	}
}

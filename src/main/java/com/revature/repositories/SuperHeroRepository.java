package com.revature.repositories;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.revature.models.SuperHero;
import com.revature.models.SuperPower;

@Repository
public class SuperHeroRepository {

	private static Map<String, SuperHero> heroes = new HashMap<>();
	
	static {
		SuperHero superman = new SuperHero();
		superman.setName("Superman");
		superman.setPowerLevel(1000);
		superman.setSuperPower(SuperPower.SUPER_STRENGTH);
		superman.setWeakness(SuperPower.MIND_READER);
		heroes.put("superman", superman);
		
		SuperHero professorX = new SuperHero();
		professorX.setName("professor X");
		professorX.setPowerLevel(2000);
		professorX.setSuperPower(SuperPower.MIND_READER);
		professorX.setWeakness(SuperPower.SUPER_STRENGTH);
		heroes.put("professorX", professorX);
	}
	
	public SuperHero findSuperHeroByName(String name) {
		return heroes.get(name);
	}
	
	
}

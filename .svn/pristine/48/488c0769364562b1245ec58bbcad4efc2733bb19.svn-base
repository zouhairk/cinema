package com.ibformation.cinema2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ibformation.cinema2.service.CinemaService;

@RestController()
public class Cinema {
	@Autowired
	CinemaService cinemaService;

	
	@GetMapping("/cinema")
	public ModelAndView cinema() {
		System.out.println("getmapine");
		ModelAndView mav = new ModelAndView("cinema");
		mav.addObject("cinemas", cinemaService.findAll());
		mav.addObject("cinemaBySalleId",cinemaService.findBySalleId(1));
		mav.addObject("cinemaByFilmId",cinemaService.findBySalleId(2));
		return mav;
	}
}

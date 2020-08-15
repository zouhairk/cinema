package com.ibformation.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.cinema.bo.Cinema;

public interface CinemaDao extends CrudRepository<Cinema, Integer> {

}

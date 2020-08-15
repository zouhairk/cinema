package com.ibformation.cinema.dao;

import org.springframework.data.repository.CrudRepository;

import com.ibformation.cinema.bo.Seance;

public interface SeanceDao extends CrudRepository<Seance, Integer> {

}

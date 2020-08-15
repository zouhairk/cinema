package com.ibformation.cinema2.bo;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Seance implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 4867889923618905726L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate date;
	private Time heureDepart;
	@ManyToOne
	@JoinColumn()
	private Film film;
	@ManyToOne
	private Salle salle;
}

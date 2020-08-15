package com.ibformation.cinema2.bo;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Salle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -646050463630344605L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int id;
	private int capacite;
	private String numero;
	@ManyToOne
	private Cinema cinema;
	@OneToMany(mappedBy = "salle",fetch = FetchType.LAZY)
	private Set<Seance> seances=new HashSet<>();

	public Salle(int capacite, String numero, Cinema cinema) {
		super();
		this.capacite = capacite;
		this.numero = numero;
		this.cinema = cinema;
	}

	public Salle(int id) {
		super();
		this.id = id;
	}

}

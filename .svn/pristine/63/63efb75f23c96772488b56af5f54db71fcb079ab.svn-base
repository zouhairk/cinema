package com.ibformation.bo;
 
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "salle", catalog = "cinema")
@Data
@NoArgsConstructor
public class Salle implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6531317452063576290L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Salle", unique = true, nullable = false)
	private Integer idSalle;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Cinema")
	private Cinema cinema;

	@Column(name = "numero_Salle", length = 50)
	private String numeroSalle;

	@Column(name = "capacite_Salle")
	private Integer capaciteSalle;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salle")
	private Set<Programmer> programmers = new HashSet<>(0);

	public Salle(Cinema cinema, String numeroSalle, Integer capaciteSalle, Set<Programmer> programmers) {
		this.cinema = cinema;
		this.numeroSalle = numeroSalle;
		this.capaciteSalle = capaciteSalle;
		this.programmers = programmers;
	}

}

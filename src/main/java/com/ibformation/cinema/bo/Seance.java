package com.ibformation.cinema.bo;
 
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "seance", catalog = "cinema")
@Data
@NoArgsConstructor
public class Seance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8133162885092926837L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Seance", unique = true, nullable = false)
	private Integer idSeance;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_heure_depart_Seance", nullable = false, length = 19)
	private Date dateHeureDepartSeance;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_heure_fin_Seance", nullable = false, length = 19)
	private Date dateHeureFinSeance;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	private Set<Reservation> reservations = new HashSet<>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "seance")
	private Set<Programmer> programmers = new HashSet<>(0);

	public Seance(Date dateHeureDepartSeance, Date dateHeureFinSeance) {
		this.dateHeureDepartSeance = dateHeureDepartSeance;
		this.dateHeureFinSeance = dateHeureFinSeance;
	}

	public Seance(Date dateHeureDepartSeance, Date dateHeureFinSeance, Set<Reservation> reservations, Set<Programmer> programmers) {
		this.dateHeureDepartSeance = dateHeureDepartSeance;
		this.dateHeureFinSeance = dateHeureFinSeance;
		this.reservations = reservations;
		this.programmers = programmers;
	}

}

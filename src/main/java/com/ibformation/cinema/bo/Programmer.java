package com.ibformation.cinema.bo;
// Generated 24 juil. 2020 11:44:02 by Hibernate Tools 5.1.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "programmer", catalog = "cinema")
@Data
@NoArgsConstructor
public class Programmer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5262028383309093372L;

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idFilm", column = @Column(name = "id_Film", nullable = false)),
		@AttributeOverride(name = "idSeance", column = @Column(name = "id_Seance", nullable = false)),
		@AttributeOverride(name = "idSalle", column = @Column(name = "id_Salle", nullable = false)) })
	private ProgrammerId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Film", nullable = false, insertable = false, updatable = false)
	private Film film;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Salle", nullable = false, insertable = false, updatable = false)
	private Salle salle;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Seance", nullable = false, insertable = false, updatable = false)
	private Seance seance;

	public Programmer(ProgrammerId id, Film film, Salle salle, Seance seance) {
		this.id = id;
		this.film = film;
		this.salle = salle;
		this.seance = seance;
	}

}

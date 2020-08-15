package com.ibformation.cinema.bo;
 
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
@Table(name = "reservation", catalog = "cinema")
@Data
@NoArgsConstructor
public class Reservation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4119872939176200152L;

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "idCompte", column = @Column(name = "id_Compte", nullable = false)),
		@AttributeOverride(name = "idSeance", column = @Column(name = "id_Seance", nullable = false)) })
	private ReservationId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Compte", nullable = false, insertable = false, updatable = false)
	private Compte compte;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Seance", nullable = false, insertable = false, updatable = false)
	private Seance seance;

	@Column(name = "nombre_place_reserver_Reservation")
	private Integer nombrePlaceReserverReservation;

	public Reservation(ReservationId id, Compte compte, Seance seance) {
		this.id = id;
		this.compte = compte;
		this.seance = seance;
	}

	public Reservation(ReservationId id, Compte compte, Seance seance, Integer nombrePlaceReserverReservation) {
		this.id = id;
		this.compte = compte;
		this.seance = seance;
		this.nombrePlaceReserverReservation = nombrePlaceReserverReservation;
	}

}

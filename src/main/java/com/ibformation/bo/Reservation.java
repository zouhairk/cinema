package com.ibformation.bo;
 
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 
@Entity
@Table(name = "reservation", catalog = "cinema")
public class Reservation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2229003723825591084L;
	
	private ReservationId id;
	private Compte compte;
	private Programmer programmer;
	private Integer nombrePlaceReserverReservation;

	public Reservation() {
	}

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

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idCompte", column = @Column(name = "id_Compte", nullable = false)),
			@AttributeOverride(name = "idSeance", column = @Column(name = "id_Seance", nullable = false)) })
	public ReservationId getId() {
		return this.id;
	}

	public void setId(ReservationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Compte", nullable = false, insertable = false, updatable = false)
	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Programmer", nullable = false, insertable = false, updatable = false)
	public Seance getSeance() {
		return this.seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	@Column(name = "nombre_place_reserver_Reservation")
	public Integer getNombrePlaceReserverReservation() {
		return this.nombrePlaceReserverReservation;
	}

	public void setNombrePlaceReserverReservation(Integer nombrePlaceReserverReservation) {
		this.nombrePlaceReserverReservation = nombrePlaceReserverReservation;
	}

}

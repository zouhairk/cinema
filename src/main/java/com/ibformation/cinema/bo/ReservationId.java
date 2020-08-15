package com.ibformation.cinema.bo;
 
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Embeddable
@Data
@NoArgsConstructor
public class ReservationId implements java.io.Serializable {

	@Column(name = "id_Compte", nullable = false)
	private int idCompte;

	@Column(name = "id_Seance", nullable = false)
	private int idSeance;

	public ReservationId(int idCompte, int idSeance) {
		this.idCompte = idCompte;
		this.idSeance = idSeance;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReservationId))
			return false;
		ReservationId castOther = (ReservationId) other;

		return (this.getIdCompte() == castOther.getIdCompte()) && (this.getIdSeance() == castOther.getIdSeance());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdCompte();
		result = 37 * result + this.getIdSeance();
		return result;
	}

}

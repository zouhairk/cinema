package com.ibformation.cinema.bo;
 
import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Embeddable
@Data
@NoArgsConstructor
public class ProgrammerId implements java.io.Serializable {

	@Column(name = "id_Film", nullable = false)
	private int idFilm;

	@Column(name = "id_Seance", nullable = false)
	private int idSeance;
	
	@Column(name = "id_Salle", nullable = false)
	private int idSalle;

	public ProgrammerId(int idFilm, int idSeance, int idSalle) {
		this.idFilm = idFilm;
		this.idSeance = idSeance;
		this.idSalle = idSalle;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProgrammerId))
			return false;
		ProgrammerId castOther = (ProgrammerId) other;

		return (this.getIdFilm() == castOther.getIdFilm()) && (this.getIdSeance() == castOther.getIdSeance())
				&& (this.getIdSalle() == castOther.getIdSalle());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdFilm();
		result = 37 * result + this.getIdSeance();
		result = 37 * result + this.getIdSalle();
		return result;
	}

}

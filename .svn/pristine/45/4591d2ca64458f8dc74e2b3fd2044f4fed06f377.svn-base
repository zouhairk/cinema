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
@Table(name = "adresse", catalog = "cinema")
@Data
@NoArgsConstructor
public class Adresse implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2111199517336484721L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Adresse", unique = true, nullable = false)
	private Integer idAdresse;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cinema_id_cinema")
	private Cinema cinema;

	@Column(name = "rue_Adresse", length = 100)

	private String rueAdresse;

	@Column(name = "ville_Adresse", length = 100)
	private String villeAdresse;

	@Column(name = "pays_Adresse", length = 100)
	private String paysAdresse;

	@Column(name = "code_postal_Adresse", length = 10)
	private String codePostalAdresse;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "adresse")
	private Set<Cinema> cinemas = new HashSet<>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "adresse")
	private Set<Compte> comptes = new HashSet<>(0);

	public Adresse(Cinema cinema, String rueAdresse, String villeAdresse, String paysAdresse, String codePostalAdresse,
			Set<Cinema> cinemas, Set<Compte> comptes) {
		this.cinema = cinema;
		this.rueAdresse = rueAdresse;
		this.villeAdresse = villeAdresse;
		this.paysAdresse = paysAdresse;
		this.codePostalAdresse = codePostalAdresse;
		this.cinemas = cinemas;
		this.comptes = comptes;
	}

}

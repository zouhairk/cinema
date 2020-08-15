package com.ibformation.cinema.bo;
 
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "compte", catalog = "cinema")
@Data
@NoArgsConstructor
public class Compte implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8251193616837371248L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Compte", unique = true, nullable = false)
	private Integer idCompte;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_Adresse")
	private Adresse adresse;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "carte_fid_id_carte_fid")
	private CarteFid carteFid;
	
	@Column(name = "nom_Compte", length = 50)
	private String nomCompte;
	
	@Column(name = "prenom_Compte", length = 50)
	private String prenomCompte;
	
	@Column(name = "email_Compte", length = 100)
	private String emailCompte;
	
	@Column(name = "motspasse_Compte", length = 65535)
	private String motspasseCompte;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "avoir_compte_role", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Compte", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Role", nullable = false, updatable = false) })
	private Set<Role> roles = new HashSet<>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compte")
	private Set<Reservation> reservations = new HashSet<>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compte")
	private Set<CarteFid> carteFids = new HashSet<>(0);

	public Compte(Adresse adresse, CarteFid carteFid, String nomCompte, String prenomCompte, String emailCompte,
			String motspasseCompte, Set<Role> roles, Set<Reservation> reservations, Set<CarteFid> carteFids) {
		this.adresse = adresse;
		this.carteFid = carteFid;
		this.nomCompte = nomCompte;
		this.prenomCompte = prenomCompte;
		this.emailCompte = emailCompte;
		this.motspasseCompte = motspasseCompte;
		this.roles = roles;
		this.reservations = reservations;
		this.carteFids = carteFids;
	}

}

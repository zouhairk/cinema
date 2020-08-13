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
@Table(name = "carte_fid", catalog = "cinema")
@Data
@NoArgsConstructor
public class CarteFid implements java.io.Serializable {

	private static final long serialVersionUID = -4637630274585296606L;
 
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Carte_fid", unique = true, nullable = false)
 	private Integer idCarteFid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compte_id_compte")
	private Compte compte;

	@Column(name = "points_Carte_fid")
	private Integer pointsCarteFid;
	
	@Column(name = "niveau_Carte_fid", length = 100)
	private String niveauCarteFid;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "carteFid")
	private Set<Compte> comptes = new HashSet<>(0);

	public CarteFid(Compte compte, Integer pointsCarteFid, String niveauCarteFid, Set<Compte> comptes) {
		this.compte = compte;
		this.pointsCarteFid = pointsCarteFid;
		this.niveauCarteFid = niveauCarteFid;
		this.comptes = comptes;
	}

}

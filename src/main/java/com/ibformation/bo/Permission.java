package com.ibformation.bo;
 
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "permission", catalog = "cinema")
@Data
@NoArgsConstructor
public class Permission implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -371428942173735999L;
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Permission", unique = true, nullable = false)
	private Integer idPermission;

	@Column(name = "libelle_Permission", length = 65535)
	private String libellePermission;

	@Column(name = "attribut_Permission", length = 30)
	private String attributPermission;

	@Column(name = "valeur_Permission")
	private Boolean valeurPermission;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "permissions")
	private Set<Role> roles = new HashSet<>(0);

	public Permission(String libellePermission, String attributPermission, Boolean valeurPermission, Set<Role> roles) {
		this.libellePermission = libellePermission;
		this.attributPermission = attributPermission;
		this.valeurPermission = valeurPermission;
		this.roles = roles;
	}

}

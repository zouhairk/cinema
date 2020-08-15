package com.ibformation.cinema.bo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "role", catalog = "cinema")
@Data
@NoArgsConstructor
public class Role implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4490164390139439835L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Role", unique = true, nullable = false)
	private Integer idRole;

	@Column(name = "libelle_Role", length = 100)
	private String libelleRole;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	private Set<Compte> comptes = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "avoir_role_permission", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Role", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Permission", nullable = false, updatable = false) })
	private Set<Permission> permissions = new HashSet<>(0);

	public Role(String libelleRole, Set<Compte> comptes, Set<Permission> permissions) {
		this.libelleRole = libelleRole;
		this.comptes = comptes;
		this.permissions = permissions;
	}

}

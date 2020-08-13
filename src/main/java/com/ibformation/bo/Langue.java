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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

 
@Entity
@Table(name = "langue", catalog = "cinema")
@Data
@NoArgsConstructor
public class Langue implements java.io.Serializable {

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Langue", unique = true, nullable = false)
	private Integer idLangue;

	@Column(name = "Libelle_Langue", length = 100)
	private String libelleLangue;

	@Column(name = "code_Langue", length = 3)
	private String codeLangue;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "avoir", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Langue", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Film", nullable = false, updatable = false) })
	private Set<Film> films = new HashSet<>(0);

	public Langue(String libelleLangue, String codeLangue, Set<Film> films) {
		this.libelleLangue = libelleLangue;
		this.codeLangue = codeLangue;
		this.films = films;
	}

}

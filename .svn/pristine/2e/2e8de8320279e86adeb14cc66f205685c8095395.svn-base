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
@Table(name = "question", catalog = "cinema")
@Data
@NoArgsConstructor
public class Question implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3339646564575626025L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_Question", unique = true, nullable = false)
	private Integer idQuestion;

	@Column(name = "Question_Question", length = 65535)
	private String questionQuestion;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "questions")
	private Set<Jeu> jeus = new HashSet<>(0);

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "avoir_reponse_question", catalog = "cinema", joinColumns = {
			@JoinColumn(name = "id_Question", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_Cinema", nullable = false, updatable = false) })
	private Set<Reponse> reponses = new HashSet<>(0);

	public Question(String questionQuestion, Set<Jeu> jeus, Set<Reponse> reponses) {
		this.questionQuestion = questionQuestion;
		this.jeus = jeus;
		this.reponses = reponses;
	}

}

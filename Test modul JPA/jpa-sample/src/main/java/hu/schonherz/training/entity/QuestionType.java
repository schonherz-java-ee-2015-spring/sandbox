package hu.schonherz.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "QuestionType")
public class QuestionType extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	public QuestionType() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}

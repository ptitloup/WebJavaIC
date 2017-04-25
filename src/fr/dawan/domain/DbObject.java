package fr.dawan.domain;

public abstract class DbObject {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

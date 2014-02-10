package org.paumard.model;

public class Marin {

	private Long id ;
	
	private String nom ;
	
	private String prenom ;
	
	private int age ;
	
	private Address adresse ;

	public Marin() {
		super();
	}

	public Marin(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Address getAdresse() {
		return adresse;
	}

	public void setAdresse(Address adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id=").append(id+", ");
		sb.append("nom=").append(nom+", ");
		sb.append("prenom=").append(prenom+", ");
		sb.append("age=").append(age);
		sb.append("adresse=").append(adresse.toString());
		return sb.toString();
	}
}

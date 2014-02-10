package org.paumard.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.paumard.model.util.Statut;

public class Bateau {

	private Long id ;
	
	private String nom ;
	
	private int tonnage ;
	
	private List<Marin> equipage ;
	
	private Statut statut ;
	
	public Bateau() {
		super();
	}

	public Bateau(String nom, int tonnage) {
		super();
		this.nom = nom;
		this.tonnage = tonnage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public void addMarin(Marin marin) {
		this.equipage.add(marin) ;
	}
	
	public void removeMarin(Marin marin) {
		this.equipage.remove(marin) ;
	}
	
	public Collection<Marin> getEquipage() {
		return new ArrayList<>(this.equipage) ;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id=").append(id+", ");
		sb.append("nom=").append(nom+", ");
		sb.append("tonnage=").append(tonnage+", ");
		sb.append("statut=").append(statut);
		return sb.toString();
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}
}

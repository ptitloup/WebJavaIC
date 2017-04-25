package fr.dawan.domain;

import java.util.Date;

public class Stagiaire extends DbObject{
	public enum PriseEnCharge {
		Salarie, Employeur, PoleEmploi, OPCA
	}
	public enum Civilite {
		Mademoiselle,
		Madame,
		Monsieur
	}

	private String nom, prenom, societe;
	private boolean connu;
	private Date dateNaissance;
	private PriseEnCharge payeur;
	private Civilite genre;

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
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public boolean isConnu() {
		return connu;
	}
	public void setConnu(boolean connu) {
		this.connu = connu;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public PriseEnCharge getPayeur() {
		return payeur;
	}
	public void setPayeur(PriseEnCharge payeur) {
		this.payeur = payeur;
	}
	public Civilite getGenre() {
		return genre;
	}
	public void setGenre(Civilite genre) {
		this.genre = genre;
	}

}

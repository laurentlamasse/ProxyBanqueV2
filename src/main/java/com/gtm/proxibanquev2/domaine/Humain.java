package com.gtm.proxibanquev2.domaine;

/**
 * La classe Humain est une classe abstraite qui est implementee par 
 * les classes Employe et Client
 * @author Stagiaire
 * @param
 * nom - un String
 * prenom - un String
 *
 */

public abstract class Humain {

	//Proprietes
	private String nom, prenom;
	
	//Constructeur
	public Humain(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public Humain(){
	
	}

	//Getters setters
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
	
	
}

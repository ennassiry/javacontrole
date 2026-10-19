package com.ennassiry.controle;

public abstract class Employe {

	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	private  Employe  superieur ;
	private int n;

	public Employe(String matricule, String nom, double tarifJournalier) {
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {

		System.out.println(
				"Employe [matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier + "]");

	}

	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
		++n;

	}

	public Employe getSuperieur() {

		return this;
	}

}

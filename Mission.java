package com.ennassiry.controle;

public class Mission {
	
	private int nbJours ;
	Employe employe ;
	Projet maprojet;
	public Mission(int nbJours, Employe employe, Projet maprojet) {
		super();
		this.nbJours = nbJours;
		this.employe = employe;
		this.maprojet = maprojet;
	}
	
	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}
	
	public void afficherRecapitulatif() {
		System.out.println("nb jours "+nbJours+"employe: "+employe.nom+ " "+employe.getMatricule());
		System.out.println("projet "+maprojet.getCode()+" "+maprojet.getIntitule());
	}

	
}

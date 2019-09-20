package fr.test.jeucarte;

public class Carte {

	private String rang;

	private Couleur couleur;

	public Carte(String rang, Couleur couleur) {
		this.rang = rang;
		this.couleur = couleur;
	}

	public String getRang() {
		return this.rang;
	}

	public Couleur getCouleur() {
		return this.couleur;
	}

	@Override
	public String toString() {
		return this.getRang() + " de " + this.couleur;
	}

}

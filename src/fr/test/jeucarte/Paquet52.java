package fr.test.jeucarte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;

public class Paquet52 {

	private final org.apache.log4j.Logger logger = LogManager.getLogger(this.getClass().getName());

	private List<Carte> cartes;

	public Paquet52() {
		
		BasicConfigurator.configure();
		this.cartes = new ArrayList<Carte>();

	}

	public void initPaquet() {

		logger.info("Initialisation du paquet");

		for (int i = 0; i < Couleur.values().length; i++) {
			for (int j = 0; j < Rang.rangs.length; j++) {
				cartes.add(new Carte(Rang.rangs[j], Couleur.values()[i]));
			}
		}

	}

	public void affichagePaquet() {

		logger.info("Affichage du paquet");

		for (int i = 0; i < cartes.size(); i++) {
			System.out.println(cartes.get(i));
		}

	}

	public void melangerPaquet() {

		logger.info("Mélange du paquet");

		Collections.shuffle(cartes);

	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}

}

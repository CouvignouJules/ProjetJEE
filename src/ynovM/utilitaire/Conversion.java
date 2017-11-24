package ynovM.utilitaire;

import ynovM.modele.metier.Station;
import ynovM.service.StationPOJO;

public class Conversion {
	public static Station pojoToCage(StationPOJO pojo) {		
		return new Station(pojo.getId(), pojo.getX(), pojo.getY(), pojo.getNom(), pojo.getLocalisation(), pojo.getTemperature(),
				pojo.getHygrometrie(), pojo.getNebulosite(), pojo.getAnemometre(), pojo.getPluviometrie(), pojo.getRemarques());	
	}
}

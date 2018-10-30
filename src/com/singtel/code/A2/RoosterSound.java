package com.singtel.code.A2;

import java.util.HashMap;
import java.util.Map;

// Add the rooster sound in your native tongue
public class RoosterSound {
	
	private Map<String, String> roosterMap = new HashMap<>();
	public RoosterSound() {
		roosterMap.put("Danish", "kykyliky");
		roosterMap.put("Dutch", "kukeleku");
		roosterMap.put("Finnish", "kukko kiekuu");
		roosterMap.put("French", "cocorico");
		roosterMap.put("German", "kikeriki");
		roosterMap.put("Greek", "kikiriki");
		roosterMap.put("Hebrew", "coo-koo-ri-koo");
		roosterMap.put("Hungarian", "kukuriku");
		roosterMap.put("Italian", "chicchirichi");
		roosterMap.put("Japanese", "ko-ke-kok-ko-o");
		roosterMap.put("Portuguese", "cucurucu");
		roosterMap.put("Russian", "kukareku");
		roosterMap.put("Swedish", "kuckeliku");
		roosterMap.put("Turkish", "kuk-kurri-kuuu");
		roosterMap.put("Urdu", "kuklooku");
		
	}
	public Map<String, String> getRoosterMap() {
		return roosterMap;
	}
	

}

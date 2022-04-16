package fr.univrouen.rss22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
	
	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/guid")
	public String getRSSinXML(
	 	@RequestParam(value  =  "guid")  String  texte)  {
	return ("Détail du flux RSS demandé : " + texte);
	}
	
	@GetMapping("/test")
	public String getTestinXML(
	 	@RequestParam(value  =  "nb")  String  guid, @RequestParam(value  =  "search")  String  titre)  {
	return ("Test : \n guid = " + guid + "\n titre = " + titre);
	}

}

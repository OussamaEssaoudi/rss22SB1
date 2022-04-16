package model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRSS {
	
	public String loadFileXML() {
		
		String reponse="";
		try{
		   Resource resource = new DefaultResourceLoader().getResource("classpath:xml/item.xml");
		   InputStream in = resource.getInputStream();
		   BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		 
		    while (true) {
		      String line = reader.readLine();
		      if (line == null)
		        break;
		      reponse+=line;
		    }
			 reader.close();
		}catch (Exception e) {
			reponse = e.getMessage();
		}
		return reponse;
	}	
}
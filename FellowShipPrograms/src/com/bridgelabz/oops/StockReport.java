package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.StockModel;
import com.bridgelabz.utility.OopsUtility;

public class StockReport {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Stockinput.json";

		String sourceout = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/Stockoutput.json";

		ObjectMapper mapper = new ObjectMapper();
		StockModel data = mapper.readValue(new File(sourcein), StockModel.class);
		
		System.out.println("Stock name : "+data.getTata().get(0).getName());
		System.out.println("Stock shares : "+data.getTata().get(0).getShare());
		System.out.println("Stock price: "+data.getTata().get(0).getPrice());
		int valueOfTcs=OopsUtility.calculateValueOfStock(data.getTata().get(0).getShare(),data.getTata().get(0).getPrice());
		System.out.println();
		
		
		System.out.println("Stock name : "+data.getHdfc().get(0).getName());
		System.out.println("Stock shares : "+data.getHdfc().get(0).getShare());
		System.out.println("Stock price : "+data.getHdfc().get(0).getPrice());
		int valueOfHfc=OopsUtility.calculateValueOfStock(data.getHdfc().get(0).getShare(),data.getHdfc().get(0).getPrice());
		System.out.println();
		
		System.out.println("Stock name : "+data.getZee().get(0).getName());
		System.out.println("Stock shares : "+data.getZee().get(0).getShare());
		System.out.println("Stock price : "+data.getZee().get(0).getPrice());
		int valueOfZee=OopsUtility.calculateValueOfStock(data.getZee().get(0).getShare(),data.getZee().get(0).getPrice());
		
		
		data.setValueOfTcs
		
		
	}

}

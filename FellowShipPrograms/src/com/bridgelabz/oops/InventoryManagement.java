package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;

public class InventoryManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
      String sourcein="/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/"
      		+ "Json/Inventory.json";
      
      String sourceout="/home/admin1/FellowShip/FellowShipPrograms/src/"
      		+ "com/bridgelabz/Json/InventoryOut.json";
      
      ObjectMapper mapper=new ObjectMapper();
      InventoryModel data=mapper.readValue(new File(sourcein),InventoryModel.class );
     
      int total=0;
      System.out.println(""+data.getRice().get(0).getName());
      
      
	}

}

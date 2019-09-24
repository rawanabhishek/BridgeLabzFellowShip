/******************************************************************************
 
 *  Purpose: Create a JSON file having Inventory Details for Rice, Pulses and 
 *           Wheats with properties name, weight, price per kg.
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   19-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.InventoryModel;
import com.bridgelabz.utility.OopsUtility;

public class InventoryManagement {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
      String sourcein="/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/"
      		+ "json/Inventory.json";
      
      String sourceout="/home/admin1/FellowShip/FellowShipPrograms/src/"
      		+ "com/bridgelabz/json/InventoryOut.json";
      
      ObjectMapper mapper=new ObjectMapper();
		InventoryModel data = mapper.readValue(new File(sourcein), InventoryModel.class);

       int total=0;
       System.out.println("Rice name:"+data.getRice().get(0).getName());
       System.out.println("Rice weight:"+data.getRice().get(0).getWeight());
       System.out.println("Rice price: "+data.getRice().get(0).getPriceperkg());
       data.getRice().get(0).setTotalvalue(OopsUtility.calculateValueOf(data.getRice().get(0).getWeight(), data.getRice().get(0).getPriceperkg()));
       total+=OopsUtility.calculateValueOf(data.getRice().get(0).getWeight(), data.getRice().get(0).getPriceperkg());
       System.out.println("------------------------");
       
       System.out.println("Pulses name :"+data.getPulses().get(0).getName());
       System.out.println("Pulses weight :"+data.getPulses().get(0).getWeight());
       System.out.println("Pulses price :"+data.getPulses().get(0).getPriceperkg());
       data.getPulses().get(0).setTotalvalue(OopsUtility.calculateValueOf(data.getPulses().get(0).getWeight(),data.getPulses().get(0).getPriceperkg()));
       total+=OopsUtility.calculateValueOf(data.getPulses().get(0).getWeight(),data.getPulses().get(0).getPriceperkg());
       System.out.println("------------------------");
       
       System.out.println("Wheat name :"+data.getWheats().get(0).getName());
       System.out.println("Wheat weight :"+data.getWheats().get(0).getWeight());
       System.out.println("Wheat price :"+data.getWheats().get(0).getPriceperkg());
       
       data.getWheats().get(0).setTotalvalue(OopsUtility.calculateValueOf(data.getWheats().get(0).getWeight(),data.getWheats().get(0).getPriceperkg() ));
       total+=OopsUtility.calculateValueOf(data.getWheats().get(0).getWeight(),data.getWheats().get(0).getPriceperkg() );
       System.out.println("------------------------");
       
       System.out.println("total value is : "+total);
       
       data.setTotal(total);
       
       mapper.writeValue(new File(sourceout), data);
       
	}

}

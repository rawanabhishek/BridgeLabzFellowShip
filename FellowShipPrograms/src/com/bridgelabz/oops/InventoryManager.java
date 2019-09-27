/******************************************************************************
 
 *  Purpose: Create a JSON file having Inventory Details from json file and update
 *           that inventory  and write it to a new json file
 *  @author  Abhishek Rawat
 *  @version 1.0
 *  @since   20-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.oops;


import java.io.IOException;
import java.util.ArrayList;


import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;


import com.bridgelabz.model.InventoryModel;
import com.bridgelabz.model.Pulse;
import com.bridgelabz.model.Rice;
import com.bridgelabz.model.Wheat;
import com.bridgelabz.utility.OopsUtility;
import com.bridgelabz.utility.ScannerUtility;
import com.bridgelabz.utility.jsonutility;

public class InventoryManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String sourcein = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/InventoryOut.json";

		String sourceout = "/home/admin1/FellowShip/FellowShipPrograms/src/com/bridgelabz/json/InventoryManagerOut.json";

	
		

		InventoryModel model = new InventoryModel();
		model=(InventoryModel) jsonutility.readMapper(sourcein, model);

		int total=model.getTotal();
		int grandtotal=total;
		ArrayList<Rice> ricelist = new ArrayList<Rice>();
		ArrayList<Pulse> pulseslist = new ArrayList<Pulse>();
		ArrayList<Wheat> wheatlist = new ArrayList<Wheat>();

		ricelist.addAll(model.getRice());
		pulseslist.addAll(model.getPulses());
		wheatlist.addAll(model.getWheats());

		System.out.println("Manager how much inventory you want to add :");
		int number = ScannerUtility.intScanner();

		for (int i = 0; i < number; i++) {

			System.out.println(" Press 1. for adding rice : \n Press 2. for adding pulses : \n Press 3. for adding wheats :  ");
			int choice = ScannerUtility.intScanner();

			System.out.println("Enter the inventory  brand:  ");
			String inventorybrand = ScannerUtility.stringScanner();

			System.out.println();
			System.out.println("Enter the weight for inventory :");
			int inventoryWeight = ScannerUtility.intScanner();

			System.out.println();
			System.out.println("Enter the Price for inventory :");
			int inventoryPrice = ScannerUtility.intScanner();

			if (choice == 1) {

				Rice rice = new Rice();
				rice.setName(inventorybrand);
				rice.setWeight(inventoryWeight);
				rice.setPriceperkg(inventoryPrice);
				rice.setTotalvalue(OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice));
				grandtotal+=OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice);
				ricelist.add(rice);

			} else if (choice == 2) {
				Pulse pulse = new Pulse();
				pulse.setName(inventorybrand);
				pulse.setWeight(inventoryWeight);
				pulse.setPriceperkg(inventoryPrice);
				pulse.setTotalvalue(OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice));
				grandtotal+=OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice);
				pulseslist.add(pulse);

			} else if (choice == 3) {
				Wheat wheat=new Wheat();
				wheat.setName(inventorybrand);
				wheat.setWeight(inventoryWeight);
				wheat.setPriceperkg(inventoryPrice);
				wheat.setTotalvalue(OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice));
				grandtotal+=OopsUtility.calculateValueOf(inventoryWeight, inventoryPrice);
				wheatlist.add(wheat);
			}

		
	
			
			model.setRice(ricelist);
			model.setPulses(pulseslist);
			model.setWheats(wheatlist);
			
			model.setGrandtotal(grandtotal);
			jsonutility.writeMapper(sourceout, model);
			

		}

	}

}

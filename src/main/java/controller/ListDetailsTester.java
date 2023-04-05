package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.ListDetails;
import model.ListItem;
import model.Shopper;

public class ListDetailsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopper cameron = new Shopper("Cameron");
		
		//ShopperHelper sh = new ShopperHelper();
		
		//sh.insertShopper(cameron);
		
		ListItem shampoo = new ListItem("Target", "Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> cameronsItems = new ArrayList<ListItem>();
		cameronsItems.add(shampoo);
		cameronsItems.add(brush);
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);
		cameronList.setListOfItems(cameronsItems);
		
		ldh.insertNewListDetails(cameronList);
		
		List<ListDetails> allLists = ldh.getLists();
		
		for(ListDetails a : allLists) {
			System.out.println(a.toString());
		}
	}

}

package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ListDetails {
	@Id
	@GeneratedValue
	private int id;
	private String listName;
	private LocalDate tripDate;
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Shopper shopper;
	@OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
	private List<ListItem> listOfItems;
	
	public ListDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ListDetails(int id, String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		super();
		this.id = id;
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper, List<ListItem> listOfItems) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
		this.listOfItems = listOfItems;
	}
	public ListDetails(String listName, LocalDate tripDate, Shopper shopper) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.shopper = shopper;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListName() {
		return listName;
	}
	public void setListName(String listName) {
		this.listName = listName;
	}
	public LocalDate getTripDate() {
		return tripDate;
	}
	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}
	public Shopper getShopper() {
		return shopper;
	}
	public void setShopper(Shopper shopper) {
		this.shopper = shopper;
	}
	public List<ListItem> getListOfItems() {
		return listOfItems;
	}
	public void setListOfItems(List<ListItem> listOfItems) {
		this.listOfItems = listOfItems;
	}
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", shopper=" + shopper
				+ ", listOfItems=" + listOfItems + "]";
	}

}

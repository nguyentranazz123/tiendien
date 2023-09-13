/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.io.File;
import java.util.ArrayList;

public class cusManager {
	public ArrayList<customer> customerList;
	private String tenFile;

	public cusManager() {
		this.customerList = new ArrayList<customer>();
		this.tenFile="";
	}

	public cusManager(ArrayList<customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public ArrayList<customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<customer> customerList) {
		this.customerList = customerList;
	}
	//add customer
	public void insert(customer ctm) {
		this.customerList.add(ctm);
	}
	//remove customer
	public void delete(customer ctm) {
		this.customerList.remove(ctm);
                
	}
	//update customer
	public void update(customer ctm) {
		this.customerList.remove(ctm);
		this.customerList.add(ctm);
	}
	//show list


	public boolean alreadyAnID(customer ctm) {
		for (customer customer : customerList) {
			if(customer.getCusCode()==ctm.getCusCode())
				return true;
		}
		return false;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
		
	}
	public String getTenFile() {
		// TODO Auto-generated method stub
		return tenFile;
	}
}


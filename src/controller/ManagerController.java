/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.customer;
import view.cusView;

public class ManagerController implements ActionListener {
	public cusView view;
	ArrayList<customer> customerList;
	public ManagerController(cusView view) {
		super();
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Insert")) {
			this.view.reset();
		}else if(src.equals("Save")) {
			try {
				this.view.actionAdd();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(view,"Error "+e2.getMessage()+"\n"+"Note: You might input wrong type of data or miss something");
			} 
		}else if(src.equals("Update")) {
			this.view.showInfo();

		}else if(src.equals("Delete")) {
			this.view.deleteCustomer();
                        
		}else if(src.equals("Check Bill")) {
			this.view.checkBill();
		}else if(src.equals("Remove")) {
			this.view.deleteRow();
			this.view.reset();
		}else if(src.equals("Search")) {
			this.view.cusSearch();
		}else if(src.equals("SaveFile")) {
			this.view.thucHienSaveFile();
		}else if(src.equals("Open")) {
			this.view.thucHienOpenFile();
		}
	}

}


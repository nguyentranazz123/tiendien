/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class customer implements Serializable{
	public int cusCode;
	public String cusName;
	public String cusAddress;
	public String cusSex;
	public int cusPhone;
	public String cusType;
	public int numberFirst;
	public int numberLast;
	
	public customer() {
		super();
	}
	
	public customer(int cusCode, String cusName, String cusAddress, String cusSex,
			int cusPhone, String cusType, int numberFirst,
			int numberLast) {
		super();
		this.cusCode = cusCode;
		this.cusName = cusName;
		this.cusAddress = cusAddress;
		this.cusSex = cusSex;
		this.cusPhone = cusPhone;
		this.cusType = cusType;
		this.numberFirst = numberFirst;
		this.numberLast = numberLast;
	}
	
	public int getCusCode() {
		return cusCode;
	}
	public void setCusCode(int cusCode) {
		this.cusCode = cusCode;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusDddress) {
		this.cusAddress = cusDddress;
	}
	public String getCusSex() {
		return cusSex;
	}
	public void setCusSex(String cusSex) {
		this.cusSex = cusSex;
	}
	public int getCusPhone() {
		return cusPhone;
	}
	public void setCusPhone(int cusPhone) {
		this.cusPhone = cusPhone;
	}
	public int getNumberFirst() {
		return numberFirst;
	}
	public void setNumberFirst(int numberFirst) {
		this.numberFirst = numberFirst;
	}
	public int getNumberLast() {
		return numberLast;
	}
	public void setNumberLast(int numberLast) {
		this.numberLast = numberLast;
	}
	public String getCusType() {
		return cusType;
	}
	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cusCode, cusAddress, cusName, cusPhone, cusSex, numberFirst, numberLast);
	}
	
	@Override
	public boolean equals(Object obj) {
		 if (obj instanceof customer) {
			 customer another = (customer) obj;
	            //Chu y vi id la int nen dung == neu la String thi dung equal
	            if (this.getCusCode()==another.getCusCode()) {
	                return true;
	            }
	        }else {
	        return false;}
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		customer other = (customer) obj;
		return cusCode == other.cusCode && Objects.equals(cusAddress, other.cusAddress)
				&& Objects.equals(cusName, other.cusName) && cusPhone == other.cusPhone
				&& Objects.equals(cusSex, other.cusSex) && numberFirst == other.numberFirst
				&& numberLast == other.numberLast;
	}	
	
}

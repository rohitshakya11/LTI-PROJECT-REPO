/**
 * 
 */
package com.lti.bean;

/**
 * @author 10710128
 *
 */
public class Customer {
	
	//properties declaration
	public int customerID;
	public String customerName;
	public String customerAddress;
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}

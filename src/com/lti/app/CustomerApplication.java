/**
 * 
 */
package com.lti.app;

import com.lti.service.CustomerService;

/**
 * @author 10710128
 *
 */
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService service = new CustomerService();
		service.createCustomer();
		service.deleteCustomer();
		service.updateCustomer();
		service.listCustomer();

	}

}

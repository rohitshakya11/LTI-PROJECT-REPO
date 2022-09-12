/**
 * 
 */
package com.lti.app;

import com.lti.service.CalculatorService;

/**
 * @author 10710128
 *
 */
public class CalApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create the instance of the class and expose all methods here
		
		CalculatorService service = new CalculatorService();
		System.out.println("addition-->"+service.add(10, 10));
		System.out.println("substraction-->"+service.sub(10, 8));
		System.out.println("multiplication-->"+service.mul(10, 10));
		System.out.println("division-->"+service.div(12, 6));
		

	}

}

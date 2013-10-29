/**
 * 
 */
package com.demo;

import com.demo.engines.Car;
import com.demo.engines.Engine;
import com.demo.engines.LawnMower;

/**
 * @author LWSSystem
 *
 */
public class StartStopEngines {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		demo1();
	}

	public static void demo1 ()
	{
		Car c = new Car();
		LawnMower lm = new LawnMower();
		
		start(c);
		stop(lm);
		
		start(lm);
		stop(c);
	}
	
	public static void start (Engine eng)
	{
		eng.startEngine();
	}

	public static void stop (Engine eng)
	{
		eng.stopEngine();
	}
}

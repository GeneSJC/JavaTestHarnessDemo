/**
 * 
 */
package com.demo.engines;

/**
 * @author LWSSystem
 *
 */
public class Car implements Engine {

	/* (non-Javadoc)
	 * @see com.demo.Engine#startEngine()
	 */
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub

		String msg = "Starting engine of type" + getEngineType();
		System.out.println(msg);
	}

	/* (non-Javadoc)
	 * @see com.demo.Engine#stopEngine()
	 */
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

		String msg = "Stopping engine of type" + getEngineType();
		System.out.println(msg);
	}

	/* (non-Javadoc)
	 * @see com.demo.Engine#getEngineType()
	 */
	@Override
	public String getEngineType() {

		return "Auto";
	}

	public void startCar()
	{
		
	}
}

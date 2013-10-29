/**
 * 
 */
package com.demo.engines;

/**
 * @author LWSSystem
 *
 */
public class LawnMower implements Engine {

	/* (non-Javadoc)
	 * @see com.demo.Engine#startEngine()
	 */
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub

		String msg = "zz Starting engine of type" + getEngineType();
		System.out.println(msg);
	}

	/* (non-Javadoc)
	 * @see com.demo.Engine#stopEngine()
	 */
	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub

		String msg = "zz Stopping engine of type" + getEngineType();
		System.out.println(msg);
	}

	/* (non-Javadoc)
	 * @see com.demo.Engine#getEngineType()
	 */
	@Override
	public String getEngineType() {

		return "Grass Cutter";
	}

	
}

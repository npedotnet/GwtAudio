/**
 * AudioListener.java
 * 
 * Copyright (c) 2015 Kenji Sasaki
 * Released under the MIT license.
 * https://github.com/npedotnet/GwtAudio/blob/master/LICENSE
 * 
 * English document
 * https://github.com/npedotnet/GwtAudio/blob/master/README.md
 * 
 * Japanese document
 * http://3dtech.jp/wiki/index.php?GwtAudio
 * 
 */

package net.npe.webaudio;

import com.google.gwt.core.client.JavaScriptObject;

public class AudioListener extends JavaScriptObject {
	
	/**
	 * attribute double dopplerFactor;
	 * @return dopplerFactor
	 */
	public final native double getDopplerFactor() /*-{
		return this.dopplerFactor;
	}-*/;
	
	/**
	 * attribute double dopplerFactor;
	 * @param dopplerFactor
	 */
	public final native void setDopplerFactor(double dopplerFactor) /*-{
		this.dopplerFactor = dopplerFactor;
	}-*/;
	
	/**
	 * attribute double speedOfSound;
	 * @return speedOfSound
	 */
	public final native double getSpeedOfSound() /*-{
		return this.speedOfSound;
	}-*/;
	
	/**
	 * attribute double speedOfSound;
	 * @param speedOfSound
	 */
	public final native void setSpeedOfSound(double speedOfSound) /*-{
		this.speedOfSound = speedOfSound;
	}-*/;
	
	/**
	 * Uses a 3D cartesian coordinate system<br>
	 * void setPosition(double x, double y, double z);
	 * @param x
	 * @param y
	 * @param z
	 */
	public final native void setPosition(double x, double y, double z) /*-{
		this.setPosition(x, y, z);
	}-*/;
	
	/**
	 * Uses a 3D cartesian coordinate system<br>
	 * void setOrientation(double x, double y, double z, double xUp, double yUp, double zUp);
	 * @param x
	 * @param y
	 * @param z
	 * @param xUp
	 * @param yUp
	 * @param zUp
	 */
	public final native void setOrientation(double x, double y, double z, double xUp, double yUp, double zUp) /*-{
		this.setOrientation(x, y, z, xUp, yUp, zUp);
	}-*/;
	
	/**
	 * Uses a 3D cartesian coordinate system<br>
	 * void setVelocity(double x, double y, double z);
	 * @param x
	 * @param y
	 * @param z
	 */
	public final native void setVelocity(double x, double y, double z) /*-{
		this.setVelocity(x, y, z);
	}-*/;

	/**
	 * protected constructor
	 */
	protected AudioListener() {}
	
}

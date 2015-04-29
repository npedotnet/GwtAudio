/**
 * OscillatorNode.java
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

public class OscillatorNode extends AudioNode {
	
	/**
	 * getType
	 * @return OscillatorType
	 */
	public final OscillatorType getType() {
		return OscillatorType.valueOf(getTypeName());
	}
	
	/**
	 * attribute OscillatorType type;
	 * @return type
	 */
	public final native String getTypeName() /*-{
		return this.type;
	}-*/;
	
	/**
	 * setType
	 * @param type
	 */
	public final void setType(OscillatorType type) {
		setTypeName(type.toString());
	}
	
	/**
	 * attribute OscillatorType type;
	 * @param type
	 */
	public final native void setTypeName(String type) /*-{
		this.type = type;
	}-*/;
	
	/**
	 * readonly attribute AudioParam frequency; // in Hertz
	 * @return frequency
	 */
	public final native AudioParam getFrequency() /*-{
		return this.frequency;
	}-*/;
	
	/**
	 * readonly attribute AudioParam detune; // in Cents
	 * @return detune
	 */
	public final native AudioParam getDetune() /*-{
		return this.detune;
	}-*/;
	
	/**
	 * void start(double when);
	 * @param when
	 */
	public final native void start(double when) /*-{
		this.start(when);
	}-*/;
	
	/**
	 * void stop(double when);
	 * @param when
	 */
	public final native void stop(double when) /*-{
		this.stop(when);
	}-*/;
	
	/**
	 * void setPeriodicWave(PeriodicWave periodicWave);
	 * @param periodicWave
	 */
	public final native void setPeriodicWave(PeriodicWave periodicWave) /*-{
		this.setPeriodicWave(periodicWave);
	}-*/;
	
	// TODO attribute EventHandler onended;
	
	/**
	 * protected constructor
	 */
	protected OscillatorNode() {}
	
}

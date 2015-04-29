/**
 * BiquadFilterNode.java
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

import com.google.gwt.typedarrays.shared.Float32Array;

public class BiquadFilterNode extends AudioNode {
	
	/**
	 * getType
	 * @return BiquadFilterType
	 */
	public final BiquadFilterType getType() {
		return BiquadFilterType.valueOf(getTypeName());
	}
	
	/**
	 * attribute BiquadFilterType type;
	 * @return type
	 */
	public final native String getTypeName() /*-{
		return this.type;
	}-*/;
	
	/**
	 * setType
	 * @param type
	 */
	public final void setType(BiquadFilterType type) {
		setTypeName(type.toString());
	}
	
	/**
	 * attribute BiquadFilterType type;
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
	 * readonly attribute AudioParam Q; // Quality factor
	 * @return Q
	 */
	public final native AudioParam getQ() /*-{
		return this.Q;
	}-*/;
	
	/**
	 * readonly attribute AudioParam gain; // in Decibels
	 * @return gain
	 */
	public final native AudioParam getGain() /*-{
		return this.gain;
	}-*/;
	
	/**
	 * void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
	 * @param frequencyHz
	 * @param magResponse
	 * @param phaseResponse
	 */
	public final native void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse) /*-{
		this.getFrequencyResponse(frequencyHz, magResponse, phaseResponse);
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected BiquadFilterNode() {}
	
}

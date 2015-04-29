/**
 * AnalyserNode.java
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
import com.google.gwt.typedarrays.shared.Uint8Array;

public final class AnalyserNode extends AudioNode {
	
	/**
	 * Real-time frequency-domain data<br>
	 * void getFloatFrequencyData(Float32Array array);
	 * @param array
	 */
	public native void getFloatFrequencyData(Float32Array array) /*-{
		this.getFloatFrequencyData(array);
	}-*/;
	
	/**
	 * Real-time frequency-domain data<br>
	 * void getByteFrequencyData(Uint8Array array);
	 * @param array
	 */
	public native void getByteFrequencyData(Uint8Array array) /*-{
		this.getByteFrequencyData(array);
	}-*/;
	
	/**
	 * Real-time waveform data<br>
	 * void getByteTimeDomainData(Uint8Array array);
	 * @param array
	 */
	public native void getByteTimeDomainData(Uint8Array array) /*-{
		this.getByteTimeDomainData(array);
	}-*/;
	
	/**
	 * attribute unsigned long fftSize;
	 * @return fftSize
	 */
	public native int getFftSize() /*-{
		return this.fftSize;
	}-*/;
	
	/**
	 * attribute unsigned long fftSize;
	 * @param fftSize
	 */
	public native void setFftSize(int fftSize) /*-{
		this.fftSize = fftSize;
	}-*/;
	
	/**
	 * readonly attribute unsigned long frequencyBinCount;
	 * @return frequencyBinCount
	 */
	public native int getFrequencyBinCount() /*-{
		return this.frequencyBinCount;
	}-*/;
	
	/**
	 * attribute double minDecibels;
	 * @return minDecibels
	 */
	public native double getMinDecibels() /*-{
		return this.minDecibels;
	}-*/;
	
	/**
	 * attribute double minDecibels;
	 * @param minDecibels
	 */
	public native void setMinDecibels(double minDecibels) /*-{
		this.minDecibels = minDecibels;
	}-*/;
	
	/**
	 * attribute double maxDecibels;
	 * @return maxDecibels
	 */
	public native double getMaxDecibels() /*-{
		return this.maxDecibels;
	}-*/;
	
	/**
	 * attribute double maxDecibels;
	 * @param maxDecibels
	 */
	public native void setMaxDecibels(double maxDecibels) /*-{
		this.maxDecibels = maxDecibels;
	}-*/;
	
	/**
	 * attribute double smoothingTimeConstant;
	 * @return smoothingTimeConstant
	 */
	public native double getSmoothingTimeConstant() /*-{
		return this.smoothingTimeConstant;
	}-*/;
	
	/**
	 * attribute double smoothingTimeConstant;
	 * @param smoothingTimeConstant
	 */
	public native void setSmoothingTimeConstant(double smoothingTimeConstant) /*-{
		this.smoothingTimeConstant = smoothingTimeConstant;
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AnalyserNode() {}
	
}

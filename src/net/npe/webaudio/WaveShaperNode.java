/**
 * WaveShaperNode.java
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

public class WaveShaperNode extends AudioNode {
	
	/**
	 * attribute Float32Array? curve;
	 * @return curve
	 */
	public final native Float32Array getCurve() /*-{
		return this.curve;
	}-*/;
	
	/**
	 * attribute Float32Array? curve;
	 * @param curve
	 */
	public final native void setCurve(Float32Array curve) /*-{
		this.curve = curve;
	}-*/;
	
	/**
	 * getOversample
	 * @return OverSampleType
	 */
	public final OverSampleType getOversample() {
		return OverSampleType.valueOf(getOversampleName());
	}
	
	/**
	 * attribute OverSampleType oversample;
	 * @return oversample
	 */
	public final native String getOversampleName() /*-{
		return this.oversample;
	}-*/;
	
	/**
	 * setOversample
	 * @param oversample
	 */
	public final void setOversample(OverSampleType oversample) {
		setOversampleName(oversample.toString());
	}
	
	/**
	 * attribute OverSampleType oversample;
	 * @param oversample
	 */
	public final native void setOversampleName(String oversample) /*-{
		this.oversample = oversample;
	}-*/;

	/**
	 * protected constructor
	 */
	protected WaveShaperNode() {}
	
}

/**
 * AudioParam.java
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
import com.google.gwt.typedarrays.shared.Float32Array;

public class AudioParam extends JavaScriptObject {
	
	/**
	 * attribute float value;
	 * @return value
	 */
	public final native float getValue() /*-{
		return this.value;
	}-*/;
	
	/**
	 * attribute float value;
	 * @param value
	 */
	public final native void setValue(float value) /*-{
		this.value = value;
	}-*/;
	
	/**
	 * readonly attribute float defaultValue;
	 * @return defaultValue
	 */
	public final native float getDefaultValue() /*-{
		return this.defaultValue;
	}-*/;
	
	/**
	 * void setValueAtTime(float value, double startTime);
	 * @param value
	 * @param startTime
	 */
	public final native void setValueAtTime(float value, double startTime) /*-{
		this.setValueAtTime(value, startTime);
	}-*/;
	
	/**
	 * void linearRampToValueAtTime(float value, double endTime);
	 * @param value
	 * @param endTime
	 */
	public final native void linearRampToValueAtTime(float value, double endTime) /*-{
		this.linearRampToValueAtTime(value, endTime);
	}-*/;
	
	/**
	 * void exponentialRampToValueAtTime(float value, double endTime);
	 * @param value
	 * @param endTime
	 */
	public final native void exponentialRampToValueAtTime(float value, double endTime) /*-{
		this.exponentialRampToValueAtTime(value, endTime);
	}-*/;
	
	/**
	 * Exponentially approach the target value with a rate having the given time constant.<br>
	 * void setTargetAtTime(float target, double startTime, double timeConstant);
	 * @param target
	 * @param startTime
	 * @param timeConstant
	 */
	public final native void setTargetAtTime(float target, double startTime, double timeConstant) /*-{
		this.setTargetAtTime(target, startTime, timeConstant);
	}-*/;
	
	/**
	 * Sets an array of arbitrary parameter values starting at time for the given duration.<br>
	 * The number of values will be scaled to fit into the desired duration.<br>
	 * void setValueCurveAtTime(Float32Array values, double startTime, double duration);
	 * @param values
	 * @param startTime
	 * @param duration
	 */
	public final native void setValueCurveAtTime(Float32Array values, double startTime, double duration) /*-{
		this.setValueCurveAtTime(values, startTime, duration);
	}-*/;
	
	/**
	 * Cancels all scheduled parameter changes with times greater than or equal to startTime.
	 * @param startTime
	 */
	public final native void cancelScheduledValues(double startTime) /*-{
		this.cancelScheduledValues(startTime);
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AudioParam() {}
	
}

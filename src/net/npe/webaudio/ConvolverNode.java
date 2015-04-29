/**
 * ConvolverNode.java
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

public class ConvolverNode extends AudioNode {
	
	/**
	 * attribute AudioBuffer? buffer;
	 * @return buffer
	 */
	public final native AudioBuffer getBuffer() /*-{
		return this.buffer;
	}-*/;
	
	/**
	 * attribute AudioBuffer? buffer;
	 * @param buffer
	 */
	public final native void setBuffer(AudioBuffer buffer) /*-{
		this.buffer = buffer;
	}-*/;
	
	/**
	 * attribute boolean normalize;
	 * @return normalize
	 */
	public final native boolean getNormalize() /*-{
		return this.normalize;
	}-*/;
	
	/**
	 * attribute boolean normalize;
	 * @param normalize
	 */
	public final native void setNormalize(boolean normalize) /*-{
		this.normalize = normalize;
	}-*/;

	/**
	 * protected constructor
	 */
	protected ConvolverNode() {}
	
}

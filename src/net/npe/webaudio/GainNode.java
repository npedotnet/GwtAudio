/**
 * GainNode.java
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

public class GainNode extends AudioNode {
	
	/**
	 * readonly attribute AudioParam gain;
	 * @return gain
	 */
	public final native AudioParam getGain() /*-{
		return this.gain;
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected GainNode() {}
	
}

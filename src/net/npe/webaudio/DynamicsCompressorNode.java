/**
 * DynamicsCompressorNode.java
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

public class DynamicsCompressorNode extends AudioNode {
	
	/**
	 * readonly attribute AudioParam threshold; // in Decibels
	 * @return threshold
	 */
	public final native AudioParam getThreshold() /*-{
		return this.threshold;
	}-*/;
	
	/**
	 * readonly attribute AudioParam knee; // in Decibels
	 * @return knee
	 */
	public final native AudioParam getKnee() /*-{
		return this.knee;
	}-*/;
	
	/**
	 * readonly attribute AudioParam ratio; // unit-less
	 * @return ratio
	 */
	public final native AudioParam getRatio() /*-{
		return this.ratio;
	}-*/;
	
	/**
	 * readonly attribute AudioParam reduction; // in Decibels
	 * @return reduction
	 */
	public final native AudioParam getReduction() /*-{
		return this.reduction;
	}-*/;
	
	/**
	 * readonly attribute AudioParam attack; // in Seconds
	 * @return attack
	 */
	public final native AudioParam getAttack() /*-{
		return this.attack;
	}-*/;
	
	/**
	 * readonly attribute AudioParam release; // in Seconds
	 * @return release
	 */
	public final native AudioParam getRelease() /*-{
		return this.release;
	}-*/;

	/**
	 * protected constructor
	 */
	protected DynamicsCompressorNode() {}
	
}

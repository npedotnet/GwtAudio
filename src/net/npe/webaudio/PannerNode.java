/**
 * PannerNode.java
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

public class PannerNode extends AudioNode {
	
	/**
	 * Default for stereo is HRTF<br>
	 * getPanningModel
	 * @return PanningModelType
	 */
	public final PanningModelType getPanningModel() {
		return PanningModelType.valueOf(getPanningModelName());
	}
	
	/**
	 * Default for stereo is HRTF<br>
	 * attribute PanningModelType panningModel;
	 * @return
	 */
	public final native String getPanningModelName() /*-{
		return this.panningModel;
	}-*/;
	
	/**
	 * Default for stereo is HRTF<br>
	 * setPanningModel
	 * @param panningModel
	 */
	public final void setPanningModel(PanningModelType panningModel) {
		setPanningModelName(panningModel.toString());
	}
	
	/**
	 * Default for stereo is HRTF<br>
	 * attribute PanningModelType panningModel;
	 * @param panningModel
	 */
	public final native void setPanningModelName(String panningModel) /*-{
		this.panningModel = panningModel;
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
	 * void setOrientation(double x, double y, double z);
	 * @param x
	 * @param y
	 * @param z
	 */
	public final native void setOrientation(double x, double y, double z) /*-{
		this.setOrientation(x, y, z);
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
	 * getDistanceModel
	 * @return DistanceModelType
	 */
	public final DistanceModelType getDistanceModel() {
		return DistanceModelType.valueOf(getDistanceModelName());
	}
	
	/**
	 * attribute DistanceModelType distanceModel;
	 * @return distanceModel
	 */
	public final native String getDistanceModelName() /*-{
		return this.distanceModel;
	}-*/;
	
	/**
	 * setDistanceModel
	 * @param distanceModel
	 */
	public final void setDistanceModel(DistanceModelType distanceModel) {
		setDistanceModelName(distanceModel.toString());
	}
	
	/**
	 * attribute DistanceModelType distanceModel;
	 * @param distanceModel
	 */
	public final native void setDistanceModelName(String distanceModel) /*-{
		this.distanceModel = distanceModel;
	}-*/;
	
	/**
	 * attribute double refDistance;
	 * @return refDistance
	 */
	public final native double getRefDistance() /*-{
		return this.refDistance;
	}-*/;
	
	/**
	 * attribute double refDistance;
	 * @param refDistance
	 */
	public final native void setRefDistance(double refDistance) /*-{
		this.refDistance = refDistance;
	}-*/;
	
	/**
	 * attribute double maxDistance;
	 * @return maxDistance
	 */
	public final native double getMaxDistance() /*-{
		return this.maxDistance;
	}-*/;
	
	/**
	 * attribute double maxDistance;
	 * @param maxDistance
	 */
	public final native void setMaxDistance(double maxDistance) /*-{
		this.maxDistance = maxDistance;
	}-*/;
	
	/**
	 * attribute double rolloffFactor;
	 * @return rolloffFactor
	 */
	public final native double getRolloffFactor() /*-{
		return this.rolloffFactor;
	}-*/;
	
	/**
	 * attribute double rolloffFactor;
	 * @param rolloffFactor
	 */
	public final native void setRolloffFactor(double rolloffFactor) /*-{
		this.rolloffFactor = rolloffFactor;
	}-*/;
	
	/**
	 * attribute double coneInnerAngle;
	 * @return coneInnerAngle
	 */
	public final native double getConeInnerAngle() /*-{
		return this.coneInnerAngle;
	}-*/;
	
	/**
	 * attribute double coneInnerAngle;
	 * @param coneInnerAngle
	 */
	public final native void setConeInnerAngle(double coneInnerAngle) /*-{
		this.coneInnerAngle = coneInnerAngle;
	}-*/;
	
	/**
	 * attribute double coneOuterAngle;
	 * @return coneOuterAngle
	 */
	public final native double getConeOuterAngle() /*-{
		return this.coneOuterAngle;
	}-*/;
	
	/**
	 * attribute double coneOuterAngle;
	 * @param coneOuterAngle
	 */
	public final native void setConeOuterAngle(double coneOuterAngle) /*-{
		this.coneOuterAngle = coneOuterAngle;
	}-*/;
	
	/**
	 * attribute double coneOuterGain;
	 * @return coneOuterGain
	 */
	public final native double getConeOuterGain() /*-{
		return this.coneOuterGain;
	}-*/;
	
	/**
	 * attribute double coneOuterGain;
	 * @param coneOuterGain
	 */
	public final native void setConeOuterGain(double coneOuterGain) /*-{
		this.coneOuterGain = coneOuterGain;
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected PannerNode() {}

}

/**
 * DistanceModelType.java
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

public enum DistanceModelType {
	
	/** linear */
	LINEAR("linear"),
	/** inverse */
	INVERSE("inverse"),
	/** exponential */
	EXPONENTIAL("exponential");
	
	public String toString() {
		return name;
	}
	
	private DistanceModelType(String name) {
		this.name = name;
	}
	
	private String name;
	
}

/**
 * OverSampleType.java
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

public enum OverSampleType {
	
	/** none */
	NONE("none"),
	/** 2x */
	X2("2x"),
	/** 4x */
	X4("4x");
	
	public String toString() {
		return name;
	}
	
	private OverSampleType(String name) {
		this.name = name;
	}
	
	private String name;
	
}

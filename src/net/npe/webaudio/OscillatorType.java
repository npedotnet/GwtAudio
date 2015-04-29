/**
 * OscillatorType.java
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

public enum OscillatorType {
	
	/** sine */
	SINE("sine"),
	/** square */
	SQUARE("square"),
	/** sawtooth */
	SAWTOOTH("sawtooth"),
	/** triangle */
	TRIANGLE("triangle"),
	/** custom */
	CUSTOM("custom");
	
	public String toString() {
		return name;
	}
	
	private OscillatorType(String name) {
		this.name = name;
	}
	
	private String name;
	
}

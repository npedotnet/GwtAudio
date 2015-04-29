/**
 * BiquadFilterType.java
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

public enum BiquadFilterType {
	
	/** lowpass */
	LOWPASS("lowpass"),
	/** highpass */
	HIGHPASS("highpass"),
	/** bandpass */
	BANDPASS("bandpass"),
	/** lowshelf */
	LOWSHELF("lowshelf"),
	/** highshelf */
	HIGHSHELF("highshelf"),
	/** peaking */
	PEAKING("peaking"),
	/** notch */
	NOTCH("notch"),
	/** allpass */
	ALLPASS("allpass");
	
	public String toString() {
		return name;
	}
	
	private BiquadFilterType(String name) {
		this.name = name;
	}
	
	private String name;
	
}

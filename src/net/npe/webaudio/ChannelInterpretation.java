/**
 * ChannelInterpretation.java
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

public enum ChannelInterpretation {
	
	/** speakers */
	SPEAKERS("speakers"),
	/** discrete */
	DISCRETE("discrete");
	
	public String toString() {
		return name;
	}
	
	private ChannelInterpretation(String name) {
		this.name = name;
	}
	
	private String name;
	
}

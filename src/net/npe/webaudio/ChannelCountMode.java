/**
 * ChannelCountMode.java
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

public enum ChannelCountMode {
	
	/** max */
	MAX("max"),
	/** clamped-max */
	CLAMPED_MAX("clamped-max"),
	/** explicit */
	EXPLICIT("explicit");
	
	public String toString() {
		return name;
	}
	
	private ChannelCountMode(String name) {
		this.name = name;
	}
	
	private String name;
	
}

/**
 * OfflineAudioContext.java
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

public class OfflineAudioContext extends AudioContext {
	
	/**
	 * void startRendering();
	 */
	public final native void startRendering() /*-{
		this.startRendering();
	}-*/;
	
	// TODO attribute EventHandler oncomplete;

}

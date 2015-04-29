/**
 * AudioBuffer.java
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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.typedarrays.shared.Float32Array;

public class AudioBuffer extends JavaScriptObject {
	
	/**
	 * readonly attribute float sampleRate;
	 * @return sampleRate
	 */
	public final native float getSampleRate() /*-{
		return this.sampleRate;
	}-*/;
	
	/**
	 * readonly attribute long length;
	 * @return length
	 */
	public final native int getLength() /*-{
		return this.length;
	}-*/;
	
	/**
	 * in seconds<br>
	 * readonly attribute double duration;
	 * @return duration
	 */
	public final native double getDuration() /*-{
		return this.duration;
	}-*/;
	
	/**
	 * readonly attribute long numberOfChannels;
	 * @return numberOfChannels
	 */
	public final native int numberOfChannels() /*-{
		return this.numberOfChannels;
	}-*/;
	
	/**
	 * Float32Array getChannelData(unsigned long channel);
	 * @param channel
	 * @return ChannelData Float32Array
	 */
	public final native Float32Array getChannelData(int channel) /*-{
		return this.getChannelData(channel);
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AudioBuffer() {}
	
}

/**
 * AudioDestinationNode.java
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

public class AudioDestinationNode extends AudioNode {
	
	/**
	 * readonly attribute MediaStream stream;
	 * @return maxChannelCount
	 */
	public final native int maxChannelCount() /*-{
		return this.maxChannelCount;
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AudioDestinationNode() {}
	
}

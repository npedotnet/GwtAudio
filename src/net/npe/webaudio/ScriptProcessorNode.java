/**
 * ScriptProcessorNode.java
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

public class ScriptProcessorNode extends AudioNode {
	
	// TODO attribute EventHandler onaudioprocess;
	
	/**
	 * readonly attribute long bufferSize;
	 * @return bufferSize
	 */
	public final native int getBufferSize() /*-{
		return this.bufferSize;
	}-*/;

	/**
	 * protected constructor
	 */
	protected ScriptProcessorNode() {}
	
}

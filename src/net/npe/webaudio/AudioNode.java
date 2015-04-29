/**
 * AudioNode.java
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

public class AudioNode extends JavaScriptObject {
	
	/**
	 * void connect(AudioNode destination, optional unsigned long output = 0, optional unsigned long input = 0);
	 * @param destination
	 * @param output
	 * @param input
	 */
	public final native void connect(AudioNode destination, int output, int input) /*-{
		this.connect(destination, output, input);
	}-*/;
	
	/**
	 * void connect(AudioNode destination, optional unsigned long output = 0, optional unsigned long input = 0);
	 * @param destination
	 * @param output
	 */
	public final void connect(AudioNode destination, int output) {
		connect(destination, output, 0);
	}
	
	/**
	 * void connect(AudioNode destination, optional unsigned long output = 0, optional unsigned long input = 0);
	 * @param destination
	 */
	public final void connect(AudioNode destination) {
		connect(destination, 0, 0);
	}
	
	/**
	 * void connect(AudioParam destination, optional unsigned long output = 0);
	 * @param destination
	 * @param output
	 */
	public final native void connect(AudioParam destination, int output) /*-{
		this.connect(destination, output);
	}-*/;
	
	/**
	 * void connect(AudioParam destination, optional unsigned long output = 0);
	 * @param destination
	 */
	public final void connect(AudioParam destination) {
		connect(destination, 0);
	}
	
	/**
	 * void disconnect(optional unsigned long output = 0);
	 * @param output
	 */
	public final native void disconnect(int output) /*-{
		this.disconnect(output);
	}-*/;
	
	/**
	 * void disconnect(optional unsigned long output = 0);
	 */
	public final void disconnect() {
		disconnect(0);
	}
	
	/**
	 * readonly attribute AudioContext context;
	 * @return context
	 */
	public final native AudioContext getContext() /*-{
		return this.context;
	}-*/;
	
	/**
	 * readonly attribute unsigned long numberOfInputs;
	 * @return numberOfInputs
	 */
	public final native int getNumberOfInputs() /*-{
		return this.numberOfInputs;
	}-*/;
	
	/**
	 * readonly attribute unsigned long numberOfOutputs;
	 * @return numberOfOutputs
	 */
	public final native int getNumberOfOutputs() /*-{
		return this.numberOfOutputs;
	}-*/;

	/**
	 * attribute unsigned long channelCount;
	 * @return channelCount
	 */
	public final native int getChannelCount() /*-{
		return this.channelCount;
	}-*/;
	
	/**
	 * attribute unsigned long channelCount;
	 * @param channelCount
	 */
	public final native void setChannelCount(int channelCount) /*-{
		this.channelCount = channelCount;
	}-*/;
	
	/**
	 * getChannelCountMode
	 * @return ChannelCountMode
	 */
	public final ChannelCountMode getChannelCountMode() {
		return ChannelCountMode.valueOf(getChannelCountModeName());
	}
	
	/**
	 * attribute ChannelCountMode channelCountMode;
	 * @return channelCountMode
	 */
	public final native String getChannelCountModeName() /*-{
		return this.channelCountMode;
	}-*/;
	
	/**
	 * setChannelCountMode
	 * @param channelCountMode
	 */
	public final void setChannelCountMode(ChannelCountMode channelCountMode) {
		setChannelCountModeName(channelCountMode.toString());
	}
	
	/**
	 * attribute ChannelCountMode channelCountMode;
	 * @param channelCountMode
	 */
	public final native void setChannelCountModeName(String channelCountMode) /*-{
		this.channelCountMode = channelCountMode;
	}-*/;
	
	/**
	 * getChannelInterpretation
	 * @return ChannelInterpretation
	 */
	public final ChannelInterpretation getChannelInterpretation() {
		return ChannelInterpretation.valueOf(getChannelInterpretationName());
	}
	
	/**
	 * attribute ChannelInterpretation channelInterpretation;
	 * @return channelInterpretation
	 */
	public final native String getChannelInterpretationName() /*-{
		return this.channelInterpretation;
	}-*/;
	
	/**
	 * setChannelInterpretation
	 * @param channelInterpretation
	 */
	public final void setChannelInterpretation(ChannelInterpretation channelInterpretation) {
		setChannelInterpretationName(channelInterpretation.toString());
	}
	
	/**
	 * attribute ChannelInterpretation channelInterpretation;
	 * @param channelInterpretation
	 */
	public final native void setChannelInterpretationName(String channelInterpretation) /*-{
		this.channelInterpretation = channelInterpretation;
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AudioNode() {}
	
}

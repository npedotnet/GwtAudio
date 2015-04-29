/**
 * AudioBufferSourceNode.java
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

public class AudioBufferSourceNode extends AudioNode {

	/**
	 * attribute AudioBuffer? buffer;
	 * @return buffer;
	 */
	public final native AudioBuffer getBuffer() /*-{
		return this.buffer;
	}-*/;
	
	/**
	 * attribute AudioBuffer? buffer;
	 * @param buffer
	 */
	public final native void setBuffer(AudioBuffer buffer) /*-{
		this.buffer = buffer;
	}-*/;
	
	/**
	 * readonly attribute AudioParam playbackRate;
	 * @return playbackRate
	 */
	public final native AudioParam playbackRate() /*-{
		return this.playbackRate;
	}-*/;

	/**
	 * attribute boolean loop;
	 * @return loop
	 */
	public final native boolean getLoop() /*-{
		return this.loop;
	}-*/;
	
	/**
	 * attribute boolean loop;
	 * @param loop
	 */
	public final native void setLoop(boolean loop) /*-{
		this.loop = loop;
	}-*/;
	
	/**
	 * attribute double loopStart;
	 * @return loopStart
	 */
	public final native double getLoopStart() /*-{
		return this.loopStart;
	}-*/;
	
	/**
	 * attribute double loopStart;
	 * @param loopStart
	 */
	public final native void setLoopStart(double loopStart) /*-{
		this.loopStart = loopStart;
	}-*/;
	
	/**
	 * attribute double loopEnd;
	 * @return loopEnd
	 */
	public final native double getLoopEnd() /*-{
		return this.loopEnd;
	}-*/;
	
	/**
	 * attribute double loopEnd;
	 * @param loopEnd
	 */
	public final native void setLoopEnd(double loopEnd) /*-{
		this.loopEnd = loopEnd;
	}-*/;
	
	/**
	 * void start(optional double when = 0, optional double offset = 0, optional double duration);
	 * @param when
	 * @param offset
	 * @param duration
	 */
	public final native void start(double when, double offset, double duration) /*-{
		this.start(when, offset, duration);
	}-*/;
	
	/**
	 * void start(optional double when = 0, optional double offset = 0, optional double duration);
	 * @param when
	 * @param offset
	 */
	public native final void start(double when, double offset) /*-{
		this.start(when, offset);
	}-*/;
	
	/**
	 * void start(optional double when = 0, optional double offset = 0, optional double duration);
	 * @param when
	 */
	public final void start(double when) {
		start(when, 0);
	}
	
	/**
	 * void stop(optional double when = 0);
	 * @param when
	 */
	public native final void stop(double when) /*-{
		this.stop(when);
	}-*/;
	
	/**
	 * void stop(optional double when = 0);
	 */
	public final void stop() {
		stop(0);
	}
	
	/**
	 * protected constructor
	 */
	protected AudioBufferSourceNode() {}
	
}

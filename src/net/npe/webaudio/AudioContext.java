/**
 * AudioContext.java
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
import com.google.gwt.typedarrays.shared.ArrayBuffer;
import com.google.gwt.typedarrays.shared.Float32Array;

public class AudioContext extends JavaScriptObject {
	
	/**
	 * create a AudioContext instance
	 * @return AudioContext or webkitAudioContext
	 */
	public static native AudioContext create() /*-{
		return new AudioContext() || new webkitAudioContext();
	}-*/;
	
	/**
	 * readonly attribute AudioDestinationNode destination;
	 * @return destination
	 */
	public final native AudioDestinationNode getDestination() /*-{
		return this.destination;
	}-*/;

	/**
	 * readonly attribute float sampleRate;
	 * @return sampleRate
	 */
	public final native float getSampleRate() /*-{
		return this.sampleRate;
	}-*/;
	
	/**
	 * readonly attribute double currentTime;
	 * @return currentTime
	 */
	public final native double currentTime() /*-{
		return this.currentTime;
	}-*/;
	
	/**
	 * readonly attribute AudioListener listener;
	 * @return listener
	 */
	public final native AudioListener listener() /*-{
		return this.listener;
	}-*/;
	
	/**
	 * AudioBuffer createBuffer(unsigned long numberOfChannels, unsigned long length, float sampleRate);
	 * @param numberOfChannels
	 * @param length
	 * @param sampleRate
	 * @return AudioBuffer
	 */
	public final native AudioBuffer createBuffer(int numberOfChannels, int length, float sampleRate) /*-{
		return this.createBuffer(numberOfChannels, length, sampleRate);
	}-*/;
	
	/**
	 * void decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback, optional DecodeErrorCallback errorCallback);
	 * @param audioData
	 * @param handler
	 */
	public final native void decodeAudioData(ArrayBuffer audioData, DecodeHandler handler) /*-{
		this.decodeAudioData(audioData, function(buffer) {
			handler.@net.npe.webaudio.DecodeHandler::onSuccess(Lnet/npe/webaudio/AudioBuffer;)(buffer);
		}, function() {
			handler.@net.npe.webaudio.DecodeHandler::onError();
		});
	}-*/;
	
	/**
	 * AudioBufferSourceNode createBufferSource();
	 * @return AudioBufferSourceNode
	 */
	public final native AudioBufferSourceNode createBufferSource() /*-{
		return this.createBufferSource();
	}-*/;
	
	/**
	 * MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
	 * @param mediaElement
	 * @return MediaElementAudioSourceNode
	 */
	public final native MediaElementAudioSourceNode createMediaElementSource(JavaScriptObject mediaElement) /*-{
		return this.createMediaElementSource(mediaElement);
	}-*/;
	
	/**
	 * MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
	 * @param mediaStream
	 * @return MediaStreamAudioSourceNode
	 */
	public final native MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream) /*-{
		return this.createMediaStreamSource(mediaStream);
	}-*/;
	
	/**
	 * MediaStreamAudioDestinationNode createMediaStreamDestination();
	 * @return MediaStreamAudioDestinationNode
	 */
	public final native MediaStreamAudioDestinationNode createMediaStreamDestination() /*-{
		return this.createMediaStreamDestination();
	}-*/;
	
	/**
	 * ScriptProcessorNode createScriptProcessor(optional unsigned long bufferSize = 0,<br>
	 * optional unsigned long numberOfInputChannels = 2,<br>
	 * optional unsigned long numberOfOutputChannels = 2);
	 * @param bufferSize
	 * @param numberOfInputChannels
	 * @param numberOfOutputChannels
	 * @return ScriptProcessorNode
	 */
	public final native ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels, int numberOfOutputChannels) /*-{
		return this.createScriptProcessor(bufferSize, numberOfInputChannels, numberOfOutputChannels);
	}-*/;
	
	/**
	 * ScriptProcessorNode createScriptProcessor(optional unsigned long bufferSize = 0,<br>
	 * optional unsigned long numberOfInputChannels = 2,<br>
	 * optional unsigned long numberOfOutputChannels = 2);
	 * @param bufferSize
	 * @param numberOfInputChannels
	 * @return ScriptProcessorNode
	 */
	public final ScriptProcessorNode createScriptProcessor(int bufferSize, int numberOfInputChannels) {
		return createScriptProcessor(bufferSize, numberOfInputChannels, 2);
	}
	
	/**
	 * ScriptProcessorNode createScriptProcessor(optional unsigned long bufferSize = 0,<br>
	 * optional unsigned long numberOfInputChannels = 2,<br>
	 * optional unsigned long numberOfOutputChannels = 2);
	 * @param bufferSize
	 * @return ScriptProcessorNode
	 */
	public final ScriptProcessorNode createScriptProcessor(int bufferSize) {
		return createScriptProcessor(bufferSize, 2, 2);
	}
	
	/**
	 * ScriptProcessorNode createScriptProcessor(optional unsigned long bufferSize = 0,<br>
	 * optional unsigned long numberOfInputChannels = 2,<br>
	 * optional unsigned long numberOfOutputChannels = 2);
	 * @return ScriptProcessorNode
	 */
	public final ScriptProcessorNode createScriptProcessor() {
		return createScriptProcessor(0, 2, 2);
	}
	
	/**
	 * AnalyserNode createAnalyser();
	 * @return AnalyserNode
	 */
	public final native AnalyserNode createAnalyser() /*-{
		return this.createAnalyser();
	}-*/;
	
	/**
	 * GainNode createGain();
	 * @return GainNode
	 */
	public final native GainNode createGain() /*-{
		return this.createGain();
	}-*/;
	
	/**
	 * DelayNode createDelay(optional double maxDelayTime = 1.0);
	 * @param maxDelayTime
	 * @return DelayNode
	 */
	public final native DelayNode createDelay(double maxDelayTime) /*-{
		return this.createDelay(maxDelayTime);
	}-*/;
	
	/**
	 * DelayNode createDelay(optional double maxDelayTime = 1.0);
	 * @return DelayNode
	 */
	public final DelayNode createDelay() {
		return createDelay(1.0);
	}
	
	/**
	 * BiquadFilterNode createBiquadFilter();
	 * @return BiquadFilterNode
	 */
	public final native BiquadFilterNode createBiquadFilter() /*-{
		return this.createBiquadFilter();
	}-*/;
	
	/**
	 * WaveShaperNode createWaveShaper();
	 * @return WaveShaperNode
	 */
	public final native WaveShaperNode createWaveShaper() /*-{
		return this.createWaveShaper();
	}-*/;
	
	/**
	 * PannerNode createPanner();
	 * @return PannerNode
	 */
	public final native PannerNode createPanner() /*-{
		return this.createPanner();
	}-*/;
	
	/**
	 * ConvolverNode createConvolver();
	 * @return ConvolverNode
	 */
	public final native ConvolverNode createConvolver() /*-{
		return this.createConvolver();
	}-*/;
	
	/**
	 * ChannelSplitterNode createChannelSplitter(optional unsigned long numberOfOutputs = 6);
	 * @param numberOfOutputs
	 * @return ChannelSplitterNode
	 */
	public final native ChannelSplitterNode createChannelSplitter(int numberOfOutputs) /*-{
		return this.createChannelSplitter(numberOfOutputs);
	}-*/;
	
	/**
	 * ChannelSplitterNode createChannelSplitter(optional unsigned long numberOfOutputs = 6);
	 * @return ChannelSplitterNode
	 */
	public final ChannelSplitterNode createChannelSplitter() {
		return createChannelSplitter(6);
	}
	
	/**
	 * ChannelMergerNode createChannelMerger(optional unsigned long numberOfInputs = 6);
	 * @param numberOfInputs
	 * @return ChannelMergerNode
	 */
	public final native ChannelMergerNode createChannelMerger(int numberOfInputs) /*-{
		return this.createChannelMerger(numberOfInputs);
	}-*/;
	
	/**
	 * ChannelMergerNode createChannelMerger(optional unsigned long numberOfInputs = 6);
	 * @return ChannelMergerNode
	 */
	public final ChannelMergerNode createChannelMerger() {
		return createChannelMerger(6);
	}
	
	/**
	 * DynamicsCompressorNode createDynamicsCompressor();
	 * @return DynamicsCompressorNode
	 */
	public final native DynamicsCompressorNode createDynamicsCompressor() /*-{
		return this.createDynamicsCompressor();
	}-*/;
	
	/**
	 * OscillatorNode createOscillator();
	 * @return OscillatorNode
	 */
	public final native OscillatorNode createOscillator() /*-{
		return this.createOscillator();
	}-*/;
	
	/**
	 * PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag);
	 * @param real
	 * @param imag
	 * @return PeriodicWave
	 */
	public final native PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag) /*-{
		return this.createPeriodicWave(real, imag);
	}-*/;
	
	/**
	 * protected constructor
	 */
	protected AudioContext() {}

}

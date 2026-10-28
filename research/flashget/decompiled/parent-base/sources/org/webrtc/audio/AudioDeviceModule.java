package org.webrtc.audio;

/* loaded from: classes9.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    void setSpeakerMute(boolean z4);

    void setVolume(float f4);
}

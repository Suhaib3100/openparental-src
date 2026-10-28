package org.webrtc.audio;

@Deprecated
/* loaded from: classes9.dex */
public class LegacyAudioDeviceModule implements AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z4) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z4);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setVolume(float f4) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setVolume(f4);
    }
}

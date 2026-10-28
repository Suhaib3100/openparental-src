package com.tencent.liteav.audio;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public interface TXAudioEffectManager {

    public static class AudioMusicParam {

        /* renamed from: id, reason: collision with root package name */
        public int f71741id;
        public String path;
        public int loopCount = 0;
        public boolean publish = false;
        public boolean isShortFile = false;
        public long startTimeMS = 0;
        public long endTimeMS = -1;

        public AudioMusicParam(int i4, String str) {
            this.path = str;
            this.f71741id = i4;
        }

        public String toString() {
            return ProtectedSandApp.s("儍\u0001") + this.path + ProtectedSandApp.s("儎\u0001") + this.f71741id + ProtectedSandApp.s("儏\u0001") + this.loopCount + ProtectedSandApp.s("儐\u0001") + this.publish + ProtectedSandApp.s("儑\u0001") + this.isShortFile + ProtectedSandApp.s("儒\u0001") + this.startTimeMS + ProtectedSandApp.s("儓\u0001") + this.endTimeMS;
        }
    }

    public interface TXMusicPlayObserver {
        void onComplete(int i4, int i5);

        void onPlayProgress(int i4, long j4, long j5);

        void onStart(int i4, int i5);
    }

    public interface TXMusicPreloadObserver {
        void onLoadError(int i4, int i5);

        void onLoadProgress(int i4, int i5);
    }

    public enum TXVoiceChangerType {
        TXLiveVoiceChangerType_0(0),
        TXLiveVoiceChangerType_1(1),
        TXLiveVoiceChangerType_2(2),
        TXLiveVoiceChangerType_3(3),
        TXLiveVoiceChangerType_4(4),
        TXLiveVoiceChangerType_5(5),
        TXLiveVoiceChangerType_6(6),
        TXLiveVoiceChangerType_7(7),
        TXLiveVoiceChangerType_8(8),
        TXLiveVoiceChangerType_9(9),
        TXLiveVoiceChangerType_10(10),
        TXLiveVoiceChangerType_11(11),
        TXLiveVoiceChangerType_12(12),
        TXLiveVoiceChangerType_13(13);

        private int nativeValue;

        TXVoiceChangerType(int i4) {
            this.nativeValue = i4;
        }

        public final int getNativeValue() {
            return this.nativeValue;
        }
    }

    public enum TXVoiceReverbType {
        TXLiveVoiceReverbType_0(0),
        TXLiveVoiceReverbType_1(1),
        TXLiveVoiceReverbType_2(2),
        TXLiveVoiceReverbType_3(3),
        TXLiveVoiceReverbType_4(4),
        TXLiveVoiceReverbType_5(5),
        TXLiveVoiceReverbType_6(6),
        TXLiveVoiceReverbType_7(7),
        TXLiveVoiceReverbType_8(8),
        TXLiveVoiceReverbType_9(9),
        TXLiveVoiceReverbType_10(10),
        TXLiveVoiceReverbType_11(11);

        private int nativeValue;

        TXVoiceReverbType(int i4) {
            this.nativeValue = i4;
        }

        public final int getNativeValue() {
            return this.nativeValue;
        }
    }

    void enableVoiceEarMonitor(boolean z4);

    long getMusicCurrentPosInMS(int i4);

    long getMusicDurationInMS(String str);

    int getMusicTrackCount(int i4);

    void pausePlayMusic(int i4);

    boolean preloadMusic(AudioMusicParam audioMusicParam);

    void resumePlayMusic(int i4);

    void seekMusicToPosInMS(int i4, int i5);

    void setAllMusicVolume(int i4);

    void setMusicObserver(int i4, TXMusicPlayObserver tXMusicPlayObserver);

    void setMusicPitch(int i4, float f4);

    void setMusicPlayoutVolume(int i4, int i5);

    void setMusicPublishVolume(int i4, int i5);

    void setMusicScratchSpeedRate(int i4, float f4);

    void setMusicSpeedRate(int i4, float f4);

    void setMusicTrack(int i4, int i5);

    void setPreloadObserver(TXMusicPreloadObserver tXMusicPreloadObserver);

    void setVoiceCaptureVolume(int i4);

    void setVoiceChangerType(TXVoiceChangerType tXVoiceChangerType);

    void setVoiceEarMonitorVolume(int i4);

    void setVoicePitch(double d5);

    void setVoiceReverbType(TXVoiceReverbType tXVoiceReverbType);

    boolean startPlayMusic(AudioMusicParam audioMusicParam);

    void stopPlayMusic(int i4);
}

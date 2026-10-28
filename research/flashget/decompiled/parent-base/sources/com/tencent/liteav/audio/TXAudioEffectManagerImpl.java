package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@JNINamespace("liteav::manager")
/* loaded from: classes7.dex */
public class TXAudioEffectManagerImpl implements TXAudioEffectManager {
    private static final int EFFECT_PLAYER_ID_TYPE = 2;
    private static final String TAG = ProtectedSandApp.s("儮\u0001");
    private List<Integer> mEffectIdList = new ArrayList();
    private final MusicPlayObserver mMusicPlayObserver;
    private final MusicPreloadObserver mMusicPreloadObserver;
    private long mNativeAudioEffectMgr;

    static class AudioBgmParams {
        private TXAudioEffectManager.AudioMusicParam mParams;

        public AudioBgmParams(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
            this.mParams = audioMusicParam;
        }

        public long getEndTimeMS() {
            return this.mParams.endTimeMS;
        }

        public int getLoopCount() {
            return this.mParams.loopCount;
        }

        public String getPath() {
            return this.mParams.path;
        }

        public long getStartTimeMS() {
            return this.mParams.startTimeMS;
        }

        public boolean isPublish() {
            return this.mParams.publish;
        }
    }

    static class MusicPlayObserver {
        private final HashMap<Long, TXAudioEffectManager.TXMusicPlayObserver> mObserverMap = new HashMap<>();

        MusicPlayObserver() {
        }

        public void addObserver(long j4, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
            if (tXMusicPlayObserver == null) {
                return;
            }
            synchronized (this) {
                this.mObserverMap.put(Long.valueOf(j4), tXMusicPlayObserver);
            }
        }

        public void onComplete(long j4, int i4) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j4));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onComplete((int) j4, i4);
            }
        }

        public void onPlayProgress(long j4, long j5, long j6) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j4));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onPlayProgress((int) j4, j5, j6);
            }
        }

        public void onStart(long j4, int i4) {
            TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver;
            synchronized (this) {
                tXMusicPlayObserver = this.mObserverMap.get(Long.valueOf(j4));
            }
            if (tXMusicPlayObserver != null) {
                tXMusicPlayObserver.onStart((int) j4, i4);
            }
        }

        public void removeObserver(long j4) {
            synchronized (this) {
                this.mObserverMap.remove(Long.valueOf(j4));
            }
        }
    }

    static class MusicPreloadObserver {
        private TXAudioEffectManager.TXMusicPreloadObserver mObserver;

        MusicPreloadObserver() {
        }

        public void onLoadError(long j4, int i4) {
            TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadError((int) j4, i4);
            }
        }

        public void onLoadProgress(long j4, int i4) {
            TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver = this.mObserver;
            if (tXMusicPreloadObserver != null) {
                tXMusicPreloadObserver.onLoadProgress((int) j4, i4);
            }
        }

        public void setObserver(TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
            this.mObserver = tXMusicPreloadObserver;
        }
    }

    public TXAudioEffectManagerImpl(long j4) {
        this.mNativeAudioEffectMgr = 0L;
        MusicPlayObserver musicPlayObserver = new MusicPlayObserver();
        this.mMusicPlayObserver = musicPlayObserver;
        MusicPreloadObserver musicPreloadObserver = new MusicPreloadObserver();
        this.mMusicPreloadObserver = musicPreloadObserver;
        this.mNativeAudioEffectMgr = j4;
        if (j4 != 0) {
            nativeSetMusicObserver(j4, musicPlayObserver);
            nativeSetPreloadObserver(this.mNativeAudioEffectMgr, musicPreloadObserver);
        }
    }

    private static long convertToEffectId(int i4) {
        return 8589934592L | i4;
    }

    private static native void nativeDestroy(long j4);

    private static native void nativeEnableVoiceEarMonitor(long j4, boolean z4);

    private static native long nativeGetMusicCurrentPosInMS(long j4, long j5);

    private static native long nativeGetMusicDurationInMS(long j4, String str);

    private static native int nativeGetMusicTrackCount(long j4, long j5);

    private static native void nativePausePlayMusic(long j4, long j5);

    private static native void nativePreloadMusic(long j4, long j5, AudioBgmParams audioBgmParams);

    private static native void nativeResumePlayMusic(long j4, long j5);

    private static native void nativeSeekMusicToPosInMS(long j4, long j5, long j6);

    private static native void nativeSetAllMusicVolume(long j4, int i4);

    private static native void nativeSetMusicObserver(long j4, MusicPlayObserver musicPlayObserver);

    private static native void nativeSetMusicPitch(long j4, long j5, float f4);

    private static native void nativeSetMusicPlayoutVolume(long j4, long j5, int i4);

    private static native void nativeSetMusicPublishVolume(long j4, long j5, int i4);

    private static native void nativeSetMusicScratchSpeedRate(long j4, long j5, float f4);

    private static native void nativeSetMusicSpeedRate(long j4, long j5, float f4);

    private static native void nativeSetMusicTrack(long j4, long j5, int i4);

    private static native void nativeSetPreloadObserver(long j4, MusicPreloadObserver musicPreloadObserver);

    private static native void nativeSetVoiceCaptureVolume(long j4, int i4);

    private static native void nativeSetVoiceChangerType(long j4, int i4);

    private static native void nativeSetVoiceEarMonitorVolume(long j4, int i4);

    private static native void nativeSetVoicePitch(long j4, double d5);

    private static native void nativeSetVoiceReverbType(long j4, int i4);

    private static native void nativeStartPlayMusic(long j4, long j5, AudioBgmParams audioBgmParams);

    private static native void nativeStopPlayMusic(long j4, long j5);

    public static TXAudioEffectManager.TXVoiceChangerType voiceChangerTypeFromInt(int i4) {
        return i4 == 0 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0 : i4 == 1 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_1 : i4 == 2 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_2 : i4 == 3 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_3 : i4 == 4 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_4 : i4 == 5 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_5 : i4 == 6 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_6 : i4 == 7 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_7 : i4 == 8 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_8 : i4 == 9 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_9 : i4 == 10 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_10 : i4 == 11 ? TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_11 : TXAudioEffectManager.TXVoiceChangerType.TXLiveVoiceChangerType_0;
    }

    public static TXAudioEffectManager.TXVoiceReverbType voiceReverbTypeFromInt(int i4) {
        return i4 == 0 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0 : i4 == 1 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_1 : i4 == 2 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_2 : i4 == 3 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_3 : i4 == 4 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_4 : i4 == 5 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_5 : i4 == 6 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_6 : i4 == 7 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_7 : i4 == 8 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_8 : i4 == 9 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_9 : i4 == 10 ? TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_10 : TXAudioEffectManager.TXVoiceReverbType.TXLiveVoiceReverbType_0;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void enableVoiceEarMonitor(boolean z4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeEnableVoiceEarMonitor(j4, z4);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeDestroy(j4);
            this.mNativeAudioEffectMgr = 0L;
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicCurrentPosInMS(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            return nativeGetMusicCurrentPosInMS(j4, i4);
        }
        return 0L;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public long getMusicDurationInMS(String str) {
        if (TextUtils.isEmpty(str)) {
            LiteavLog.e(ProtectedSandApp.s("儮\u0001"), ProtectedSandApp.s("儯\u0001"));
            return 0L;
        }
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            return nativeGetMusicDurationInMS(j4, str);
        }
        return 0L;
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public int getMusicTrackCount(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            return nativeGetMusicTrackCount(j4, i4);
        }
        return 0;
    }

    public void pauseAudioEffect(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativePausePlayMusic(j4, convertToEffectId(i4));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void pausePlayMusic(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativePausePlayMusic(j4, i4);
        }
    }

    public void playAudioEffect(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null || TextUtils.isEmpty(audioMusicParam.path)) {
            LiteavLog.e(ProtectedSandApp.s("儮\u0001"), ProtectedSandApp.s("儰\u0001"));
            return;
        }
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeStartPlayMusic(j4, convertToEffectId(audioMusicParam.f71741id), new AudioBgmParams(audioMusicParam));
            synchronized (this) {
                this.mEffectIdList.add(Integer.valueOf(audioMusicParam.f71741id));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean preloadMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            LiteavLog.e(ProtectedSandApp.s("儮\u0001"), ProtectedSandApp.s("儱\u0001"));
            return false;
        }
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 == 0) {
            return true;
        }
        nativePreloadMusic(j4, audioMusicParam.f71741id, new AudioBgmParams(audioMusicParam));
        return true;
    }

    public void resumeAudioEffect(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeResumePlayMusic(j4, convertToEffectId(i4));
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void resumePlayMusic(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeResumePlayMusic(j4, i4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void seekMusicToPosInMS(int i4, int i5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSeekMusicToPosInMS(j4, i4, i5);
        }
    }

    public void setAllAudioEffectsVolume(int i4) {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                try {
                    Iterator<Integer> it = this.mEffectIdList.iterator();
                    while (it.hasNext()) {
                        setAudioEffectVolume(it.next().intValue(), i4);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setAllMusicVolume(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetAllMusicVolume(j4, i4);
        }
    }

    public void setAudioEffectVolume(int i4, int i5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicPlayoutVolume(j4, convertToEffectId(i4), i5);
            nativeSetMusicPublishVolume(this.mNativeAudioEffectMgr, convertToEffectId(i4), i5);
        }
    }

    public void setEffectObserver(int i4, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(convertToEffectId(i4), tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(convertToEffectId(i4));
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicObserver(int i4, TXAudioEffectManager.TXMusicPlayObserver tXMusicPlayObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            if (tXMusicPlayObserver != null) {
                this.mMusicPlayObserver.addObserver(i4, tXMusicPlayObserver);
            } else {
                this.mMusicPlayObserver.removeObserver(i4);
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPitch(int i4, float f4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicPitch(j4, i4, f4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPlayoutVolume(int i4, int i5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicPlayoutVolume(j4, i4, i5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicPublishVolume(int i4, int i5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicPublishVolume(j4, i4, i5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicScratchSpeedRate(int i4, float f4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicScratchSpeedRate(j4, i4, f4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicSpeedRate(int i4, float f4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicSpeedRate(j4, i4, f4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setMusicTrack(int i4, int i5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetMusicTrack(j4, i4, i5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setPreloadObserver(TXAudioEffectManager.TXMusicPreloadObserver tXMusicPreloadObserver) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPreloadObserver.setObserver(tXMusicPreloadObserver);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceCaptureVolume(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetVoiceCaptureVolume(j4, i4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceChangerType(TXAudioEffectManager.TXVoiceChangerType tXVoiceChangerType) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 == 0 || tXVoiceChangerType == null) {
            return;
        }
        nativeSetVoiceChangerType(j4, tXVoiceChangerType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceEarMonitorVolume(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetVoiceEarMonitorVolume(j4, i4);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoicePitch(double d5) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeSetVoicePitch(j4, d5);
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void setVoiceReverbType(TXAudioEffectManager.TXVoiceReverbType tXVoiceReverbType) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 == 0 || tXVoiceReverbType == null) {
            return;
        }
        nativeSetVoiceReverbType(j4, tXVoiceReverbType.getNativeValue());
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public boolean startPlayMusic(TXAudioEffectManager.AudioMusicParam audioMusicParam) {
        if (audioMusicParam == null) {
            LiteavLog.e(ProtectedSandApp.s("儮\u0001"), ProtectedSandApp.s("儰\u0001"));
            return false;
        }
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 == 0) {
            return true;
        }
        nativeStartPlayMusic(j4, audioMusicParam.f71741id, new AudioBgmParams(audioMusicParam));
        return true;
    }

    public void stopAllAudioEffects() {
        if (this.mNativeAudioEffectMgr != 0) {
            synchronized (this) {
                try {
                    for (Integer num : this.mEffectIdList) {
                        this.mMusicPlayObserver.removeObserver(convertToEffectId(num.intValue()));
                        nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(num.intValue()));
                    }
                    this.mEffectIdList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void stopAudioEffect(int i4) {
        if (this.mNativeAudioEffectMgr != 0) {
            this.mMusicPlayObserver.removeObserver(convertToEffectId(i4));
            nativeStopPlayMusic(this.mNativeAudioEffectMgr, convertToEffectId(i4));
            synchronized (this) {
                try {
                    int indexOf = this.mEffectIdList.indexOf(Integer.valueOf(i4));
                    if (indexOf >= 0) {
                        this.mEffectIdList.remove(indexOf);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager
    public void stopPlayMusic(int i4) {
        long j4 = this.mNativeAudioEffectMgr;
        if (j4 != 0) {
            nativeStopPlayMusic(j4, i4);
        }
    }
}

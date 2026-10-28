package com.tencent.trtc;

import com.tencent.liteav.trtc.TXChorusMusicPlayerImpl;
import com.tencent.trtc.TRTCCloudDef;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class TXChorusMusicPlayer {

    public interface ITXChorusPlayerListener {
        void onChorusError(TXChorusError tXChorusError, String str);

        void onChorusMusicLoadProgress(String str, float f4);

        void onChorusMusicLoadSucceed(String str, List<TXLyricLine> list, List<TXReferencePitch> list2);

        void onChorusPaused();

        void onChorusRequireLoadMusic(String str);

        void onChorusResumed();

        void onChorusStarted();

        void onChorusStopped();

        void onMusicProgressUpdated(long j4, long j5);

        void onNetworkQualityUpdated(int i4, int i5, int i6);

        void onVoicePitchUpdated(int i4, boolean z4, long j4);

        void onVoiceScoreUpdated(int i4, int i5, int i6);

        void shouldDecryptAudioData(ByteBuffer byteBuffer);
    }

    public static class TXChorusCopyrightedMusicParams {
        public String musicId = null;
        public String playToken = null;
        public String copyrightedLicenseKey = null;
        public String copyrightedLicenseUrl = null;
    }

    public enum TXChorusError {
        TXChorusErrorInvalidParameters,
        TXChorusErrorTrtcCloudNotFound,
        TXChorusErrorRestrictedToLeadSinger,
        TXChorusErrorMusicPreloadRequired,
        TXChorusErrorMusicLoadFailed,
        TXChorusErrorMusicDecodeFailed,
        TXChorusErrorEnterRoomFailed,
        TXChorusErrorRoomDisconnected,
        TXChorusErrorTrtcError
    }

    public static class TXChorusExternalMusicParams {
        public String musicId = null;
        public String musicUrl = null;
        public String accompanyUrl = null;
        public boolean isEncrypted = false;
        public int encryptBlockLength = 0;
    }

    public static class TXChorusLyricCharacter {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public String utf8Character = null;
    }

    public enum TXChorusMusicTrack {
        TXChorusAccompaniment,
        TXChorusOriginalSong
    }

    public enum TXChorusRole {
        TXChorusRoleLeadSinger,
        TXChorusRoleBackSinger,
        TXChorusRoleAnchor,
        TXChorusRoleAudience
    }

    public static class TXChorusYsdMusicParams {
        public String musicId = null;
        public String userId = null;
        public String userToken = null;
        public String deviceId = null;
        public String appId = null;
        public String appKey = null;
        public boolean isChargedOnce = false;
    }

    public static class TXLyricLine {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public List<TXChorusLyricCharacter> characterArray = null;
    }

    public static class TXReferencePitch {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public int referencePitch = 0;
    }

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, ITXChorusPlayerListener iTXChorusPlayerListener) {
        return TXChorusMusicPlayerImpl.create(tRTCCloud, str, iTXChorusPlayerListener);
    }

    public abstract void callExperimentalAPI(String str);

    public abstract void destroy();

    public abstract void loadExternalMusic(TXChorusExternalMusicParams tXChorusExternalMusicParams);

    public abstract void loadMusic(TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams);

    public abstract void loadYsdMusic(TXChorusYsdMusicParams tXChorusYsdMusicParams);

    public abstract void pause();

    public abstract void resume();

    public abstract void seek(long j4);

    public abstract void setChorusRole(TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams);

    public abstract void setListener(ITXChorusPlayerListener iTXChorusPlayerListener);

    public abstract void setMusicPitch(float f4);

    public abstract void setPlayoutVolume(int i4);

    public abstract void setPublishVolume(int i4);

    public abstract void start();

    public abstract void stop();

    public abstract void switchMusicTrack(TXChorusMusicTrack tXChorusMusicTrack);
}

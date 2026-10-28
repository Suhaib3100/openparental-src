package com.tencent.liteav.trtc;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TXChorusMusicPlayer;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@JNINamespace("liteav::chorus")
/* loaded from: classes7.dex */
public class TXChorusMusicPlayerImpl extends TXChorusMusicPlayer {
    private static final String TAG = ProtectedSandApp.s("呲\u0001");
    private final ChorusPlayerListener mListener;
    private long mNativePtr;
    private TRTCCloud mSubTRTCCloud;
    private TRTCCloud mTRTCCloud;

    /* renamed from: com.tencent.liteav.trtc.TXChorusMusicPlayerImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72075a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f72076b;

        static {
            int[] iArr = new int[TXChorusMusicPlayer.TXChorusMusicTrack.values().length];
            f72076b = iArr;
            try {
                iArr[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusAccompaniment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72076b[TXChorusMusicPlayer.TXChorusMusicTrack.TXChorusOriginalSong.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TXChorusMusicPlayer.TXChorusRole.values().length];
            f72075a = iArr2;
            try {
                iArr2[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72075a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleBackSinger.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f72075a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAnchor.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72075a[TXChorusMusicPlayer.TXChorusRole.TXChorusRoleAudience.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static class EnterRoomParams {

        /* renamed from: a, reason: collision with root package name */
        private final TRTCCloudDef.TRTCParams f72078a;

        public EnterRoomParams(TRTCCloudDef.TRTCParams tRTCParams) {
            this.f72078a = tRTCParams;
        }

        public String getBusinessInfo() {
            return this.f72078a.businessInfo;
        }

        public String getPrivateMapKey() {
            return this.f72078a.privateMapKey;
        }

        public int getRole() {
            return this.f72078a.role;
        }

        public int getRoomId() {
            return this.f72078a.roomId;
        }

        public int getSdkAppId() {
            return this.f72078a.sdkAppId;
        }

        public String getStrRoomId() {
            return this.f72078a.strRoomId;
        }

        public String getStreamId() {
            return this.f72078a.streamId;
        }

        public String getUserDefineRecordId() {
            return this.f72078a.userDefineRecordId;
        }

        public String getUserId() {
            return this.f72078a.userId;
        }

        public String getUserSig() {
            return this.f72078a.userSig;
        }
    }

    static class TXChorusLyricCharacterList {

        /* renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXChorusLyricCharacter> f72079a;

        public TXChorusLyricCharacterList(int i4) {
            this.f72079a = new ArrayList(i4);
        }

        public void add(int i4, long j4, long j5, String str) {
            TXChorusMusicPlayer.TXChorusLyricCharacter tXChorusLyricCharacter = new TXChorusMusicPlayer.TXChorusLyricCharacter();
            tXChorusLyricCharacter.startTimeMs = j4;
            tXChorusLyricCharacter.durationMs = j5;
            tXChorusLyricCharacter.utf8Character = str;
            this.f72079a.add(i4, tXChorusLyricCharacter);
        }

        public List<TXChorusMusicPlayer.TXChorusLyricCharacter> getChorusLyricCharacterList() {
            return this.f72079a;
        }
    }

    static class TXLyricLineList {

        /* renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXLyricLine> f72080a;

        public TXLyricLineList(int i4) {
            this.f72080a = new ArrayList(i4);
        }

        public void add(int i4, long j4, long j5, List<TXChorusMusicPlayer.TXChorusLyricCharacter> list) {
            TXChorusMusicPlayer.TXLyricLine tXLyricLine = new TXChorusMusicPlayer.TXLyricLine();
            tXLyricLine.startTimeMs = j4;
            tXLyricLine.durationMs = j5;
            tXLyricLine.characterArray = list;
            this.f72080a.add(i4, tXLyricLine);
        }

        public List<TXChorusMusicPlayer.TXLyricLine> getLyricLineList() {
            return this.f72080a;
        }
    }

    static class TXReferencePitchList {

        /* renamed from: a, reason: collision with root package name */
        final List<TXChorusMusicPlayer.TXReferencePitch> f72081a;

        public TXReferencePitchList(int i4) {
            this.f72081a = new ArrayList(i4);
        }

        public void add(int i4, long j4, long j5, int i5) {
            TXChorusMusicPlayer.TXReferencePitch tXReferencePitch = new TXChorusMusicPlayer.TXReferencePitch();
            tXReferencePitch.startTimeMs = j4;
            tXReferencePitch.durationMs = j5;
            tXReferencePitch.referencePitch = i5;
            this.f72081a.add(i4, tXReferencePitch);
        }

        public List<TXChorusMusicPlayer.TXReferencePitch> getTXReferencePitchList() {
            return this.f72081a;
        }
    }

    private TXChorusMusicPlayerImpl(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        long j4;
        String s4 = ProtectedSandApp.s("呲\u0001");
        String s5 = ProtectedSandApp.s("味\u0001");
        this.mListener = new ChorusPlayerListener((byte) 0);
        long j5 = 0;
        this.mNativePtr = 0L;
        this.mTRTCCloud = null;
        this.mSubTRTCCloud = null;
        if (tRTCCloud == null) {
            return;
        }
        this.mTRTCCloud = tRTCCloud;
        try {
            j4 = parseNativePointer(tRTCCloud.callExperimentalAPI(s5));
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("呴\u0001"), th);
            j4 = 0;
        }
        try {
            TRTCCloud createSubCloud = tRTCCloud.createSubCloud();
            this.mSubTRTCCloud = createSubCloud;
            j5 = parseNativePointer(createSubCloud.callExperimentalAPI(s5));
        } catch (Throwable th2) {
            LiteavLog.e(s4, ProtectedSandApp.s("呵\u0001"), th2);
        }
        long j6 = j5;
        ChorusPlayerListener chorusPlayerListener = this.mListener;
        chorusPlayerListener.f72077a = iTXChorusPlayerListener;
        this.mNativePtr = nativeCreate(j4, j6, str, chorusPlayerListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TXChorusMusicPlayer.TXChorusError convertIntValueToTXChorusError(int i4) {
        switch (i4) {
            case 1:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorInvalidParameters;
            case 2:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcCloudNotFound;
            case 3:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRestrictedToLeadSinger;
            case 4:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicPreloadRequired;
            case 5:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicLoadFailed;
            case 6:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorMusicDecodeFailed;
            case 7:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorEnterRoomFailed;
            case 8:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorRoomDisconnected;
            case 9:
                return TXChorusMusicPlayer.TXChorusError.TXChorusErrorTrtcError;
            default:
                LiteavLog.w(ProtectedSandApp.s("呲\u0001"), ProtectedSandApp.s("呶\u0001").concat(String.valueOf(i4)));
                return null;
        }
    }

    public static TXChorusMusicPlayer create(TRTCCloud tRTCCloud, String str, TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return new TXChorusMusicPlayerImpl(tRTCCloud, str, iTXChorusPlayerListener);
    }

    private static int getTXChorusMusicTrackIntValue(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        String s4 = ProtectedSandApp.s("呲\u0001");
        if (tXChorusMusicTrack == null) {
            LiteavLog.w(s4, ProtectedSandApp.s("呷\u0001").concat(String.valueOf(tXChorusMusicTrack)));
            return -1;
        }
        int i4 = AnonymousClass1.f72076b[tXChorusMusicTrack.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                LiteavLog.w(s4, ProtectedSandApp.s("呸\u0001").concat(String.valueOf(tXChorusMusicTrack)));
                return -1;
            }
        }
        return i5;
    }

    private static int getTXChorusRoleIntValue(TXChorusMusicPlayer.TXChorusRole tXChorusRole) {
        String s4 = ProtectedSandApp.s("呲\u0001");
        if (tXChorusRole == null) {
            LiteavLog.w(s4, ProtectedSandApp.s("呹\u0001").concat(String.valueOf(tXChorusRole)));
            return -1;
        }
        int i4 = AnonymousClass1.f72075a[tXChorusRole.ordinal()];
        int i5 = 1;
        if (i4 != 1) {
            i5 = 2;
            if (i4 != 2) {
                i5 = 3;
                if (i4 != 3) {
                    i5 = 4;
                    if (i4 != 4) {
                        LiteavLog.w(s4, ProtectedSandApp.s("呺\u0001").concat(String.valueOf(tXChorusRole)));
                        return -1;
                    }
                }
            }
        }
        return i5;
    }

    private static native void nativeCallExperimentalAPI(long j4, String str);

    private static native long nativeCreate(long j4, long j5, String str, ChorusPlayerListener chorusPlayerListener);

    private static native void nativeDestroy(long j4);

    private static native void nativeLoadExternalMusic(long j4, String str, String str2, String str3, boolean z4, int i4);

    private static native void nativeLoadMusic(long j4, String str, String str2, String str3, String str4);

    private static native void nativeLoadYsdMusic(long j4, String str, String str2, String str3, String str4, String str5, String str6, boolean z4);

    private static native void nativePause(long j4);

    private static native void nativeResume(long j4);

    private static native void nativeSeek(long j4, long j5);

    private static native void nativeSetChorusRole(long j4, int i4, EnterRoomParams enterRoomParams);

    private static native void nativeSetMusicPitch(long j4, float f4);

    private static native void nativeSetPlayoutVolume(long j4, int i4);

    private static native void nativeSetPublishVolume(long j4, int i4);

    private static native void nativeStart(long j4);

    private static native void nativeStop(long j4);

    private static native void nativeSwitchMusicTrack(long j4, int i4);

    private static long parseNativePointer(String str) {
        String s4 = ProtectedSandApp.s("呲\u0001");
        try {
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 64) {
                return bigInteger.longValue();
            }
            LiteavLog.e(s4, ProtectedSandApp.s("呻\u0001").concat(String.valueOf(str)));
            return 0L;
        } catch (Throwable th) {
            LiteavLog.e(s4, ProtectedSandApp.s("呼\u0001").concat(String.valueOf(str)), th);
            return 0L;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void callExperimentalAPI(String str) {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeCallExperimentalAPI(j4, str);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void destroy() {
        TRTCCloud tRTCCloud;
        try {
            long j4 = this.mNativePtr;
            if (j4 != 0) {
                nativeDestroy(j4);
                this.mNativePtr = 0L;
            }
            TRTCCloud tRTCCloud2 = this.mTRTCCloud;
            if (tRTCCloud2 != null && (tRTCCloud = this.mSubTRTCCloud) != null) {
                tRTCCloud2.destroySubCloud(tRTCCloud);
                this.mSubTRTCCloud = null;
                this.mTRTCCloud = null;
            }
            this.mListener.f72077a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            LiteavLog.w(ProtectedSandApp.s("呲\u0001"), ProtectedSandApp.s("命\u0001"), Long.valueOf(j4));
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadExternalMusic(TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams) {
        long j4 = this.mNativePtr;
        if (j4 != 0 && tXChorusExternalMusicParams != null) {
            nativeLoadExternalMusic(j4, tXChorusExternalMusicParams.musicId, tXChorusExternalMusicParams.musicUrl, tXChorusExternalMusicParams.accompanyUrl, tXChorusExternalMusicParams.isEncrypted, tXChorusExternalMusicParams.encryptBlockLength);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadMusic(TXChorusMusicPlayer.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams) {
        long j4 = this.mNativePtr;
        if (j4 != 0 && tXChorusCopyrightedMusicParams != null) {
            nativeLoadMusic(j4, tXChorusCopyrightedMusicParams.musicId, tXChorusCopyrightedMusicParams.playToken, tXChorusCopyrightedMusicParams.copyrightedLicenseKey, tXChorusCopyrightedMusicParams.copyrightedLicenseUrl);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void loadYsdMusic(TXChorusMusicPlayer.TXChorusYsdMusicParams tXChorusYsdMusicParams) {
        long j4 = this.mNativePtr;
        if (j4 != 0 && tXChorusYsdMusicParams != null) {
            nativeLoadYsdMusic(j4, tXChorusYsdMusicParams.musicId, tXChorusYsdMusicParams.userId, tXChorusYsdMusicParams.userToken, tXChorusYsdMusicParams.deviceId, tXChorusYsdMusicParams.appId, tXChorusYsdMusicParams.appKey, tXChorusYsdMusicParams.isChargedOnce);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void pause() {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativePause(j4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void resume() {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeResume(j4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void seek(long j4) {
        long j5 = this.mNativePtr;
        if (j5 != 0) {
            nativeSeek(j5, j4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setChorusRole(TXChorusMusicPlayer.TXChorusRole tXChorusRole, TRTCCloudDef.TRTCParams tRTCParams) {
        try {
            if (this.mNativePtr != 0 && tXChorusRole != null) {
                nativeSetChorusRole(this.mNativePtr, getTXChorusRoleIntValue(tXChorusRole), tRTCParams != null ? new EnterRoomParams(tRTCParams) : null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public void setListener(TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        this.mListener.f72077a = iTXChorusPlayerListener;
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setMusicPitch(float f4) {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeSetMusicPitch(j4, f4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPlayoutVolume(int i4) {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeSetPlayoutVolume(j4, i4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void setPublishVolume(int i4) {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeSetPublishVolume(j4, i4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void start() {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeStart(j4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void stop() {
        long j4 = this.mNativePtr;
        if (j4 != 0) {
            nativeStop(j4);
        }
    }

    @Override // com.tencent.trtc.TXChorusMusicPlayer
    public synchronized void switchMusicTrack(TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack) {
        long j4 = this.mNativePtr;
        if (j4 != 0 && tXChorusMusicTrack != null) {
            nativeSwitchMusicTrack(j4, getTXChorusMusicTrackIntValue(tXChorusMusicTrack));
        }
    }

    static class ChorusPlayerListener {

        /* renamed from: a, reason: collision with root package name */
        TXChorusMusicPlayer.ITXChorusPlayerListener f72077a;

        private ChorusPlayerListener() {
            this.f72077a = null;
        }

        public void onChorusError(int i4, String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusError(TXChorusMusicPlayerImpl.convertIntValueToTXChorusError(i4), str);
            }
        }

        public void onChorusMusicLoadProgress(String str, float f4) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadProgress(str, f4);
            }
        }

        public void onChorusMusicLoadSucceed(String str, List<TXChorusMusicPlayer.TXLyricLine> list, List<TXChorusMusicPlayer.TXReferencePitch> list2) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusMusicLoadSucceed(str, list, list2);
            }
        }

        public void onChorusPaused() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusPaused();
            }
        }

        public void onChorusRequireLoadMusic(String str) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusRequireLoadMusic(str);
            }
        }

        public void onChorusResumed() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusResumed();
            }
        }

        public void onChorusStarted() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStarted();
            }
        }

        public void onChorusStopped() {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onChorusStopped();
            }
        }

        public void onMusicProgressUpdated(long j4, long j5) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onMusicProgressUpdated(j4, j5);
            }
        }

        public void onNetworkQualityUpdated(int i4, int i5, int i6) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onNetworkQualityUpdated(i4, i5, i6);
            }
        }

        public void onVoicePitchUpdated(int i4, boolean z4, long j4) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoicePitchUpdated(i4, z4, j4);
            }
        }

        public void onVoiceScoreUpdated(int i4, int i5, int i6) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.onVoiceScoreUpdated(i4, i5, i6);
            }
        }

        public void shouldDecryptAudioData(ByteBuffer byteBuffer) {
            TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener = this.f72077a;
            if (iTXChorusPlayerListener != null) {
                iTXChorusPlayerListener.shouldDecryptAudioData(byteBuffer);
            }
        }

        /* synthetic */ ChorusPlayerListener(byte b5) {
            this();
        }
    }
}

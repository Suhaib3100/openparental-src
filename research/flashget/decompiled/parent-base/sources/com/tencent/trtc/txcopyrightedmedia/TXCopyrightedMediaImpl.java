package com.tencent.trtc.txcopyrightedmedia;

import android.content.Context;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia;

@JNINamespace("liteav::extensions")
/* loaded from: classes7.dex */
public class TXCopyrightedMediaImpl extends TXCopyrightedMedia {
    private long mNativeTXCopyrightedMediaImpl = 0;

    public class TXSongScoreImpl implements TXCopyrightedMedia.ITXSongScore {
        private long mNativeTXCopyrightedSongScore;

        public TXSongScoreImpl(String str, int i4, int i5, String str2, String str3, String str4) {
            this.mNativeTXCopyrightedSongScore = 0L;
            this.mNativeTXCopyrightedSongScore = TXCopyrightedMediaImpl.nativeCreateSongScore(TXCopyrightedMediaImpl.this.mNativeTXCopyrightedMediaImpl, this, str, i4, i5, str2, str3, str4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public int calculateTotalScore() {
            return TXCopyrightedMediaImpl.nativeCalculateTotalScore(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void destroy() {
            TXCopyrightedMediaImpl.nativeDestroySongScore(this.mNativeTXCopyrightedSongScore);
            this.mNativeTXCopyrightedSongScore = 0L;
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void finish() {
            TXCopyrightedMediaImpl.nativeFinish(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public TXCopyrightedMedia.TXSongScoreNoteItem[] getAllGrove() {
            return TXCopyrightedMediaImpl.nativeGetAllGrove(this.mNativeTXCopyrightedSongScore);
        }

        public void onMIDIGroveAndHint(String str, boolean z4, float f4, float f5, int i4, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIGroveAndHint(str, z4, f4, f5, i4);
        }

        public void onMIDISCoreUpdate(String str, int i4, int i5, int i6, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDISCoreUpdate(str, i4, i5, i6);
        }

        public void onMIDIScoreError(String str, int i4, String str2, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreError(str, i4, str2);
        }

        public void onMIDIScoreFinish(String str, int[] iArr, int i4, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScoreFinish(str, iArr, i4);
        }

        public void onMIDIScorePrepared(String str, Object obj) {
            ((TXCopyrightedMedia.ITXSongScoreCallback) obj).onMIDIScorePrepared(str);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void prepare() {
            TXCopyrightedMediaImpl.nativePrepare(this.mNativeTXCopyrightedSongScore);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void process(byte[] bArr, int i4, float f4) {
            TXCopyrightedMediaImpl.nativeProcess(this.mNativeTXCopyrightedSongScore, bArr, i4, f4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setKeyShift(int i4) {
            TXCopyrightedMediaImpl.nativeSetKeyShift(this.mNativeTXCopyrightedSongScore, i4);
        }

        @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore
        public void setSongScoreCallback(TXCopyrightedMedia.ITXSongScoreCallback iTXSongScoreCallback) {
            TXCopyrightedMediaImpl.nativeSetSongScoreCallback(this.mNativeTXCopyrightedSongScore, iTXSongScoreCallback);
        }
    }

    public static Object createClimaxTimeRange(int i4, int i5) {
        TXCopyrightedMedia.TXClimaxTimeRange tXClimaxTimeRange = new TXCopyrightedMedia.TXClimaxTimeRange();
        tXClimaxTimeRange.startTime = i4;
        tXClimaxTimeRange.endTime = i5;
        return tXClimaxTimeRange;
    }

    public static Object createSongScoreNoteItem(int i4, int i5, int i6, int i7) {
        TXCopyrightedMedia.TXSongScoreNoteItem tXSongScoreNoteItem = new TXCopyrightedMedia.TXSongScoreNoteItem();
        tXSongScoreNoteItem.startTime = i4;
        tXSongScoreNoteItem.duration = i5;
        tXSongScoreNoteItem.noteHeight = i6;
        tXSongScoreNoteItem.endTime = i7;
        return tXSongScoreNoteItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeCalculateTotalScore(long j4);

    private static native void nativeCancelPreloadMusic(long j4, String str, String str2);

    private static native void nativeClearMusicCache(long j4);

    private static native void nativeClearMusicCacheByMusicId(long j4, String str, String str2);

    private static native long nativeCreateCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateSongScore(long j4, TXSongScoreImpl tXSongScoreImpl, String str, int i4, int i5, String str2, String str3, String str4);

    private static native void nativeDestroyCopyRightedMedia(TXCopyrightedMediaImpl tXCopyrightedMediaImpl, long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeDestroySongScore(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeFinish(long j4);

    private static native String nativeGenMusicURI(long j4, String str, int i4, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native TXCopyrightedMedia.TXSongScoreNoteItem[] nativeGetAllGrove(long j4);

    private static native TXCopyrightedMedia.TXClimaxTimeRange nativeGetClimaxSegmentTimeRange(long j4, String str, int i4, String str2);

    private static native boolean nativeIsMusicPreloaded(long j4, String str, String str2);

    private static native void nativePreloadClimaxSegment(long j4, String str, String str2, String str3);

    private static native void nativePreloadMusic(long j4, String str, String str2, String str3);

    private static native void nativePreloadPitchAndLyricFile(long j4, String str, String str2, String str3);

    private static native void nativePreloadYSDMusic(long j4, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativePrepare(long j4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProcess(long j4, byte[] bArr, int i4, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetKeyShift(long j4, int i4);

    private static native void nativeSetLicense(long j4, Context context, String str, String str2);

    private static native void nativeSetMusicCacheMaxCount(long j4, int i4);

    private static native void nativeSetMusicPreloadCallback(long j4, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeSetSongScoreCallback(long j4, Object obj);

    private static native void nativeSetYSDAuthParams(long j4, String str, String str2, String str3, String str4, String str5, boolean z4);

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void cancelPreloadMusic(String str, String str2) {
        nativeCancelPreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache() {
        nativeClearMusicCache(this.mNativeTXCopyrightedMediaImpl);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public TXCopyrightedMedia.ITXSongScore createSongScore(String str, int i4, int i5, String str2, String str3, String str4) {
        return new TXSongScoreImpl(str, i4, i5, str2, str3, str4);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void destroy() {
        long j4 = this.mNativeTXCopyrightedMediaImpl;
        if (j4 != 0) {
            nativeDestroyCopyRightedMedia(this, j4);
            this.mNativeTXCopyrightedMediaImpl = 0L;
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public String genMusicURI(String str, int i4, String str2) {
        return nativeGenMusicURI(this.mNativeTXCopyrightedMediaImpl, str, i4, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public TXCopyrightedMedia.TXClimaxTimeRange getClimaxSegmentTimeRange(String str, int i4, String str2) {
        return nativeGetClimaxSegmentTimeRange(this.mNativeTXCopyrightedMediaImpl, str, i4, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void init() {
        if (this.mNativeTXCopyrightedMediaImpl == 0) {
            this.mNativeTXCopyrightedMediaImpl = nativeCreateCopyRightedMedia(this);
        }
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public boolean isMusicPreloaded(String str, String str2) {
        return nativeIsMusicPreloaded(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    public void onPreloadComplete(String str, String str2, int i4, String str3, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadComplete(str, str2, i4, str3);
    }

    public void onPreloadProgress(String str, String str2, float f4, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadProgress(str, str2, f4);
    }

    public void onPreloadStart(String str, String str2, Object obj) {
        ((TXCopyrightedMedia.ITXMusicPreloadCallback) obj).onPreloadStart(str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadClimaxSegment(String str, String str2, String str3) {
        nativePreloadClimaxSegment(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(String str, String str2) {
        nativePreloadYSDMusic(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadPitchAndLyricFile(String str, String str2, String str3) {
        nativePreloadPitchAndLyricFile(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setLicense(Context context, String str, String str2) {
        nativeSetLicense(this.mNativeTXCopyrightedMediaImpl, context, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicCacheMaxCount(int i4) {
        nativeSetMusicCacheMaxCount(this.mNativeTXCopyrightedMediaImpl, i4);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setMusicPreloadCallback(TXCopyrightedMedia.ITXMusicPreloadCallback iTXMusicPreloadCallback) {
        nativeSetMusicPreloadCallback(this.mNativeTXCopyrightedMediaImpl, iTXMusicPreloadCallback);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void setYSDAuthParams(TXCopyrightedMedia.TXCopyrightedMediaYSDAuthParams tXCopyrightedMediaYSDAuthParams) {
        nativeSetYSDAuthParams(this.mNativeTXCopyrightedMediaImpl, tXCopyrightedMediaYSDAuthParams.appId, tXCopyrightedMediaYSDAuthParams.appKey, tXCopyrightedMediaYSDAuthParams.deviceId, tXCopyrightedMediaYSDAuthParams.userId, tXCopyrightedMediaYSDAuthParams.userToken, tXCopyrightedMediaYSDAuthParams.isChargedOnce);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void clearMusicCache(String str, String str2) {
        nativeClearMusicCacheByMusicId(this.mNativeTXCopyrightedMediaImpl, str, str2);
    }

    @Override // com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia
    public void preloadMusic(String str, String str2, String str3) {
        nativePreloadMusic(this.mNativeTXCopyrightedMediaImpl, str, str2, str3);
    }
}

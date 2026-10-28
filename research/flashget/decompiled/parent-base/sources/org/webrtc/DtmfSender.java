package org.webrtc;

/* loaded from: classes9.dex */
public class DtmfSender {
    private long nativeDtmfSender;

    public DtmfSender(long j4) {
        this.nativeDtmfSender = j4;
    }

    private void checkDtmfSenderExists() {
        if (this.nativeDtmfSender == 0) {
            throw new IllegalStateException("DtmfSender has been disposed.");
        }
    }

    private static native boolean nativeCanInsertDtmf(long j4);

    private static native int nativeDuration(long j4);

    private static native boolean nativeInsertDtmf(long j4, String str, int i4, int i5);

    private static native int nativeInterToneGap(long j4);

    private static native String nativeTones(long j4);

    public boolean canInsertDtmf() {
        checkDtmfSenderExists();
        return nativeCanInsertDtmf(this.nativeDtmfSender);
    }

    public void dispose() {
        checkDtmfSenderExists();
        JniCommon.nativeReleaseRef(this.nativeDtmfSender);
        this.nativeDtmfSender = 0L;
    }

    public int duration() {
        checkDtmfSenderExists();
        return nativeDuration(this.nativeDtmfSender);
    }

    public boolean insertDtmf(String str, int i4, int i5) {
        checkDtmfSenderExists();
        return nativeInsertDtmf(this.nativeDtmfSender, str, i4, i5);
    }

    public int interToneGap() {
        checkDtmfSenderExists();
        return nativeInterToneGap(this.nativeDtmfSender);
    }

    public String tones() {
        checkDtmfSenderExists();
        return nativeTones(this.nativeDtmfSender);
    }
}

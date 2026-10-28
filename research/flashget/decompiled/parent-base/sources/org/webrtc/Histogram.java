package org.webrtc;

/* loaded from: classes9.dex */
class Histogram {
    private final long handle;

    private Histogram(long j4) {
        this.handle = j4;
    }

    public static Histogram createCounts(String str, int i4, int i5, int i6) {
        return new Histogram(nativeCreateCounts(str, i4, i5, i6));
    }

    public static Histogram createEnumeration(String str, int i4) {
        return new Histogram(nativeCreateEnumeration(str, i4));
    }

    private static native void nativeAddSample(long j4, int i4);

    private static native long nativeCreateCounts(String str, int i4, int i5, int i6);

    private static native long nativeCreateEnumeration(String str, int i4);

    public void addSample(int i4) {
        nativeAddSample(this.handle, i4);
    }
}

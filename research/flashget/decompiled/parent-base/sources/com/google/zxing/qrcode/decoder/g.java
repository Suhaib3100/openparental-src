package com.google.zxing.qrcode.decoder;

import com.tencent.rtmp.TXLiveConstants;

/* compiled from: FormatInformation.java */
/* loaded from: classes6.dex */
final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final int f63296c = 21522;

    /* renamed from: d, reason: collision with root package name */
    private static final int[][] f63297d = {new int[]{f63296c, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* renamed from: a, reason: collision with root package name */
    private final f f63298a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f63299b;

    private g(int i4) {
        this.f63298a = f.forBits((i4 >> 3) & 3);
        this.f63299b = (byte) (i4 & 7);
    }

    static g a(int i4, int i5) {
        g b5 = b(i4, i5);
        return b5 != null ? b5 : b(i4 ^ f63296c, i5 ^ f63296c);
    }

    private static g b(int i4, int i5) {
        int bitCount;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int[] iArr : f63297d) {
            int i10 = iArr[0];
            if (i10 == i4 || i10 == i5) {
                return new g(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i4 ^ i10);
            if (bitCount2 < i6) {
                i7 = iArr[1];
                i6 = bitCount2;
            }
            if (i4 != i5 && (bitCount = Integer.bitCount(i10 ^ i5)) < i6) {
                i7 = iArr[1];
                i6 = bitCount;
            }
        }
        if (i6 <= 3) {
            return new g(i7);
        }
        return null;
    }

    static int e(int i4, int i5) {
        return Integer.bitCount(i4 ^ i5);
    }

    byte c() {
        return this.f63299b;
    }

    f d() {
        return this.f63298a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f63298a == gVar.f63298a && this.f63299b == gVar.f63299b;
    }

    public int hashCode() {
        return (this.f63298a.ordinal() << 3) | this.f63299b;
    }
}

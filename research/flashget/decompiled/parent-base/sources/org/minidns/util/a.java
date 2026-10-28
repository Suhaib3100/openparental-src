package org.minidns.util;

/* compiled from: Base32.java */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f87562a = "0123456789ABCDEFGHIJKLMNOPQRSTUV";

    /* renamed from: b, reason: collision with root package name */
    private static final String f87563b = "======";

    private a() {
    }

    public static String a(byte[] bArr) {
        int length = ((int) (8.0d - ((bArr.length % 5) * 1.6d))) % 8;
        System.arraycopy(bArr, 0, new byte[bArr.length + length], 0, bArr.length);
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < bArr.length; i4 += 5) {
            long j4 = ((r2[i4] & 255) << 32) + ((r2[i4 + 1] & 255) << 24) + ((r2[i4 + 2] & 255) << 16) + ((r2[i4 + 3] & 255) << 8) + (r2[i4 + 4] & 255);
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 35) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 30) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 25) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 20) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 15) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 10) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((j4 >> 5) & 31)));
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) (j4 & 31)));
        }
        return sb.substring(0, sb.length() - length) + "======".substring(0, length);
    }
}

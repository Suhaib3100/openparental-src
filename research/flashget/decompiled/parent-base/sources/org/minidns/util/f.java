package org.minidns.util;

/* compiled from: Hex.java */
/* loaded from: classes9.dex */
public class f {
    public static StringBuilder a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            sb.append(String.format("%02X ", Byte.valueOf(b5)));
        }
        return sb;
    }
}

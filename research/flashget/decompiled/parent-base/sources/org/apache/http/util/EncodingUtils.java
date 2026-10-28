package org.apache.http.util;

import java.io.UnsupportedEncodingException;
import org.apache.http.Consts;

/* loaded from: classes3.dex */
public final class EncodingUtils {
    private EncodingUtils() {
    }

    public static byte[] getAsciiBytes(String str) {
        Args.notNull(str, "Input");
        try {
            return str.getBytes(Consts.ASCII.name());
        } catch (UnsupportedEncodingException unused) {
            throw new Error("ASCII not supported");
        }
    }

    public static String getAsciiString(byte[] bArr, int i4, int i5) {
        Args.notNull(bArr, "Input");
        try {
            return new String(bArr, i4, i5, Consts.ASCII.name());
        } catch (UnsupportedEncodingException unused) {
            throw new Error("ASCII not supported");
        }
    }

    public static byte[] getBytes(String str, String str2) {
        Args.notNull(str, "Input");
        Args.notEmpty(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String getString(byte[] bArr, int i4, int i5, String str) {
        Args.notNull(bArr, "Input");
        Args.notEmpty(str, "Charset");
        try {
            return new String(bArr, i4, i5, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i4, i5);
        }
    }

    public static String getAsciiString(byte[] bArr) {
        Args.notNull(bArr, "Input");
        return getAsciiString(bArr, 0, bArr.length);
    }

    public static String getString(byte[] bArr, String str) {
        Args.notNull(bArr, "Input");
        return getString(bArr, 0, bArr.length, str);
    }
}

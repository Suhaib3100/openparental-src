package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;

/* compiled from: Utf8.java */
/* loaded from: classes3.dex */
public final class l {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, ProtectedSandApp.s("ᓉ"));
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(ProtectedSandApp.s("ᓉ"));
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes(ProtectedSandApp.s("ᓉ")).length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException();
        }
    }
}

package com.coremedia.iso;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;

/* compiled from: Ascii.java */
/* loaded from: classes3.dex */
public final class b {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, ProtectedSandApp.s("ཅ"));
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(ProtectedSandApp.s("ཅ"));
        } catch (UnsupportedEncodingException e4) {
            throw new Error(e4);
        }
    }
}

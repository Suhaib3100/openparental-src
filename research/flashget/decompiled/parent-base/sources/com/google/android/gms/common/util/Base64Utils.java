package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public final class Base64Utils {
    @o0
    @KeepForSdk
    public static byte[] decode(@o0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @o0
    @KeepForSdk
    public static byte[] decodeUrlSafe(@o0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @o0
    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(@o0 String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @o0
    @KeepForSdk
    public static String encode(@o0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @o0
    @KeepForSdk
    public static String encodeUrlSafe(@o0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @o0
    @KeepForSdk
    public static String encodeUrlSafeNoPadding(@o0 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}

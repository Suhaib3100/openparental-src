package com.google.android.gms.maps.internal;

import androidx.annotation.q0;

/* compiled from: com.google.android.gms:play-services-maps@@18.2.0 */
/* loaded from: classes5.dex */
public final class zza {
    public static byte zza(@q0 Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    @q0
    public static Boolean zzb(byte b5) {
        if (b5 == 0) {
            return Boolean.FALSE;
        }
        if (b5 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}

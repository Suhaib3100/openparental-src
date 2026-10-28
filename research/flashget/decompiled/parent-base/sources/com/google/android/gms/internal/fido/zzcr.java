package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzcr {
    static Object zza(@a Object obj, int i4) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.a.a(ProtectedSandApp.s("퀮"), i4));
    }

    static Object[] zzb(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            zza(objArr[i5], i5);
        }
        return objArr;
    }
}

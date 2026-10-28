package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzic {
    static Object[] zza(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(com.google.android.gms.internal.location.a.a(20, ProtectedSandApp.s("\ue9e0"), i5));
            }
        }
        return objArr;
    }
}

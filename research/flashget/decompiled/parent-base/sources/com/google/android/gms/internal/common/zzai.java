package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzai {
    static Object[] zza(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (objArr[i5] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 9);
                sb.append(ProtectedSandApp.s("쿘"));
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}

package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
enum zzgk implements Comparator {
    zza;

    zzgk() {
        ProtectedSandApp.s("킐");
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            int i5 = (bArr[i4] & 255) - (bArr2[i4] & 255);
            if (i5 != 0) {
                return i5;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return ProtectedSandApp.s("킑");
    }
}

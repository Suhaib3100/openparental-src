package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjd {
    static Object zza(@CheckForNull Object obj, int i5) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(s.a(ProtectedSandApp.s("හ"), i5));
    }

    static Object[] zzb(Object[] objArr, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            zza(objArr[i6], i6);
        }
        return objArr;
    }
}

package com.google.android.libraries.places.internal;

import androidx.fragment.app.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzht {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzht(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + valueOf3.length() + valueOf4.length());
        String s4 = ProtectedSandApp.s("\ue9db");
        String s5 = ProtectedSandApp.s("\ue9dc");
        l0.a(sb, s4, valueOf, s5, valueOf2);
        return new IllegalArgumentException(c.a(sb, ProtectedSandApp.s("\ue9dd"), valueOf3, s5, valueOf4));
    }
}

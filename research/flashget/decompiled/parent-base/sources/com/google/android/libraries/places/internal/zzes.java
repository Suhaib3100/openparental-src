package com.google.android.libraries.places.internal;

import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
@c.a
/* loaded from: classes5.dex */
public abstract class zzes {
    abstract zzes zzb(int i4);

    abstract zzet zzc();

    public abstract zzes zzd(int i4);

    public final zzet zze() {
        zzet zzc = zzc();
        zzha.zzi(!zzc.zzb().isEmpty(), ProtectedSandApp.s("\ue94f"));
        return zzc;
    }
}

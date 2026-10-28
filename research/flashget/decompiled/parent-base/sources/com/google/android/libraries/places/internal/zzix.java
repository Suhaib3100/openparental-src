package com.google.android.libraries.places.internal;

import android.support.v4.media.c;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public class zzix {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzix(String str, Class cls, boolean z4) {
        this(str, cls, z4, true);
    }

    public static zzix zza(String str, Class cls) {
        return new zzix(str, cls, false, false);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.zza;
        String name2 = this.zzb.getName();
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.stats.a.a(str, name.length() + 3, name2.length()));
        l0.a(sb, name, ProtectedSandApp.s("\ue9e8"), str, ProtectedSandApp.s("\ue9e9"));
        return c.a(sb, name2, ProtectedSandApp.s("\ue9ea"));
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzix(String str, Class cls, boolean z4, boolean z5) {
        zzkt.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z4;
        System.identityHashCode(this);
        for (int i4 = 0; i4 < 5; i4++) {
        }
    }
}

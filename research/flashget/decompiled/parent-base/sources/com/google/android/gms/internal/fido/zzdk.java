package com.google.android.gms.internal.fido;

import androidx.constraintlayout.core.e;
import androidx.fragment.app.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public class zzdk {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    protected zzdk(String str, Class cls, boolean z4) {
        this(str, cls, z4, true);
    }

    public static zzdk zza(String str, Class cls) {
        return new zzdk(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        return c.a(e.a(name, ProtectedSandApp.s("퀴")), this.zza, ProtectedSandApp.s("퀵"), cls.getName(), ProtectedSandApp.s("퀶"));
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzdk(String str, Class cls, boolean z4, boolean z5) {
        zzfk.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z4;
        System.identityHashCode(this);
        for (int i4 = 0; i4 < 5; i4++) {
        }
    }
}

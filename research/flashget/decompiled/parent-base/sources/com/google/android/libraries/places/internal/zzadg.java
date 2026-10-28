package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzadg implements zzaep {
    private static final zzadg zza = new zzadg();

    private zzadg() {
    }

    public static zzadg zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final zzaeo zzb(Class cls) {
        if (!zzadk.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            int length = name.length();
            String s4 = ProtectedSandApp.s("\ue785");
            throw new IllegalArgumentException(length != 0 ? s4.concat(name) : new String(s4));
        }
        try {
            return (zzaeo) zzadk.zzy(cls.asSubclass(zzadk.class)).zzb(3, null, null);
        } catch (Exception e4) {
            String name2 = cls.getName();
            int length2 = name2.length();
            String s5 = ProtectedSandApp.s("\ue786");
            throw new RuntimeException(length2 != 0 ? s5.concat(name2) : new String(s5), e4);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzaep
    public final boolean zzc(Class cls) {
        return zzadk.class.isAssignableFrom(cls);
    }
}

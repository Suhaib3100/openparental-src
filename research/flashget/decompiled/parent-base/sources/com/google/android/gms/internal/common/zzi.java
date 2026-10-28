package com.google.android.gms.internal.common;

import androidx.annotation.q0;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public class zzi {
    private final Class zza;

    @q0
    private final Object zzb;

    private zzi(Class cls, @q0 Object obj) {
        this.zza = cls;
        this.zzb = obj;
    }

    public static zzi zzb(Class cls, @q0 Object obj) {
        return new zzi(cls, obj);
    }

    public final Class zzc() {
        return this.zza;
    }

    @q0
    public final Object zzd() {
        return this.zzb;
    }

    /* synthetic */ zzi(Class cls, Object obj, byte[] bArr) {
        this(cls, obj);
    }
}

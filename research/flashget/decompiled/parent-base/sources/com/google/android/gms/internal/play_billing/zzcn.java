package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzcn extends zzca {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zzcn(Object[] objArr, int i4, int i5) {
        this.zza = objArr;
        this.zzb = i4;
        this.zzc = i5;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        zzbl.zza(i4, this.zzc, ProtectedSandApp.s("훿"));
        Object obj = this.zza[i4 + i4 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final boolean zzf() {
        return true;
    }
}

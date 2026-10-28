package com.google.android.gms.internal.play_billing;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzcr extends zzcf {
    final transient Object zza;

    zzcr(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzch(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d.a(ProtectedSandApp.s("휁"), this.zza.toString(), ProtectedSandApp.s("휂"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final int zza(Object[] objArr, int i4) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    public final zzca zzd() {
        return zzca.zzl(this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    /* renamed from: zze */
    public final zzcs iterator() {
        return new zzch(this.zza);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final boolean zzf() {
        throw null;
    }
}

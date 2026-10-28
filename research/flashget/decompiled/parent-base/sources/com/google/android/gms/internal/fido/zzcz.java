package com.google.android.gms.internal.fido;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
final class zzcz extends zzcf {
    final transient Object zza;

    zzcz(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzcm(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return d.a(ProtectedSandApp.s("퀲"), this.zza.toString(), ProtectedSandApp.s("퀳"));
    }

    @Override // com.google.android.gms.internal.fido.zzby
    final int zza(Object[] objArr, int i4) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby
    /* renamed from: zzd */
    public final zzdc iterator() {
        return new zzcm(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzcf
    public final zzcc zzi() {
        return zzcc.zzj(this.zza);
    }
}

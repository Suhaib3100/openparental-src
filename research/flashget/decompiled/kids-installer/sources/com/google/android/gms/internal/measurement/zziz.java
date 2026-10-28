package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zziz extends zzja {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzja zzc;

    zziz(zzja zzjaVar, int i5, int i6) {
        this.zzc = zzjaVar;
        this.zza = i5;
        this.zzb = i6;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        zzij.zza(i5, this.zzb, ProtectedSandApp.s("⍧"));
        return this.zzc.get(i5 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    @CheckForNull
    final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzja, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzja subList(int i5, int i6) {
        zzij.zzc(i5, i6, this.zzb);
        zzja zzjaVar = this.zzc;
        int i7 = this.zza;
        return zzjaVar.subList(i5 + i7, i6 + i7);
    }
}

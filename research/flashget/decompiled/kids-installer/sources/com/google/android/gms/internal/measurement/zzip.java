package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzip implements zzim {
    private static final zzim zza = new zzim() { // from class: com.google.android.gms.internal.measurement.zzio
        @Override // com.google.android.gms.internal.measurement.zzim
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzim zzb;

    @CheckForNull
    private Object zzc;

    zzip(zzim zzimVar) {
        zzimVar.getClass();
        this.zzb = zzimVar;
    }

    public final String toString() {
        Object obj = this.zzb;
        if (obj == zza) {
            obj = e.a(ProtectedSandApp.s("⍕"), String.valueOf(this.zzc), ProtectedSandApp.s("⍖"));
        }
        return e.a(ProtectedSandApp.s("⍗"), String.valueOf(obj), ProtectedSandApp.s("⍘"));
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.zzb;
        zzim zzimVar2 = zza;
        if (zzimVar != zzimVar2) {
            synchronized (this) {
                if (this.zzb != zzimVar2) {
                    Object zza2 = this.zzb.zza();
                    this.zzc = zza2;
                    this.zzb = zzimVar2;
                    return zza2;
                }
            }
        }
        return this.zzc;
    }
}

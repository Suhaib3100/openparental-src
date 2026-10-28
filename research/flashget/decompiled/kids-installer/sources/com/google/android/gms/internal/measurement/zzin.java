package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = e.a(ProtectedSandApp.s("⍑"), String.valueOf(this.zzc), ProtectedSandApp.s("⍒"));
        } else {
            obj = this.zza;
        }
        return e.a(ProtectedSandApp.s("⍓"), obj.toString(), ProtectedSandApp.s("⍔"));
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}

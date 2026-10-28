package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzu extends zzai {
    private final Callable zza;

    public zzu(String str, Callable callable) {
        super(ProtectedSandApp.s("\u2458"));
        this.zza = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        try {
            return zzi.zzb(this.zza.call());
        } catch (Exception unused) {
            return zzap.zzf;
        }
    }
}

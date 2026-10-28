package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.solver.widgets.analyzer.e;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zziq implements Serializable, zzim {
    final Object zza;

    zziq(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zziq) {
            return zzih.zza(this.zza, ((zziq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return e.a(ProtectedSandApp.s("⍙"), this.zza.toString(), ProtectedSandApp.s("⍚"));
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        return this.zza;
    }
}

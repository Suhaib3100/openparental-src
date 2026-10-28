package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public abstract class zzay {
    final List<zzbv> zza = new ArrayList();

    protected zzay() {
    }

    final zzaq zza(String str) {
        if (this.zza.contains(zzg.zza(str))) {
            throw new UnsupportedOperationException(c.a(ProtectedSandApp.s("투"), str));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("툭"));
    }

    public abstract zzaq zza(String str, zzh zzhVar, List<zzaq> list);
}

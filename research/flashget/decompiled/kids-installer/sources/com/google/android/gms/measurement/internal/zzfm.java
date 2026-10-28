package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.l0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfm {
    private final zza zza;

    /* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzfm(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    @l0
    public final void zza(Context context, Intent intent) {
        zzgd zzp = zzgd.zzp(context, null, null);
        zzet zzaA = zzp.zzaA();
        if (intent == null) {
            zzaA.zzk().zza(ProtectedSandApp.s("ྺ"));
            return;
        }
        zzp.zzay();
        String action = intent.getAction();
        zzaA.zzj().zzb(ProtectedSandApp.s("ྻ"), action);
        String s5 = ProtectedSandApp.s("ྼ");
        if (!s5.equals(action)) {
            if (ProtectedSandApp.s("྿").equals(action)) {
                zzaA.zzk().zza(ProtectedSandApp.s("࿀"));
            }
        } else {
            Intent className = new Intent().setClassName(context, ProtectedSandApp.s("\u0fbd"));
            className.setAction(s5);
            zzaA.zzj().zza(ProtectedSandApp.s("྾"));
            this.zza.doStartService(context, className);
        }
    }
}

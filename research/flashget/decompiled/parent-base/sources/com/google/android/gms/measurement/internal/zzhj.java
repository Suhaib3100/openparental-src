package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhj {
    private final zza zza;

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    public interface zza {
        void doStartService(Context context, Intent intent);
    }

    public zzhj(zza zzaVar) {
        Preconditions.checkNotNull(zzaVar);
        this.zza = zzaVar;
    }

    @l0
    public final void zza(Context context, Intent intent) {
        zzgo zzj = zzhy.zza(context, null, null).zzj();
        if (intent == null) {
            zzj.zzu().zza(ProtectedSandApp.s("\udee7"));
            return;
        }
        String action = intent.getAction();
        zzj.zzp().zza(ProtectedSandApp.s("\udee8"), action);
        String s4 = ProtectedSandApp.s("\udee9");
        if (!s4.equals(action)) {
            if (ProtectedSandApp.s("\udeec").equals(action)) {
                zzj.zzu().zza(ProtectedSandApp.s("\udeed"));
            }
        } else {
            Intent className = new Intent().setClassName(context, ProtectedSandApp.s("\udeea"));
            className.setAction(s4);
            zzj.zzp().zza(ProtectedSandApp.s("\udeeb"));
            this.zza.doStartService(context, className);
        }
    }
}

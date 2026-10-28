package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes5.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    zzs(int i4, int i5, Bundle bundle) {
        this.zza = i4;
        this.zzc = i5;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("준"));
        sb.append(this.zzc);
        sb.append(ProtectedSandApp.s("줁"));
        sb.append(this.zza);
        sb.append(ProtectedSandApp.s("줂"));
        return h.a(sb, zzb(), ProtectedSandApp.s("줃"));
    }

    abstract void zza(Bundle bundle);

    abstract boolean zzb();

    final void zzc(zzt zztVar) {
        if (Log.isLoggable(ProtectedSandApp.s("줄"), 3)) {
            toString();
            zztVar.toString();
        }
        this.zzb.setException(zztVar);
    }

    final void zzd(Object obj) {
        if (Log.isLoggable(ProtectedSandApp.s("줄"), 3)) {
            toString();
            String.valueOf(obj);
        }
        this.zzb.setResult(obj);
    }
}

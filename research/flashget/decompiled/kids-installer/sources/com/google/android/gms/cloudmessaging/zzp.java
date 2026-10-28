package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes2.dex */
abstract class zzp<T> {
    final int zza;
    final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    final int zzc;
    final Bundle zzd;

    zzp(int i5, int i6, Bundle bundle) {
        this.zza = i5;
        this.zzc = i6;
        this.zzd = bundle;
    }

    public final String toString() {
        int i5 = this.zzc;
        int i6 = this.zza;
        StringBuilder sb = new StringBuilder(55);
        sb.append(ProtectedSandApp.s("ਈ"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("ਉ"));
        sb.append(i6);
        sb.append(ProtectedSandApp.s("ਊ"));
        sb.append(zzb());
        sb.append(ProtectedSandApp.s("\u0a0b"));
        return sb.toString();
    }

    abstract void zza(Bundle bundle);

    abstract boolean zzb();

    final void zzc(zzq zzqVar) {
        if (Log.isLoggable(ProtectedSandApp.s("\u0a0c"), 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            new StringBuilder(valueOf.length() + 14 + valueOf2.length());
        }
        this.zzb.setException(zzqVar);
    }

    final void zzd(T t5) {
        if (Log.isLoggable(ProtectedSandApp.s("\u0a0d"), 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t5);
            new StringBuilder(valueOf.length() + 16 + valueOf2.length());
        }
        this.zzb.setResult(t5);
    }
}

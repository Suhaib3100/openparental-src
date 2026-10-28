package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzd zzc;

    zzc(zzd zzdVar, LifecycleCallback lifecycleCallback, String str) {
        this.zzc = zzdVar;
        this.zza = lifecycleCallback;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzd zzdVar = this.zzc;
        i5 = zzdVar.zzc;
        if (i5 > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            bundle = zzdVar.zzd;
            if (bundle != null) {
                bundle3 = zzdVar.zzd;
                bundle2 = bundle3.getBundle(this.zzb);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
        i6 = this.zzc.zzc;
        if (i6 >= 2) {
            this.zza.onStart();
        }
        i7 = this.zzc.zzc;
        if (i7 >= 3) {
            this.zza.onResume();
        }
        i8 = this.zzc.zzc;
        if (i8 >= 4) {
            this.zza.onStop();
        }
        i9 = this.zzc.zzc;
        if (i9 >= 5) {
            this.zza.onDestroy();
        }
    }
}

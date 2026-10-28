package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.q0;
import androidx.collection.a;
import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
final class zzc {
    private final Map zza = Collections.synchronizedMap(new a());
    private int zzb = 0;

    @q0
    private Bundle zzc;

    zzc() {
    }

    @q0
    final LifecycleCallback zza(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.zza.get(str));
    }

    final void zzb(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(k0.a(new StringBuilder(String.valueOf(str).length() + 59), ProtectedSandApp.s("쪋"), str, ProtectedSandApp.s("쪌")));
        }
        map.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            new zzg(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    final boolean zzc() {
        return this.zzb > 0;
    }

    final boolean zzd() {
        return this.zzb >= 2;
    }

    final void zze(@q0 Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (Map.Entry entry : this.zza.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void zzf() {
        this.zzb = 2;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    final void zzg() {
        this.zzb = 3;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    final void zzh(int i4, int i5, @q0 Intent intent) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i4, i5, intent);
        }
    }

    final void zzi(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.zza.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void zzj() {
        this.zzb = 4;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    final void zzk() {
        this.zzb = 5;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    final void zzl(String str, @q0 FileDescriptor fileDescriptor, PrintWriter printWriter, @q0 String[] strArr) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    final /* synthetic */ int zzm() {
        return this.zzb;
    }

    final /* synthetic */ Bundle zzn() {
        return this.zzc;
    }
}

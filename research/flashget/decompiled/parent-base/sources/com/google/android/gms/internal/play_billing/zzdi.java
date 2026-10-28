package com.google.android.gms.internal.play_billing;

import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzdi implements zzdk {
    private static final zzdj zza = new zzdj(zzdi.class);
    private final Object zzb;

    zzdi(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.zzb;
        return com.cby.txliteav.live.impl.tx.a.a(super.toString(), ProtectedSandApp.s("휾"), obj.toString(), ProtectedSandApp.s("휿"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void zzb(Runnable runnable, Executor executor) {
        zzbl.zzc(executor, ProtectedSandApp.s("흀"));
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zza.zza().logp(Level.SEVERE, ProtectedSandApp.s("흃"), ProtectedSandApp.s("흄"), y.a(ProtectedSandApp.s("흁"), runnable.toString(), ProtectedSandApp.s("흂"), String.valueOf(executor)), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.zzb;
    }
}

package com.google.android.gms.measurement.internal;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzhw<V> extends FutureTask<V> implements Comparable<zzhw<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzhv zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(zzhv zzhvVar, Runnable runnable, boolean z4, String str) {
        super(com.google.android.gms.internal.measurement.zzdg.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.zzd = zzhvVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhv.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z4;
        if (andIncrement == Long.MAX_VALUE) {
            zzhvVar.zzj().zzg().zza(ProtectedSandApp.s("\udf25"));
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@o0 Object obj) {
        zzhw zzhwVar = (zzhw) obj;
        boolean z4 = this.zza;
        if (z4 != zzhwVar.zza) {
            return z4 ? -1 : 1;
        }
        long j4 = this.zzb;
        long j5 = zzhwVar.zzb;
        if (j4 < j5) {
            return -1;
        }
        if (j4 > j5) {
            return 1;
        }
        this.zzd.zzj().zzn().zza(ProtectedSandApp.s("\udf26"), Long.valueOf(this.zzb));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzd.zzj().zzg().zza(this.zzc, th);
        if ((th instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(zzhv zzhvVar, Callable<V> callable, boolean z4, String str) {
        super(com.google.android.gms.internal.measurement.zzdg.zza().zza(callable));
        AtomicLong atomicLong;
        this.zzd = zzhvVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhv.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z4;
        if (andIncrement == Long.MAX_VALUE) {
            zzhvVar.zzj().zzg().zza(ProtectedSandApp.s("\udf25"));
        }
    }
}

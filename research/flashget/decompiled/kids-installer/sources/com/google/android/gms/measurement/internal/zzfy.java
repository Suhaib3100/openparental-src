package com.google.android.gms.measurement.internal;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfy extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzga zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfy(zzga zzgaVar, Runnable runnable, boolean z5, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z5;
        if (andIncrement == Long.MAX_VALUE) {
            a.a(zzgaVar.zzt, ProtectedSandApp.s("࿋"));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@o0 Object obj) {
        zzfy zzfyVar = (zzfy) obj;
        boolean z5 = this.zza;
        if (z5 != zzfyVar.zza) {
            return !z5 ? 1 : -1;
        }
        long j5 = this.zzc;
        long j6 = zzfyVar.zzc;
        if (j5 < j6) {
            return -1;
        }
        if (j5 > j6) {
            return 1;
        }
        this.zzb.zzt.zzaA().zzh().zzb(ProtectedSandApp.s("࿎"), Long.valueOf(this.zzc));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzaA().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfw) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfy(zzga zzgaVar, Callable callable, boolean z5, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzb = zzgaVar;
        String s5 = ProtectedSandApp.s("࿌");
        Preconditions.checkNotNull(s5);
        atomicLong = zzga.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = s5;
        this.zza = z5;
        if (andIncrement == Long.MAX_VALUE) {
            a.a(zzgaVar.zzt, ProtectedSandApp.s("\u0fcd"));
        }
    }
}

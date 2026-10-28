package com.google.android.gms.measurement.internal;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzga extends zzgx {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);

    @q0
    private zzfz zzb;

    @q0
    private zzfz zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    zzga(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzfx(this, ProtectedSandApp.s("モ"));
        this.zzg = new zzfx(this, ProtectedSandApp.s("ャ"));
    }

    static /* bridge */ /* synthetic */ boolean zzr(zzga zzgaVar) {
        boolean z5 = zzgaVar.zzj;
        return false;
    }

    private final void zzt(zzfy zzfyVar) {
        synchronized (this.zzh) {
            this.zzd.add(zzfyVar);
            zzfz zzfzVar = this.zzb;
            if (zzfzVar == null) {
                zzfz zzfzVar2 = new zzfz(this, ProtectedSandApp.s("ヤ"), this.zzd);
                this.zzb = zzfzVar2;
                zzfzVar2.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                zzfzVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zzaz() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException(ProtectedSandApp.s("ュ"));
        }
    }

    @q0
    final Object zzd(AtomicReference atomicReference, long j5, String str, Runnable runnable) {
        String s5 = ProtectedSandApp.s("ユ");
        synchronized (atomicReference) {
            this.zzt.zzaB().zzp(runnable);
            try {
                atomicReference.wait(j5);
            } catch (InterruptedException unused) {
                this.zzt.zzaA().zzk().zza(s5 + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.zzt.zzaA().zzk().zza(ProtectedSandApp.s("ョ").concat(str));
        }
        return obj;
    }

    @Override // com.google.android.gms.measurement.internal.zzgx
    protected final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void zzg() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException(ProtectedSandApp.s("ヨ"));
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfy zzfyVar = new zzfy(this, callable, false, ProtectedSandApp.s("ラ"));
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                b.a(this.zzt, ProtectedSandApp.s("リ"));
            }
            zzfyVar.run();
        } else {
            zzt(zzfyVar);
        }
        return zzfyVar;
    }

    public final Future zzi(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzfy zzfyVar = new zzfy(this, callable, true, ProtectedSandApp.s("ル"));
        if (Thread.currentThread() == this.zzb) {
            zzfyVar.run();
        } else {
            zzt(zzfyVar);
        }
        return zzfyVar;
    }

    public final void zzo(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzfy zzfyVar = new zzfy(this, runnable, false, ProtectedSandApp.s("レ"));
        synchronized (this.zzh) {
            this.zze.add(zzfyVar);
            zzfz zzfzVar = this.zzc;
            if (zzfzVar == null) {
                zzfz zzfzVar2 = new zzfz(this, ProtectedSandApp.s("ロ"), this.zze);
                this.zzc = zzfzVar2;
                zzfzVar2.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            } else {
                zzfzVar.zza();
            }
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfy(this, runnable, false, ProtectedSandApp.s("ヮ")));
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzt(new zzfy(this, runnable, true, ProtectedSandApp.s("ワ")));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.zzb;
    }
}

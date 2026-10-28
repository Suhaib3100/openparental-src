package com.google.android.gms.measurement.internal;

import android.os.Process;
import androidx.annotation.b0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfz extends Thread {
    final /* synthetic */ zzga zza;
    private final Object zzb;
    private final BlockingQueue zzc;

    @b0("threadLifeCycleLock")
    private boolean zzd = false;

    public zzfz(zzga zzgaVar, String str, BlockingQueue blockingQueue) {
        this.zza = zzgaVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zzb = new Object();
        this.zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzfz zzfzVar;
        zzfz zzfzVar2;
        obj = this.zza.zzh;
        synchronized (obj) {
            if (!this.zzd) {
                semaphore = this.zza.zzi;
                semaphore.release();
                obj2 = this.zza.zzh;
                obj2.notifyAll();
                zzga zzgaVar = this.zza;
                zzfzVar = zzgaVar.zzb;
                if (this == zzfzVar) {
                    zzgaVar.zzb = null;
                } else {
                    zzfzVar2 = zzgaVar.zzc;
                    if (this == zzfzVar2) {
                        zzgaVar.zzc = null;
                    } else {
                        zzgaVar.zzt.zzaA().zzd().zza(ProtectedSandApp.s("࿏"));
                    }
                }
                this.zzd = true;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.zza.zzt.zzaA().zzk().zzb(String.valueOf(getName()).concat(ProtectedSandApp.s("࿐")), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z5 = false;
        while (!z5) {
            try {
                semaphore = this.zza.zzi;
                semaphore.acquire();
                z5 = true;
            } catch (InterruptedException e6) {
                zzc(e6);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzfy zzfyVar = (zzfy) this.zzc.poll();
                if (zzfyVar != null) {
                    Process.setThreadPriority(true != zzfyVar.zza ? 10 : threadPriority);
                    zzfyVar.run();
                } else {
                    synchronized (this.zzb) {
                        if (this.zzc.peek() == null) {
                            zzga.zzr(this.zza);
                            try {
                                this.zzb.wait(30000L);
                            } catch (InterruptedException e7) {
                                zzc(e7);
                            }
                        }
                    }
                    obj = this.zza.zzh;
                    synchronized (obj) {
                        if (this.zzc.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zzb) {
            this.zzb.notifyAll();
        }
    }
}

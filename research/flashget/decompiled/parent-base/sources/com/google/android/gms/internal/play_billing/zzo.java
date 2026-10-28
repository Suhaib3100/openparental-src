package com.google.android.gms.internal.play_billing;

import androidx.annotation.q0;
import androidx.compose.ui.input.pointer.s;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public class zzo implements zzdk {
    static final boolean zza;
    static final zzd zzb;
    public static final /* synthetic */ int zzf = 0;
    private static final Logger zzg;
    private static final Object zzh;

    @q0
    volatile Object zzc;

    @q0
    volatile zzh zzd;

    @q0
    volatile zzm zze;

    static {
        zzd zzlVar;
        String s4 = ProtectedSandApp.s("\ud963");
        zza = Boolean.parseBoolean(System.getProperty(ProtectedSandApp.s("\ud964"), ProtectedSandApp.s("\ud965")));
        zzg = Logger.getLogger(zzo.class.getName());
        try {
            zzlVar = new zzj(AtomicReferenceFieldUpdater.newUpdater(zzm.class, Thread.class, ProtectedSandApp.s("\ud966")), AtomicReferenceFieldUpdater.newUpdater(zzm.class, zzm.class, s4), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzm.class, ProtectedSandApp.s("\ud967")), AtomicReferenceFieldUpdater.newUpdater(zzo.class, zzh.class, ProtectedSandApp.s("\ud968")), AtomicReferenceFieldUpdater.newUpdater(zzo.class, Object.class, s4));
            th = null;
        } catch (Throwable th) {
            th = th;
            zzlVar = new zzl();
        }
        Throwable th2 = th;
        zzb = zzlVar;
        if (th2 != null) {
            zzg.logp(Level.SEVERE, ProtectedSandApp.s("\ud96b"), ProtectedSandApp.s("\ud969"), ProtectedSandApp.s("\ud96a"), th2);
        }
        zzh = new Object();
    }

    protected zzo() {
    }

    static void zzc(zzo zzoVar) {
        zzm zzmVar;
        zzd zzdVar;
        zzh zzhVar;
        do {
            zzmVar = zzoVar.zze;
            zzdVar = zzb;
        } while (!zzdVar.zze(zzoVar, zzmVar, zzm.zza));
        while (zzmVar != null) {
            Thread thread = zzmVar.zzb;
            if (thread != null) {
                zzmVar.zzb = null;
                LockSupport.unpark(thread);
            }
            zzmVar = zzmVar.zzc;
        }
        do {
            zzhVar = zzoVar.zzd;
        } while (!zzdVar.zzc(zzoVar, zzhVar, zzh.zza));
        zzh zzhVar2 = null;
        while (zzhVar != null) {
            zzh zzhVar3 = zzhVar.zzd;
            zzhVar.zzd = zzhVar2;
            zzhVar2 = zzhVar;
            zzhVar = zzhVar3;
        }
        while (zzhVar2 != null) {
            Runnable runnable = zzhVar2.zzb;
            zzh zzhVar4 = zzhVar2.zzd;
            if (runnable instanceof zzk) {
                zzo zzoVar2 = ((zzk) runnable).zza;
                throw null;
            }
            zzf(runnable, zzhVar2.zzc);
            zzhVar2 = zzhVar4;
        }
    }

    private final void zze(StringBuilder sb) {
        V v4;
        String s4 = ProtectedSandApp.s("\ud96c");
        boolean z4 = false;
        while (true) {
            try {
                try {
                    v4 = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append(ProtectedSandApp.s("\ud971"));
                    return;
                } catch (RuntimeException e4) {
                    sb.append(ProtectedSandApp.s("\ud96f"));
                    sb.append(e4.getClass());
                    sb.append(ProtectedSandApp.s("\ud970"));
                    return;
                } catch (ExecutionException e5) {
                    sb.append(ProtectedSandApp.s("\ud972"));
                    sb.append(e5.getCause());
                    sb.append(s4);
                    return;
                }
            } catch (InterruptedException unused2) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb.append(ProtectedSandApp.s("\ud96d"));
        sb.append(v4 == this ? ProtectedSandApp.s("\ud96e") : String.valueOf(v4));
        sb.append(s4);
    }

    private static void zzf(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            zzg.logp(Level.SEVERE, ProtectedSandApp.s("\ud96b"), ProtectedSandApp.s("\ud975"), y.a(ProtectedSandApp.s("\ud973"), String.valueOf(runnable), ProtectedSandApp.s("\ud974"), String.valueOf(executor)), (Throwable) e4);
        }
    }

    private final void zzg(zzm zzmVar) {
        zzmVar.zzb = null;
        while (true) {
            zzm zzmVar2 = this.zze;
            if (zzmVar2 != zzm.zza) {
                zzm zzmVar3 = null;
                while (zzmVar2 != null) {
                    zzm zzmVar4 = zzmVar2.zzc;
                    if (zzmVar2.zzb != null) {
                        zzmVar3 = zzmVar2;
                    } else if (zzmVar3 != null) {
                        zzmVar3.zzc = zzmVar4;
                        if (zzmVar3.zzb == null) {
                            break;
                        }
                    } else if (!zzb.zze(this, zzmVar2, zzmVar4)) {
                        break;
                    }
                    zzmVar2 = zzmVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzh(Object obj) throws ExecutionException {
        if (obj instanceof zze) {
            Throwable th = ((zze) obj).zzc;
            CancellationException cancellationException = new CancellationException(ProtectedSandApp.s("\ud976"));
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzg) {
            throw new ExecutionException(((zzg) obj).zza);
        }
        if (obj == zzh) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.zzc;
        if ((obj instanceof zzk) | (obj == null)) {
            zze zzeVar = zza ? new zze(z4, new CancellationException(ProtectedSandApp.s("\ud977"))) : z4 ? zze.zza : zze.zzb;
            while (!zzb.zzd(this, obj, zzeVar)) {
                obj = this.zzc;
                if (!(obj instanceof zzk)) {
                }
            }
            zzc(this);
            if (!(obj instanceof zzk)) {
                return true;
            }
            zzdk zzdkVar = ((zzk) obj).zzb;
            throw null;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.zzc;
        if ((obj2 != null) && (!(obj2 instanceof zzk))) {
            return zzh(obj2);
        }
        zzm zzmVar = this.zze;
        zzm zzmVar2 = zzm.zza;
        if (zzmVar != zzmVar2) {
            zzm zzmVar3 = new zzm();
            do {
                zzd zzdVar = zzb;
                zzdVar.zza(zzmVar3, zzmVar);
                if (zzdVar.zze(this, zzmVar, zzmVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzg(zzmVar3);
                            throw new InterruptedException();
                        }
                        obj = this.zzc;
                    } while (!((obj != null) & (!(obj instanceof zzk))));
                    return zzh(obj);
                }
                zzmVar = this.zze;
            } while (zzmVar != zzmVar2);
        }
        return zzh(this.zzc);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.zzc != null) & (!(r0 instanceof zzk));
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(ProtectedSandApp.s("\ud980"));
        boolean z4 = this.zzc instanceof zze;
        String s4 = ProtectedSandApp.s("\ud96c");
        if (z4) {
            sb.append(ProtectedSandApp.s("\ud971"));
        } else if (isDone()) {
            zze(sb);
        } else {
            try {
                concat = zza();
            } catch (RuntimeException e4) {
                concat = ProtectedSandApp.s("\ud981").concat(String.valueOf(e4.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                androidx.concurrent.futures.a.a(sb, ProtectedSandApp.s("\ud982"), concat, s4);
            } else if (isDone()) {
                zze(sb);
            } else {
                sb.append(ProtectedSandApp.s("\ud983"));
            }
        }
        sb.append(s4);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @q0
    protected String zza() {
        Object obj = this.zzc;
        if (obj instanceof zzk) {
            zzdk zzdkVar = ((zzk) obj).zzb;
            return ProtectedSandApp.s("\ud984");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return s.a(ProtectedSandApp.s("\ud985"), ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), ProtectedSandApp.s("\ud986"));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void zzb(Runnable runnable, Executor executor) {
        executor.getClass();
        zzh zzhVar = this.zzd;
        zzh zzhVar2 = zzh.zza;
        if (zzhVar != zzhVar2) {
            zzh zzhVar3 = new zzh(runnable, executor);
            do {
                zzhVar3.zzd = zzhVar;
                if (zzb.zzc(this, zzhVar, zzhVar3)) {
                    return;
                } else {
                    zzhVar = this.zzd;
                }
            } while (zzhVar != zzhVar2);
        }
        zzf(runnable, executor);
    }

    protected boolean zzd(@q0 Object obj) {
        if (obj == null) {
            obj = zzh;
        }
        if (!zzb.zzd(this, null, obj)) {
            return false;
        }
        zzc(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException, java.util.concurrent.ExecutionException {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzo.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}

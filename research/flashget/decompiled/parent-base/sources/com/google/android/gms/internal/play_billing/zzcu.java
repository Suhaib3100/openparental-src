package com.google.android.gms.internal.play_billing;

import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzcu<V> extends zzcv<V> {

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zza {
        static final zza zza;
        static final zza zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzcv.zzc) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zza(false, null);
                zza = new zza(true, null);
            }
        }

        zza(boolean z4, Throwable th) {
            this.zzc = z4;
            this.zzd = th;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzb<V> implements Runnable {
        final zzcu<V> zza;
        final zzdk<? extends V> zzb;

        zzb(zzcu zzcuVar, zzdk zzdkVar) {
            this.zza = zzcuVar;
            this.zzb = zzdkVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.zza.valueField != this) {
                return;
            }
            if (zzcv.zzq(this.zza, this, zzcu.zzr(this.zzb))) {
                zzcu.zzu(this.zza, false);
            }
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzc {
        static final zzc zza = new zzc(new Throwable(ProtectedSandApp.s("휄")) { // from class: com.google.android.gms.internal.play_billing.zzcu.zzc.1
            {
                super(ProtectedSandApp.s("휃"));
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    interface zze<V> extends zzdk<V> {
    }

    protected zzcu() {
    }

    static Object zzc(Object obj) throws ExecutionException {
        if (obj instanceof zza) {
            CancellationException cancellationException = new CancellationException(ProtectedSandApp.s("휕"));
            cancellationException.initCause(((zza) obj).zzd);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzcv.zza) {
            return null;
        }
        return obj;
    }

    static boolean zzh(Object obj) {
        return !(obj instanceof zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zzr(zzdk zzdkVar) {
        Throwable zze2;
        String s4 = ProtectedSandApp.s("휖");
        if (zzdkVar instanceof zze) {
            Object obj = ((zzcu) zzdkVar).valueField;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.zzc) {
                    Throwable th = zzaVar.zzd;
                    obj = th != null ? new zza(false, th) : zza.zzb;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((zzdkVar instanceof zzdq) && (zze2 = ((zzdq) zzdkVar).zze()) != null) {
            return new zzc(zze2);
        }
        boolean isCancelled = zzdkVar.isCancelled();
        if ((!zzcv.zzc) && isCancelled) {
            zza zzaVar2 = zza.zzb;
            Objects.requireNonNull(zzaVar2);
            return zzaVar2;
        }
        try {
            Object zzs = zzs(zzdkVar);
            return isCancelled ? new zza(false, new IllegalArgumentException(s4.concat(String.valueOf(zzdkVar)))) : zzs == null ? zzcv.zza : zzs;
        } catch (Error e4) {
            e = e4;
            return new zzc(e);
        } catch (CancellationException e5) {
            return !isCancelled ? new zzc(new IllegalArgumentException(ProtectedSandApp.s("휗").concat(String.valueOf(zzdkVar)), e5)) : new zza(false, e5);
        } catch (ExecutionException e6) {
            return isCancelled ? new zza(false, new IllegalArgumentException(s4.concat(String.valueOf(zzdkVar)), e6)) : new zzc(e6.getCause());
        } catch (Exception e7) {
            e = e7;
            return new zzc(e);
        }
    }

    private static Object zzs(Future future) throws ExecutionException {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
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
        return obj;
    }

    private final void zzt(StringBuilder sb) {
        String s4 = ProtectedSandApp.s("휘");
        try {
            Object zzs = zzs(this);
            sb.append(ProtectedSandApp.s("휙"));
            if (zzs == null) {
                sb.append(ProtectedSandApp.s("휚"));
            } else if (zzs == this) {
                sb.append(ProtectedSandApp.s("휛"));
            } else {
                sb.append(zzs.getClass().getName());
                sb.append(ProtectedSandApp.s("휜"));
                sb.append(Integer.toHexString(System.identityHashCode(zzs)));
            }
            sb.append(s4);
        } catch (CancellationException unused) {
            sb.append(ProtectedSandApp.s("휟"));
        } catch (ExecutionException e4) {
            sb.append(ProtectedSandApp.s("휠"));
            sb.append(e4.getCause());
            sb.append(s4);
        } catch (Exception e5) {
            sb.append(ProtectedSandApp.s("휝"));
            sb.append(e5.getClass());
            sb.append(ProtectedSandApp.s("휞"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzu(zzcu zzcuVar, boolean z4) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            zzcuVar.zzo();
            zzcuVar.zzg();
            zzd zzdVar3 = zzdVar2;
            zzd zzk = zzcuVar.zzk(zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zzk != null) {
                zzd zzdVar5 = zzk.next;
                zzk.next = zzdVar4;
                zzdVar4 = zzk;
                zzk = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzcuVar = zzbVar.zza;
                    if (zzcuVar.valueField == zzbVar && zzcv.zzq(zzcuVar, zzbVar, zzr(zzbVar.zzb))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    Objects.requireNonNull(executor);
                    zzv(runnable2, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e4) {
            zzcv.zzb.zza().logp(Level.SEVERE, ProtectedSandApp.s("휣"), ProtectedSandApp.s("휤"), y.a(ProtectedSandApp.s("휡"), String.valueOf(runnable), ProtectedSandApp.s("휢"), String.valueOf(executor)), (Throwable) e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        zza zzaVar;
        Object obj = this.valueField;
        if (!(obj instanceof zzb) && !(obj == null)) {
            return false;
        }
        if (zzcv.zzc) {
            zzaVar = new zza(z4, new CancellationException(ProtectedSandApp.s("휥")));
        } else {
            zzaVar = z4 ? zza.zza : zza.zzb;
            Objects.requireNonNull(zzaVar);
        }
        zzcu<V> zzcuVar = this;
        boolean z5 = false;
        while (true) {
            if (zzcv.zzq(zzcuVar, obj, zzaVar)) {
                zzu(zzcuVar, z4);
                if (!(obj instanceof zzb)) {
                    break;
                }
                zzdk<? extends V> zzdkVar = ((zzb) obj).zzb;
                if (!(zzdkVar instanceof zze)) {
                    zzdkVar.cancel(z4);
                    break;
                }
                zzcuVar = (zzcu) zzdkVar;
                obj = zzcuVar.valueField;
                if (!(obj == null) && !(obj instanceof zzb)) {
                    break;
                }
                z5 = true;
            } else {
                obj = zzcuVar.valueField;
                if (zzh(obj)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zzl();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.valueField instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.valueField;
        return (obj != null) & zzh(obj);
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith(ProtectedSandApp.s("휦"))) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(ProtectedSandApp.s("휧"));
        boolean z4 = this.valueField instanceof zza;
        String s4 = ProtectedSandApp.s("휘");
        if (z4) {
            sb.append(ProtectedSandApp.s("휟"));
        } else if (isDone()) {
            zzt(sb);
        } else {
            int length = sb.length();
            sb.append(ProtectedSandApp.s("휨"));
            Object obj = this.valueField;
            boolean z5 = obj instanceof zzb;
            String s5 = ProtectedSandApp.s("휩");
            if (z5) {
                sb.append(ProtectedSandApp.s("휪"));
                zzdk<? extends V> zzdkVar = ((zzb) obj).zzb;
                try {
                    if (zzdkVar == this) {
                        sb.append(ProtectedSandApp.s("휛"));
                    } else {
                        sb.append(zzdkVar);
                    }
                } catch (Throwable th) {
                    zzdl.zza(th);
                    sb.append(s5);
                    sb.append(th.getClass());
                }
                sb.append(s4);
            } else {
                try {
                    concat = zzbo.zza(zzd());
                } catch (Throwable th2) {
                    zzdl.zza(th2);
                    concat = s5.concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    androidx.concurrent.futures.a.a(sb, ProtectedSandApp.s("휫"), concat, s4);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                zzt(sb);
            }
        }
        sb.append(s4);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void zzb(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzbl.zzc(executor, ProtectedSandApp.s("휬"));
        if (!isDone() && (zzdVar = this.listenersField) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzp(zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listenersField;
                }
            } while (zzdVar != zzd.zza);
        }
        zzv(runnable, executor);
    }

    protected String zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    protected final Throwable zze() {
        if (!(this instanceof zze)) {
            return null;
        }
        Object obj = this.valueField;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    protected void zzg() {
    }

    protected final boolean zzi(Throwable th) {
        if (!zzcv.zzq(this, null, new zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    protected final boolean zzj(zzdk zzdkVar) {
        zzc zzcVar;
        Object obj = this.valueField;
        if (obj == null) {
            if (zzdkVar.isDone()) {
                if (!zzcv.zzq(this, null, zzr(zzdkVar))) {
                    return false;
                }
                zzu(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, zzdkVar);
            if (zzcv.zzq(this, null, zzbVar)) {
                try {
                    zzdkVar.zzb(zzbVar, zzda.zza);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzcv.zzq(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.valueField;
        }
        if (obj instanceof zza) {
            zzdkVar.cancel(((zza) obj).zzc);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return zzm(j4, timeUnit);
    }
}

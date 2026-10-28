package com.google.android.gms.internal.play_billing;

import androidx.compose.material3.z3;
import com.cby.txliteav.live.impl.tx.f;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcv;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
abstract class zzcv<V> extends zzdq implements zzdk<V> {
    static final Object zza = new Object();
    static final zzdj zzb = new zzdj(zzcu.class);
    static final boolean zzc;
    private static final zza zzd;
    volatile zzcu.zzd listenersField;
    volatile Object valueField;
    volatile zze waitersField;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    abstract class zza {
        /* synthetic */ zza(zzcz zzczVar) {
        }

        abstract zzcu.zzd zza(zzcv zzcvVar, zzcu.zzd zzdVar);

        abstract zze zzb(zzcv zzcvVar, zze zzeVar);

        abstract void zzc(zze zzeVar, zze zzeVar2);

        abstract void zzd(zze zzeVar, Thread thread);

        abstract boolean zze(zzcv zzcvVar, zzcu.zzd zzdVar, zzcu.zzd zzdVar2);

        abstract boolean zzf(zzcv zzcvVar, Object obj, Object obj2);

        abstract boolean zzg(zzcv zzcvVar, zze zzeVar, zze zzeVar2);
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzb extends zza {
        private static final AtomicReferenceFieldUpdater<zze, Thread> zza = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, ProtectedSandApp.s("휭"));
        private static final AtomicReferenceFieldUpdater<zze, zze> zzb = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, ProtectedSandApp.s("휮"));
        private static final AtomicReferenceFieldUpdater<? super zzcv<?>, zze> zzc = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, zze.class, ProtectedSandApp.s("휯"));
        private static final AtomicReferenceFieldUpdater<? super zzcv<?>, zzcu.zzd> zzd = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, zzcu.zzd.class, ProtectedSandApp.s("휰"));
        private static final AtomicReferenceFieldUpdater<? super zzcv<?>, Object> zze = AtomicReferenceFieldUpdater.newUpdater(zzcv.class, Object.class, ProtectedSandApp.s("휱"));

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zzcu.zzd zza(zzcv zzcvVar, zzcu.zzd zzdVar) {
            return zzd.getAndSet(zzcvVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zze zzb(zzcv zzcvVar, zze zzeVar) {
            return zzc.getAndSet(zzcvVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzb.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zze(zzcv zzcvVar, zzcu.zzd zzdVar, zzcu.zzd zzdVar2) {
            return zzcw.zza(zzd, zzcvVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
            return zzcw.zza(zze, zzcvVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzg(zzcv zzcvVar, zze zzeVar, zze zzeVar2) {
            return zzcw.zza(zzc, zzcvVar, zzeVar, zzeVar2);
        }

        /* synthetic */ zzb(zzcz zzczVar) {
            super(null);
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zzcu.zzd zza(zzcv zzcvVar, zzcu.zzd zzdVar) {
            zzcu.zzd zzdVar2;
            synchronized (zzcvVar) {
                try {
                    zzdVar2 = zzcvVar.listenersField;
                    if (zzdVar2 != zzdVar) {
                        zzcvVar.listenersField = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zze zzb(zzcv zzcvVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzcvVar) {
                try {
                    zzeVar2 = zzcvVar.waitersField;
                    if (zzeVar2 != zzeVar) {
                        zzcvVar.waitersField = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zzeVar.next = zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzd(zze zzeVar, Thread thread) {
            zzeVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zze(zzcv zzcvVar, zzcu.zzd zzdVar, zzcu.zzd zzdVar2) {
            synchronized (zzcvVar) {
                try {
                    if (zzcvVar.listenersField != zzdVar) {
                        return false;
                    }
                    zzcvVar.listenersField = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
            synchronized (zzcvVar) {
                try {
                    if (zzcvVar.valueField != obj) {
                        return false;
                    }
                    zzcvVar.valueField = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzg(zzcv zzcvVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzcvVar) {
                try {
                    if (zzcvVar.waitersField != zzeVar) {
                        return false;
                    }
                    zzcvVar.waitersField = zzeVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* synthetic */ zzc(zzcz zzczVar) {
            super(null);
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zzd extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe zzh;
            try {
                try {
                    zzh = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    try {
                        zzh = (Unsafe) Class.forName(ProtectedSandApp.s("휲")).getMethod(ProtectedSandApp.s("휳"), PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcy
                            @Override // java.security.PrivilegedExceptionAction
                            public final Object run() {
                                return zzcv.zzd.zzh();
                            }
                        });
                    } catch (Exception unused2) {
                        zzh = zzh();
                        Unsafe unsafe = zzh;
                    }
                }
                try {
                    zzc = zzh.objectFieldOffset(zzcv.class.getDeclaredField(ProtectedSandApp.s("휴")));
                    zzb = zzh.objectFieldOffset(zzcv.class.getDeclaredField(ProtectedSandApp.s("휵")));
                    zzd = zzh.objectFieldOffset(zzcv.class.getDeclaredField(ProtectedSandApp.s("휶")));
                    zze = zzh.objectFieldOffset(zze.class.getDeclaredField(ProtectedSandApp.s("휷")));
                    zzf = zzh.objectFieldOffset(zze.class.getDeclaredField(ProtectedSandApp.s("휸")));
                    zza = zzh;
                } catch (NoSuchFieldException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Exception e5) {
                throw new RuntimeException(ProtectedSandApp.s("휹"), e5);
            }
        }

        private zzd() {
            throw null;
        }

        static /* synthetic */ Unsafe zzh() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError(ProtectedSandApp.s("휺"));
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zzcu.zzd zza(zzcv zzcvVar, zzcu.zzd zzdVar) {
            zzcu.zzd zzdVar2;
            do {
                zzdVar2 = zzcvVar.listenersField;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzcvVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final zze zzb(zzcv zzcvVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzcvVar.waitersField;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!zzg(zzcvVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzc(zze zzeVar, zze zzeVar2) {
            zza.putObject(zzeVar, zzf, zzeVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final void zzd(zze zzeVar, Thread thread) {
            zza.putObject(zzeVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zze(zzcv zzcvVar, zzcu.zzd zzdVar, zzcu.zzd zzdVar2) {
            return zzcx.zza(zza, zzcvVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzf(zzcv zzcvVar, Object obj, Object obj2) {
            return zzcx.zza(zza, zzcvVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.play_billing.zzcv.zza
        final boolean zzg(zzcv zzcvVar, zze zzeVar, zze zzeVar2) {
            return zzcx.zza(zza, zzcvVar, zzc, zzeVar, zzeVar2);
        }

        /* synthetic */ zzd(zzcz zzczVar) {
            super(null);
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    final class zze {
        static final zze zza = new zze(false);
        volatile zze next;
        volatile Thread thread;

        zze(boolean z4) {
        }

        zze() {
            zzcv.zzn(this, Thread.currentThread());
        }
    }

    static {
        boolean z4;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z4 = Boolean.parseBoolean(System.getProperty(ProtectedSandApp.s("휅"), ProtectedSandApp.s("휆")));
        } catch (SecurityException unused) {
            z4 = false;
        }
        zzc = z4;
        String property = System.getProperty(ProtectedSandApp.s("휇"), "");
        zzcz zzczVar = null;
        if (property == null || property.contains(ProtectedSandApp.s("휈"))) {
            try {
                zzcVar = new zzd(zzczVar);
            } catch (Error | Exception e4) {
                try {
                    th = e4;
                    th2 = null;
                    zzcVar = new zzb(zzczVar);
                } catch (Error | Exception e5) {
                    th = e4;
                    th2 = e5;
                    zzcVar = new zzc(zzczVar);
                }
            }
        } else {
            try {
                zzcVar = new zzb(zzczVar);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(zzczVar);
            }
        }
        th2 = null;
        th = null;
        zzd = zzcVar;
        if (th2 != null) {
            zzdj zzdjVar = zzb;
            Logger zza2 = zzdjVar.zza();
            Level level = Level.SEVERE;
            zza2.logp(level, ProtectedSandApp.s("휋"), ProtectedSandApp.s("휉"), ProtectedSandApp.s("휊"), th);
            zzdjVar.zza().logp(level, ProtectedSandApp.s("휋"), ProtectedSandApp.s("휉"), ProtectedSandApp.s("휌"), th2);
        }
    }

    zzcv() {
    }

    private final void zza(zze zzeVar) {
        zzeVar.thread = null;
        while (true) {
            zze zzeVar2 = this.waitersField;
            if (zzeVar2 != zze.zza) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.next;
                    if (zzeVar2.thread != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.next = zzeVar4;
                        if (zzeVar3.thread == null) {
                            break;
                        }
                    } else if (!zzd.zzg(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    static /* synthetic */ void zzn(zze zzeVar, Thread thread) {
        zzd.zzd(zzeVar, thread);
    }

    static boolean zzq(zzcv zzcvVar, Object obj, Object obj2) {
        return zzd.zzf(zzcvVar, obj, obj2);
    }

    final zzcu.zzd zzk(zzcu.zzd zzdVar) {
        return zzd.zza(this, zzdVar);
    }

    final Object zzl() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.valueField;
        if ((obj2 != null) && zzcu.zzh(obj2)) {
            return zzcu.zzc(obj2);
        }
        zze zzeVar = this.waitersField;
        if (zzeVar != zze.zza) {
            zze zzeVar2 = new zze();
            do {
                zza zzaVar = zzd;
                zzaVar.zzc(zzeVar2, zzeVar);
                if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zza(zzeVar2);
                            throw new InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & zzcu.zzh(obj)));
                    return zzcu.zzc(obj);
                }
                zzeVar = this.waitersField;
            } while (zzeVar != zze.zza);
        }
        Object obj3 = this.valueField;
        Objects.requireNonNull(obj3);
        return zzcu.zzc(obj3);
    }

    final Object zzm(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.valueField;
        boolean z4 = true;
        if ((obj != null) && zzcu.zzh(obj)) {
            return zzcu.zzc(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zze zzeVar = this.waitersField;
            if (zzeVar != zze.zza) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = zzd;
                    zzaVar.zzc(zzeVar2, zzeVar);
                    if (zzaVar.zzg(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzeVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.valueField;
                            if ((obj2 != null) && zzcu.zzh(obj2)) {
                                return zzcu.zzc(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzeVar2);
                    } else {
                        zzeVar = this.waitersField;
                    }
                } while (zzeVar != zze.zza);
            }
            Object obj3 = this.valueField;
            Objects.requireNonNull(obj3);
            return zzcu.zzc(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.valueField;
            if ((obj4 != null) && zzcu.zzh(obj4)) {
                return zzcu.zzc(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String obj5 = toString();
        String obj6 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj6.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        String s4 = ProtectedSandApp.s("휍");
        String s5 = ProtectedSandApp.s("휎");
        String a5 = f.a(s4, j4, s5, lowerCase2);
        if (nanos + 1000 < 0) {
            String concat = a5.concat(ProtectedSandApp.s("휏"));
            long j5 = -nanos;
            long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z4 = false;
            }
            if (convert > 0) {
                String str = concat + convert + s5 + lowerCase;
                if (z4) {
                    str = str.concat(ProtectedSandApp.s("휐"));
                }
                concat = str.concat(s5);
            }
            if (z4) {
                concat = concat + nanos2 + ProtectedSandApp.s("휑");
            }
            a5 = concat.concat(ProtectedSandApp.s("휒"));
        }
        if (isDone()) {
            throw new TimeoutException(a5.concat(ProtectedSandApp.s("휓")));
        }
        throw new TimeoutException(z3.a(a5, ProtectedSandApp.s("휔"), obj5));
    }

    final void zzo() {
        for (zze zzb2 = zzd.zzb(this, zze.zza); zzb2 != null; zzb2 = zzb2.next) {
            Thread thread = zzb2.thread;
            if (thread != null) {
                zzb2.thread = null;
                LockSupport.unpark(thread);
            }
        }
    }

    final boolean zzp(zzcu.zzd zzdVar, zzcu.zzd zzdVar2) {
        return zzd.zze(this, zzdVar, zzdVar2);
    }
}

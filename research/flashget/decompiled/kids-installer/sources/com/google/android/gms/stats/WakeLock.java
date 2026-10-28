package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@ShowFirstParty
@ThreadSafe
@KeepForSdk
/* loaded from: classes2.dex */
public class WakeLock {
    private static final long zzb = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService zzc = null;
    private static final Object zzd = new Object();
    private static volatile zzd zze = new zzb();

    @b0("acquireReleaseLock")
    com.google.android.gms.internal.stats.zzb zza;
    private final Object zzf;

    @b0("acquireReleaseLock")
    private final PowerManager.WakeLock zzg;

    @b0("acquireReleaseLock")
    private int zzh;

    @b0("acquireReleaseLock")
    private Future<?> zzi;

    @b0("acquireReleaseLock")
    private long zzj;

    @b0("acquireReleaseLock")
    private final Set<zze> zzk;

    @b0("acquireReleaseLock")
    private boolean zzl;

    @b0("acquireReleaseLock")
    private int zzm;
    private Clock zzn;
    private WorkSource zzo;
    private final String zzp;
    private final String zzq;
    private final Context zzr;

    @b0("acquireReleaseLock")
    private final Map<String, zzc> zzs;
    private AtomicInteger zzt;
    private final ScheduledExecutorService zzu;

    @KeepForSdk
    public WakeLock(@o0 Context context, int i5, @o0 String str) {
        String packageName = context.getPackageName();
        this.zzf = new Object();
        this.zzh = 0;
        this.zzk = new HashSet();
        this.zzl = true;
        this.zzn = DefaultClock.getInstance();
        this.zzs = new HashMap();
        this.zzt = new AtomicInteger(0);
        Preconditions.checkNotNull(context, ProtectedSandApp.s("ᇎ"));
        Preconditions.checkNotEmpty(str, ProtectedSandApp.s("ᇏ"));
        this.zzr = context.getApplicationContext();
        this.zzq = str;
        this.zza = null;
        if (ProtectedSandApp.s("ᇐ").equals(context.getPackageName())) {
            this.zzp = str;
        } else {
            String valueOf = String.valueOf(str);
            String s5 = ProtectedSandApp.s("ᇑ");
            this.zzp = valueOf.length() != 0 ? s5.concat(valueOf) : new String(s5);
        }
        PowerManager powerManager = (PowerManager) context.getSystemService(ProtectedSandApp.s("ᇒ"));
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) ProtectedSandApp.s("ᇓ"), 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i5, str);
        this.zzg = newWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            this.zzo = fromPackage;
            if (fromPackage != null) {
                zze(newWakeLock, fromPackage);
            }
        }
        ScheduledExecutorService scheduledExecutorService = zzc;
        if (scheduledExecutorService == null) {
            synchronized (zzd) {
                scheduledExecutorService = zzc;
                if (scheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    zzc = scheduledExecutorService;
                }
            }
        }
        this.zzu = scheduledExecutorService;
    }

    public static /* synthetic */ void zza(@o0 WakeLock wakeLock) {
        synchronized (wakeLock.zzf) {
            if (wakeLock.isHeld()) {
                String.valueOf(wakeLock.zzp).concat(ProtectedSandApp.s("ᇔ"));
                wakeLock.zzc();
                if (wakeLock.isHeld()) {
                    wakeLock.zzh = 1;
                    wakeLock.zzd(0);
                }
            }
        }
    }

    @b0("acquireReleaseLock")
    private final String zzb(String str) {
        if (this.zzl) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @b0("acquireReleaseLock")
    private final void zzc() {
        if (this.zzk.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.zzk);
        this.zzk.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private final void zzd(int i5) {
        synchronized (this.zzf) {
            if (isHeld()) {
                if (this.zzl) {
                    int i6 = this.zzh - 1;
                    this.zzh = i6;
                    if (i6 > 0) {
                        return;
                    }
                } else {
                    this.zzh = 0;
                }
                zzc();
                Iterator<zzc> it = this.zzs.values().iterator();
                while (it.hasNext()) {
                    it.next().zza = 0;
                }
                this.zzs.clear();
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                    this.zzi = null;
                    this.zzj = 0L;
                }
                this.zzm = 0;
                try {
                    if (this.zzg.isHeld()) {
                        try {
                            this.zzg.release();
                        } catch (RuntimeException e6) {
                            if (!e6.getClass().equals(RuntimeException.class)) {
                                throw e6;
                            }
                            String.valueOf(this.zzp).concat(ProtectedSandApp.s("ᇕ"));
                            if (this.zza != null) {
                                this.zza = null;
                            }
                        }
                    } else {
                        String.valueOf(this.zzp).concat(ProtectedSandApp.s("ᇖ"));
                    }
                } finally {
                    if (this.zza != null) {
                        this.zza = null;
                    }
                }
            }
        }
    }

    private static void zze(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e6) {
            Log.wtf(ProtectedSandApp.s("ᇗ"), e6.toString());
        }
    }

    @KeepForSdk
    public void acquire(long j5) {
        this.zzt.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, zzb), 1L);
        if (j5 > 0) {
            max = Math.min(j5, max);
        }
        synchronized (this.zzf) {
            if (!isHeld()) {
                this.zza = com.google.android.gms.internal.stats.zzb.zza(false, null);
                this.zzg.acquire();
                this.zzn.elapsedRealtime();
            }
            this.zzh++;
            this.zzm++;
            zzb(null);
            zzc zzcVar = this.zzs.get(null);
            if (zzcVar == null) {
                zzcVar = new zzc(null);
                this.zzs.put(null, zzcVar);
            }
            zzcVar.zza++;
            long elapsedRealtime = this.zzn.elapsedRealtime();
            long j6 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
            if (j6 > this.zzj) {
                this.zzj = j6;
                Future<?> future = this.zzi;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzi = this.zzu.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        WakeLock.zza(WakeLock.this);
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z5;
        synchronized (this.zzf) {
            z5 = this.zzh > 0;
        }
        return z5;
    }

    @KeepForSdk
    public void release() {
        if (this.zzt.decrementAndGet() < 0) {
            String.valueOf(this.zzp).concat(ProtectedSandApp.s("ᇘ"));
        }
        synchronized (this.zzf) {
            zzb(null);
            if (this.zzs.containsKey(null)) {
                zzc zzcVar = this.zzs.get(null);
                if (zzcVar != null) {
                    int i5 = zzcVar.zza - 1;
                    zzcVar.zza = i5;
                    if (i5 == 0) {
                        this.zzs.remove(null);
                    }
                }
            } else {
                String.valueOf(this.zzp).concat(ProtectedSandApp.s("ᇙ"));
            }
            zzd(0);
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z5) {
        synchronized (this.zzf) {
            this.zzl = z5;
        }
    }
}

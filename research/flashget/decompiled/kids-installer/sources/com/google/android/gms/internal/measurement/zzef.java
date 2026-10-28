package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import android.view.C0532i;
import androidx.annotation.b0;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzef {
    private static volatile zzef zzc;
    protected final Clock zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final AppMeasurementSdk zze;

    @b0("listenerList")
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcc zzj;

    protected zzef(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzW(str2, str3)) {
            this.zzd = ProtectedSandApp.s("ං");
        } else {
            this.zzd = str;
        }
        this.zza = DefaultClock.getInstance();
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zziq.zzc(context, ProtectedSandApp.s("ඃ"), com.google.android.gms.measurement.internal.zzfv.zza(context)) != null && !zzS()) {
                this.zzi = null;
                this.zzh = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (zzW(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = ProtectedSandApp.s("\u0d84");
        }
        zzV(new zzcx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzee(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT(Exception exc, boolean z5, boolean z6) {
        this.zzh |= z5;
        if (z5) {
            return;
        }
        String s5 = ProtectedSandApp.s("අ");
        if (z6) {
            zzB(5, s5, exc, null, null);
        }
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z5, boolean z6, Long l5) {
        zzV(new zzds(this, l5, str, str2, bundle, z5, z6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV(zzdu zzduVar) {
        this.zzb.execute(zzduVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzW(String str, String str2) {
        return (str2 == null || str == null || zzS()) ? false : true;
    }

    public static zzef zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzef.class) {
                if (zzc == null) {
                    zzc = new zzef(context, str, str2, str3, bundle);
                }
            }
        }
        return zzc;
    }

    public final void zzA(String str, String str2, Bundle bundle, long j5) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j5));
    }

    public final void zzB(int i5, String str, Object obj, Object obj2, Object obj3) {
        zzV(new zzdg(this, false, 5, str, obj, null, null));
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.zzf) {
            for (int i5 = 0; i5 < this.zzf.size(); i5++) {
                if (zzhgVar.equals(((Pair) this.zzf.get(i5)).first)) {
                    return;
                }
            }
            zzdw zzdwVar = new zzdw(zzhgVar);
            this.zzf.add(new Pair(zzhgVar, zzdwVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdwVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzV(new zzdq(this, zzdwVar));
        }
    }

    public final void zzD() {
        zzV(new zzcv(this));
    }

    public final void zzE(Bundle bundle) {
        zzV(new zzcn(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        zzV(new zzct(this, bundle));
    }

    public final void zzG(Bundle bundle) {
        zzV(new zzcu(this, bundle));
    }

    public final void zzH(Activity activity, String str, String str2) {
        zzV(new zzcr(this, activity, str, str2));
    }

    public final void zzI(boolean z5) {
        zzV(new zzdn(this, z5));
    }

    public final void zzJ(Bundle bundle) {
        zzV(new zzdo(this, bundle));
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzhf zzhfVar) {
        zzdv zzdvVar = new zzdv(zzhfVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzdvVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        zzV(new zzdp(this, zzdvVar));
    }

    public final void zzL(Boolean bool) {
        zzV(new zzcs(this, bool));
    }

    public final void zzM(long j5) {
        zzV(new zzcw(this, j5));
    }

    public final void zzN(String str) {
        zzV(new zzcq(this, str));
    }

    public final void zzO(String str, String str2, Object obj, boolean z5) {
        zzV(new zzdt(this, str, str2, obj, z5));
    }

    public final void zzP(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Pair pair;
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.zzf) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzhgVar.equals(((Pair) this.zzf.get(i5)).first)) {
                        pair = (Pair) this.zzf.get(i5);
                        break;
                    }
                    i5++;
                }
            }
            if (pair == null) {
                return;
            }
            this.zzf.remove(pair);
            zzdw zzdwVar = (zzdw) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdwVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzV(new zzdr(this, zzdwVar));
        }
    }

    protected final boolean zzS() {
        try {
            Class.forName(ProtectedSandApp.s("ආ"), false, zzef.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdj(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zzf(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdc(this, zzbzVar));
        Long zzc2 = zzbzVar.zzc(500L);
        if (zzc2 != null) {
            return zzc2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i5 = this.zzg + 1;
        this.zzg = i5;
        return nextLong + i5;
    }

    public final Bundle zzc(Bundle bundle, boolean z5) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdh(this, bundle, zzbzVar));
        if (z5) {
            return zzbzVar.zzb(C0532i.f8582a);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.zze;
    }

    protected final zzcc zzf(Context context, boolean z5) {
        try {
            return zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ProtectedSandApp.s("ඇ")).instantiate(ProtectedSandApp.s("ඈ")));
        } catch (DynamiteModule.LoadingException e6) {
            zzT(e6, true, false);
            return null;
        }
    }

    @n1
    public final Long zzh() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdl(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final Object zzi(int i5) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdm(this, zzbzVar, i5));
        return zzbz.zzf(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzk() {
        return this.zzi;
    }

    @n1
    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdk(this, zzbzVar));
        return zzbzVar.zzd(120000L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdb(this, zzbzVar));
        return zzbzVar.zzd(50L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzde(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdd(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzp() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzda(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final List zzq(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzcp(this, str, str2, zzbzVar));
        List list = (List) zzbz.zzf(zzbzVar.zzb(C0532i.f8582a), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzr(String str, String str2, boolean z5) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdf(this, str, str2, z5, zzbzVar));
        Bundle zzb = zzbzVar.zzb(C0532i.f8582a);
        if (zzb == null || zzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zzb.size());
        for (String str3 : zzb.keySet()) {
            Object obj = zzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzv(String str) {
        zzV(new zzcy(this, str));
    }

    public final void zzw(String str, String str2, Bundle bundle) {
        zzV(new zzco(this, str, str2, bundle));
    }

    public final void zzx(String str) {
        zzV(new zzcz(this, str));
    }

    public final void zzy(@o0 String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }
}

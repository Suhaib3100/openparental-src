package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.view.C1434k;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.measurement.internal.zzje;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.k2;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzjq extends zzh {
    final zzu zza;

    @m1
    private zzkz zzb;
    private zzjm zzc;
    private final Set<zzjl> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzav zzj;
    private PriorityQueue<zzno> zzk;
    private boolean zzl;

    @b0("consentLock")
    private zzje zzm;
    private final AtomicLong zzn;
    private long zzo;

    @m1
    private boolean zzp;
    private zzav zzq;
    private SharedPreferences.OnSharedPreferenceChangeListener zzr;
    private zzav zzs;
    private final zzor zzt;

    protected zzjq(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzp = true;
        this.zzt = new zzkr(this);
        this.zzf = new AtomicReference<>();
        this.zzm = zzje.zza;
        this.zzo = -1L;
        this.zzn = new AtomicLong(0L);
        this.zza = new zzu(zzhyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzav() {
        zzt();
        String zza = zzk().zzh.zza();
        if (zza != null) {
            if (ProtectedSandApp.s("\ue0b9").equals(zza)) {
                zza(ProtectedSandApp.s("\ue0a9"), ProtectedSandApp.s("\ue0ba"), (Object) null, zzb().currentTimeMillis());
            } else {
                zza(ProtectedSandApp.s("\ue0a9"), ProtectedSandApp.s("\ue0ba"), Long.valueOf(ProtectedSandApp.s("\ue0bb").equals(zza) ? 1L : 0L), zzb().currentTimeMillis());
            }
        }
        if (!this.zzu.zzac() || !this.zzp) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue0bd"));
            zzo().zzak();
        } else {
            zzj().zzc().zza(ProtectedSandApp.s("\ue0bc"));
            zzan();
            zzp().zza.zza();
            zzl().zzb(new zzkd(this));
        }
    }

    public final Application.ActivityLifecycleCallbacks zzaa() {
        return this.zzb;
    }

    @n1
    public final zzaj zzab() {
        zzt();
        return zzo().zzaa();
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, 15000L, ProtectedSandApp.s("\ue10c"), new zzka(this, atomicReference));
    }

    public final Double zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, 15000L, ProtectedSandApp.s("\ue10d"), new zzkw(this, atomicReference));
    }

    public final Integer zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, 15000L, ProtectedSandApp.s("\ue10e"), new zzkt(this, atomicReference));
    }

    public final Long zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, 15000L, ProtectedSandApp.s("\ue10f"), new zzku(this, atomicReference));
    }

    public final String zzag() {
        return this.zzf.get();
    }

    public final String zzah() {
        zzlk zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zzb;
        }
        return null;
    }

    public final String zzai() {
        zzlk zzaa = this.zzu.zzq().zzaa();
        if (zzaa != null) {
            return zzaa.zza;
        }
        return null;
    }

    public final String zzaj() {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            Context zza = zza();
            String zzx = this.zzu.zzx();
            return new zzhs(zza, zzx).zza(ProtectedSandApp.s("\ue110"));
        } catch (IllegalStateException e4) {
            this.zzu.zzj().zzg().zza(ProtectedSandApp.s("\ue111"), e4);
            return null;
        }
    }

    public final String zzak() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, 15000L, ProtectedSandApp.s("\ue112"), new zzkj(this, atomicReference));
    }

    @TargetApi(30)
    final PriorityQueue<zzno> zzal() {
        if (this.zzk == null) {
            this.zzk = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzjp
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long valueOf;
                    valueOf = Long.valueOf(((zzno) obj).zzb);
                    return valueOf;
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzjs
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                    return compare;
                }
            }));
        }
        return this.zzk;
    }

    @n1
    public final void zzam() {
        zzt();
        zzu();
        if (zze().zza(zzbh.zzdd)) {
            zzls zzo = zzo();
            zzo.zzt();
            zzo.zzu();
            if (zzo.zzap() && zzo.zzq().zzg() < 242600) {
                return;
            }
            zzo().zzac();
        }
    }

    @n1
    public final void zzan() {
        zzt();
        zzu();
        if (this.zzu.zzaf()) {
            Boolean zze = zze().zze(ProtectedSandApp.s("\ue113"));
            if (zze != null && zze.booleanValue()) {
                zzj().zzc().zza(ProtectedSandApp.s("\ue114"));
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzjq.this.zzaq();
                    }
                });
            }
            zzo().zzad();
            this.zzp = false;
            String zzw = zzk().zzw();
            if (TextUtils.isEmpty(zzw)) {
                return;
            }
            zzf().zzac();
            if (zzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\ue115"), zzw);
            zzc(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue116"), bundle);
        }
    }

    public final void zzao() {
        if (!(zza().getApplicationContext() instanceof Application) || this.zzb == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zzb);
    }

    final void zzap() {
        if (zzpn.zza() && zze().zza(zzbh.zzci)) {
            if (zzl().zzg()) {
                zzj().zzg().zza(ProtectedSandApp.s("\ue117"));
                return;
            }
            if (zzab.zza()) {
                zzj().zzg().zza(ProtectedSandApp.s("\ue118"));
                return;
            }
            zzu();
            zzj().zzp().zza(ProtectedSandApp.s("\ue119"));
            final AtomicReference atomicReference = new AtomicReference();
            zzl().zza(atomicReference, C1434k.f30360a, ProtectedSandApp.s("\ue11a"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjr
                @Override // java.lang.Runnable
                public final void run() {
                    zzjq.this.zza(atomicReference);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza(ProtectedSandApp.s("\ue11b"));
            } else {
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzju
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzjq.this.zza(list);
                    }
                });
            }
        }
    }

    @n1
    public final void zzaq() {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue11c"));
            return;
        }
        long zza = zzk().zzp.zza();
        zzk().zzp.zza(1 + zza);
        if (zza >= 5) {
            zzj().zzu().zza(ProtectedSandApp.s("\ue11d"));
            zzk().zzo.zza(true);
        } else {
            if (this.zzq == null) {
                this.zzq = new zzkm(this, this.zzu);
            }
            this.zzq.zza(0L);
        }
    }

    @n1
    public final void zzar() {
        zzt();
        zzj().zzc().zza(ProtectedSandApp.s("\ue11e"));
        zznm zza = zznm.zza(zzk().zzc());
        zzj().zzp().zza(ProtectedSandApp.s("\ue11f"), zza);
        if (zzk().zza(zza)) {
            Bundle zza2 = zza.zza();
            zzj().zzp().zza(ProtectedSandApp.s("\ue120"), zza2);
            if (zza2 != Bundle.EMPTY) {
                zza(zza2, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("\ue121"), zza.zzb());
            zzc(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue122"), bundle);
        }
    }

    @n1
    @TargetApi(30)
    final void zzas() {
        zzno poll;
        androidx.privacysandbox.ads.adservices.java.measurement.a zzo;
        zzt();
        this.zzl = false;
        if (zzal().isEmpty() || this.zzh || (poll = zzal().poll()) == null || (zzo = zzq().zzo()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza(ProtectedSandApp.s("\ue123"), poll.zza);
        ListenableFuture<k2> e4 = zzo.e(Uri.parse(poll.zza));
        if (e4 == null) {
            this.zzh = false;
            zzal().add(poll);
            return;
        }
        if (!zze().zza(zzbh.zzcn)) {
            SparseArray<Long> zzm = zzk().zzm();
            zzm.put(poll.zzc, Long.valueOf(poll.zzb));
            zzk().zza(zzm);
        }
        s0.a(e4, new zzkc(this, poll), new zzjz(this));
    }

    @n1
    public final void zzat() {
        zzt();
        zzj().zzc().zza(ProtectedSandApp.s("\ue124"));
        if (this.zzr == null) {
            this.zzs = new zzkf(this, this.zzu);
            this.zzr = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjy
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    zzjq.this.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzr);
    }

    final boolean zzau() {
        return this.zzl;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzh
    protected final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    public final void zzd(Bundle bundle, long j4) {
        zza(bundle, -20, j4);
    }

    static /* synthetic */ void zzb(zzjq zzjqVar, Bundle bundle) {
        String s4 = ProtectedSandApp.s("\ue0ac");
        zzjqVar.zzt();
        zzjqVar.zzu();
        Preconditions.checkNotNull(bundle);
        String string = bundle.getString(ProtectedSandApp.s("\ue0ad"));
        String string2 = bundle.getString(ProtectedSandApp.s("\ue0be"));
        Preconditions.checkNotEmpty(string);
        Preconditions.checkNotEmpty(string2);
        String s5 = ProtectedSandApp.s("\ue0bf");
        Preconditions.checkNotNull(bundle.get(s5));
        if (!zzjqVar.zzu.zzac()) {
            zzjqVar.zzj().zzp().zza(ProtectedSandApp.s("\ue0c0"));
            return;
        }
        zzon zzonVar = new zzon(string, bundle.getLong(ProtectedSandApp.s("\ue0c1")), bundle.get(s5), string2);
        try {
            zzbf zza = zzjqVar.zzq().zza(bundle.getString(s4), bundle.getString(ProtectedSandApp.s("\ue0c2")), bundle.getBundle(ProtectedSandApp.s("\ue0c3")), string2, 0L, true, true);
            zzjqVar.zzo().zza(new zzae(bundle.getString(s4), string2, zzonVar, bundle.getLong(ProtectedSandApp.s("\ue0ab")), false, bundle.getString(ProtectedSandApp.s("\ue0b2")), zzjqVar.zzq().zza(bundle.getString(s4), bundle.getString(ProtectedSandApp.s("\ue0c4")), bundle.getBundle(ProtectedSandApp.s("\ue0c5")), string2, 0L, true, true), bundle.getLong(ProtectedSandApp.s("\ue0b3")), zza, bundle.getLong(ProtectedSandApp.s("\ue0b4")), zzjqVar.zzq().zza(bundle.getString(s4), bundle.getString(ProtectedSandApp.s("\ue0af")), bundle.getBundle(ProtectedSandApp.s("\ue0b0")), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    @n1
    final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    public static int zza(String str) {
        Preconditions.checkNotEmpty(str);
        return 25;
    }

    final void zzc(String str) {
        this.zzf.set(str);
    }

    public final void zzc(final Bundle bundle, final long j4) {
        zzl().zzc(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
            @Override // java.lang.Runnable
            public final void run() {
                zzjq.this.zza(bundle, j4);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static /* synthetic */ int zza(zzjq zzjqVar, Throwable th) {
        String message = th.getMessage();
        zzjqVar.zzl = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains(ProtectedSandApp.s("\ue0a2")) && !th.getClass().getSimpleName().equals(ProtectedSandApp.s("\ue0a3"))) {
            return (!(th instanceof SecurityException) || message.endsWith(ProtectedSandApp.s("\ue0a4"))) ? 2 : 3;
        }
        if (message.contains(ProtectedSandApp.s("\ue0a5"))) {
            zzjqVar.zzl = true;
        }
        return 1;
    }

    public final void zzc(boolean z4) {
        zzu();
        zzl().zzb(new zzke(this, z4));
    }

    public final void zzc(Bundle bundle) {
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjt
            @Override // java.lang.Runnable
            public final void run() {
                zzjq.this.zza(bundle2);
            }
        });
    }

    public final void zzc(long j4) {
        zzl().zzb(new zzkg(this, j4));
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        if (zzl().zzg()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0c6"));
            return new ArrayList<>(0);
        }
        if (zzab.zza()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0c7"));
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, C1434k.f30360a, ProtectedSandApp.s("\ue0c8"), new zzkq(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0c9"), null);
            return new ArrayList<>();
        }
        return zzos.zzb((List<zzae>) list);
    }

    public final List<zzon> zza(boolean z4) {
        zzu();
        zzj().zzp().zza(ProtectedSandApp.s("\ue0ca"));
        if (zzl().zzg()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0cb"));
            return Collections.emptyList();
        }
        if (zzab.zza()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0cc"));
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, C1434k.f30360a, ProtectedSandApp.s("\ue0cd"), new zzkk(this, atomicReference, z4));
        List<zzon> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzj().zzg().zza(ProtectedSandApp.s("\ue0ce"), Boolean.valueOf(z4));
        return Collections.emptyList();
    }

    static /* synthetic */ void zzb(zzjq zzjqVar, int i4) {
        if (zzjqVar.zzj == null) {
            zzjqVar.zzj = new zzkb(zzjqVar, zzjqVar.zzu);
        }
        zzjqVar.zzj.zza(i4 * 1000);
    }

    final /* synthetic */ void zzb(String str) {
        if (zzg().zzb(str)) {
            zzg().zzag();
        }
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    @n1
    final void zzb(long j4) {
        zza(j4, true);
    }

    private final void zzb(String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        zzl().zzb(new zzki(this, str, str2, j4, zzos.zza(bundle), z4, z5, z6, str3));
    }

    public final void zzb(boolean z4) {
        if (zza().getApplicationContext() instanceof Application) {
            Application application = (Application) zza().getApplicationContext();
            if (this.zzb == null) {
                this.zzb = new zzkz(this);
            }
            if (z4) {
                application.unregisterActivityLifecycleCallbacks(this.zzb);
                application.registerActivityLifecycleCallbacks(this.zzb);
                zzj().zzp().zza(ProtectedSandApp.s("\ue12c"));
            }
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z4) {
        if (zzl().zzg()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0cf"));
            return Collections.emptyMap();
        }
        if (zzab.zza()) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0d0"));
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, C1434k.f30360a, ProtectedSandApp.s("\ue0cd"), new zzkp(this, atomicReference, null, str, str2, z4));
        List<zzon> list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue0d1"), Boolean.valueOf(z4));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzon zzonVar : list) {
            Object zza = zzonVar.zza();
            if (zza != null) {
                aVar.put(zzonVar.zza, zza);
            }
        }
        return aVar;
    }

    public final void zzb(Bundle bundle) {
        zzb(bundle, zzb().currentTimeMillis());
    }

    public final void zzb(Bundle bundle, long j4) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        String s4 = ProtectedSandApp.s("\ue0ac");
        if (!TextUtils.isEmpty(bundle2.getString(s4))) {
            zzj().zzu().zza(ProtectedSandApp.s("\ue125"));
        }
        bundle2.remove(s4);
        Preconditions.checkNotNull(bundle2);
        zzjf.zza(bundle2, s4, String.class, null);
        String s5 = ProtectedSandApp.s("\ue0be");
        zzjf.zza(bundle2, s5, String.class, null);
        String s6 = ProtectedSandApp.s("\ue0ad");
        zzjf.zza(bundle2, s6, String.class, null);
        String s7 = ProtectedSandApp.s("\ue0bf");
        zzjf.zza(bundle2, s7, Object.class, null);
        String s10 = ProtectedSandApp.s("\ue0b2");
        zzjf.zza(bundle2, s10, String.class, null);
        String s11 = ProtectedSandApp.s("\ue0b3");
        zzjf.zza(bundle2, s11, Long.class, 0L);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0c4"), String.class, null);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0c5"), Bundle.class, null);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0c2"), String.class, null);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0c3"), Bundle.class, null);
        String s12 = ProtectedSandApp.s("\ue0b4");
        zzjf.zza(bundle2, s12, Long.class, 0L);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0af"), String.class, null);
        zzjf.zza(bundle2, ProtectedSandApp.s("\ue0b0"), Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(s6));
        Preconditions.checkNotEmpty(bundle2.getString(s5));
        Preconditions.checkNotNull(bundle2.get(s7));
        bundle2.putLong(ProtectedSandApp.s("\ue0ab"), j4);
        String string = bundle2.getString(s6);
        Object obj = bundle2.get(s7);
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue126"), zzi().zzc(string));
            return;
        }
        if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue127"), zzi().zzc(string), obj);
            return;
        }
        Object zzc = zzq().zzc(string, obj);
        if (zzc == null) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue128"), zzi().zzc(string), obj);
            return;
        }
        zzjf.zza(bundle2, zzc);
        long j5 = bundle2.getLong(s11);
        if (!TextUtils.isEmpty(bundle2.getString(s10)) && (j5 > 15552000000L || j5 < 1)) {
            zzj().zzg().zza(ProtectedSandApp.s("\ue129"), zzi().zzc(string), Long.valueOf(j5));
            return;
        }
        long j6 = bundle2.getLong(s12);
        if (j6 <= 15552000000L && j6 >= 1) {
            zzl().zzb(new zzko(this, bundle2));
            return;
        }
        zzj().zzg().zza(ProtectedSandApp.s("\ue12a"), zzi().zzc(string), Long.valueOf(j6));
    }

    static /* synthetic */ void zza(zzjq zzjqVar, Bundle bundle) {
        String s4 = ProtectedSandApp.s("\ue0ab");
        String s5 = ProtectedSandApp.s("\ue0ac");
        zzjqVar.zzt();
        zzjqVar.zzu();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(ProtectedSandApp.s("\ue0ad")));
        if (!zzjqVar.zzu.zzac()) {
            zzjqVar.zzj().zzp().zza(ProtectedSandApp.s("\ue0ae"));
            return;
        }
        try {
            zzjqVar.zzo().zza(new zzae(bundle.getString(s5), "", new zzon(checkNotEmpty, 0L, null, ""), bundle.getLong(s4), bundle.getBoolean(ProtectedSandApp.s("\ue0b1")), bundle.getString(ProtectedSandApp.s("\ue0b2")), null, bundle.getLong(ProtectedSandApp.s("\ue0b3")), null, bundle.getLong(ProtectedSandApp.s("\ue0b4")), zzjqVar.zzq().zza(bundle.getString(s5), bundle.getString(ProtectedSandApp.s("\ue0af")), bundle.getBundle(ProtectedSandApp.s("\ue0b0")), "", bundle.getLong(s4), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    static /* synthetic */ void zza(zzjq zzjqVar, zzje zzjeVar, zzje zzjeVar2) {
        if (com.google.android.gms.internal.measurement.zznm.zza() && zzjqVar.zze().zza(zzbh.zzcx)) {
            return;
        }
        zzje.zza zzaVar = zzje.zza.zzb;
        zzje.zza zzaVar2 = zzje.zza.zza;
        boolean zza = zzjeVar.zza(zzjeVar2, zzaVar, zzaVar2);
        boolean zzb = zzjeVar.zzb(zzjeVar2, zzaVar, zzaVar2);
        if (zza || zzb) {
            zzjqVar.zzg().zzag();
        }
    }

    static /* synthetic */ void zza(zzjq zzjqVar, zzje zzjeVar, long j4, boolean z4, boolean z5) {
        zzjqVar.zzt();
        zzjqVar.zzu();
        zzje zzo = zzjqVar.zzk().zzo();
        if (j4 <= zzjqVar.zzo && zzje.zza(zzo.zza(), zzjeVar.zza())) {
            zzjqVar.zzj().zzo().zza(ProtectedSandApp.s("\ue0b5"), zzjeVar);
            return;
        }
        if (zzjqVar.zzk().zza(zzjeVar)) {
            zzjqVar.zzj().zzp().zza(ProtectedSandApp.s("\ue0b6"), zzjeVar);
            zzjqVar.zzo = j4;
            if (zzjqVar.zzo().zzao()) {
                zzjqVar.zzo().zzb(z4);
            } else {
                zzjqVar.zzo().zza(z4);
            }
            if (z5) {
                zzjqVar.zzo().zza(new AtomicReference<>());
                return;
            }
            return;
        }
        zzjqVar.zzj().zzo().zza(ProtectedSandApp.s("\ue0b7"), Integer.valueOf(zzjeVar.zza()));
    }

    public final void zzb(zzjl zzjlVar) {
        zzu();
        Preconditions.checkNotNull(zzjlVar);
        if (this.zzd.remove(zzjlVar)) {
            return;
        }
        zzj().zzu().zza(ProtectedSandApp.s("\ue12b"));
    }

    public final void zza(String str, String str2, Bundle bundle) {
        long currentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(ProtectedSandApp.s("\ue0ad"), str);
        bundle2.putLong(ProtectedSandApp.s("\ue0ab"), currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(ProtectedSandApp.s("\ue0af"), str2);
            bundle2.putBundle(ProtectedSandApp.s("\ue0b0"), bundle);
        }
        zzl().zzb(new zzkn(this, bundle2));
    }

    public final void zza(com.google.android.gms.internal.measurement.zzdo zzdoVar) throws RemoteException {
        zzl().zzb(new zzks(this, zzdoVar));
    }

    final /* synthetic */ void zza(AtomicReference atomicReference) {
        Bundle zza = zzk().zzi.zza();
        zzls zzo = zzo();
        if (zza == null) {
            zza = new Bundle();
        }
        zzo.zza((AtomicReference<List<zzno>>) atomicReference, zza);
    }

    final /* synthetic */ void zza(List list) {
        boolean contains;
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> zzm = zzk().zzm();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzno zznoVar = (zzno) it.next();
                contains = zzm.contains(zznoVar.zzc);
                if (!contains || zzm.get(zznoVar.zzc).longValue() < zznoVar.zzb) {
                    zzal().add(zznoVar);
                }
            }
            zzas();
        }
    }

    final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) {
        if (ProtectedSandApp.s("\ue0d9").equals(str)) {
            zzj().zzp().zza(ProtectedSandApp.s("\ue0da"));
            ((zzav) Preconditions.checkNotNull(this.zzs)).zza(500L);
        }
    }

    final /* synthetic */ void zza(Bundle bundle, long j4) {
        if (TextUtils.isEmpty(zzg().zzae())) {
            zza(bundle, 0, j4);
        } else {
            zzj().zzv().zza(ProtectedSandApp.s("\ue0df"));
        }
    }

    final /* synthetic */ void zza(Bundle bundle) {
        Bundle zza;
        if (bundle.isEmpty()) {
            zza = bundle;
        } else {
            zza = zzk().zzt.zza();
            if (zze().zza(zzbh.zzdh)) {
                zza = new Bundle(zza);
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    zzq();
                    if (zzos.zza(obj)) {
                        zzq();
                        zzos.zza(this.zzt, 27, (String) null, (String) null, 0);
                    }
                    zzj().zzv().zza(ProtectedSandApp.s("\ue0db"), str, obj);
                } else if (zzos.zzg(str)) {
                    zzj().zzv().zza(ProtectedSandApp.s("\ue0dc"), str);
                } else if (obj == null) {
                    zza.remove(str);
                } else {
                    if (zzq().zza(ProtectedSandApp.s("\ue0dd"), str, zze().zza((String) null, false), obj)) {
                        zzq().zza(zza, str, obj);
                    }
                }
            }
            zzq();
            if (zzos.zza(zza, zze().zzc())) {
                zzq();
                zzos.zza(this.zzt, 26, (String) null, (String) null, 0);
                zzj().zzv().zza(ProtectedSandApp.s("\ue0de"));
            }
        }
        zzk().zzt.zza(zza);
        if (!bundle.isEmpty() || zze().zza(zzbh.zzdf)) {
            zzo().zza(zza);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z4, boolean z5, long j4) {
        String s4 = str == null ? ProtectedSandApp.s("\ue0a9") : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, ProtectedSandApp.s("\ue106"))) {
            zzn().zza(bundle2, j4);
        } else {
            zzb(s4, str2, j4, bundle2, z5, !z5 || this.zzc == null || zzos.zzg(str2), z4, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zza(String str, String str2, Bundle bundle, long j4) {
        zza(str, str2, bundle, true, false, j4);
    }

    @n1
    final void zza(String str, String str2, long j4, Bundle bundle) {
        zzt();
        zza(str, str2, j4, bundle, true, this.zzc == null || zzos.zzg(str2), true, null);
    }

    @n1
    protected final void zza(String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        boolean zza;
        String str4;
        ArrayList arrayList;
        long j5;
        int i4;
        Object obj;
        int length;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzt();
        zzu();
        if (!this.zzu.zzac()) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue0e6"));
            return;
        }
        List<String> zzaf = zzg().zzaf();
        if (zzaf != null && !zzaf.contains(str2)) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue0e7"), str2, str);
            return;
        }
        if (!this.zze) {
            this.zze = true;
            try {
                boolean zzag = this.zzu.zzag();
                String s4 = ProtectedSandApp.s("\ue0e8");
                if (!zzag) {
                    cls = Class.forName(s4, true, zza().getClassLoader());
                } else {
                    cls = Class.forName(s4);
                }
                try {
                    cls.getDeclaredMethod(ProtectedSandApp.s("\ue0e9"), Context.class).invoke(null, zza());
                } catch (Exception e4) {
                    zzj().zzu().zza(ProtectedSandApp.s("\ue0ea"), e4);
                }
            } catch (ClassNotFoundException unused) {
                zzj().zzo().zza(ProtectedSandApp.s("\ue0eb"));
            }
        }
        if (ProtectedSandApp.s("\ue0ec").equals(str2)) {
            String s5 = ProtectedSandApp.s("\ue0ed");
            if (bundle.containsKey(s5)) {
                zza(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue0ef"), bundle.getString(s5), zzb().currentTimeMillis());
            }
        }
        if (z4 && zzos.zzj(str2)) {
            zzq().zza(bundle, zzk().zzt.zza());
        }
        if (!z6 && !ProtectedSandApp.s("\ue0f0").equals(str2)) {
            zzos zzt = this.zzu.zzt();
            String s6 = ProtectedSandApp.s("\ue0f1");
            int i5 = 2;
            if (zzt.zzc(s6, str2)) {
                if (!zzt.zza(s6, zzji.zza, zzji.zzb, str2)) {
                    i5 = 13;
                } else if (zzt.zza(s6, 40, str2)) {
                    i5 = 0;
                }
            }
            if (i5 != 0) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue0f2"), zzi().zza(str2));
                this.zzu.zzt();
                String zza2 = zzos.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzos.zza(this.zzt, i5, ProtectedSandApp.s("\ue0f3"), zza2, length);
                return;
            }
        }
        zzlk zza3 = zzn().zza(false);
        String s7 = ProtectedSandApp.s("\ue0f4");
        if (zza3 != null && !bundle.containsKey(s7)) {
            zza3.zzd = true;
        }
        zzos.zza(zza3, bundle, z4 && !z6);
        boolean equals = ProtectedSandApp.s("\ue0f5").equals(str);
        boolean zzg = zzos.zzg(str2);
        if (z4 && this.zzc != null && !zzg && !equals) {
            zzj().zzc().zza(ProtectedSandApp.s("\ue0f6"), zzi().zza(str2), zzi().zza(bundle));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(str, str2, bundle, j4);
            return;
        }
        if (this.zzu.zzaf()) {
            int zza4 = zzq().zza(str2);
            if (zza4 != 0) {
                zzj().zzm().zza(ProtectedSandApp.s("\ue0f7"), zzi().zza(str2));
                zzq();
                String zza5 = zzos.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzos.zza(this.zzt, str3, zza4, ProtectedSandApp.s("\ue0f3"), zza5, length);
                return;
            }
            String s10 = ProtectedSandApp.s("\ue0f8");
            String s11 = ProtectedSandApp.s("\ue0f9");
            String s12 = ProtectedSandApp.s("\ue0fa");
            List<String> listOf = CollectionUtils.listOf((Object[]) new String[]{s12, s10, s7, s11});
            String str5 = s12;
            Bundle zza6 = zzq().zza(str3, str2, bundle, listOf, z6);
            Preconditions.checkNotNull(zza6);
            zzlk zza7 = zzn().zza(false);
            String s13 = ProtectedSandApp.s("\ue0fb");
            if (zza7 != null && s13.equals(str2)) {
                zznh zznhVar = zzp().zzb;
                long elapsedRealtime = zznhVar.zzb.zzb().elapsedRealtime();
                long j6 = elapsedRealtime - zznhVar.zza;
                zznhVar.zza = elapsedRealtime;
                if (j6 > 0) {
                    zzq().zza(zza6, j6);
                }
            }
            boolean equals2 = ProtectedSandApp.s("\ue0ee").equals(str);
            String s14 = ProtectedSandApp.s("\ue0fc");
            if (!equals2 && ProtectedSandApp.s("\ue0fd").equals(str2)) {
                zzos zzq = zzq();
                String string = zza6.getString(s14);
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, zzq.zzk().zzq.zza())) {
                    zzq.zzj().zzc().zza(ProtectedSandApp.s("\ue0fe"));
                    return;
                }
                zzq.zzk().zzq.zza(string);
            } else if (s13.equals(str2)) {
                String zza8 = zzq().zzk().zzq.zza();
                if (!TextUtils.isEmpty(zza8)) {
                    zza6.putString(s14, zza8);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(zza6);
            if (zze().zza(zzbh.zzco)) {
                zza = zzp().zzaa();
            } else {
                zza = zzk().zzn.zza();
            }
            if (zzk().zzk.zza() > 0 && zzk().zza(j4) && zza) {
                zzj().zzp().zza(ProtectedSandApp.s("\ue0ff"));
                arrayList = arrayList2;
                j5 = 0;
                str4 = s13;
                zza(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue100"), (Object) null, zzb().currentTimeMillis());
                zza(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue101"), (Object) null, zzb().currentTimeMillis());
                zza(ProtectedSandApp.s("\ue0ee"), ProtectedSandApp.s("\ue102"), (Object) null, zzb().currentTimeMillis());
                zzk().zzl.zza(0L);
            } else {
                str4 = s13;
                arrayList = arrayList2;
                j5 = 0;
            }
            if (zza6.getLong(ProtectedSandApp.s("\ue103"), j5) == 1) {
                zzj().zzp().zza(ProtectedSandApp.s("\ue104"));
                i4 = 1;
                this.zzu.zzs().zza.zza(j4, true);
            } else {
                i4 = 1;
            }
            ArrayList arrayList3 = new ArrayList(zza6.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList3.get(i6);
                i6 += i4;
                String str6 = (String) obj2;
                if (str6 != null) {
                    zzq();
                    Bundle[] zzb = zzos.zzb(zza6.get(str6));
                    if (zzb != null) {
                        zza6.putParcelableArray(str6, zzb);
                    }
                }
                i4 = 1;
            }
            int i7 = 0;
            while (i7 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundle2 = (Bundle) arrayList4.get(i7);
                String s15 = i7 != 0 ? ProtectedSandApp.s("\ue105") : str2;
                bundle2.putString(str5, str);
                if (z5) {
                    obj = null;
                    bundle2 = zzq().zza(bundle2, (String) null);
                } else {
                    obj = null;
                }
                Bundle bundle3 = bundle2;
                String str7 = str5;
                zzo().zza(new zzbf(s15, new zzbe(bundle3), str, j4), str3);
                if (!equals) {
                    Iterator<zzjl> it = this.zzd.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle3), j4);
                    }
                }
                i7++;
                arrayList = arrayList4;
                str5 = str7;
            }
            if (zzn().zza(false) == null || !str4.equals(str2)) {
                return;
            }
            zzp().zza(true, true, zzb().elapsedRealtime());
        }
    }

    public final void zza(zzjl zzjlVar) {
        zzu();
        Preconditions.checkNotNull(zzjlVar);
        if (this.zzd.add(zzjlVar)) {
            return;
        }
        zzj().zzu().zza(ProtectedSandApp.s("\ue0e2"));
    }

    public final void zza(long j4) {
        zzc((String) null);
        zzl().zzb(new zzkl(this, j4));
    }

    final void zza(long j4, boolean z4) {
        zzt();
        zzu();
        zzj().zzc().zza(ProtectedSandApp.s("\ue0d2"));
        zznb zzp = zzp();
        zzp.zzt();
        zzp.zzb.zza();
        zzg().zzag();
        boolean zzac = this.zzu.zzac();
        zzha zzk = zzk();
        zzk.zzc.zza(j4);
        if (!TextUtils.isEmpty(zzk.zzk().zzq.zza())) {
            zzk.zzq.zza(null);
        }
        zzk.zzk.zza(0L);
        zzk.zzl.zza(0L);
        if (!zzk.zze().zzx()) {
            zzk.zzb(!zzac);
        }
        zzk.zzr.zza(null);
        zzk.zzs.zza(0L);
        zzk.zzt.zza(null);
        if (z4) {
            zzo().zzai();
        }
        zzp().zza.zza();
        this.zzp = !zzac;
    }

    private final void zza(String str, String str2, long j4, Object obj) {
        zzl().zzb(new zzkh(this, str, str2, obj, j4));
    }

    @m1
    private final void zza(Bundle bundle, int i4, long j4) {
        String s4;
        zzu();
        String zza = zzje.zza(bundle);
        if (zza != null) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue0a6"), zza);
            zzj().zzv().zza(ProtectedSandApp.s("\ue0a7"));
        }
        boolean zzg = zzl().zzg();
        zzje zza2 = zzje.zza(bundle, i4);
        if (zza2.zzi()) {
            zza(zza2, j4, zzg);
        }
        zzax zza3 = zzax.zza(bundle, i4);
        if (zza3.zzg()) {
            zza(zza3, zzg);
        }
        Boolean zza4 = zzax.zza(bundle);
        if (zza4 != null) {
            if (i4 == -30) {
                s4 = ProtectedSandApp.s("\ue0a8");
            } else {
                s4 = ProtectedSandApp.s("\ue0a9");
            }
            String str = s4;
            if (zze().zza(zzbh.zzcs) && zzg) {
                zza(str, ProtectedSandApp.s("\ue0aa"), zza4.toString(), j4);
            } else {
                zza(str, ProtectedSandApp.s("\ue0aa"), (Object) zza4.toString(), false, j4);
            }
        }
    }

    final void zza(zzax zzaxVar, boolean z4) {
        zzky zzkyVar = new zzky(this, zzaxVar);
        if (z4) {
            zzt();
            zzkyVar.run();
        } else {
            zzl().zzb(zzkyVar);
        }
    }

    @n1
    public final void zza(zzjm zzjmVar) {
        zzjm zzjmVar2;
        zzt();
        zzu();
        if (zzjmVar != null && zzjmVar != (zzjmVar2 = this.zzc)) {
            Preconditions.checkState(zzjmVar2 == null, ProtectedSandApp.s("\ue0e3"));
        }
        this.zzc = zzjmVar;
    }

    public final void zza(Boolean bool) {
        zzu();
        zzl().zzb(new zzkv(this, bool));
    }

    @n1
    final void zza(zzje zzjeVar) {
        zzt();
        boolean z4 = (zzjeVar.zzh() && zzjeVar.zzg()) || zzo().zzan();
        if (z4 != this.zzu.zzad()) {
            this.zzu.zzb(z4);
            Boolean zzu = zzk().zzu();
            if (!z4 || zzu == null || zzu.booleanValue()) {
                zza(Boolean.valueOf(z4), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zza(Boolean bool, boolean z4) {
        zzt();
        zzu();
        zzj().zzc().zza(ProtectedSandApp.s("\ue0b8"), bool);
        zzk().zza(bool);
        if (z4) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzav();
        }
    }

    @n1
    public final void zza(Intent intent) {
        if (zzpu.zza() && zze().zza(zzbh.zzby)) {
            Uri data = intent.getData();
            if (data == null) {
                zzj().zzo().zza(ProtectedSandApp.s("\ue0d3"));
                return;
            }
            String queryParameter = data.getQueryParameter(ProtectedSandApp.s("\ue0d4"));
            if (queryParameter != null && queryParameter.equals(ProtectedSandApp.s("\ue0d5"))) {
                String queryParameter2 = data.getQueryParameter(ProtectedSandApp.s("\ue0d6"));
                if (TextUtils.isEmpty(queryParameter2)) {
                    return;
                }
                zzj().zzo().zza(ProtectedSandApp.s("\ue0d7"), queryParameter2);
                zze().zzh(queryParameter2);
                return;
            }
            zzj().zzo().zza(ProtectedSandApp.s("\ue0d8"));
            zze().zzh(null);
        }
    }

    public final void zza(zzje zzjeVar, long j4, boolean z4) {
        zzje zzjeVar2;
        boolean z5;
        boolean z6;
        boolean z7;
        zzje zzjeVar3 = zzjeVar;
        zzu();
        int zza = zzjeVar.zza();
        if (zza != -10) {
            zzjh zzc = zzjeVar.zzc();
            zzjh zzjhVar = zzjh.zza;
            if (zzc == zzjhVar && zzjeVar.zzd() == zzjhVar) {
                zzj().zzv().zza(ProtectedSandApp.s("\ue0e0"));
                return;
            }
        }
        synchronized (this.zzg) {
            try {
                zzjeVar2 = this.zzm;
                z5 = false;
                if (zzje.zza(zza, zzjeVar2.zza())) {
                    z6 = zzjeVar.zzc(this.zzm);
                    if (zzjeVar.zzh() && !this.zzm.zzh()) {
                        z5 = true;
                    }
                    zzjeVar3 = zzjeVar.zzb(this.zzm);
                    this.zzm = zzjeVar3;
                    z7 = z5;
                    z5 = true;
                } else {
                    z6 = false;
                    z7 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z5) {
            zzj().zzo().zza(ProtectedSandApp.s("\ue0e1"), zzjeVar3);
            return;
        }
        long andIncrement = this.zzn.getAndIncrement();
        if (z6) {
            zzc((String) null);
            zzkx zzkxVar = new zzkx(this, zzjeVar3, j4, andIncrement, z7, zzjeVar2);
            if (z4) {
                zzt();
                zzkxVar.run();
                return;
            } else {
                zzl().zzc(zzkxVar);
                return;
            }
        }
        zzla zzlaVar = new zzla(this, zzjeVar3, andIncrement, z7, zzjeVar2);
        if (z4) {
            zzt();
            zzlaVar.run();
        } else if (zza != 30 && zza != -10) {
            zzl().zzb(zzlaVar);
        } else {
            zzl().zzc(zzlaVar);
        }
    }

    public final void zza(final String str, long j4) {
        if (str != null && TextUtils.isEmpty(str)) {
            this.zzu.zzj().zzu().zza(ProtectedSandApp.s("\ue0e4"));
        } else {
            zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzjq.this.zzb(str);
                }
            });
            zza((String) null, ProtectedSandApp.s("\ue0e5"), (Object) str, true, j4);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z4) {
        zza(str, str2, obj, z4, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z4, long j4) {
        int i4;
        int length;
        if (str == null) {
            str = ProtectedSandApp.s("\ue0a9");
        }
        String str3 = str;
        if (z4) {
            i4 = zzq().zzb(str2);
        } else {
            zzos zzq = zzq();
            String s4 = ProtectedSandApp.s("\ue10b");
            if (zzq.zzc(s4, str2)) {
                if (!zzq.zza(s4, zzjj.zza, str2)) {
                    i4 = 15;
                } else if (zzq.zza(s4, 24, str2)) {
                    i4 = 0;
                }
            }
            i4 = 6;
        }
        String s5 = ProtectedSandApp.s("\ue0f3");
        if (i4 != 0) {
            zzq();
            String zza = zzos.zza(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zzos.zza(this.zzt, i4, s5, zza, length);
            return;
        }
        if (obj != null) {
            int zza2 = zzq().zza(str2, obj);
            if (zza2 != 0) {
                zzq();
                String zza3 = zzos.zza(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
                this.zzu.zzt();
                zzos.zza(this.zzt, zza2, s5, zza3, length);
                return;
            }
            Object zzc = zzq().zzc(str2, obj);
            if (zzc != null) {
                zza(str3, str2, j4, zzc);
                return;
            }
            return;
        }
        zza(str3, str2, j4, (Object) null);
    }

    @n1
    final void zza(String str, String str2, Object obj, long j4) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzt();
        zzu();
        if (ProtectedSandApp.s("\ue0aa").equals(str2)) {
            boolean z4 = obj instanceof String;
            String s4 = ProtectedSandApp.s("\ue0ba");
            if (z4) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String lowerCase = str3.toLowerCase(Locale.ENGLISH);
                    String s5 = ProtectedSandApp.s("\ue107");
                    Long valueOf = Long.valueOf(s5.equals(lowerCase) ? 1L : 0L);
                    zzhd zzhdVar = zzk().zzh;
                    if (valueOf.longValue() == 1) {
                        s5 = ProtectedSandApp.s("\ue0bb");
                    }
                    zzhdVar.zza(s5);
                    obj = valueOf;
                    str2 = s4;
                    zzj().zzp().zza(ProtectedSandApp.s("\ue108"), ProtectedSandApp.s("\ue109"), obj);
                }
            }
            if (obj == null) {
                zzk().zzh.zza(ProtectedSandApp.s("\ue0b9"));
                str2 = s4;
            }
            zzj().zzp().zza(ProtectedSandApp.s("\ue108"), ProtectedSandApp.s("\ue109"), obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        if (!this.zzu.zzac()) {
            zzj().zzp().zza(ProtectedSandApp.s("\ue10a"));
        } else if (this.zzu.zzaf()) {
            zzo().zza(new zzon(str4, j4, obj2, str));
        }
    }
}

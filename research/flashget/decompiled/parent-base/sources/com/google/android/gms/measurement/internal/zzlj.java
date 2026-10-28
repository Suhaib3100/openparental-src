package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.b0;
import androidx.annotation.e1;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzlj extends zzh {

    @m1
    protected zzlk zza;
    private volatile zzlk zzb;
    private volatile zzlk zzc;
    private final Map<Integer, zzlk> zzd;

    @b0("activityLock")
    private Activity zze;

    @b0("activityLock")
    private volatile boolean zzf;
    private volatile zzlk zzg;
    private zzlk zzh;

    @b0("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zzlj(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    public final zzlk zzaa() {
        return this.zzb;
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

    @l0
    private final zzlk zzd(@o0 Activity activity) {
        Preconditions.checkNotNull(activity);
        zzlk zzlkVar = this.zzd.get(Integer.valueOf(activity.hashCode()));
        if (zzlkVar == null) {
            zzlk zzlkVar2 = new zzlk(null, zza(activity.getClass(), ProtectedSandApp.s("\ue16e")), zzq().zzn());
            this.zzd.put(Integer.valueOf(activity.hashCode()), zzlkVar2);
            zzlkVar = zzlkVar2;
        }
        return this.zzg != null ? this.zzg : zzlkVar;
    }

    @l0
    public final void zzb(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzw()) {
            this.zzb = null;
            zzl().zzb(new zzln(this, elapsedRealtime));
        } else {
            zzlk zzd = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzl().zzb(new zzlq(this, zzd, elapsedRealtime));
        }
    }

    @l0
    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzw()) {
                    this.zzg = null;
                    zzl().zzb(new zzlp(this));
                }
            }
        }
        if (!zze().zzw()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzlo(this));
        } else {
            zza(activity, zzd(activity), false);
            zzb zzc = zzc();
            zzc.zzl().zzb(new zzc(zzc, zzc.zzb().elapsedRealtime()));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @n1
    public final zzlk zza(boolean z4) {
        zzu();
        zzt();
        if (!z4) {
            return this.zza;
        }
        zzlk zzlkVar = this.zza;
        return zzlkVar != null ? zzlkVar : this.zzh;
    }

    @m1
    private final String zza(Class<?> cls, String str) {
        String str2;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split(ProtectedSandApp.s("\ue16d"));
        if (split.length > 0) {
            str2 = split[split.length - 1];
        } else {
            str2 = "";
        }
        return str2.length() > zze().zza((String) null, false) ? str2.substring(0, zze().zza((String) null, false)) : str2;
    }

    static /* synthetic */ void zza(zzlj zzljVar, Bundle bundle, zzlk zzlkVar, zzlk zzlkVar2, long j4) {
        if (bundle != null) {
            bundle.remove(ProtectedSandApp.s("\ue16f"));
            bundle.remove(ProtectedSandApp.s("\ue170"));
        }
        zzljVar.zza(zzlkVar, zzlkVar2, j4, true, zzljVar.zzq().zza((String) null, ProtectedSandApp.s("\ue171"), bundle, (List<String>) null, false));
    }

    @l0
    public final void zzb(Activity activity, Bundle bundle) {
        zzlk zzlkVar;
        if (!zze().zzw() || bundle == null || (zzlkVar = this.zzd.get(Integer.valueOf(activity.hashCode()))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(ProtectedSandApp.s("\ue17c"), zzlkVar.zzc);
        bundle2.putString(ProtectedSandApp.s("\ue17a"), zzlkVar.zza);
        bundle2.putString(ProtectedSandApp.s("\ue17b"), zzlkVar.zzb);
        bundle.putBundle(ProtectedSandApp.s("\ue179"), bundle2);
    }

    @l0
    private final void zza(Activity activity, zzlk zzlkVar, boolean z4) {
        zzlk zzlkVar2;
        zzlk zzlkVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzlkVar.zzb == null) {
            zzlkVar2 = new zzlk(zzlkVar.zza, activity != null ? zza(activity.getClass(), ProtectedSandApp.s("\ue16e")) : null, zzlkVar.zzc, zzlkVar.zze, zzlkVar.zzf);
        } else {
            zzlkVar2 = zzlkVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzlkVar2;
        zzl().zzb(new zzll(this, zzlkVar2, zzlkVar3, zzb().elapsedRealtime(), z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zza(zzlk zzlkVar, zzlk zzlkVar2, long j4, boolean z4, Bundle bundle) {
        String s4;
        long j5;
        zzt();
        boolean z5 = false;
        boolean z6 = (zzlkVar2 != null && zzlkVar2.zzc == zzlkVar.zzc && Objects.equals(zzlkVar2.zzb, zzlkVar.zzb) && Objects.equals(zzlkVar2.zza, zzlkVar.zza)) ? false : true;
        if (z4 && this.zza != null) {
            z5 = true;
        }
        if (z6) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzos.zza(zzlkVar, bundle2, true);
            if (zzlkVar2 != null) {
                String str = zzlkVar2.zza;
                if (str != null) {
                    bundle2.putString(ProtectedSandApp.s("\ue172"), str);
                }
                String str2 = zzlkVar2.zzb;
                if (str2 != null) {
                    bundle2.putString(ProtectedSandApp.s("\ue173"), str2);
                }
                bundle2.putLong(ProtectedSandApp.s("\ue174"), zzlkVar2.zzc);
            }
            if (z5) {
                long zza = zzp().zzb.zza(j4);
                if (zza > 0) {
                    zzq().zza(bundle2, zza);
                }
            }
            if (!zze().zzw()) {
                bundle2.putLong(ProtectedSandApp.s("\ue175"), 1L);
            }
            if (zzlkVar.zze) {
                s4 = ProtectedSandApp.s("\ue176");
            } else {
                s4 = ProtectedSandApp.s("\ue177");
            }
            String str3 = s4;
            long currentTimeMillis = zzb().currentTimeMillis();
            if (zzlkVar.zze) {
                long j6 = zzlkVar.zzf;
                if (j6 != 0) {
                    j5 = j6;
                    zzm().zza(str3, ProtectedSandApp.s("\ue178"), j5, bundle2);
                }
            }
            j5 = currentTimeMillis;
            zzm().zza(str3, ProtectedSandApp.s("\ue178"), j5, bundle2);
        }
        if (z5) {
            zza(this.zza, true, j4);
        }
        this.zza = zzlkVar;
        if (zzlkVar.zze) {
            this.zzh = zzlkVar;
        }
        zzo().zza(zzlkVar);
    }

    @l0
    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzw() || bundle == null || (bundle2 = bundle.getBundle(ProtectedSandApp.s("\ue179"))) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(activity.hashCode()), new zzlk(bundle2.getString(ProtectedSandApp.s("\ue17a")), bundle2.getString(ProtectedSandApp.s("\ue17b")), bundle2.getLong(ProtectedSandApp.s("\ue17c"))));
    }

    @l0
    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zze().zzw()) {
            this.zzd.remove(Integer.valueOf(activity.hashCode()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zza(zzlk zzlkVar, boolean z4, long j4) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzlkVar != null && zzlkVar.zzd, z4, j4) || zzlkVar == null) {
            return;
        }
        zzlkVar.zzd = false;
    }

    @Deprecated
    public final void zza(@o0 Activity activity, @e1(max = 36, min = 1) String str, @e1(max = 36, min = 1) String str2) {
        if (!zze().zzw()) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue17d"));
            return;
        }
        zzlk zzlkVar = this.zzb;
        if (zzlkVar == null) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue17e"));
            return;
        }
        if (this.zzd.get(Integer.valueOf(activity.hashCode())) == null) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue17f"));
            return;
        }
        if (str2 == null) {
            str2 = zza(activity.getClass(), ProtectedSandApp.s("\ue16e"));
        }
        boolean equals = Objects.equals(zzlkVar.zzb, str2);
        boolean equals2 = Objects.equals(zzlkVar.zza, str);
        if (equals && equals2) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue180"));
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue181"), Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza(ProtectedSandApp.s("\ue182"), Integer.valueOf(str2.length()));
            return;
        }
        zzj().zzp().zza(ProtectedSandApp.s("\ue184"), str == null ? ProtectedSandApp.s("\ue183") : str, str2);
        zzlk zzlkVar2 = new zzlk(str, str2, zzq().zzn());
        this.zzd.put(Integer.valueOf(activity.hashCode()), zzlkVar2);
        zza(activity, zzlkVar2, true);
    }

    public final void zza(Bundle bundle, long j4) {
        String str;
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    zzj().zzv().zza(ProtectedSandApp.s("\ue185"));
                    return;
                }
                String str2 = null;
                if (bundle != null) {
                    String string = bundle.getString(ProtectedSandApp.s("\ue16f"));
                    if (string != null && (string.length() <= 0 || string.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza(ProtectedSandApp.s("\ue186"), Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString(ProtectedSandApp.s("\ue170"));
                    if (string2 != null && (string2.length() <= 0 || string2.length() > zze().zza((String) null, false))) {
                        zzj().zzv().zza(ProtectedSandApp.s("\ue187"), Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str = string;
                        str2 = string2;
                    }
                } else {
                    str = null;
                }
                if (str2 == null) {
                    Activity activity = this.zze;
                    if (activity != null) {
                        str2 = zza(activity.getClass(), ProtectedSandApp.s("\ue16e"));
                    } else {
                        str2 = ProtectedSandApp.s("\ue16e");
                    }
                }
                String str3 = str2;
                zzlk zzlkVar = this.zzb;
                if (this.zzf && zzlkVar != null) {
                    this.zzf = false;
                    boolean equals = Objects.equals(zzlkVar.zzb, str3);
                    boolean equals2 = Objects.equals(zzlkVar.zza, str);
                    if (equals && equals2) {
                        zzj().zzv().zza(ProtectedSandApp.s("\ue188"));
                        return;
                    }
                }
                zzj().zzp().zza(ProtectedSandApp.s("\ue189"), str == null ? ProtectedSandApp.s("\ue183") : str, str3 == null ? ProtectedSandApp.s("\ue183") : str3);
                zzlk zzlkVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlk zzlkVar3 = new zzlk(str, str3, zzq().zzn(), true, j4);
                this.zzb = zzlkVar3;
                this.zzc = zzlkVar2;
                this.zzg = zzlkVar3;
                zzl().zzb(new zzlm(this, bundle, zzlkVar3, zzlkVar2, zzb().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

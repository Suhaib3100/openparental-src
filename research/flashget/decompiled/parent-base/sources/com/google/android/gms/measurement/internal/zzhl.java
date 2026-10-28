package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.collection.g1;
import com.coremedia.iso.boxes.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzje;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhl extends zznr implements zzai {

    @m1
    final g1<String, com.google.android.gms.internal.measurement.zzb> zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;

    @m1
    private final Map<String, Set<String>> zzd;

    @m1
    private final Map<String, Map<String, Boolean>> zze;

    @m1
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzfr.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    zzhl(zznv zznvVar) {
        super(zznvVar);
        this.zzc = new androidx.collection.a();
        this.zzd = new androidx.collection.a();
        this.zze = new androidx.collection.a();
        this.zzf = new androidx.collection.a();
        this.zzh = new androidx.collection.a();
        this.zzj = new androidx.collection.a();
        this.zzk = new androidx.collection.a();
        this.zzl = new androidx.collection.a();
        this.zzi = new androidx.collection.a();
        this.zza = new zzho(this, 20);
        this.zzb = new zzhr(this);
    }

    @n1
    private final void zzu(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzf = zzh().zzf(str);
            if (zzf != null) {
                zzfr.zzd.zza zzcd = zza(str, zzf.zza).zzcd();
                zza(str, zzcd);
                this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())));
                this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
                this.zzj.put(str, zzcd.zzc());
                this.zzk.put(str, zzf.zzb);
                this.zzl.put(str, zzf.zzc);
                return;
            }
            this.zzc.put(str, null);
            this.zze.put(str, null);
            this.zzd.put(str, null);
            this.zzf.put(str, null);
            this.zzh.put(str, null);
            this.zzj.put(str, null);
            this.zzk.put(str, null);
            this.zzl.put(str, null);
            this.zzi.put(str, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    @n1
    final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzu(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
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

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
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

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    @n1
    final boolean zzp(String str) {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains(ProtectedSandApp.s("\udf11")) || this.zzd.get(str).contains(ProtectedSandApp.s("\udf12"));
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    @bg.b
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @n1
    final long zza(String str) {
        String zza = zza(str, ProtectedSandApp.s("\udf00"));
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e4) {
            zzj().zzu().zza(ProtectedSandApp.s("\udf01"), zzgo.zza(str), e4);
            return 0L;
        }
    }

    @n1
    protected final zzfr.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzu(str);
        return this.zzh.get(str);
    }

    @n1
    protected final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    @n1
    protected final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    @n1
    final String zzf(String str) {
        zzt();
        zzu(str);
        return this.zzj.get(str);
    }

    @n1
    final Set<String> zzg(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str);
    }

    @n1
    final SortedSet<String> zzh(String str) {
        zzt();
        zzu(str);
        TreeSet treeSet = new TreeSet();
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        Iterator<zzfr.zza.zzf> it = zzb.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    @n1
    protected final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    @n1
    final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    public final boolean zzk(String str) {
        zzfr.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    final boolean zzl(String str) {
        return ProtectedSandApp.s("\udf0e").equals(zza(str, ProtectedSandApp.s("\udf0d")));
    }

    @n1
    final boolean zzm(String str) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        return zzb == null || !zzb.zzh() || zzb.zzg();
    }

    final boolean zzn(String str) {
        return ProtectedSandApp.s("\udf0e").equals(zza(str, ProtectedSandApp.s("\udf0f")));
    }

    @n1
    final boolean zzo(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(ProtectedSandApp.s("\udf10"));
    }

    @n1
    final boolean zzq(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(ProtectedSandApp.s("\udf13"));
    }

    @n1
    final boolean zzr(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(ProtectedSandApp.s("\udf14"));
    }

    @n1
    final boolean zzs(String str) {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains(ProtectedSandApp.s("\udf15")) || this.zzd.get(str).contains(ProtectedSandApp.s("\udf12"));
        }
        return false;
    }

    @n1
    final boolean zzt(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains(ProtectedSandApp.s("\udf16"));
    }

    @n1
    final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzu(str);
        if (zzl(str) && zzos.zzg(str2)) {
            return true;
        }
        if (zzn(str) && zzos.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @n1
    final zzje.zza zzb(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfr.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    @n1
    final boolean zzc(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfr.zza.C0792zza> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfr.zza.C0792zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfr.zza.zzd.zzb) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzhl zzhlVar, String str) {
        zzhlVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzhlVar.zzk(str)) {
            return null;
        }
        if (zzhlVar.zzh.containsKey(str) && zzhlVar.zzh.get(str) != null) {
            zzhlVar.zza(str, zzhlVar.zzh.get(str));
        } else {
            zzhlVar.zzu(str);
        }
        return zzhlVar.zza.snapshot().get(str);
    }

    @n1
    final zzfr.zza zzb(String str) {
        zzt();
        zzu(str);
        zzfr.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzo()) {
            return null;
        }
        return zzc.zzd();
    }

    @n1
    final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzu(str);
        if (ProtectedSandApp.s("\udf0a").equals(str2) || ProtectedSandApp.s("\udf0b").equals(str2) || ProtectedSandApp.s("\udf0c").equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @n1
    final zzjh zza(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return zzjh.zza;
        }
        for (zzfr.zza.C0792zza c0792zza : zzb.zzf()) {
            if (zza(c0792zza.zzc()) == zzaVar) {
                int i4 = zzht.zzc[c0792zza.zzb().ordinal()];
                if (i4 == 1) {
                    return zzjh.zzc;
                }
                if (i4 != 2) {
                    return zzjh.zza;
                }
                return zzjh.zzd;
            }
        }
        return zzjh.zza;
    }

    private static zzje.zza zza(zzfr.zza.zze zzeVar) {
        int i4 = zzht.zzb[zzeVar.ordinal()];
        if (i4 == 1) {
            return zzje.zza.zza;
        }
        if (i4 == 2) {
            return zzje.zza.zzb;
        }
        if (i4 == 3) {
            return zzje.zza.zzc;
        }
        if (i4 != 4) {
            return null;
        }
        return zzje.zza.zzd;
    }

    @n1
    private final zzfr.zzd zza(String str, byte[] bArr) {
        String s4 = ProtectedSandApp.s("\udef5");
        if (bArr == null) {
            return zzfr.zzd.zzg();
        }
        try {
            zzfr.zzd zzdVar = (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) ((zzfr.zzd.zza) zzoo.zza(zzfr.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza(ProtectedSandApp.s("\udef6"), zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzkb e4) {
            zzj().zzu().zza(s4, zzgo.zza(str), e4);
            return zzfr.zzd.zzg();
        } catch (RuntimeException e5) {
            zzj().zzu().zza(s4, zzgo.zza(str), e5);
            return zzfr.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    @n1
    public final String zza(String str, String str2) {
        zzt();
        zzu(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfr.zzd zzdVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzdVar != null) {
            for (zzfr.zzh zzhVar : zzdVar.zzn()) {
                aVar.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return aVar;
    }

    private final void zza(String str, zzfr.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        if (zzaVar != null) {
            Iterator<zzfr.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i4 = 0; i4 < zzaVar.zza(); i4++) {
                zzfr.zzc.zza zzcd = zzaVar.zza(i4).zzcd();
                if (zzcd.zzb().isEmpty()) {
                    zzj().zzu().zza(ProtectedSandApp.s("\udef7"));
                } else {
                    String zzb = zzcd.zzb();
                    String zzb2 = zzji.zzb(zzcd.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzcd = zzcd.zza(zzb2);
                        zzaVar.zza(i4, zzcd);
                    }
                    if (zzcd.zze() && zzcd.zzc()) {
                        aVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzcd.zzf() && zzcd.zzd()) {
                        aVar2.put(zzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzcd.zzg()) {
                        if (zzcd.zza() >= 2 && zzcd.zza() <= 65535) {
                            aVar3.put(zzcd.zzb(), Integer.valueOf(zzcd.zza()));
                        } else {
                            zzj().zzu().zza(ProtectedSandApp.s("\udef8"), zzcd.zzb(), Integer.valueOf(zzcd.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, aVar);
        this.zzf.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    @n1
    private final void zza(final String str, zzfr.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza(ProtectedSandApp.s("\udef9"), Integer.valueOf(zzdVar.zza()));
        zzgd.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza(ProtectedSandApp.s("\udefa"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm(ProtectedSandApp.s("\udf18"), new zzhq(zzhl.this, str));
                }
            });
            zzbVar.zza(ProtectedSandApp.s("\udefb"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzhm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzhl zzhlVar = zzhl.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx(ProtectedSandApp.s("\udf17"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzhk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzhl zzhlVar2 = zzhl.this;
                            String str3 = str2;
                            zzg zze = zzhlVar2.zzh().zze(str3);
                            HashMap a5 = d.a(ProtectedSandApp.s("\udeee"), ProtectedSandApp.s("\udeef"), ProtectedSandApp.s("\udef0"), str3);
                            a5.put(ProtectedSandApp.s("\udef1"), 106000L);
                            if (zze != null) {
                                String zzaf = zze.zzaf();
                                if (zzaf != null) {
                                    a5.put(ProtectedSandApp.s("\udef2"), zzaf);
                                }
                                a5.put(ProtectedSandApp.s("\udef3"), Long.valueOf(zze.zze()));
                                a5.put(ProtectedSandApp.s("\udef4"), Long.valueOf(zze.zzo()));
                            }
                            return a5;
                        }
                    });
                }
            });
            zzbVar.zza(ProtectedSandApp.s("\udefc"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzhl.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza(ProtectedSandApp.s("\udefd"), str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgd.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza(ProtectedSandApp.s("\udefe"), it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza(ProtectedSandApp.s("\udeff"), str);
        }
    }

    @n1
    protected final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfr.zzd.zza zzcd = zza(str, bArr).zzcd();
        if (zzcd == null) {
            return false;
        }
        zza(str, zzcd);
        zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        this.zzj.put(str, zzcd.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())));
        zzh().zza(str, new ArrayList(zzcd.zzd()));
        try {
            zzcd.zzb();
            bArr = ((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())).zzca();
        } catch (RuntimeException e4) {
            zzj().zzu().zza(ProtectedSandApp.s("\udf02"), zzgo.zza(str), e4);
        }
        zzal zzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzt();
        zzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("\udf03"), bArr);
        contentValues.put(ProtectedSandApp.s("\udf04"), str2);
        contentValues.put(ProtectedSandApp.s("\udf05"), str3);
        try {
            if (zzh.e_().update(ProtectedSandApp.s("\udf06"), contentValues, ProtectedSandApp.s("\udf07"), new String[]{str}) == 0) {
                zzh.zzj().zzg().zza(ProtectedSandApp.s("\udf08"), zzgo.zza(str));
            }
        } catch (SQLiteException e5) {
            zzh.zzj().zzg().zza(ProtectedSandApp.s("\udf09"), zzgo.zza(str), e5);
        }
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        return true;
    }
}

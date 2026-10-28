package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.C0532i;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.n1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzik extends zzf {

    @m1
    protected zzij zza;
    final zzs zzb;

    @m1
    protected boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;

    @b0("consentLock")
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    protected zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzaa(Boolean bool, boolean z5) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb(ProtectedSandApp.s("ヰ"), bool);
        this.zzt.zzm().zzh(bool);
        if (z5) {
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            String s5 = ProtectedSandApp.s("ヱ");
            if (bool != null) {
                edit.putBoolean(s5, bool.booleanValue());
            } else {
                edit.remove(s5);
            }
            edit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n1
    public final void zzab() {
        zzg();
        String zza = this.zzt.zzm().zzh.zza();
        if (zza != null) {
            if (ProtectedSandApp.s("ヲ").equals(zza)) {
                zzY(ProtectedSandApp.s("ン"), ProtectedSandApp.s("ヴ"), null, this.zzt.zzax().currentTimeMillis());
            } else {
                zzY(ProtectedSandApp.s("ヶ"), ProtectedSandApp.s("ヷ"), Long.valueOf(true != ProtectedSandApp.s("ヵ").equals(zza) ? 0L : 1L), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ヹ"));
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ヸ"));
        zzz();
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaB().zzp(new zzhn(this));
    }

    static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z5;
        zzha[] zzhaVarArr = {zzha.zzb, zzha.zza};
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                z5 = false;
                break;
            }
            zzha zzhaVar = zzhaVarArr[i5];
            if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                z5 = true;
                break;
            }
            i5++;
        }
        boolean zzn = zzhbVar.zzn(zzhbVar2, zzha.zzb, zzha.zza);
        if (z5 || zzn) {
            zzikVar.zzt.zzh().zzo();
        }
    }

    static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j5, boolean z5, boolean z6) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzc = zzikVar.zzt.zzm().zzc();
        if (j5 <= zzikVar.zzk && zzhb.zzk(zzc.zza(), zzhbVar.zza())) {
            zzikVar.zzt.zzaA().zzi().zzb(ProtectedSandApp.s("ヺ"), zzhbVar);
            return;
        }
        zzfi zzm = zzikVar.zzt.zzm();
        zzgd zzgdVar = zzm.zzt;
        zzm.zzg();
        int zza = zzhbVar.zza();
        if (!zzm.zzl(zza)) {
            zzikVar.zzt.zzaA().zzi().zzb(ProtectedSandApp.s("ヽ"), Integer.valueOf(zzhbVar.zza()));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString(ProtectedSandApp.s("・"), zzhbVar.zzi());
        edit.putInt(ProtectedSandApp.s("ー"), zza);
        edit.apply();
        zzikVar.zzk = j5;
        zzikVar.zzt.zzt().zzF(z5);
        if (z6) {
            zzikVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(ProtectedSandApp.s("ヾ"), str);
        bundle2.putLong(ProtectedSandApp.s("ヿ"), currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(ProtectedSandApp.s("\u3100"), str2);
            bundle2.putBundle(ProtectedSandApp.s("\u3101"), bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc(ProtectedSandApp.s("\u3102"), str, obj);
            } else if (zzlp.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb(ProtectedSandApp.s("\u3103"), str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzlp zzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzv.zzab(ProtectedSandApp.s("\u3104"), str, 100, obj)) {
                    this.zzt.zzv().zzP(zza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int zzc = this.zzt.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i5 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i5++;
                if (i5 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza(ProtectedSandApp.s("ㄅ"));
        }
        this.zzt.zzm().zzs.zzb(zza);
        this.zzt.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j5) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        String s5 = ProtectedSandApp.s("ㄆ");
        if (str2 == s5 || (str2 != null && str2.equals(s5))) {
            this.zzt.zzs().zzx(bundle2, j5);
            return;
        }
        boolean z7 = true;
        if (z6 && this.zzd != null && !zzlp.zzaj(str2)) {
            z7 = false;
        }
        zzM(str == null ? ProtectedSandApp.s("ㄇ") : str, str2, j5, bundle2, z6, z7, z5, null);
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM(ProtectedSandApp.s("ㄈ"), str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @n1
    final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    @n1
    final void zzH(String str, String str2, long j5, Bundle bundle) {
        zzg();
        zzI(str, str2, j5, bundle, true, this.zzd == null || zzlp.zzaj(str2), true, null);
    }

    @n1
    protected final void zzI(String str, String str2, long j5, Bundle bundle, boolean z5, boolean z6, boolean z7, String str3) {
        boolean z8;
        long j6;
        Bundle[] bundleArr;
        String str4 = str;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ㄭ"));
            return;
        }
        List zzn = this.zzt.zzh().zzn();
        if (zzn != null && !zzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc(ProtectedSandApp.s("ㄉ"), str2, str4);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                boolean zzN = this.zzt.zzN();
                String s5 = ProtectedSandApp.s("ㄊ");
                try {
                    (!zzN ? Class.forName(s5, true, this.zzt.zzaw().getClassLoader()) : Class.forName(s5)).getDeclaredMethod(ProtectedSandApp.s("ㄋ"), Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e6) {
                    this.zzt.zzaA().zzk().zzb(ProtectedSandApp.s("ㄌ"), e6);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzaA().zzi().zza(ProtectedSandApp.s("ㄍ"));
            }
        }
        if (ProtectedSandApp.s("ㄎ").equals(str2)) {
            String s6 = ProtectedSandApp.s("ㄏ");
            if (bundle.containsKey(s6)) {
                this.zzt.zzay();
                zzY(ProtectedSandApp.s("ㄐ"), ProtectedSandApp.s("ㄑ"), bundle.getString(s6), this.zzt.zzax().currentTimeMillis());
            }
        }
        this.zzt.zzay();
        if (z5 && zzlp.zzan(str2)) {
            this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
        }
        if (!z7) {
            this.zzt.zzay();
            if (!ProtectedSandApp.s("ㄒ").equals(str2)) {
                zzlp zzv = this.zzt.zzv();
                String s7 = ProtectedSandApp.s("ㄓ");
                int i5 = 2;
                if (zzv.zzad(s7, str2)) {
                    if (zzv.zzaa(s7, zzhc.zza, zzhc.zzb, str2)) {
                        zzv.zzt.zzf();
                        if (zzv.zzZ(s7, 40, str2)) {
                            i5 = 0;
                        }
                    } else {
                        i5 = 13;
                    }
                }
                if (i5 != 0) {
                    this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("ㄔ"), this.zzt.zzj().zzd(str2));
                    zzlp zzv2 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzO(this.zzl, null, i5, ProtectedSandApp.s("ㄕ"), zzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.zzt.zzay();
        zzir zzj = this.zzt.zzs().zzj(false);
        String s8 = ProtectedSandApp.s("ㄖ");
        if (zzj != null && !bundle.containsKey(s8)) {
            zzj.zzd = true;
        }
        zzlp.zzK(zzj, bundle, z5 && !z7);
        boolean equals = ProtectedSandApp.s("ㄗ").equals(str4);
        boolean zzaj = zzlp.zzaj(str2);
        if (!z5 || this.zzd == null || zzaj) {
            z8 = equals;
        } else {
            if (!equals) {
                this.zzt.zzaA().zzc().zzc(ProtectedSandApp.s("ㄘ"), this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j5);
                return;
            }
            z8 = true;
        }
        if (this.zzt.zzM()) {
            int zzh = this.zzt.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzt.zzaA().zze().zzb(ProtectedSandApp.s("ㄙ"), this.zzt.zzj().zzd(str2));
                zzlp zzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzO(this.zzl, str3, zzh, ProtectedSandApp.s("ㄚ"), zzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String s9 = ProtectedSandApp.s("ㄛ");
            String s10 = ProtectedSandApp.s("ㄜ");
            String s11 = ProtectedSandApp.s("ㄝ");
            Bundle zzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{s11, s9, s8, s10}), z7);
            Preconditions.checkNotNull(zzu);
            this.zzt.zzay();
            zzir zzj2 = this.zzt.zzs().zzj(false);
            String s12 = ProtectedSandApp.s("ㄞ");
            if (zzj2 != null && s12.equals(str2)) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long elapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                long j7 = elapsedRealtime - zzknVar.zzb;
                zzknVar.zzb = elapsedRealtime;
                if (j7 > 0) {
                    this.zzt.zzv().zzI(zzu, j7);
                }
            }
            zzos.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                boolean equals2 = ProtectedSandApp.s("ㄟ").equals(str4);
                String s13 = ProtectedSandApp.s("ㄠ");
                if (!equals2 && ProtectedSandApp.s("ㄡ").equals(str2)) {
                    zzlp zzv4 = this.zzt.zzv();
                    String string = zzu.getString(s13);
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzln.zza(string, zzv4.zzt.zzm().zzp.zza())) {
                        zzv4.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ㄢ"));
                        return;
                    }
                    zzv4.zzt.zzm().zzp.zzb(string);
                } else if (s12.equals(str2)) {
                    String zza = this.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzu.putString(s13, zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzu);
            boolean zzo = this.zzt.zzf().zzs(null, zzeg.zzaG) ? this.zzt.zzu().zzo() : this.zzt.zzm().zzm.zzb();
            if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j5) && zzo) {
                c.a(this.zzt, ProtectedSandApp.s("ㄣ"));
                zzY(ProtectedSandApp.s("ㄤ"), ProtectedSandApp.s("ㄥ"), null, this.zzt.zzax().currentTimeMillis());
                zzY(ProtectedSandApp.s("ㄦ"), ProtectedSandApp.s("ㄧ"), null, this.zzt.zzax().currentTimeMillis());
                zzY(ProtectedSandApp.s("ㄨ"), ProtectedSandApp.s("ㄩ"), null, this.zzt.zzax().currentTimeMillis());
                j6 = 0;
                this.zzt.zzm().zzk.zzb(0L);
            } else {
                j6 = 0;
            }
            if (zzu.getLong(ProtectedSandApp.s("ㄪ"), j6) == 1) {
                c.a(this.zzt, ProtectedSandApp.s("ㄫ"));
                this.zzt.zzu().zza.zzb(j5, true);
            }
            ArrayList arrayList2 = new ArrayList(zzu.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                String str5 = (String) arrayList2.get(i6);
                if (str5 != null) {
                    this.zzt.zzv();
                    Object obj = zzu.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzu.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i7 = 0;
            while (i7 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i7);
                String s14 = i7 != 0 ? ProtectedSandApp.s("ㄬ") : str2;
                bundle2.putString(s11, str4);
                if (z6) {
                    bundle2 = this.zzt.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                this.zzt.zzt().zzA(new zzau(s14, new zzas(bundle3), str, j5), str3);
                if (!z8) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhg) it.next()).onEvent(str, str2, new Bundle(bundle3), j5);
                    }
                }
                i7++;
                str4 = str;
            }
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) == null || !s12.equals(str2)) {
                return;
            }
            this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.add(zzhgVar)) {
            return;
        }
        b.a(this.zzt, ProtectedSandApp.s("ㄮ"));
    }

    public final void zzK(long j5) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j5));
    }

    final void zzL(long j5, boolean z5) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ㄯ"));
        zzkp zzu = this.zzt.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zzJ = this.zzt.zzJ();
        zzfi zzm = this.zzt.zzm();
        zzm.zzc.zzb(j5);
        if (!TextUtils.isEmpty(zzm.zzt.zzm().zzp.zza())) {
            zzm.zzp.zzb(null);
        }
        zzph.zzc();
        zzag zzf = zzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzf.zzs(null, zzefVar)) {
            zzm.zzj.zzb(0L);
        }
        zzm.zzk.zzb(0L);
        if (!zzm.zzt.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzq.zzb(null);
        zzm.zzr.zzb(0L);
        zzm.zzs.zzb(null);
        if (z5) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    protected final void zzM(String str, String str2, long j5, Bundle bundle, boolean z5, boolean z6, boolean z7, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i5 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i5 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i5];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i5] = new Bundle((Bundle) parcelable);
                        }
                        i5++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i5 < list.size()) {
                        Object obj2 = list.get(i5);
                        if (obj2 instanceof Bundle) {
                            list.set(i5, new Bundle((Bundle) obj2));
                        }
                        i5++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j5, bundle2, z5, z6, z7, str3));
    }

    final void zzN(String str, String str2, long j5, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j5));
    }

    final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j5) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        String s5 = ProtectedSandApp.s("\u3130");
        if (!TextUtils.isEmpty(bundle2.getString(s5))) {
            b.a(this.zzt, ProtectedSandApp.s("ㄱ"));
        }
        bundle2.remove(s5);
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, s5, String.class, null);
        String s6 = ProtectedSandApp.s("ㄲ");
        zzgz.zza(bundle2, s6, String.class, null);
        String s7 = ProtectedSandApp.s("ㄳ");
        zzgz.zza(bundle2, s7, String.class, null);
        String s8 = ProtectedSandApp.s("ㄴ");
        zzgz.zza(bundle2, s8, Object.class, null);
        String s9 = ProtectedSandApp.s("ㄵ");
        zzgz.zza(bundle2, s9, String.class, null);
        String s10 = ProtectedSandApp.s("ㄶ");
        zzgz.zza(bundle2, s10, Long.class, 0L);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄷ"), String.class, null);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄸ"), Bundle.class, null);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄹ"), String.class, null);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄺ"), Bundle.class, null);
        String s11 = ProtectedSandApp.s("ㄻ");
        zzgz.zza(bundle2, s11, Long.class, 0L);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄼ"), String.class, null);
        zzgz.zza(bundle2, ProtectedSandApp.s("ㄽ"), Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString(s7));
        Preconditions.checkNotEmpty(bundle2.getString(s6));
        Preconditions.checkNotNull(bundle2.get(s8));
        bundle2.putLong(ProtectedSandApp.s("ㄾ"), j5);
        String string = bundle2.getString(s7);
        Object obj = bundle2.get(s8);
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㅃ"), this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ㅂ"), this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object zzB = this.zzt.zzv().zzB(string, obj);
        if (zzB == null) {
            this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ㄿ"), this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzgz.zzb(bundle2, zzB);
        long j6 = bundle2.getLong(s10);
        if (!TextUtils.isEmpty(bundle2.getString(s9))) {
            this.zzt.zzf();
            if (j6 > 15552000000L || j6 < 1) {
                this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ㅀ"), this.zzt.zzj().zzf(string), Long.valueOf(j6));
                return;
            }
        }
        long j7 = bundle2.getLong(s11);
        this.zzt.zzf();
        if (j7 <= 15552000000L && j7 >= 1) {
            this.zzt.zzaB().zzp(new zzht(this, bundle2));
            return;
        }
        this.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ㅁ"), this.zzt.zzj().zzf(string), Long.valueOf(j7));
    }

    public final void zzR(zzhb zzhbVar, long j5) {
        zzhb zzhbVar2;
        boolean z5;
        zzhb zzhbVar3;
        boolean z6;
        boolean z7;
        zza();
        int zza = zzhbVar.zza();
        if (zza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.zzt.zzaA().zzl().zza(ProtectedSandApp.s("ㅄ"));
            return;
        }
        synchronized (this.zzh) {
            zzhbVar2 = this.zzi;
            z5 = false;
            if (zzhb.zzk(zza, zzhbVar2.zza())) {
                z7 = zzhbVar.zzm(this.zzi);
                zzha zzhaVar = zzha.zzb;
                if (zzhbVar.zzj(zzhaVar) && !this.zzi.zzj(zzhaVar)) {
                    z5 = true;
                }
                zzhb zze = zzhbVar.zze(this.zzi);
                this.zzi = zze;
                zzhbVar3 = zze;
                z6 = z5;
                z5 = true;
            } else {
                zzhbVar3 = zzhbVar;
                z6 = false;
                z7 = false;
            }
        }
        if (!z5) {
            this.zzt.zzaA().zzi().zzb(ProtectedSandApp.s("ㅅ"), zzhbVar3);
            return;
        }
        long andIncrement = this.zzj.getAndIncrement();
        if (z7) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzif(this, zzhbVar3, j5, andIncrement, z6, zzhbVar2));
            return;
        }
        zzig zzigVar = new zzig(this, zzhbVar3, andIncrement, z6, zzhbVar2);
        if (zza == 30 || zza == -10) {
            this.zzt.zzaB().zzq(zzigVar);
        } else {
            this.zzt.zzaB().zzp(zzigVar);
        }
    }

    public final void zzS(Bundle bundle, int i5, long j5) {
        zza();
        String zzh = zzhb.zzh(bundle);
        if (zzh != null) {
            this.zzt.zzaA().zzl().zzb(ProtectedSandApp.s("ㅆ"), zzh);
            this.zzt.zzaA().zzl().zza(ProtectedSandApp.s("ㅇ"));
        }
        zzR(zzhb.zzb(bundle, i5), j5);
    }

    @n1
    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            Preconditions.checkState(zzhfVar2 == null, ProtectedSandApp.s("ㅈ"));
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    @n1
    final void zzV(zzhb zzhbVar) {
        zzg();
        boolean z5 = (zzhbVar.zzj(zzha.zzb) && zzhbVar.zzj(zzha.zza)) || this.zzt.zzt().zzM();
        if (z5 != this.zzt.zzK()) {
            this.zzt.zzG(z5);
            zzfi zzm = this.zzt.zzm();
            zzgd zzgdVar = zzm.zzt;
            zzm.zzg();
            SharedPreferences zza = zzm.zza();
            String s5 = ProtectedSandApp.s("ㅉ");
            Boolean valueOf = zza.contains(s5) ? Boolean.valueOf(zzm.zza().getBoolean(s5, true)) : null;
            if (!z5 || valueOf == null || valueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z5), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z5) {
        zzX(ProtectedSandApp.s("ㅊ"), ProtectedSandApp.s("ㅋ"), obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L17
            com.google.android.gms.measurement.internal.zzgd r4 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r4 = r4.zzv()
            int r4 = r4.zzl(r2)
        L15:
            r12 = r4
            goto L45
        L17:
            com.google.android.gms.measurement.internal.zzgd r4 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r4 = r4.zzv()
            java.lang.String r5 = "ㅌ"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            boolean r7 = r4.zzad(r5, r2)
            r8 = 6
            if (r7 != 0) goto L2c
        L2a:
            r12 = r8
            goto L45
        L2c:
            java.lang.String[] r7 = com.google.android.gms.measurement.internal.zzhe.zza
            r9 = 0
            boolean r7 = r4.zzaa(r5, r7, r9, r2)
            if (r7 != 0) goto L38
            r4 = 15
            goto L15
        L38:
            com.google.android.gms.measurement.internal.zzgd r7 = r4.zzt
            r7.zzf()
            boolean r4 = r4.zzZ(r5, r3, r2)
            if (r4 != 0) goto L44
            goto L2a
        L44:
            r12 = r1
        L45:
            r4 = 1
            if (r12 == 0) goto L71
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r0 = r0.zzv()
            com.google.android.gms.measurement.internal.zzgd r5 = r6.zzt
            r5.zzf()
            java.lang.String r14 = r0.zzD(r2, r3, r4)
            if (r2 == 0) goto L5d
            int r1 = r18.length()
        L5d:
            r15 = r1
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r9 = r0.zzv()
            com.google.android.gms.measurement.internal.zzlo r10 = r6.zzl
            r11 = 0
            java.lang.String r13 = "ㅍ"
            java.lang.String r13 = com.flashget.kidsdownloader.ProtectedSandApp.s(r13)
            r9.zzO(r10, r11, r12, r13, r14, r15)
            return
        L71:
            if (r17 != 0) goto L7a
            java.lang.String r5 = "ㅎ"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            goto L7c
        L7a:
            r5 = r17
        L7c:
            if (r0 == 0) goto Ld5
            com.google.android.gms.measurement.internal.zzgd r7 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r7 = r7.zzv()
            int r11 = r7.zzd(r2, r0)
            if (r11 == 0) goto Lbd
            com.google.android.gms.measurement.internal.zzgd r5 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r5 = r5.zzv()
            com.google.android.gms.measurement.internal.zzgd r7 = r6.zzt
            r7.zzf()
            java.lang.String r13 = r5.zzD(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto La1
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto La9
        La1:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
        La9:
            r14 = r1
            com.google.android.gms.measurement.internal.zzgd r0 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r8 = r0.zzv()
            com.google.android.gms.measurement.internal.zzlo r9 = r6.zzl
            r10 = 0
            java.lang.String r12 = "ㅏ"
            java.lang.String r12 = com.flashget.kidsdownloader.ProtectedSandApp.s(r12)
            r8.zzO(r9, r10, r11, r12, r13, r14)
            return
        Lbd:
            com.google.android.gms.measurement.internal.zzgd r1 = r6.zzt
            com.google.android.gms.measurement.internal.zzlp r1 = r1.zzv()
            java.lang.Object r7 = r1.zzB(r2, r0)
            if (r7 == 0) goto Ld4
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzN(r1, r2, r3, r5)
        Ld4:
            return
        Ld5:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.zzN(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzX(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzY(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "ㅐ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L79
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "ㅑ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            if (r0 == 0) goto L63
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L63
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            r11 = 1
            java.lang.String r0 = "ㅒ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            boolean r10 = r0.equals(r10)
            r2 = 1
            if (r11 == r10) goto L43
            r10 = 0
            goto L44
        L43:
            r10 = r2
        L44:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzgd r11 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzfh r11 = r11.zzh
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L5e
            java.lang.String r0 = "ㅓ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
        L5e:
            r11.zzb(r0)
            r11 = r10
            goto L76
        L63:
            if (r11 != 0) goto L79
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            com.google.android.gms.measurement.internal.zzfi r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzfh r10 = r10.zzh
            java.lang.String r0 = "ㅔ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r10.zzb(r0)
        L76:
            r6 = r11
            r3 = r1
            goto L7b
        L79:
            r3 = r10
            r6 = r11
        L7b:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L8f
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            java.lang.String r10 = "ㅕ"
            java.lang.String r10 = com.flashget.kidsdownloader.ProtectedSandApp.s(r10)
            com.google.android.gms.measurement.internal.c.a(r9, r10)
            return
        L8f:
            com.google.android.gms.measurement.internal.zzgd r10 = r8.zzt
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L98
            return
        L98:
            com.google.android.gms.measurement.internal.zzlk r10 = new com.google.android.gms.measurement.internal.zzlk
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzgd r9 = r8.zzt
            com.google.android.gms.measurement.internal.zzjz r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzY(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.remove(zzhgVar)) {
            return;
        }
        b.a(this.zzt, ProtectedSandApp.s("ㅖ"));
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, 15000L, ProtectedSandApp.s("ㅗ"), new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, 15000L, ProtectedSandApp.s("ㅘ"), new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, 15000L, ProtectedSandApp.s("ㅙ"), new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, 15000L, ProtectedSandApp.s("ㅚ"), new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzi = this.zzt.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, 15000L, ProtectedSandApp.s("ㅛ"), new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅜ"));
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅝ"));
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, C0532i.f8582a, ProtectedSandApp.s("ㅞ"), new zzhv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlp.zzH(list);
        }
        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㅟ"), null);
        return new ArrayList();
    }

    public final List zzt(boolean z5) {
        zza();
        c.a(this.zzt, ProtectedSandApp.s("ㅠ"));
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅤ"));
            return Collections.emptyList();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅡ"));
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, C0532i.f8582a, ProtectedSandApp.s("ㅢ"), new zzhr(this, atomicReference, z5));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㅣ"), Boolean.valueOf(z5));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z5) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅥ"));
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza(ProtectedSandApp.s("ㅦ"));
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, C0532i.f8582a, ProtectedSandApp.s("ㅧ"), new zzhx(this, atomicReference, null, str, str2, z5));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ㅨ"), Boolean.valueOf(z5));
            return Collections.emptyMap();
        }
        androidx.collection.a aVar = new androidx.collection.a(list.size());
        for (zzlk zzlkVar : list) {
            Object zza = zzlkVar.zza();
            if (zza != null) {
                aVar.put(zzlkVar.zzb, zza);
            }
        }
        return aVar;
    }

    @n1
    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzf = this.zzt.zzf();
                zzf.zzt.zzay();
                Boolean zzk = zzf.zzk(ProtectedSandApp.s("ㅩ"));
                if (zzk != null && zzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ㅪ"));
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = zzik.this;
                            zzikVar.zzg();
                            if (zzikVar.zzt.zzm().zzn.zzb()) {
                                zzikVar.zzt.zzaA().zzc().zza(ProtectedSandApp.s("ᄅ"));
                                return;
                            }
                            long zza = zzikVar.zzt.zzm().zzo.zza();
                            zzikVar.zzt.zzm().zzo.zzb(1 + zza);
                            zzikVar.zzt.zzf();
                            if (zza < 5) {
                                zzikVar.zzt.zzE();
                            } else {
                                b.a(zzikVar.zzt, ProtectedSandApp.s("ᄄ"));
                                zzikVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzm = this.zzt.zzm();
            zzm.zzg();
            SharedPreferences zza = zzm.zza();
            String s5 = ProtectedSandApp.s("ㅫ");
            String string = zza.getString(s5, null);
            zzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString(s5, str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString(ProtectedSandApp.s("ㅬ"), string);
            zzG(ProtectedSandApp.s("ㅭ"), ProtectedSandApp.s("ㅮ"), bundle);
        }
    }
}

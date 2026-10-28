package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.m1;
import androidx.annotation.n1;
import bg.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzov;
import com.google.firebase.remoteconfig.p;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public class zzhy implements zzjc {
    private static volatile zzhy zzb;

    @m1
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;

    @m1
    private Boolean zzad;

    @m1
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzha zzj;
    private final zzgo zzk;
    private final zzhv zzl;
    private final zznb zzm;
    private final zzos zzn;
    private final zzgh zzo;
    private final Clock zzp;
    private final zzlj zzq;
    private final zzjq zzr;
    private final zzb zzs;
    private final zzle zzt;
    private final String zzu;
    private zzgf zzv;
    private zzls zzw;
    private zzaz zzx;
    private zzgg zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    private zzhy(zzjo zzjoVar) {
        Bundle bundle;
        boolean z4 = false;
        Preconditions.checkNotNull(zzjoVar);
        zzab zzabVar = new zzab(zzjoVar.zza);
        this.zzh = zzabVar;
        zzga.zza = zzabVar;
        Context context = zzjoVar.zza;
        this.zzc = context;
        this.zzd = zzjoVar.zzb;
        this.zze = zzjoVar.zzc;
        this.zzf = zzjoVar.zzd;
        this.zzg = zzjoVar.zzh;
        this.zzac = zzjoVar.zze;
        this.zzu = zzjoVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdw zzdwVar = zzjoVar.zzg;
        if (zzdwVar != null && (bundle = zzdwVar.zzg) != null) {
            Object obj = bundle.get(ProtectedSandApp.s("\udf27"));
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdwVar.zzg.get(ProtectedSandApp.s("\udf28"));
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhj.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        Long l4 = zzjoVar.zzi;
        this.zza = l4 != null ? l4.longValue() : defaultClock.currentTimeMillis();
        this.zzi = new zzag(this);
        zzha zzhaVar = new zzha(this);
        zzhaVar.zzad();
        this.zzj = zzhaVar;
        zzgo zzgoVar = new zzgo(this);
        zzgoVar.zzad();
        this.zzk = zzgoVar;
        zzos zzosVar = new zzos(this);
        zzosVar.zzad();
        this.zzn = zzosVar;
        this.zzo = new zzgh(new zzjn(zzjoVar, this));
        this.zzs = new zzb(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzv();
        this.zzq = zzljVar;
        zzjq zzjqVar = new zzjq(this);
        zzjqVar.zzv();
        this.zzr = zzjqVar;
        zznb zznbVar = new zznb(this);
        zznbVar.zzv();
        this.zzm = zznbVar;
        zzle zzleVar = new zzle(this);
        zzleVar.zzad();
        this.zzt = zzleVar;
        zzhv zzhvVar = new zzhv(this);
        zzhvVar.zzad();
        this.zzl = zzhvVar;
        com.google.android.gms.internal.measurement.zzdw zzdwVar2 = zzjoVar.zzg;
        if (zzdwVar2 != null && zzdwVar2.zzb != 0) {
            z4 = true;
        }
        boolean z5 = !z4;
        if (context.getApplicationContext() instanceof Application) {
            zzp().zzb(z5);
        } else {
            zzj().zzu().zza(ProtectedSandApp.s("\udf29"));
        }
        zzhvVar.zzb(new zzid(this, zzjoVar));
    }

    @bg.b
    private final zzle zzai() {
        zza((zzjd) this.zzt);
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final Context zza() {
        return this.zzc;
    }

    final void zzaa() {
        this.zzag++;
    }

    @n1
    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    @n1
    public final boolean zzac() {
        return zzc() == 0;
    }

    @n1
    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @bg.b
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    @n1
    protected final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException(ProtectedSandApp.s("\udf57"));
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z4 = true;
            Boolean valueOf = Boolean.valueOf(zzt().zze(ProtectedSandApp.s("\udf3e")) && zzt().zze(ProtectedSandApp.s("\udf40")) && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzy() || (zzos.zza(this.zzc) && zzos.zza(this.zzc, false))));
            this.zzaa = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z4 = false;
                }
                this.zzaa = Boolean.valueOf(z4);
            }
        }
        return this.zzaa.booleanValue();
    }

    @bg.b
    public final boolean zzag() {
        return this.zzg;
    }

    @n1
    public final boolean zzah() {
        zzl().zzt();
        zza((zzjd) zzai());
        String zzad = zzh().zzad();
        if (!this.zzi.zzv()) {
            zzj().zzp().zza(ProtectedSandApp.s("\udf58"));
            return false;
        }
        Pair<String, Boolean> zza = zzn().zza(zzad);
        if (((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzj().zzp().zza(ProtectedSandApp.s("\udf63"));
            return false;
        }
        if (!zzai().zzc()) {
            zzj().zzu().zza(ProtectedSandApp.s("\udf59"));
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzls zzr = zzr();
        zzr.zzt();
        zzr.zzu();
        if (!zzr.zzap() || zzr.zzq().zzg() >= 234200) {
            zzaj zzab = zzp().zzab();
            Bundle bundle = zzab != null ? zzab.zza : null;
            if (bundle == null) {
                int i4 = this.zzah;
                this.zzah = i4 + 1;
                boolean z4 = i4 < 10;
                zzj().zzc().zza(d.a(ProtectedSandApp.s("\udf5c"), z4 ? ProtectedSandApp.s("\udf5a") : ProtectedSandApp.s("\udf5b"), ProtectedSandApp.s("\udf5d")), Integer.valueOf(this.zzah));
                return z4;
            }
            zzje zza2 = zzje.zza(bundle, 100);
            sb.append(ProtectedSandApp.s("\udf5e"));
            sb.append(zza2.zze());
            zzax zza3 = zzax.zza(bundle, 100);
            sb.append(ProtectedSandApp.s("\udf5f"));
            sb.append(zza3.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zza3.zze())) {
                sb.append(ProtectedSandApp.s("\udf60"));
                sb.append(zza3.zze());
            }
            int i5 = zzax.zza(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append(ProtectedSandApp.s("\udf61"));
            sb.append(i5);
            zzj().zzp().zza(ProtectedSandApp.s("\udf62"), sb);
        }
        zzos zzt = zzt();
        zzh();
        URL zza4 = zzt.zza(106000L, zzad, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
        if (zza4 != null) {
            zzle zzai = zzai();
            zzld zzldVar = new zzld() { // from class: com.google.android.gms.measurement.internal.zzia
                @Override // com.google.android.gms.measurement.internal.zzld
                public final void zza(String str, int i6, Throwable th, byte[] bArr, Map map) {
                    zzhy.this.zza(str, i6, th, bArr, map);
                }
            };
            zzai.zzt();
            zzai.zzac();
            Preconditions.checkNotNull(zza4);
            Preconditions.checkNotNull(zzldVar);
            zzai.zzl().zza(new zzlg(zzai, zzad, zza4, null, null, zzldVar));
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final Clock zzb() {
        return this.zzp;
    }

    @n1
    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzx()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean zzv = zzn().zzv();
        if (zzv != null) {
            return zzv.booleanValue() ? 0 : 3;
        }
        Boolean zze = this.zzi.zze(ProtectedSandApp.s("\udf64"));
        if (zze != null) {
            return zze.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzad;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final zzab zzd() {
        return this.zzh;
    }

    @bg.b
    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException(ProtectedSandApp.s("\udf2c"));
    }

    @bg.b
    public final zzag zzf() {
        return this.zzi;
    }

    @bg.b
    public final zzaz zzg() {
        zza((zzjd) this.zzx);
        return this.zzx;
    }

    @bg.b
    public final zzgg zzh() {
        zza((zzh) this.zzy);
        return this.zzy;
    }

    @bg.b
    public final zzgf zzi() {
        zza((zzh) this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final zzgo zzj() {
        zza((zzjd) this.zzk);
        return this.zzk;
    }

    @bg.b
    public final zzgh zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzjc
    @bg.b
    public final zzhv zzl() {
        zza((zzjd) this.zzl);
        return this.zzl;
    }

    public final zzgo zzm() {
        zzgo zzgoVar = this.zzk;
        if (zzgoVar == null || !zzgoVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @bg.b
    public final zzha zzn() {
        zza((zzja) this.zzj);
        return this.zzj;
    }

    @c
    final zzhv zzo() {
        return this.zzl;
    }

    @bg.b
    public final zzjq zzp() {
        zza((zzh) this.zzr);
        return this.zzr;
    }

    @bg.b
    public final zzlj zzq() {
        zza((zzh) this.zzq);
        return this.zzq;
    }

    @bg.b
    public final zzls zzr() {
        zza((zzh) this.zzw);
        return this.zzw;
    }

    @bg.b
    public final zznb zzs() {
        zza((zzh) this.zzm);
        return this.zzm;
    }

    @bg.b
    public final zzos zzt() {
        zza((zzja) this.zzn);
        return this.zzn;
    }

    @bg.b
    public final String zzu() {
        return this.zzd;
    }

    @bg.b
    public final String zzv() {
        return this.zze;
    }

    @bg.b
    public final String zzw() {
        return this.zzf;
    }

    @bg.b
    public final String zzx() {
        return this.zzu;
    }

    final void zzy() {
        throw new IllegalStateException(ProtectedSandApp.s("\udf65"));
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }

    public static zzhy zza(Context context, com.google.android.gms.internal.measurement.zzdw zzdwVar, Long l4) {
        Bundle bundle;
        if (zzdwVar != null && (zzdwVar.zze == null || zzdwVar.zzf == null)) {
            zzdwVar = new com.google.android.gms.internal.measurement.zzdw(zzdwVar.zza, zzdwVar.zzb, zzdwVar.zzc, zzdwVar.zzd, null, null, zzdwVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhy.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzhy(new zzjo(context, zzdwVar, l4));
                    }
                } finally {
                }
            }
        } else if (zzdwVar != null && (bundle = zzdwVar.zzg) != null && bundle.containsKey(ProtectedSandApp.s("\udf2a"))) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdwVar.zzg.getBoolean(ProtectedSandApp.s("\udf2a")));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @n1
    public final void zzb(boolean z4) {
        zzl().zzt();
        this.zzaf = z4;
    }

    static /* synthetic */ void zza(zzhy zzhyVar, zzjo zzjoVar) {
        zzhyVar.zzl().zzt();
        zzaz zzazVar = new zzaz(zzhyVar);
        zzazVar.zzad();
        zzhyVar.zzx = zzazVar;
        zzgg zzggVar = new zzgg(zzhyVar, zzjoVar.zzf);
        zzggVar.zzv();
        zzhyVar.zzy = zzggVar;
        zzgf zzgfVar = new zzgf(zzhyVar);
        zzgfVar.zzv();
        zzhyVar.zzv = zzgfVar;
        zzls zzlsVar = new zzls(zzhyVar);
        zzlsVar.zzv();
        zzhyVar.zzw = zzlsVar;
        zzhyVar.zzn.zzae();
        zzhyVar.zzj.zzae();
        zzhyVar.zzy.zzw();
        zzhyVar.zzj().zzo().zza(ProtectedSandApp.s("\udf2d"), 106000L);
        zzhyVar.zzj().zzo().zza(ProtectedSandApp.s("\udf2e"));
        String zzad = zzggVar.zzad();
        if (TextUtils.isEmpty(zzhyVar.zzd)) {
            if (zzhyVar.zzt().zzd(zzad, zzhyVar.zzi.zzu())) {
                zzhyVar.zzj().zzo().zza(ProtectedSandApp.s("\udf2f"));
            } else {
                zzhyVar.zzj().zzo().zza(ProtectedSandApp.s("\udf30") + zzad);
            }
        }
        zzhyVar.zzj().zzc().zza(ProtectedSandApp.s("\udf31"));
        if (zzhyVar.zzag != zzhyVar.zzai.get()) {
            zzhyVar.zzj().zzg().zza(ProtectedSandApp.s("\udf32"), Integer.valueOf(zzhyVar.zzag), Integer.valueOf(zzhyVar.zzai.get()));
        }
        zzhyVar.zzz = true;
    }

    private static void zza(zzja zzjaVar) {
        if (zzjaVar == null) {
            throw new IllegalStateException(ProtectedSandApp.s("\udf2c"));
        }
    }

    private static void zza(zzh zzhVar) {
        if (zzhVar != null) {
            if (zzhVar.zzy()) {
                return;
            }
            throw new IllegalStateException(ProtectedSandApp.s("\udf2b").concat(String.valueOf(zzhVar.getClass())));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\udf2c"));
    }

    private static void zza(zzjd zzjdVar) {
        if (zzjdVar != null) {
            if (zzjdVar.zzaf()) {
                return;
            }
            throw new IllegalStateException(ProtectedSandApp.s("\udf2b").concat(String.valueOf(zzjdVar.getClass())));
        }
        throw new IllegalStateException(ProtectedSandApp.s("\udf2c"));
    }

    final /* synthetic */ void zza(String str, int i4, Throwable th, byte[] bArr, Map map) {
        String s4 = ProtectedSandApp.s("\udf47");
        String s5 = ProtectedSandApp.s("\udf48");
        String s6 = ProtectedSandApp.s("\udf49");
        if ((i4 == 200 || i4 == 204 || i4 == 304) && th == null) {
            zzn().zzo.zza(true);
            if (bArr != null && bArr.length != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String optString = jSONObject.optString(ProtectedSandApp.s("\udf4a"), "");
                    if (TextUtils.isEmpty(optString)) {
                        zzj().zzc().zza(ProtectedSandApp.s("\udf4b"));
                        return;
                    }
                    String optString2 = jSONObject.optString(s6, "");
                    String optString3 = jSONObject.optString(s5, "");
                    String optString4 = jSONObject.optString(s4, "");
                    double optDouble = jSONObject.optDouble(ProtectedSandApp.s("\udf4c"), p.f60679p);
                    Bundle bundle = new Bundle();
                    if (zzov.zza() && this.zzi.zza(zzbh.zzct)) {
                        if (!zzt().zzi(optString)) {
                            zzj().zzu().zza(ProtectedSandApp.s("\udf4d"), optString2, optString3, optString);
                            return;
                        }
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString(s5, optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString(s4, optString4);
                        }
                    } else if (!zzt().zzi(optString)) {
                        zzj().zzu().zza(ProtectedSandApp.s("\udf4e"), optString2, optString);
                        return;
                    }
                    if (zzov.zza()) {
                        this.zzi.zza(zzbh.zzct);
                    }
                    bundle.putString(s6, optString2);
                    bundle.putString(ProtectedSandApp.s("\udf4f"), ProtectedSandApp.s("\udf50"));
                    this.zzr.zzc(ProtectedSandApp.s("\udf51"), ProtectedSandApp.s("\udf52"), bundle);
                    zzos zzt = zzt();
                    if (TextUtils.isEmpty(optString) || !zzt.zza(optString, optDouble)) {
                        return;
                    }
                    zzt.zza().sendBroadcast(new Intent(ProtectedSandApp.s("\udf53")));
                    return;
                } catch (JSONException e4) {
                    zzj().zzg().zza(ProtectedSandApp.s("\udf54"), e4);
                    return;
                }
            }
            zzj().zzc().zza(ProtectedSandApp.s("\udf55"));
            return;
        }
        zzj().zzu().zza(ProtectedSandApp.s("\udf56"), Integer.valueOf(i4), th);
    }

    @n1
    final void zza(boolean z4) {
        this.zzac = Boolean.valueOf(z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x00ea, code lost:
    
        if (r1.zzi() != false) goto L37;
     */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdw r12) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.zza(com.google.android.gms.internal.measurement.zzdw):void");
    }
}

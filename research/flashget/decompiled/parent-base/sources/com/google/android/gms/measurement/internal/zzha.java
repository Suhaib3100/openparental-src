package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.n1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzje;
import mf.d;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzha extends zzjd {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzhe zzb;
    public final zzhb zzc;
    public final zzhb zzd;
    public final zzhd zze;
    public final zzhb zzf;
    public final zzgz zzg;
    public final zzhd zzh;
    public final zzhc zzi;
    public final zzgz zzj;
    public final zzhb zzk;
    public final zzhb zzl;
    public boolean zzm;
    public zzgz zzn;
    public zzgz zzo;
    public zzhb zzp;
    public final zzhd zzq;
    public final zzhd zzr;
    public final zzhb zzs;
    public final zzhc zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    zzha(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzw = new Object();
        this.zzf = new zzhb(this, ProtectedSandApp.s("\ude8e"), 1800000L);
        this.zzg = new zzgz(this, ProtectedSandApp.s("\ude8f"), true);
        this.zzk = new zzhb(this, ProtectedSandApp.s("\ude90"), 0L);
        this.zzl = new zzhb(this, ProtectedSandApp.s("\ude91"), 0L);
        this.zzh = new zzhd(this, ProtectedSandApp.s("\ude92"), null);
        this.zzi = new zzhc(this, ProtectedSandApp.s("\ude93"), null);
        this.zzj = new zzgz(this, ProtectedSandApp.s("\ude94"), false);
        this.zzc = new zzhb(this, ProtectedSandApp.s("\ude95"), 0L);
        this.zzd = new zzhb(this, ProtectedSandApp.s("\ude96"), 0L);
        this.zze = new zzhd(this, ProtectedSandApp.s("\ude97"), null);
        this.zzn = new zzgz(this, ProtectedSandApp.s("\ude98"), false);
        this.zzo = new zzgz(this, ProtectedSandApp.s("\ude99"), false);
        this.zzp = new zzhb(this, ProtectedSandApp.s("\ude9a"), 0L);
        this.zzq = new zzhd(this, ProtectedSandApp.s("\ude9b"), null);
        this.zzr = new zzhd(this, ProtectedSandApp.s("\ude9c"), null);
        this.zzs = new zzhb(this, ProtectedSandApp.s("\ude9d"), 0L);
        this.zzt = new zzhc(this, ProtectedSandApp.s("\ude9e"), null);
    }

    @n1
    final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzo().zza(zzje.zza.zza)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && elapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = elapsedRealtime + zze().zzd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzy = id2;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e4) {
            zzj().zzc().zza(ProtectedSandApp.s("\ude9f"), e4);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    @n1
    @d.a({@d({"this.preferences"}), @d({"this.monitoringSample"})})
    protected final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences(ProtectedSandApp.s("\udea8"), 0);
        this.zzv = sharedPreferences;
        String s4 = ProtectedSandApp.s("\udea9");
        boolean z4 = sharedPreferences.getBoolean(s4, false);
        this.zzm = z4;
        if (!z4) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean(s4, true);
            edit.apply();
        }
        this.zzb = new zzhe(this, ProtectedSandApp.s("\udeaa"), Math.max(0L, zzbh.zzc.zza(null).longValue()));
    }

    @n1
    final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains(ProtectedSandApp.s("\udeab"));
    }

    @n1
    final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString(ProtectedSandApp.s("\udead"), str);
        edit.apply();
    }

    @n1
    protected final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                try {
                    if (this.zzx == null) {
                        String str = zza().getPackageName() + ProtectedSandApp.s("\udeaf");
                        zzj().zzp().zza(ProtectedSandApp.s("\udeb0"), str);
                        this.zzx = zza().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.zzx;
    }

    @n1
    @d9.d
    protected final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return true;
    }

    final SparseArray<Long> zzm() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray(ProtectedSandApp.s("\udea0"));
        long[] longArray = zza2.getLongArray(ProtectedSandApp.s("\udea1"));
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().zzg().zza(ProtectedSandApp.s("\udeb2"));
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i4 = 0; i4 < intArray.length; i4++) {
            sparseArray.put(intArray[i4], Long.valueOf(longArray[i4]));
        }
        return sparseArray;
    }

    @n1
    final zzax zzn() {
        zzt();
        return zzax.zza(zzg().getString(ProtectedSandApp.s("\udea5"), null));
    }

    @n1
    final zzje zzo() {
        zzt();
        return zzje.zza(zzg().getString(ProtectedSandApp.s("\udea6"), ProtectedSandApp.s("\udeb3")), zzg().getInt(ProtectedSandApp.s("\udea4"), 100));
    }

    @n1
    final Boolean zzp() {
        zzt();
        SharedPreferences zzg = zzg();
        String s4 = ProtectedSandApp.s("\udea3");
        if (zzg.contains(s4)) {
            return Boolean.valueOf(zzg().getBoolean(s4, false));
        }
        return null;
    }

    @n1
    final Boolean zzu() {
        zzt();
        SharedPreferences zzg = zzg();
        String s4 = ProtectedSandApp.s("\udeac");
        if (zzg.contains(s4)) {
            return Boolean.valueOf(zzg().getBoolean(s4, true));
        }
        return null;
    }

    @n1
    final Boolean zzv() {
        zzt();
        SharedPreferences zzg = zzg();
        String s4 = ProtectedSandApp.s("\udea2");
        if (zzg.contains(s4)) {
            return Boolean.valueOf(zzg().getBoolean(s4, true));
        }
        return null;
    }

    @n1
    protected final String zzw() {
        zzt();
        SharedPreferences zzg = zzg();
        String s4 = ProtectedSandApp.s("\udeb4");
        String string = zzg.getString(s4, null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString(s4, str);
            edit.apply();
        }
        return string;
    }

    @n1
    final String zzx() {
        zzt();
        return zzg().getString(ProtectedSandApp.s("\udead"), null);
    }

    @n1
    final String zzy() {
        zzt();
        return zzg().getString(ProtectedSandApp.s("\udeb1"), null);
    }

    @n1
    final void zzz() {
        zzt();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zza(zzv);
        }
    }

    @n1
    final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        String s4 = ProtectedSandApp.s("\udeac");
        if (bool != null) {
            edit.putBoolean(s4, bool.booleanValue());
        } else {
            edit.remove(s4);
        }
        edit.apply();
    }

    @n1
    final void zzb(boolean z4) {
        zzt();
        zzj().zzp().zza(ProtectedSandApp.s("\udeae"), Boolean.valueOf(z4));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean(ProtectedSandApp.s("\udeab"), z4);
        edit.apply();
    }

    @n1
    final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString(ProtectedSandApp.s("\udeb1"), str);
        edit.apply();
    }

    @n1
    final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        String s4 = ProtectedSandApp.s("\udea2");
        if (bool != null) {
            edit.putBoolean(s4, bool.booleanValue());
        } else {
            edit.remove(s4);
        }
        edit.apply();
    }

    @n1
    final void zza(boolean z4) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean(ProtectedSandApp.s("\udea3"), z4);
        edit.apply();
    }

    final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            iArr[i4] = sparseArray.keyAt(i4);
            jArr[i4] = sparseArray.valueAt(i4).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray(ProtectedSandApp.s("\udea0"), iArr);
        bundle.putLongArray(ProtectedSandApp.s("\udea1"), jArr);
        this.zzi.zza(bundle);
    }

    final boolean zza(long j4) {
        return j4 - this.zzf.zza() > this.zzk.zza();
    }

    @n1
    final boolean zza(zzax zzaxVar) {
        zzt();
        if (!zzje.zza(zzaxVar.zza(), zzn().zza())) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString(ProtectedSandApp.s("\udea5"), zzaxVar.zzf());
        edit.apply();
        return true;
    }

    @n1
    final boolean zza(zzje zzjeVar) {
        zzt();
        int zza2 = zzjeVar.zza();
        if (!zza(zza2)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString(ProtectedSandApp.s("\udea6"), zzjeVar.zzf());
        edit.putInt(ProtectedSandApp.s("\udea4"), zza2);
        edit.apply();
        return true;
    }

    @n1
    final boolean zza(int i4) {
        return zzje.zza(i4, zzg().getInt(ProtectedSandApp.s("\udea4"), 100));
    }

    @n1
    protected final boolean zza(zznm zznmVar) {
        zzt();
        SharedPreferences zzg = zzg();
        String s4 = ProtectedSandApp.s("\udea7");
        String string = zzg.getString(s4, "");
        String zzc = zznmVar.zzc();
        if (zzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString(s4, zzc);
        edit.apply();
        return true;
    }
}

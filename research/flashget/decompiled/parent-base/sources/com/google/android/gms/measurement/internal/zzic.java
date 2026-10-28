package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.g;
import androidx.annotation.m1;
import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzic extends zzge {
    private final zznv zza;
    private Boolean zzb;
    private String zzc;

    public zzic(zznv zznvVar) {
        this(zznvVar, null);
    }

    @m1
    final zzbf zzb(zzbf zzbfVar, zzo zzoVar) {
        zzbe zzbeVar;
        if (ProtectedSandApp.s("\udf77").equals(zzbfVar.zza) && (zzbeVar = zzbfVar.zzb) != null && zzbeVar.zza() != 0) {
            String zzd = zzbfVar.zzb.zzd(ProtectedSandApp.s("\udf78"));
            if (ProtectedSandApp.s("\udf79").equals(zzd) || ProtectedSandApp.s("\udf7a").equals(zzd)) {
                this.zza.zzj().zzo().zza(ProtectedSandApp.s("\udf7b"), zzbfVar.toString());
                return new zzbf(ProtectedSandApp.s("\udf7c"), zzbfVar.zzb, zzbfVar.zzc, zzbfVar.zzd);
            }
        }
        return zzbfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzc(zzo zzoVar) {
        zzb(zzoVar, false);
        zzb(new zzil(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzd(zzo zzoVar) {
        zzb(zzoVar, false);
        zzb(new zzii(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zze(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        zzb(new zzit(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzf(zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new zzis(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzg(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzih
            @Override // java.lang.Runnable
            public final void run() {
                zzic.this.zzj(zzoVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzh(zzo zzoVar) {
        zzb(zzoVar, false);
        zzb(new zzij(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzi(final zzo zzoVar) {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzif
            @Override // java.lang.Runnable
            public final void run() {
                zzic.this.zzk(zzoVar);
            }
        });
    }

    final /* synthetic */ void zzj(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zzf(zzoVar);
    }

    final /* synthetic */ void zzk(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zzg(zzoVar);
    }

    private zzic(zznv zznvVar, String str) {
        Preconditions.checkNotNull(zznvVar);
        this.zza = zznvVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final zzaj zza(zzo zzoVar) {
        zzb(zzoVar, false);
        Preconditions.checkNotEmpty(zzoVar.zza);
        try {
            return (zzaj) this.zza.zzl().zzb(new zziv(this, zzoVar)).get(i0.f35991f, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6c"), zzgo.zza(zzoVar.zza), e4);
            return new zzaj(null);
        }
    }

    private final void zzd(zzbf zzbfVar, zzo zzoVar) {
        this.zza.zzr();
        this.zza.zza(zzbfVar, zzoVar);
    }

    final void zzc(zzbf zzbfVar, zzo zzoVar) {
        boolean z4;
        if (!this.zza.zzi().zzk(zzoVar.zza)) {
            zzd(zzbfVar, zzoVar);
            return;
        }
        this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udf7d"), zzoVar.zza);
        zzhl zzi = this.zza.zzi();
        String str = zzoVar.zza;
        com.google.android.gms.internal.measurement.zzb zzbVar = TextUtils.isEmpty(str) ? null : zzi.zza.get(str);
        if (zzbVar == null) {
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udf7e"), zzoVar.zza);
            zzd(zzbfVar, zzoVar);
            return;
        }
        try {
            Map<String, Object> zza = this.zza.zzp().zza(zzbfVar.zzb.zzb(), true);
            String zza2 = zzji.zza(zzbfVar.zza);
            if (zza2 == null) {
                zza2 = zzbfVar.zza;
            }
            z4 = zzbVar.zza(new com.google.android.gms.internal.measurement.zzad(zza2, zzbfVar.zzd, zza));
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf7f"), zzoVar.zzb, zzbfVar.zza);
            z4 = false;
        }
        if (!z4) {
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udf80"), zzbfVar.zza);
            zzd(zzbfVar, zzoVar);
            return;
        }
        if (zzbVar.zzd()) {
            this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udf81"), zzbfVar.zza);
            zzd(this.zza.zzp().zza(zzbVar.zza().zzb()), zzoVar);
        } else {
            zzd(zzbfVar, zzoVar);
        }
        if (zzbVar.zzc()) {
            for (com.google.android.gms.internal.measurement.zzad zzadVar : zzbVar.zza().zzc()) {
                this.zza.zzj().zzp().zza(ProtectedSandApp.s("\udf82"), zzadVar.zzb());
                zzd(this.zza.zzp().zza(zzadVar), zzoVar);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final String zzb(zzo zzoVar) {
        zzb(zzoVar, false);
        return this.zza.zzb(zzoVar);
    }

    @g
    private final void zzb(zzo zzoVar, boolean z4) {
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        this.zza.zzq().zza(zzoVar.zzb, zzoVar.zzp);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzno> zza(zzo zzoVar, Bundle bundle) {
        zzb(zzoVar, false);
        Preconditions.checkNotNull(zzoVar.zza);
        try {
            return (List) this.zza.zzl().zza(new zziy(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6d"), zzgo.zza(zzoVar.zza), e4);
            return Collections.emptyList();
        }
    }

    final /* synthetic */ void zzb(Bundle bundle, String str) {
        if (bundle.isEmpty()) {
            this.zza.zzf().zzp(str);
        } else {
            this.zza.zzf().zzb(str, bundle);
            this.zza.zzf().zza(str, bundle);
        }
    }

    @m1
    private final void zzb(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzb(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zzb(final Bundle bundle, zzo zzoVar) {
        if (com.google.android.gms.internal.measurement.zznr.zza() && this.zza.zze().zza(zzbh.zzdg)) {
            zzb(zzoVar, false);
            final String str = zzoVar.zza;
            Preconditions.checkNotNull(str);
            zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzie
                @Override // java.lang.Runnable
                public final void run() {
                    zzic.this.zzb(bundle, str);
                }
            });
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzon> zza(zzo zzoVar, boolean z4) {
        zzb(zzoVar, false);
        String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzop> list = (List) this.zza.zzl().zza(new zzjb(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzop zzopVar : list) {
                if (!z4 && zzos.zzg(zzopVar.zzc)) {
                }
                arrayList.add(new zzon(zzopVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6e"), zzgo.zza(zzoVar.zza), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6e"), zzgo.zza(zzoVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzae> zza(String str, String str2, zzo zzoVar) {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzl().zza(new zzir(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6f"), e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzae> zza(String str, String str2, String str3) {
        zza(str, true);
        try {
            return (List) this.zza.zzl().zza(new zziq(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf70"), e4);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzon> zza(String str, String str2, boolean z4, zzo zzoVar) {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzop> list = (List) this.zza.zzl().zza(new zzip(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzop zzopVar : list) {
                if (!z4 && zzos.zzg(zzopVar.zzc)) {
                }
                arrayList.add(new zzon(zzopVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf72"), zzgo.zza(zzoVar.zza), e);
            return Collections.emptyList();
        } catch (ExecutionException e5) {
            e = e5;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf72"), zzgo.zza(zzoVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final List<zzon> zza(String str, String str2, String str3, boolean z4) {
        zza(str, true);
        try {
            List<zzop> list = (List) this.zza.zzl().zza(new zzio(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzop zzopVar : list) {
                if (!z4 && zzos.zzg(zzopVar.zzc)) {
                }
                arrayList.add(new zzon(zzopVar));
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf71"), zzgo.zza(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e5) {
            e = e5;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf71"), zzgo.zza(str), e);
            return Collections.emptyList();
        }
    }

    @g
    private final void zza(String str, boolean z4) {
        boolean z5;
        if (!TextUtils.isEmpty(str)) {
            if (z4) {
                try {
                    if (this.zzb == null) {
                        if (!ProtectedSandApp.s("\udf68").equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zza(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zza()).isUidGoogleSigned(Binder.getCallingUid())) {
                            z5 = false;
                            this.zzb = Boolean.valueOf(z5);
                        }
                        z5 = true;
                        this.zzb = Boolean.valueOf(z5);
                    }
                    if (this.zzb.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e4) {
                    this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf6a"), zzgo.zza(str));
                    throw e4;
                }
            }
            if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zza(), Binder.getCallingUid(), str)) {
                this.zzc = str;
            }
            if (str.equals(this.zzc)) {
                return;
            } else {
                throw new SecurityException(String.format(ProtectedSandApp.s("\udf69"), str));
            }
        }
        zzgq zzg = this.zza.zzj().zzg();
        String s4 = ProtectedSandApp.s("\udf6b");
        zzg.zza(s4);
        throw new SecurityException(s4);
    }

    final /* synthetic */ void zza(Bundle bundle, String str) {
        boolean zza = this.zza.zze().zza(zzbh.zzde);
        boolean zza2 = this.zza.zze().zza(zzbh.zzdg);
        if (bundle.isEmpty() && zza && zza2) {
            this.zza.zzf().zzp(str);
            return;
        }
        this.zza.zzf().zzb(str, bundle);
        if (zza2 && this.zza.zzf().zzt(str)) {
            this.zza.zzf().zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        zzb(zzoVar, false);
        zzb(new zziu(this, zzbfVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(zzbf zzbfVar, String str, String str2) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zzb(new zzix(this, zzbfVar, str));
    }

    @m1
    private final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzc(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(zzae zzaeVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        zzb(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.zza = zzoVar.zza;
        zzb(new zzin(this, zzaeVar2, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        zza(zzaeVar.zza, true);
        zzb(new zzim(this, new zzae(zzaeVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(long j4, String str, String str2, String str3) {
        zzb(new zzik(this, str2, str3, str, j4));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(final Bundle bundle, zzo zzoVar) {
        zzb(zzoVar, false);
        final String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzig
            @Override // java.lang.Runnable
            public final void run() {
                zzic.this.zza(bundle, str);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final void zza(zzon zzonVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzonVar);
        zzb(zzoVar, false);
        zzb(new zziz(this, zzonVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @g
    public final byte[] zza(zzbf zzbfVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbfVar);
        zza(str, true);
        this.zza.zzj().zzc().zza(ProtectedSandApp.s("\udf73"), this.zza.zzg().zza(zzbfVar.zza));
        long nanoTime = this.zza.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzl().zzb(new zziw(this, zzbfVar, str)).get();
            if (bArr == null) {
                this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf74"), zzgo.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzj().zzc().zza(ProtectedSandApp.s("\udf75"), this.zza.zzg().zza(zzbfVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzb().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf76"), zzgo.zza(str), this.zza.zzg().zza(zzbfVar.zza), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            this.zza.zzj().zzg().zza(ProtectedSandApp.s("\udf76"), zzgo.zza(str), this.zza.zzg().zza(zzbfVar.zza), e);
            return null;
        }
    }
}

package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.g;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzgv extends zzei {
    private final zzlh zza;
    private Boolean zzb;
    private String zzc;

    public zzgv(zzlh zzlhVar, String str) {
        Preconditions.checkNotNull(zzlhVar);
        this.zza = zzlhVar;
        this.zzc = null;
    }

    private final void zzA(zzau zzauVar, zzq zzqVar) {
        this.zza.zzA();
        this.zza.zzE(zzauVar, zzqVar);
    }

    @g
    private final void zzy(zzq zzqVar, boolean z5) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        this.zza.zzv().zzY(zzqVar.zzb, zzqVar.zzq);
    }

    @g
    private final void zzz(String str, boolean z5) {
        boolean z6;
        if (TextUtils.isEmpty(str)) {
            zzer zzd = this.zza.zzaA().zzd();
            String s5 = ProtectedSandApp.s("ⓑ");
            zzd.zza(s5);
            throw new SecurityException(s5);
        }
        if (z5) {
            try {
                if (this.zzb == null) {
                    if (!ProtectedSandApp.s("Ⓨ").equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzaw(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzaw()).isUidGoogleSigned(Binder.getCallingUid())) {
                        z6 = false;
                        this.zzb = Boolean.valueOf(z6);
                    }
                    z6 = true;
                    this.zzb = Boolean.valueOf(z6);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e6) {
                this.zza.zzaA().zzd().zzb(ProtectedSandApp.s("ⓐ"), zzet.zzn(str));
                throw e6;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaw(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new SecurityException(String.format(ProtectedSandApp.s("Ⓩ"), str));
        }
    }

    @m1
    final zzau zzb(zzau zzauVar, zzq zzqVar) {
        zzas zzasVar;
        if (ProtectedSandApp.s("ⓒ").equals(zzauVar.zza) && (zzasVar = zzauVar.zzb) != null && zzasVar.zza() != 0) {
            String zzg = zzauVar.zzb.zzg(ProtectedSandApp.s("ⓓ"));
            if (ProtectedSandApp.s("ⓔ").equals(zzg) || ProtectedSandApp.s("ⓕ").equals(zzg)) {
                this.zza.zzaA().zzi().zzb(ProtectedSandApp.s("ⓖ"), zzauVar.toString());
                return new zzau(ProtectedSandApp.s("ⓗ"), zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
            }
        }
        return zzauVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final String zzd(zzq zzqVar) {
        zzy(zzqVar, false);
        return this.zza.zzx(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final List zze(zzq zzqVar, boolean z5) {
        zzy(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgs(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z5 || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzc(ProtectedSandApp.s("ⓘ"), zzet.zzn(zzqVar.zza), e6);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final List zzf(String str, String str2, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaB().zzh(new zzgj(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzb(ProtectedSandApp.s("ⓙ"), e6);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaB().zzh(new zzgk(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzb(ProtectedSandApp.s("ⓚ"), e6);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final List zzh(String str, String str2, boolean z5, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgh(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z5 || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzc(ProtectedSandApp.s("ⓛ"), zzet.zzn(zzqVar.zza), e6);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final List zzi(String str, String str2, String str3, boolean z5) {
        zzz(str, true);
        try {
            List<zzlm> list = (List) this.zza.zzaB().zzh(new zzgi(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlm zzlmVar : list) {
                if (z5 || !zzlp.zzaj(zzlmVar.zzc)) {
                    arrayList.add(new zzlk(zzlmVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzc(ProtectedSandApp.s("ⓜ"), zzet.zzn(str), e6);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzj(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgt(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzk(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzauVar);
        zzy(zzqVar, false);
        zzx(new zzgo(this, zzauVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzl(zzau zzauVar, String str, String str2) {
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgp(this, zzauVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        zzx(new zzgl(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        zzy(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        zzx(new zzgf(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        zzz(zzacVar.zza, true);
        zzx(new zzgg(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        zzgn zzgnVar = new zzgn(this, zzqVar);
        Preconditions.checkNotNull(zzgnVar);
        if (this.zza.zzaB().zzs()) {
            zzgnVar.run();
        } else {
            this.zza.zzaB().zzq(zzgnVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzq(long j5, String str, String str2, String str3) {
        zzx(new zzgu(this, str2, str3, str, j5));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        zzy(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzge
            @Override // java.lang.Runnable
            public final void run() {
                zzgv.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzs(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgm(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final void zzt(zzlk zzlkVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzlkVar);
        zzy(zzqVar, false);
        zzx(new zzgr(this, zzlkVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzej
    @g
    public final byte[] zzu(zzau zzauVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzauVar);
        zzz(str, true);
        this.zza.zzaA().zzc().zzb(ProtectedSandApp.s("ⓝ"), this.zza.zzi().zzd(zzauVar.zza));
        long nanoTime = this.zza.zzax().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaB().zzi(new zzgq(this, zzauVar, str)).get();
            if (bArr == null) {
                this.zza.zzaA().zzd().zzb(ProtectedSandApp.s("ⓞ"), zzet.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzaA().zzc().zzd(ProtectedSandApp.s("ⓟ"), this.zza.zzi().zzd(zzauVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzax().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e6) {
            this.zza.zzaA().zzd().zzd(ProtectedSandApp.s("ⓠ"), zzet.zzn(str), this.zza.zzi().zzd(zzauVar.zza), e6);
            return null;
        }
    }

    final void zzv(zzau zzauVar, zzq zzqVar) {
        if (!this.zza.zzm().zzo(zzqVar.zza)) {
            zzA(zzauVar, zzqVar);
            return;
        }
        this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ⓡ"), zzqVar.zza);
        zzfu zzm = this.zza.zzm();
        String str = zzqVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzm.zzd.get(str);
        if (zzcVar == null) {
            this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ⓦ"), zzqVar.zza);
            zzA(zzauVar, zzqVar);
            return;
        }
        try {
            Map zzt = this.zza.zzu().zzt(zzauVar.zzb.zzc(), true);
            String zza = zzhc.zza(zzauVar.zza);
            if (zza == null) {
                zza = zzauVar.zza;
            }
            if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(zza, zzauVar.zzd, zzt))) {
                if (zzcVar.zzg()) {
                    this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ⓢ"), zzauVar.zza);
                    zzA(this.zza.zzu().zzj(zzcVar.zza().zzb()), zzqVar);
                } else {
                    zzA(zzauVar, zzqVar);
                }
                if (zzcVar.zzf()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                        this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ⓣ"), zzaaVar.zzd());
                        zzA(this.zza.zzu().zzj(zzaaVar), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaA().zzd().zzc(ProtectedSandApp.s("ⓤ"), zzqVar.zzb, zzauVar.zza);
        }
        this.zza.zzaA().zzj().zzb(ProtectedSandApp.s("ⓥ"), zzauVar.zza);
        zzA(zzauVar, zzqVar);
    }

    final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzak zzh = this.zza.zzh();
        zzh.zzg();
        zzh.zzW();
        byte[] zzbx = zzh.zzf.zzu().zzl(new zzap(zzh.zzt, "", str, ProtectedSandApp.s("ⓧ"), 0L, 0L, bundle)).zzbx();
        zzh.zzt.zzaA().zzj().zzc(ProtectedSandApp.s("ⓨ"), zzh.zzt.zzj().zzd(str), Integer.valueOf(zzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("ⓩ"), str);
        contentValues.put(ProtectedSandApp.s("⓪"), zzbx);
        try {
            if (zzh.zzh().insertWithOnConflict(ProtectedSandApp.s("⓫"), null, contentValues, 5) == -1) {
                zzh.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("⓬"), zzet.zzn(str));
            }
        } catch (SQLiteException e6) {
            zzh.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("⓭"), zzet.zzn(str), e6);
        }
    }

    @m1
    final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaB().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaB().zzp(runnable);
        }
    }
}

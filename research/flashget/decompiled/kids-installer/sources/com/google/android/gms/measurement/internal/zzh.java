package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes2.dex */
final class zzh {
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;

    @q0
    private String zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private final zzgd zza;
    private final String zzb;

    @q0
    private String zzc;

    @q0
    private String zzd;

    @q0
    private String zze;

    @q0
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    @q0
    private String zzj;
    private long zzk;

    @q0
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;

    @q0
    private String zzq;

    @q0
    private Boolean zzr;
    private long zzs;

    @q0
    private List zzt;

    @q0
    private String zzu;
    private boolean zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @n1
    zzh(zzgd zzgdVar, String str) {
        Preconditions.checkNotNull(zzgdVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgdVar;
        this.zzb = str;
        zzgdVar.zzaB().zzg();
    }

    @n1
    @q0
    public final String zzA() {
        this.zza.zzaB().zzg();
        return this.zzd;
    }

    @n1
    @q0
    public final String zzB() {
        this.zza.zzaB().zzg();
        return this.zzE;
    }

    @n1
    @q0
    public final String zzC() {
        this.zza.zzaB().zzg();
        return this.zze;
    }

    @n1
    @q0
    public final String zzD() {
        this.zza.zzaB().zzg();
        return this.zzu;
    }

    @n1
    @q0
    public final List zzE() {
        this.zza.zzaB().zzg();
        return this.zzt;
    }

    @n1
    public final void zzF() {
        this.zza.zzaB().zzg();
        this.zzF = false;
    }

    @n1
    public final void zzG() {
        this.zza.zzaB().zzg();
        long j5 = this.zzg + 1;
        if (j5 > 2147483647L) {
            this.zza.zzaA().zzk().zzb(ProtectedSandApp.s("\u0feb"), zzet.zzn(this.zzb));
            j5 = 0;
        }
        this.zzF = true;
        this.zzg = j5;
    }

    @n1
    public final void zzH(@q0 String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    @n1
    public final void zzI(boolean z5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzp != z5;
        this.zzp = z5;
    }

    @n1
    public final void zzJ(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    @n1
    public final void zzK(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    @n1
    public final void zzL(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    @n1
    public final void zzM(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzk != j5;
        this.zzk = j5;
    }

    @n1
    public final void zzN(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzG != j5;
        this.zzG = j5;
    }

    @n1
    public final void zzO(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzB != j5;
        this.zzB = j5;
    }

    @n1
    public final void zzP(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzC != j5;
        this.zzC = j5;
    }

    @n1
    public final void zzQ(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzA != j5;
        this.zzA = j5;
    }

    @n1
    public final void zzR(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzz != j5;
        this.zzz = j5;
    }

    @n1
    public final void zzS(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzD != j5;
        this.zzD = j5;
    }

    @n1
    public final void zzT(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzy != j5;
        this.zzy = j5;
    }

    @n1
    public final void zzU(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzn != j5;
        this.zzn = j5;
    }

    @n1
    public final void zzV(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzs != j5;
        this.zzs = j5;
    }

    @n1
    public final void zzW(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzH != j5;
        this.zzH = j5;
    }

    @n1
    public final void zzX(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    @n1
    public final void zzY(@q0 String str) {
        this.zza.zzaB().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzF |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    @n1
    public final void zzZ(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzm != j5;
        this.zzm = j5;
    }

    @n1
    public final long zza() {
        this.zza.zzaB().zzg();
        return 0L;
    }

    @n1
    public final void zzaa(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzE, str);
        this.zzE = str;
    }

    @n1
    public final void zzab(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzi != j5;
        this.zzi = j5;
    }

    @n1
    public final void zzac(long j5) {
        Preconditions.checkArgument(j5 >= 0);
        this.zza.zzaB().zzg();
        this.zzF |= this.zzg != j5;
        this.zzg = j5;
    }

    @n1
    public final void zzad(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzh != j5;
        this.zzh = j5;
    }

    @n1
    public final void zzae(boolean z5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzo != z5;
        this.zzo = z5;
    }

    @n1
    public final void zzaf(@q0 Boolean bool) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    @n1
    public final void zzag(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    @n1
    public final void zzah(@q0 List list) {
        this.zza.zzaB().zzg();
        if (zzg.zza(this.zzt, list)) {
            return;
        }
        this.zzF = true;
        this.zzt = list != null ? new ArrayList(list) : null;
    }

    @n1
    public final void zzai(@q0 String str) {
        this.zza.zzaB().zzg();
        this.zzF |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    @n1
    public final void zzaj(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzx != j5;
        this.zzx = j5;
    }

    @n1
    public final void zzak(boolean z5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzv != z5;
        this.zzv = z5;
    }

    @n1
    public final void zzal(long j5) {
        this.zza.zzaB().zzg();
        this.zzF |= this.zzw != j5;
        this.zzw = j5;
    }

    @n1
    public final boolean zzam() {
        this.zza.zzaB().zzg();
        return this.zzp;
    }

    @n1
    public final boolean zzan() {
        this.zza.zzaB().zzg();
        return this.zzo;
    }

    @n1
    public final boolean zzao() {
        this.zza.zzaB().zzg();
        return this.zzF;
    }

    @n1
    public final boolean zzap() {
        this.zza.zzaB().zzg();
        return this.zzv;
    }

    @n1
    public final long zzb() {
        this.zza.zzaB().zzg();
        return this.zzk;
    }

    @n1
    public final long zzc() {
        this.zza.zzaB().zzg();
        return this.zzG;
    }

    @n1
    public final long zzd() {
        this.zza.zzaB().zzg();
        return this.zzB;
    }

    @n1
    public final long zze() {
        this.zza.zzaB().zzg();
        return this.zzC;
    }

    @n1
    public final long zzf() {
        this.zza.zzaB().zzg();
        return this.zzA;
    }

    @n1
    public final long zzg() {
        this.zza.zzaB().zzg();
        return this.zzz;
    }

    @n1
    public final long zzh() {
        this.zza.zzaB().zzg();
        return this.zzD;
    }

    @n1
    public final long zzi() {
        this.zza.zzaB().zzg();
        return this.zzy;
    }

    @n1
    public final long zzj() {
        this.zza.zzaB().zzg();
        return this.zzn;
    }

    @n1
    public final long zzk() {
        this.zza.zzaB().zzg();
        return this.zzs;
    }

    @n1
    public final long zzl() {
        this.zza.zzaB().zzg();
        return this.zzH;
    }

    @n1
    public final long zzm() {
        this.zza.zzaB().zzg();
        return this.zzm;
    }

    @n1
    public final long zzn() {
        this.zza.zzaB().zzg();
        return this.zzi;
    }

    @n1
    public final long zzo() {
        this.zza.zzaB().zzg();
        return this.zzg;
    }

    @n1
    public final long zzp() {
        this.zza.zzaB().zzg();
        return this.zzh;
    }

    @n1
    public final long zzq() {
        this.zza.zzaB().zzg();
        return this.zzx;
    }

    @n1
    public final long zzr() {
        this.zza.zzaB().zzg();
        return this.zzw;
    }

    @n1
    @q0
    public final Boolean zzs() {
        this.zza.zzaB().zzg();
        return this.zzr;
    }

    @n1
    @q0
    public final String zzt() {
        this.zza.zzaB().zzg();
        return this.zzq;
    }

    @n1
    @q0
    public final String zzu() {
        this.zza.zzaB().zzg();
        String str = this.zzE;
        zzaa(null);
        return str;
    }

    @n1
    public final String zzv() {
        this.zza.zzaB().zzg();
        return this.zzb;
    }

    @n1
    @q0
    public final String zzw() {
        this.zza.zzaB().zzg();
        return this.zzc;
    }

    @n1
    @q0
    public final String zzx() {
        this.zza.zzaB().zzg();
        return this.zzl;
    }

    @n1
    @q0
    public final String zzy() {
        this.zza.zzaB().zzg();
        return this.zzj;
    }

    @n1
    @q0
    public final String zzz() {
        this.zza.zzaB().zzg();
        return this.zzf;
    }
}

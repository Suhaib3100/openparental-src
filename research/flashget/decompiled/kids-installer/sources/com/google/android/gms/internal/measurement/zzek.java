package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzek extends zzlb implements zzmj {
    private static final zzek zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzli zzg = zzlb.zzbH();
    private boolean zzh;
    private zzer zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzek zzekVar = new zzek();
        zza = zzekVar;
        zzlb.zzbO(zzek.class, zzekVar);
    }

    private zzek() {
    }

    public static zzej zzc() {
        return (zzej) zza.zzbA();
    }

    static /* synthetic */ void zzi(zzek zzekVar, String str) {
        zzekVar.zzd |= 2;
        zzekVar.zzf = str;
    }

    static /* synthetic */ void zzj(zzek zzekVar, int i5, zzem zzemVar) {
        zzemVar.getClass();
        zzli zzliVar = zzekVar.zzg;
        if (!zzliVar.zzc()) {
            zzekVar.zzg = zzlb.zzbI(zzliVar);
        }
        zzekVar.zzg.set(i5, zzemVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzem zze(int i5) {
        return (zzem) this.zzg.get(i5);
    }

    public final zzer zzf() {
        zzer zzerVar = this.zzi;
        return zzerVar == null ? zzer.zzb() : zzerVar;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final Object zzl(int i5, Object obj, Object obj2) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return zzlb.zzbL(zza, ProtectedSandApp.s("ⶑ"), new Object[]{ProtectedSandApp.s("ⶈ"), ProtectedSandApp.s("ⶉ"), ProtectedSandApp.s("ⶊ"), ProtectedSandApp.s("ⶋ"), zzem.class, ProtectedSandApp.s("ⶌ"), ProtectedSandApp.s("ⶍ"), ProtectedSandApp.s("ⶎ"), ProtectedSandApp.s("ⶏ"), ProtectedSandApp.s("ⶐ")});
        }
        if (i6 == 3) {
            return new zzek();
        }
        zzeg zzegVar = null;
        if (i6 == 4) {
            return new zzej(zzegVar);
        }
        if (i6 != 5) {
            return null;
        }
        return zza;
    }

    public final boolean zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return this.zzl;
    }

    public final boolean zzo() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 64) != 0;
    }
}

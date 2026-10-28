package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.collection.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes4.dex */
public final class zzfu extends zzku implements zzaf {

    @m1
    final Map zza;

    @m1
    final Map zzb;

    @m1
    final Map zzc;

    @m1
    final g zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzfu(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzg = new androidx.collection.a();
        this.zza = new androidx.collection.a();
        this.zzb = new androidx.collection.a();
        this.zzc = new androidx.collection.a();
        this.zzh = new androidx.collection.a();
        this.zzj = new androidx.collection.a();
        this.zzk = new androidx.collection.a();
        this.zzl = new androidx.collection.a();
        this.zzi = new androidx.collection.a();
        this.zzd = new zzfr(this, 20);
        this.zze = new zzfs(this);
    }

    @n1
    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        String s5 = ProtectedSandApp.s("ス");
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzlj.zzm(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            this.zzt.zzaA().zzj().zzc(ProtectedSandApp.s("ズ"), zzffVar.zzu() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzt() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzll e6) {
            this.zzt.zzaA().zzk().zzc(s5, zzet.zzn(str), e6);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e7) {
            this.zzt.zzaA().zzk().zzc(s5, zzet.zzn(str), e7);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        androidx.collection.a aVar = new androidx.collection.a();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfb) it.next()).zzb());
        }
        for (int i5 = 0; i5 < zzfeVar.zza(); i5++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i5).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                b.a(this.zzt, ProtectedSandApp.s("セ"));
            } else {
                String zzc = zzfcVar.zzc();
                String zzb = zzhc.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(zzb)) {
                    zzfcVar.zzb(zzb);
                    zzfeVar.zzd(i5, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    aVar.put(zzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    aVar2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        this.zzt.zzaA().zzk().zzc(ProtectedSandApp.s("ゼ"), zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        aVar3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, aVar);
        this.zzc.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0131: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:278), block:B:31:0x0131 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    @androidx.annotation.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzC(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfu.zzC(java.lang.String):void");
    }

    @n1
    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ツ"), Integer.valueOf(zzffVar.zza()));
        com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzo().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd(ProtectedSandApp.s("ヅ"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn(ProtectedSandApp.s("࿈"), new zzft(zzfu.this, str));
                }
            });
            zzcVar.zzd(ProtectedSandApp.s("テ"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfu zzfuVar = zzfu.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu(ProtectedSandApp.s("࿉"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzfn
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfu zzfuVar2 = zzfu.this;
                            String str3 = str2;
                            zzh zzj = zzfuVar2.zzf.zzh().zzj(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put(ProtectedSandApp.s("࿁"), ProtectedSandApp.s("࿂"));
                            hashMap.put(ProtectedSandApp.s("࿃"), str3);
                            zzfuVar2.zzt.zzf().zzh();
                            hashMap.put(ProtectedSandApp.s("࿄"), 79000L);
                            if (zzj != null) {
                                String zzy = zzj.zzy();
                                if (zzy != null) {
                                    hashMap.put(ProtectedSandApp.s("࿅"), zzy);
                                }
                                hashMap.put(ProtectedSandApp.s("࿆"), Long.valueOf(zzj.zzb()));
                                hashMap.put(ProtectedSandApp.s("࿇"), Long.valueOf(zzj.zzk()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd(ProtectedSandApp.s("デ"), new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(zzfu.this.zze);
                }
            });
            zzcVar.zzc(zzgtVar);
            this.zzd.put(str, zzcVar);
            this.zzt.zzaA().zzj().zzc(ProtectedSandApp.s("ト"), str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzt.zzaA().zzj().zzb(ProtectedSandApp.s("ド"), ((com.google.android.gms.internal.measurement.zzgr) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ナ"), str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        androidx.collection.a aVar = new androidx.collection.a();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzp()) {
                aVar.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return aVar;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfu zzfuVar, String str) {
        zzfuVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfuVar.zzo(str)) {
            return null;
        }
        if (!zzfuVar.zzh.containsKey(str) || zzfuVar.zzh.get(str) == null) {
            zzfuVar.zzC(str);
        } else {
            zzfuVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfuVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfuVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    @n1
    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    protected final boolean zzb() {
        return false;
    }

    @n1
    final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @n1
    protected final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
    }

    @n1
    protected final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    @n1
    protected final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    @n1
    final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    @n1
    final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    @n1
    protected final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    @n1
    final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    @n1
    final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzff zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzs();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) ? false : true;
    }

    final boolean zzp(String str) {
        return ProtectedSandApp.s("ニ").equals(zza(str, ProtectedSandApp.s("ヌ")));
    }

    @n1
    final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (ProtectedSandApp.s("ネ").equals(str2) || ProtectedSandApp.s("ノ").equals(str2) || ProtectedSandApp.s("ハ").equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @n1
    final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlp.zzaj(str2)) {
            return true;
        }
        if (zzs(str) && zzlp.zzak(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzs(String str) {
        return ProtectedSandApp.s("バ").equals(zza(str, ProtectedSandApp.s("パ")));
    }

    @n1
    protected final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzbB();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
        this.zzf.zzh().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()).zzbx();
        } catch (RuntimeException e6) {
            this.zzt.zzaA().zzk().zzc(ProtectedSandApp.s("ヒ"), zzet.zzn(str), e6);
        }
        zzak zzh = this.zzf.zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzg();
        zzh.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ProtectedSandApp.s("ビ"), bArr);
        contentValues.put(ProtectedSandApp.s("ピ"), str2);
        contentValues.put(ProtectedSandApp.s("フ"), str3);
        try {
            if (zzh.zzh().update(ProtectedSandApp.s("ブ"), contentValues, ProtectedSandApp.s("プ"), new String[]{str}) == 0) {
                zzh.zzt.zzaA().zzd().zzb(ProtectedSandApp.s("ヘ"), zzet.zzn(str));
            }
        } catch (SQLiteException e7) {
            zzh.zzt.zzaA().zzd().zzc(ProtectedSandApp.s("ベ"), zzet.zzn(str), e7);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        return true;
    }

    @n1
    final boolean zzu(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ペ"));
    }

    @n1
    final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ホ")) || ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ボ"));
        }
        return false;
    }

    @n1
    final boolean zzw(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ポ"));
    }

    @n1
    final boolean zzx(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("マ"));
    }

    @n1
    final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ミ")) || ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("ム"));
        }
        return false;
    }

    @n1
    final boolean zzz(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains(ProtectedSandApp.s("メ"));
    }
}
